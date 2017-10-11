public class Ants {
	
	public int id;
	public int lifeSpan;
	public int movement;	
	public boolean dead = false;
	public String name;
	
	public Ants(){
		this.id++;
	}
	
	
	public int getId(){
		return this.id;
	}
	
	public int setId(){
		return this.id;
	}
	
	public int getLifeSpan(){
		return this.lifeSpan = 365;
	}
	
	public int setLifeSpan(){
		return this.lifeSpan;
	}
	
	public boolean getDeadOrAlive(){
		return true;
	}
	
	public int getMovement(){
		return this.movement;
	}
	
	public int setMovement(){
		return this.movement;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String setName(){
		return this.name;
	}

}
