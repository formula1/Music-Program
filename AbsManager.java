import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

import java.util.ArrayList;


abstract class AbsManager extends JPanel implements ActionListener{
	JComboBox list;
	ArrayList<Mixer> open_mixers;

	public AbsManager(){
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		list = new JComboBox();
		Mixer.Info[] info = getMixers();
		for(int i=0;i<info.length;i++){
			list.addItem(info[i].getName());
		}
		list.addActionListener(this);
		this.add(list);
	}


	public JPanel getSettings(){
		list.setSelectedIndex(0);
		return this;
	}
	abstract protected Mixer.Info[] getMixers();
	abstract protected JPanel getIndividual(Mixer.Info inf);
	
	public void actionPerformed(ActionEvent e){
		this.setVisible(false);
		Component[] etc = this.getComponents();
		for(int i=0;i<etc.length;i++){
			if(etc[i] != list){
				this.remove(etc[i]);
			}
		}
		this.add(getIndividual(
			getMixers()[list.getSelectedIndex()]
		));
		this.setVisible(true);
		/*
			Going to grab the appropiate element
			Set the panel to the appropiate labels
		*/
	}
	
}//end class