import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CConverter extends JFrame
{
	public CConverter()
	{
		super("Cobalt");	
		buildGUI();	
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		pack();	
		setVisible(true);		
	}
	
	/*
	* buildGUI() is the build function for the GUI
	*/
	private void buildGUI()
	{
		// Declaration of 2 input fields, 2 buttons, and an output label
		JTextField input1= new JTextField(7);
		JLabel inAge = new JLabel("Enter The Amount of Cobalt 60: ");
		JTextField input2= new JTextField(7);
		JLabel inAmount = new JLabel("Enter The number of years: ");
		JButton comp= new JButton("Compute");
		JButton quit = new JButton("Quit");
		JLabel o = new JLabel("Amount Remaining: ");

		// Container creation and layout
		Container ct= getContentPane();
		ct.setLayout(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		
		// Layout insets
		c.insets = new Insets(5,5,5,5);
		// Amount input text layout settings and construction
		c.gridx =0; c.gridy=0;c.gridwidth=1; c.gridheight=1;
		ct.add(inAge, c);
		// Amount input box layout settings and construction
		c.gridx =3; c.gridy=0;c.gridwidth=1; c.gridheight=1;
		ct.add(input1, c);
		// Age input text layout settings and construction
		c.gridx =0; c.gridy=1;c.gridwidth=1; c.gridheight=1;
		ct.add(inAmount, c);
		// Age text box layout settings and construction
		c.gridx =3; c.gridy=1;c.gridwidth=1; c.gridheight=1;
		ct.add(input2, c);
		// Compute button layout settings and construction
		c.gridx =2; c.gridy=2;c.gridwidth=1; c.gridheight=1;
		ct.add(comp, c);
		// Quit Button layout settings and construction
		c.gridx =3; c.gridy=2;c.gridwidth=1; c.gridheight=1;
		ct.add(quit, c);
		// Output Label layout settings and construction
		c.gridx =0; c.gridy=3;c.gridwidth=1; c.gridheight=1;
		ct.add(o, c);
		
		// ActionListener for input boxes and computation
		QuitListener ql= new QuitListener();
		quit.addActionListener(ql);
		AddListener al = new AddListener(input1,input2, o);
		input1.addActionListener(al);
		input2.addActionListener(al);
		comp.addActionListener(al);
	}
	
	// Implamentation of actionListener
	class AddListener implements ActionListener
	{
		private JTextField inAge,inAmount;
		private JLabel out;
	
		// AddListener function used for computation. 2 inputs, 1 output
		public AddListener(JTextField inAge,JTextField inAmount, JLabel out)
		{
			this.inAge = inAge;
			this.inAmount = inAmount;
			this.out = out;
		}
	
		// actionPerformed() computes the the halflife amount of Cobalt 60 that is left.
		// Inputs: Amount and Age
		// Outputs: Amount left 
		public void actionPerformed(ActionEvent e)
		{
			double c = Double.parseDouble(inAge.getText());
			double p = Double.parseDouble(inAmount.getText());
			double k=c;
			for(int i=0;i<p;i++)
			{
				k= k*0.88;
			}
		out.setText("Amount Remaining: " +k);
		}
	}
	
	// QuitListener class to exit the Listener
	class QuitListener implements  ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	// Main() to run the CConverter
	public static void main(String[]args)
	{
		CConverter cc=new CConverter();
	}
}
