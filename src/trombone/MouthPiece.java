package trombone;

public class MouthPiece {
	
	public enum RimSize{Wide,Narrow,Round,Sharp};
	public enum CupSize{Large,Small,Deep,Shallow};
	public enum Throat{Large,Small}
	
	private RimSize rimSize;
	private RimSize rimMod;
	private CupSize cupSize;
	private int cupDiameter;
	private CupSize cupMod;
	private Throat throat;
	
	private int backBore;
	private String description;

	public MouthPiece(RimSize rimSize, CupSize cupDepth, int cupDiameter, Throat throat, int backBore, String description){
		this.rimSize = rimSize;
		this.cupSize = cupDepth;
		this.backBore = backBore;
		this.throat = throat;
		this.description = description;
		this.cupDiameter = cupDiameter;
	}
	public MouthPiece(){
		this.rimSize = RimSize.Sharp;
		this.cupSize = CupSize.Shallow;
		this.throat = Throat.Large;
		
	}
}
