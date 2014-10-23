import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Planet
{

    public Planet(double d, double d1, double d2, Color color1)
    {
        ellipse = new java.awt.geom.Ellipse2D.Double();
        x = d;
        y = d1;
        radius = d2;
        color = color1;
        ellipse.setFrameFromCenter(d, d1, d + d2 / 2D, d1 + d2 / 2D);
    }

    public void paint(Graphics2D graphics2d)
    {
        Color color1 = graphics2d.getColor();
        graphics2d.setColor(color);
        graphics2d.fill(ellipse);
        graphics2d.setColor(color1);
    }

    public void updatePosition(double d, double d1)
    {
        ellipse.setFrameFromCenter(d, d1, d + radius / 2D, d1 + radius / 2D);
    }

    private double x;
    private double y;
    private double radius;
    private Color color;
    private Ellipse2D ellipse;
}
