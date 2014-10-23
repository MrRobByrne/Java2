import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Galaxy extends JPanel
    implements ActionListener
{

    public Galaxy()
    {
        setPreferredSize(new Dimension(420, 420));
        setBackground(BG_COLOR);
        angle = 0.0D;
        sun = new Planet(200D, 200D, 40D, Color.ORANGE);
        earth = new Planet(320D, 200D, 20D, Color.GREEN);
        moon = new Planet(360D, 200D, 10D, Color.WHITE);
        mars = new Planet(240D, 200D, 16D, Color.RED);
        timer = new Timer(5, this);
        timer.start();
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D)g;
        sun.paint(graphics2d);
        earth.paint(graphics2d);
        moon.paint(graphics2d);
        mars.paint(graphics2d);
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        angle++;
        if(angle > 360D)
            angle = 0.0D;
        double d = 200D + 120D * Math.cos((6.25D * -angle) / 360D);
        double d1 = 200D + 120D * Math.sin((6.25D * -angle) / 360D);
        earth.updatePosition(d, d1);
        double d2 = d + 40D * Math.cos((12.4D * angle) / 360D);
        double d3 = d1 + 40D * Math.sin((12.4D * angle) / 360D);
        moon.updatePosition(d2, d3);
        double d4 = 200D + 40D * Math.cos((31.4D * angle) / 360D);
        double d5 = 200D + 40D * Math.sin((31.4D * angle) / 360D);
        mars.updatePosition(d4, d5);
        repaint();
    }

    public static void main(String args[])
    {
        Galaxy galaxy = new Galaxy();
        runApplication(galaxy);
    }

    private Planet earth;
    private Planet sun;
    private Planet moon;
    private Planet mars;
    private static final int INTERVAL = 5;
    private static final int WINDOW_WIDTH = 420;
    private static final int WINDOW_HEIGHT = 420;
    private static final Color BG_COLOR;
    private Timer timer;
    private double angle;

    static 
    {
        BG_COLOR = Color.BLACK;
    }
    public static void runApplication(JPanel jpanel)
    {
        JFrame jframe = new JFrame();
        jframe.setSize(jpanel.getPreferredSize());
        jframe.setTitle(jpanel.getClass().getName());
        jframe.setDefaultCloseOperation(3);
        jframe.add(jpanel);
        jframe.setVisible(true);
    }
}