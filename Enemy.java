package hk222su_assign3;



public class Enemy {
	private String name = "Jane Doe";
	private int attackDice = 1;
	private int defenceDice = 1;
	private int xpPoint = 50;
	private int dice;
	private int fist;
	
public Enemy(){}
	
	public Enemy(String name, int attack, int defence, int xpPoint){
		setName(name);
		setAttack(attack);
		setDefence(defence);
		setXpPoint(xpPoint);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;		
	}
	
	public void setAttack(int attack) {
		if(attack > 0)
			this.attackDice = attack;		
	}
	
	public int getAttack() {
		return attackDice;		
	}
	
	public void setDefence(int defence) {
		if(defence > 0)
			this.defenceDice = defence;		
	}
	
	public int getDefence() {
		return defenceDice;		
	}
	
	public void setXpPoint(int xpPoint) {
		if (xpPoint > 0)
			this.xpPoint = xpPoint;				
	}
	
	public int getXpPoint() {
		return xpPoint;		
	}
	
	public int getDice() {
		dice = (int) (Math.random()*5 +1);
		return dice;		
	}
	
	 public int attack() {
		 int points = (attackDice * getDice());		 
		return points;		 	 
	 }
	 
	 public int defence() {
		 int points = (defenceDice * getDice());		 
		return points;		 	 
	 }
	 
	 
	 public int getFist() {
		  fist = (int) ( Math.random () * 14 + 1);
		  return fist;
	 }
	 
	 public int hurtPoints() {	 			 
			       	int hurt = getFist();
			    	return hurt;}
						
}		
	
	
	
	
	

