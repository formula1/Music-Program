import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import java.util.LinkedList;
import java.util.List;


class LiveInputManager extends AbsManager{
	public LiveInputManager(){
		super();
	}

	public JPanel getIndividual(Mixer.Info info){
		JPanel ret = new JPanel();
		ret.add(new JLabel(info.getName()));
		ret.add(new JLabel(info.getDescription()));
		ret.add(new JLabel(info.getVendor()));
		ret.add(new JLabel(info.getVersion()));
		return ret;
	}
	
	protected Mixer.Info[] getMixers(){
		List<Mixer.Info> ret = new LinkedList();

		Mixer.Info[] in = AudioSystem.getMixerInfo();

		for(Mixer.Info i:in){
			Mixer temp = AudioSystem.getMixer(i);
			if(temp.getSourceLineInfo().length > 0){
				ret.add(i);
			}
		}
		return ret.toArray(new Mixer.Info[ret.size()]);
	}

}//end class