// Javapad.java is a simple notpad created in Java as an extendion of JFrame
// Implaments 3 ActionListeners, 2 to listen and 1 to quit the listener
// BuildGUI() is used to build and configure the GUI
//

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Javapad extends JFrame 
{
  private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenuItem n, open, save, exit;

  public Javapad() 
  {
    super("Javapad");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(640, 480));
    buildGUI();
    pack();
    setVisible(true);
  }

	class NListener implements ActionListener
  {
    private JTextArea area;
    public NListener(JTextArea area)
    {
      this.area=area;
    }
    public void actionPerformed(ActionEvent e)
    {
      area.setText("");
    }
  }

  class FileListener implements ActionListener 
  {
    private JFileChooser fc;
    private JTextArea area;

    public FileListener(JTextArea area) 
    {
      fc = new JFileChooser();
      this.area = area;
    }

    // ActionPerformed defines the actions performed by open and save menu options.
    public void actionPerformed(ActionEvent e) 
    {
     
     if(e.getSource() == open) 
     {
        int returnVal = fc.showOpenDialog(Javapad.this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {

        	try 
          {
          	File file = fc.getSelectedFile();
          	FileReader in = new FileReader(file);
          	int size=(int)file.length();
          	char data[]= new char[size];
          	in.read(data, 0, size);
          	String s = new String(data);
          	area.setText(s);
		      } // try
	
          catch (IOException exc) 
          {
            exc.printStackTrace();
            System.exit(1);
          } // catch

        } // if
      } // if

      else if(e.getSource() == save) 
      {
        int returnVal = fc.showSaveDialog(Javapad.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
          try 
          {
            File file = fc.getSelectedFile();
            FileWriter fw = new FileWriter(file);
      			PrintWriter out = new PrintWriter(fw);
      			out.print(area);
      			out.close();
		      } // try
          
          catch(IOException exc) 
          {
            exc.printStackTrace();
            System.exit(1);
          } // catch
        } // if
      } // else if
    }
  }

  // Build and configure the GUI
  private void buildGUI() 
  {
    Container container = this.getContentPane();

    menuBar = new JMenuBar();
    menuBar.setBorder( new BevelBorder(BevelBorder.RAISED) );
    menuBar.setBorderPainted(true);
    container.add(menuBar, BorderLayout.NORTH);   

    fileMenu = new JMenu("File");
    menuBar.add(fileMenu);

    JMenuItem n = new JMenuItem("New");
    fileMenu.add(n);
    fileMenu.addSeparator();

    open = new JMenuItem("Open");
    fileMenu.add(open);
    fileMenu.addSeparator();

    save = new JMenuItem("Save");
    fileMenu.add(save);
    fileMenu.addSeparator();

    JMenuItem exit = new JMenuItem("Exit");
    fileMenu.add(exit);


    JTextArea edit = new JTextArea(30,20);
    edit.setFont(new Font("Courier", Font.PLAIN, 14));

    JScrollPane sp = new JScrollPane(edit);
    sp.setPreferredSize(new Dimension(450, 100));
    container.add(sp, BorderLayout.CENTER);
  	QuitListener ql= new QuitListener();
  	exit.addActionListener(ql);
  	NListener nl = new NListener(edit);
  	n.addActionListener(nl);

    FileListener fl = new FileListener(edit);
    open.addActionListener(fl);
    save.addActionListener(fl);


  }
	
  // ActionListener Quit
  class QuitListener implements  ActionListener
  {
		public void actionPerformed(ActionEvent e)
    {
		System.exit(0);
		}
	}
	
  // Implamnetation of Javapad()
  public static void main(String[] args) 
  {
    Javapad jp = new Javapad();
  }
}


