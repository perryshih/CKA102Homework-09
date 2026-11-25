package hwext;

interface InterfaceAttack{
	void attack();
}

public class Attack implements InterfaceAttack{
	private String a;
	
	public Attack(String a) {
		setAttack(a);
	}
	public Attack() {
		setAttack("平A穿插普攻");
	}
	
	public void setAttack(String a) {
		this.a = a;
	}
	
	public String getAttack() {
		return a;
	}
	
	public void attack() {
		System.out.println(getAttack());
	}
}

