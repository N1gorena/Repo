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
	private MidiChannel T_bone;
	private int volume;
	private final int trombone = Instruments.TROMBONE;
	
	public Trombone() throws MidiUnavailableException{
		this.synth = MidiSystem.getSynthesizer();
		this.synth.open();
		
		Soundbank soundbank = synth.getDefaultSoundbank();
		Instrument[] instr = soundbank.getInstruments();
		synth.loadInstrument(instr[Instruments.TROMBONE]);
		
		MidiChannel[] channels = synth.getChannels();
		this.T_bone = channels[channel];
		this.T_bone.programChange(instr[trombone].getPatch().getBank(),instr[trombone].getPatch().getProgram());
	}

	public void playNote(int freq, int volumen) throws InterruptedException{
		T_bone.noteOn(freq, volumen);
		Thread.sleep(1000);
		T_bone.noteOff(freq, volumen);
	}
	
}
