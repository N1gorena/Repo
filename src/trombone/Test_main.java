package trombone;


import javax.sound.midi.MidiUnavailableException;
import midiParser.MidiGate;

public class Test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trombone trombone = null;
		
		try {
			trombone = new Trombone();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int testVolume = 300;
		int testLength = 100;
		
		//Length then Volume
		Note n1 = new Note("C4", testLength, testVolume);
		
		try {
			trombone.playNote(n1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MidiGate parser = new MidiGate();
		parser.parseMidiFile("saria_song.mid");
	}	
}
