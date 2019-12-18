package hk222su_assign3;

public class Weapon {
	private String name;
	private int dice;
	
	public Weapon() {
		
	}
	
	public Weapon(String name, int dice) {
		setName(name);
		setDice(dice);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
		
	}
	
	public void setDice (int dice) {
		this.dice = dice;	
	}
	
	public int getDice() {
		return dice;
	}

	

}
