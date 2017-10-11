

public class Queen extends Ants {
	
	private int hatch;
	private int foodConsumption;
	
	public Queen(){
		this.name = "Queen";
		this.id = 0;
		this.lifeSpan = 365 * 20;
	}
	

	public int setMovement(){
		return 0;
	}
		
	public int getFoodConsumption(){
		if(hatch == 0){
			foodConsumption = 1;
		}
		return this.foodConsumption;
	}
	
	public int setFoodConsumption(){
		return this.foodConsumption;
	}
	
	public void getHatch(){
		//Determine what type of any to be hatched?
		
	}
	

}
