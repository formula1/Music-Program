import javax.swing.JFrame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class Init implements WindowListener{
	AbsManager[] mixers;
	JFrame j;
	public static void main(String args[]){
		try{
			Init st = new Init();
			st.go();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void go() throws Exception{
		mixers = new AbsManager[3];
		mixers[0] = new LiveInputManager();
//		mixers[2] = new LiveOutputManager();
		j = new JFrame();
		j.add(mixers[0].getSettings());
//		j.add(mixers[2].getSettings());
		j.addWindowListener(this);
		j.setVisible(true);
	
	}
	public void windowClosed(WindowEvent e){
		System.exit(0);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		if(true)
			j.dispose();
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}


/*


Organization
-Initializer
-Renderer
-Timeline



Goals of the Music Program

Simple
1) To allow me to drag and drop samples to a timeline
	-Need a scrollable timeline
2) samples will snap to the Time signature of my choosing
3) allow it to loop

Live Beats
1) Allow me to make "live beats" by assigning inputs to specific sounds
2) Create a metronome
3) Allow the Live beats to snap to the time signiture as well

Custome Sounds
1) Adjust waves
2) Combine Waves
3) Apply Volume Effects based on graphs volume over time equations


*/