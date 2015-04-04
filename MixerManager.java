import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.AudioSystem;
import javax.swing.JLabel;

class MixerManager extends AbsManager{
	
	public MixerManager(){
		super();
	}

	public JPanel getSettings(){
		list.setSelectedIndex(0);
		return settings;
	}

	public void setSettings(String[] settings){

	}

	private Mixer.Info[] getMixers(){
		return AudioSystem.getMixerInfo();
	}
	

}//end class


/*
When opening the Mixer Manager
-Get a list of the mixer managers
--Add a listener to the list
	-on hit, get the info and settings of that index number
-Set it to first index





*/