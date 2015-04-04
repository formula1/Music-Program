import java.util.ArrayList;



class MusicProject implements Runnable{
public static Long time;
public static Long hertz;
ArrayList<Channel> channels;


public MusicProject(location){

}

public start(){
}

public run(){
	while(true){
		if(Long.compare(time - System.nanoTime(),hertz) >= 0){
			for(int i = 0;i<channels.size();i++){
				channels.get(i).go();
			}
		}
	}
	// 1 hert = 1 beat per second
	// 2 hertz = 2 beats per second
	//.5 hertz = .5 beats per second
	// need to multiply hertz by 1000000000 or 1,000,000,000
}

public void changeHertz(float h){
	hertz = (h*1000000000).LongValue();
}

}//end class

/*
How do I want to design this?

I could create 2 forms of time signiture concepts
-I base all of the sounds off of Real time
-I base all of the sounds off of metronome
	--Metronome might be better in that it will allow the person to speed the project 
	or slow it down in terms of hertz without creating too much of an issue in terms of 
	mathing out the individual times of all of the samples
		-if I were to batch change the hertz, then I batch change them regardless

so now how do I design the individuals?

Alright so Everything is based off metronome....

When Metronome hits, check what sounds to play

Do I....
create Channels as individual objects?
-On each metronome hit I'll send the channel the specific time
	-The metronome will then either say "yes I will play a sound" or "no I wont"
	-Transormations are live so I'm not too worried about that




*/