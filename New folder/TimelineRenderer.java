import javax.Swing.JFrame;
import java.util.ArrayList;
import java.io.File
import java.io.BufferedReader;
/*
User/appplication sends a loctaion to load from
-If the application has already had it opened then it will just switch to that and ask
	-Have there been any changes?
		yes-Theres been changes made to this application 
		no-Just swicth to that window

This may need to go ot window manager class, but whatever

*/


class TimelineRenderer{
ArrayList<JFrame> windows


public TimelineRenderer(String location){

}

private JPanel render(location){
	BufferedReader br = new BufferedReader(new FileReader(loctaion));
	String line;
	while((line = br.readline()) != null){
	
	}
	br.close();
}

public JFrame load(String location){
	if(location == ""){
		return new JFrame();
	}
	if(File.exists(location)){
		JFrame ret = new JFrame();
		try{
			ret.add(this.render(location));
		}catch{
			
		}
	}else{
		throw new Exception("Couldn't Find File");
	}
}

}//End Class