
public class Bala extends Ants {
	
	private int entrance;
	private boolean attack;
	
	public Bala() {
		this.name = "Bala";
		this.id = id++;
	}
	
	public int getEntrance(){
		return this.entrance;
	}
	
	public int setEntrance(){
		return this.entrance;
	}
	
	public boolean getAttack(){
		return attack;
	}
	
	public boolean setAttack(){
		return attack;
	}
}
