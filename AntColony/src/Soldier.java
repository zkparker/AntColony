
public class Soldier extends Ants {

	private boolean balaPresent;
	private boolean scoutMode;
	private boolean attackMode;

	public Soldier() {
		this.id = id++;
		this.name = "Soldier";
	}

	public boolean getBalaPresent() {
		return balaPresent;
	}
	
	public boolean getScoutMode(){
		return this.scoutMode;
	}
	
	public boolean setScoutMode(){
		return this.scoutMode;
	}
	
	public boolean getAttackMode(){
		return this.attackMode;
	}
	
	public boolean setAttackMode(){
		return this.attackMode;
	}

}
