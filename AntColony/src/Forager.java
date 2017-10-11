
public class Forager extends Ants {
	
	private int movementHistory;
	private int carryingFood;
	private boolean forageMode;
	private boolean returnToNestMode;

	public Forager(){
		this.name = "Forager";
		this.id = id++;
	}
	
	public int getMovementHistory(){
		return this.movementHistory;
	}
	
	public int setMovementHistory(){
		return this.movementHistory;
	}
	
	public int getCarryingFood(){
		return this.carryingFood;
	}
	
	public int setCarryingFood(){
		return this.carryingFood;
	}
	
	public boolean getForageMode(){
		return this.forageMode;
	}
	
	public boolean setForageMode(){
		return this.forageMode;
	}
	
	public boolean getReturnToNestMode(){
		return this.returnToNestMode;
	}
	
	public boolean setReturnToNestMode(){
		return this.returnToNestMode;
	}
}
