package awt.mygui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

	MyCalculator mc;
	public MyListener(MyCalculator mc){
		this.mc = mc;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mc.b0) {
			mc.num1 = mc.l1.getText();
			mc.num2="0";
			mc.num3=mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b1) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "1";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b2) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "2";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b3) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "3";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b4) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "4";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b5) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "5";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b6) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "6";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b7) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "7";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b8) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "8";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.b9) {
			mc.num1 = mc.l1.getText();
			mc.num2 = "9";
			mc.num3 = mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
		}
		if(e.getSource()==mc.bDot) {
			mc.num1 = mc.l1.getText();
			if(!mc.num1.isEmpty()) {
				mc.num2=".";
			mc.num3=mc.num1+mc.num2;
			mc.l1.setText(mc.num3);
			}
		}
		if(e.getSource()==mc.bAdd) {
			mc.num4 = mc.l1.getText();
			mc.l1.setText("");
			mc.operation = 1;
		}
		if(e.getSource()==mc.bSub) {
			mc.num4 = mc.l1.getText();
			mc.l1.setText("");
			mc.operation = 2;
		}
		if(e.getSource()==mc.bMul) {
			mc.num4 = mc.l1.getText();
			mc.l1.setText("");
			mc.operation = 3;
		}
		if(e.getSource()==mc.bDiv) {
			mc.num4 = mc.l1.getText();
			mc.l1.setText("");
			mc.operation = 4;
		}
		if(e.getSource()==mc.bClear) {
			mc.l1.setText("");
		}
		if(e.getSource()==mc.bEqual) {
			Double d1 = null,d2=null,d3;
			mc.num5 = mc.l1.getText();
			// check label is empty
			if(!mc.num5.isEmpty()) {
				d1 = Double.parseDouble(mc.num4);
				d2 = Double.parseDouble(mc.num5);
			}
			switch(mc.operation) {
			case 1:
				d3 = d1 + d2;
				mc.l1.setText(String.valueOf(d3));
				break;
			case 2:
				d3 = d1 - d2;
				mc.l1.setText(String.valueOf(d3));
				break;
			case 3:
				d3 = d1 * d2;
				mc.l1.setText(String.valueOf(d3));
				break;
			case 4:
				d3 = d1 / d2;
				mc.l1.setText(String.valueOf(d3));
				break;
			}
		}
	}
}
