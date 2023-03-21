package awt.mygui;

import java.awt.*;
public class MyCalculator {

	String num1,num2,num3,num4,num5;
	int operation;
	TextField l1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bDot,bEqual,bClear;
	Frame f;
	
	   //  Default Constructor
	public MyCalculator(){
		
		createFrame();
		createComponents();
		addComponents();
		registrationComponents();	
	}
	
	   //  Main method
    public static void main(String[] args) {
		new MyCalculator();
	}
    
       //  Create Frame Method
   	private void createFrame() {
   		
   		f = new Frame("My Calculator");
   		f.setVisible(true);
   		f.setSize(500,450);
   		f.setLayout(new GridLayout(4,4,10,10));
   		f.setResizable(false);
 
   	}
    
         //  Create Components Method
   	private void createComponents() {
   		
    	l1 = new TextField(30);	
   		l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
   		b0 = new Button("0");
   		b1 = new Button("1");
   		b2 = new Button("2");
   		b3 = new Button("3");
   		b4 = new Button("4");
   		b5 = new Button("5");
   		b6 = new Button("6");
   		b7 = new Button("7");
   		b8 = new Button("8");
   		b9 = new Button("9");
   		bAdd = new Button("+");
   		bSub = new Button("-");
   		bMul =new Button("*");
   		bDiv = new Button("/");
   		bDot = new Button(".");
   		bEqual = new Button("=");
   		bClear = new Button("AC");
   		
   		    //  Calling myFontStyle Method
   		myFontStyle(b0);
   		myFontStyle(b1);
   		myFontStyle(b2);
   		myFontStyle(b3);
   		myFontStyle(b4);
   		myFontStyle(b5);
   		myFontStyle(b6);
   		myFontStyle(b7);
   		myFontStyle(b8);
   		myFontStyle(b9);
   		myFontStyle(bAdd);
   		myFontStyle(bSub);
   		myFontStyle(bMul);
   		myFontStyle(bDiv);
   		myFontStyle(bDot);
   		myFontStyle(bEqual);
   		myFontStyle(bClear);
   		
   		
   		l1.setBackground(Color.white);
		b0.setBackground(Color.red);
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		b5.setBackground(Color.red);
		b6.setBackground(Color.red);
		b7.setBackground(Color.red);
		b8.setBackground(Color.red);
		b9.setBackground(Color.red);
		bAdd.setBackground(Color.red);
		bSub.setBackground(Color.red);
		bMul.setBackground(Color.red);
		bDiv.setBackground(Color.red);
		bDot.setBackground(Color.red);
		bEqual.setBackground(Color.red);
		bClear.setBackground(Color.red);
		
	    f.setBackground(Color.black); 
   	}
   	
          //  Add Components Method
	private void addComponents() {
	
        f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(bAdd);
		f.add(bSub);
		f.add(bMul);
		f.add(bDiv);
		f.add(bDot);
		f.add(bEqual);
		f.add(bClear);
		
	}
	
	    //  Registration Components Method
	private void registrationComponents() {
	
		MyListener ml = new MyListener(this);
		b0.addActionListener(ml);
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		b4.addActionListener(ml);
		b5.addActionListener(ml);
		b6.addActionListener(ml);
		b7.addActionListener(ml);
		b8.addActionListener(ml);
		b9.addActionListener(ml);
		bAdd.addActionListener(ml);
		bSub.addActionListener(ml);
		bMul.addActionListener(ml);
		bDiv.addActionListener(ml);
		bDot.addActionListener(ml);
		bEqual.addActionListener(ml);
		bClear.addActionListener(ml);
	
		FrameClose fc = new FrameClose(this);
		f.addWindowListener(fc);
	}
	
	    //  setFontStyling
	void myFontStyle(Component c) {
		c.setFont(new Font(Font.DIALOG,Font.BOLD,30));
	}
	
}
