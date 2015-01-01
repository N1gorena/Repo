package midiParser;

import trombone.Note;
import jm.JMC;
import jm.music.data.*;
import jm.music.tools.*;
import jm.util.*;

public class MidiGate {
	
	public MidiGate(){
	}

	public boolean parseMidiFile(String file){
		Score theScore = new Score("FullScore");
		Read.midi(theScore,file);
		theScore.clean();
		//System.out.println(theScore.getKeyQuality());
		//System.out.println(theScore.getSize());
		Part firstPart = theScore.getPart(0);
		//System.out.println(firstPart.getInstrument());//79 is a whistle
		Phrase firstPhrase = firstPart.getPhrase(0);
		
		return true;
		
	}
}
