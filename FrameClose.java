package awt.mygui;

import java.awt.event.WindowAdapter;
// import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
public class FrameClose extends WindowAdapter {

	MyCalculator mc;
	public FrameClose(MyCalculator mc) {
		this.mc = mc;
	}
	public void windowClosing(WindowEvent e) {
		mc.f.dispose();
	}
}
