package hwext;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private InterfaceDefend defendskill;
	private InterfaceAttack attackskill;
	private InterfaceMove moveskill;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setAttack(InterfaceAttack attack) {
		this.attackskill = attack;
	}	
	public void setDefend(InterfaceDefend defend) {
		this.defendskill = defend;
	}
	public void setMove(InterfaceMove move) {
		this.moveskill = move;
	}
	
	public void attack() {
		attackskill.attack();
	}
	
	public void move() {
		moveskill.move();
	}
	
	public void defend() {
		defendskill.defend();
	}
	
	public void behavior() {
		attackskill.attack();
		moveskill.move();
		defendskill.defend();
	}
}
