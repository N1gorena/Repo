package trombone;


import java.io.File;
import java.io.IOException;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.constants.Pitches;
import jm.constants.RhythmValues;

public class Test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Trombone trombone = new Trombone();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
}
