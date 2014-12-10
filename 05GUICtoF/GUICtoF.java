import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICtoF extends JFrame implements ActionListener{
    private Container pane;
    private Container textPane;
    private Container buttonPane;
    private JButton button,button2;
    private JLabel label;
    private JTextField text;
    public GUICtoF(){
	this.setTitle("Temperature Converter");
	this.setSize(325,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	textPane = new Container();
	label = new JLabel("Celcius/Fahrenheit Value :");
	text = new JTextField(13);
	textPane.setLayout(new FlowLayout());
	textPane.add(label);
	textPane.add(text);
	
	buttonPane = new Container();
	button = new JButton("Convert to Fahrenheit");
	button.setActionCommand("F");
	button.addActionListener(this);
	button2 = new JButton("Convert to Celcius");
	button2.setActionCommand("C");
	button2.addActionListener(this);
	buttonPane.setLayout(new FlowLayout());
	buttonPane.add(button);
	buttonPane.add(button2);
	
	pane.add(textPane);
	pane.add(buttonPane);
    }
    
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("F")){
	    String Text = text.getText();
	    double Celcius = Double.parseDouble(Text);
	    Celcius = Celcius*((double)9 / 5) + 32;
	    text.setText("" + Celcius);
	}
	if (action.equals("C")){
	    String Text = text.getText();
	    double Fahrenheit = Double.parseDouble(Text);
	    Fahrenheit = ((double)Fahrenheit - 32.0)*((double)5 / 9);
	    text.setText("" + Fahrenheit);
	}
    }
    
    public static void main(String[] args){
	GUICtoF g = new GUICtoF();
	g.setVisible(true);
    }
}
	
