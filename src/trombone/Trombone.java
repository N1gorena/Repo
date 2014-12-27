package trombone;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;

import jm.constants.Instruments;



public class Trombone {
	private final int channel = 1;
	private int duration = 200;
	private Synthesizer synth;
	private int volume;
	private final int trombone = Instruments.TROMBONE;
	
	public Trombone() throws MidiUnavailableException{
		this.synth = MidiSystem.getSynthesizer();
		this.synth.open();
		
		Soundbank soundbank = synth.getDefaultSoundbank();
		Instrument[] instr = soundbank.getInstruments();
		synth.loadInstrument(instr[Instruments.TROMBONE]);
		
		MidiChannel[] channels = synth.getChannels();
		channels[channel].programChange(instr[trombone].getPatch().getBank(),instr[trombone].getPatch().getProgram());
		
	}
	
	/*public static void main(String[] args){
		int channel = 1;
		int volume = 80;
		int duration = 200;
		
		try{
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			
			Soundbank soundbank = synth.getDefaultSoundbank();
			Instrument[] instr = soundbank.getInstruments();
			synth.loadInstrument(instr[Instruments.TROMBONE]);
			
			MidiChannel[] channels = synth.getChannels();
			channels[channel].programChange(instr[Instruments.TROMBONE].getPatch().getBank(),instr[Instruments.TROMBONE].getPatch().getProgram());
			
			channels[channel].noteOn(60, volume);
			Thread.sleep(1000);
			synth.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public void playNote(int freq, int volumen) throws InterruptedException{
		MidiChannel[] channels = this.synth.getChannels();
		channels[channel].noteOn(freq, volumen);
		Thread.sleep(duration);
	}
	
}
