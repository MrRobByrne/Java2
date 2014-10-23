import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CConverter extends JFrame{
	public CConverter(){
	super("Cobalt");
	buildGUI();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pack();
	setVisible(true);
	}
	private void buildGUI(){
	JTextField input1= new JTextField(7);
	JLabel in1 = new JLabel("Enter The Amount of Cobalt 60: ");
	JTextField input2= new JTextField(7);
	JLabel in2 = new JLabel("Enter The number of years: ");
	JButton comp= new JButton("Compute");
	JButton quit = new JButton("Quit");
	JLabel o = new JLabel("Amount Remaining: ");
	Container ct= getContentPane();
	ct.setLayout(new GridBagLayout());
	GridBagConstraints c= new GridBagConstraints();
	c.fill = GridBagConstraints.BOTH;
	c.insets = new Insets(5,5,5,5);
	c.gridx =0; c.gridy=0;c.gridwidth=1; c.gridheight=1;
	ct.add(in1, c);
	c.gridx =3; c.gridy=0;c.gridwidth=1; c.gridheight=1;
	ct.add(input1, c);
	c.gridx =0; c.gridy=1;c.gridwidth=1; c.gridheight=1;
	ct.add(in2, c);
	c.gridx =3; c.gridy=1;c.gridwidth=1; c.gridheight=1;
	ct.add(input2, c);
	c.gridx =2; c.gridy=2;c.gridwidth=1; c.gridheight=1;
	ct.add(comp, c);
	c.gridx =3; c.gridy=2;c.gridwidth=1; c.gridheight=1;
	ct.add(quit, c);
	c.gridx =0; c.gridy=3;c.gridwidth=1; c.gridheight=1;
	ct.add(o, c);
	QuitListener ql= new QuitListener();
	quit.addActionListener(ql);
	AddListener al = new AddListener(input1,input2, o);
	input1.addActionListener(al);
	input2.addActionListener(al);
	comp.addActionListener(al);
	}
	class AddListener implements ActionListener{
		private JTextField in1,in2;
		private JLabel out;
	public AddListener(JTextField in1,JTextField in2, JLabel out){
		this.in1 = in1;
		this.in2 = in2;
		this.out = out;
	}
	
	public void actionPerformed(ActionEvent e){
		double c = Double.parseDouble(in1.getText());
		double p = Double.parseDouble(in2.getText());
		double k=c;
		for(int i=0;i<p;i++){
		k= k*0.88;
		}
		out.setText("Amount Remaining: " +k);
	}
	}
	class QuitListener implements  ActionListener{
		public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	}
	public static void main(String[]args){
		CConverter cc=new CConverter();
		}
	}
