package hwext;

interface InterfaceDefend{
	void defend();
}

public class Defend implements InterfaceDefend{
	private String d;
	
	public Defend(String d) {
		setDefend(d);
	}
	public Defend() {
		setDefend("擋不了");
	}
	
	public void setDefend(String d) {
		this.d = d;
	}
	
	public String getDefend() {
		return d;
	}
	public void defend() {
		System.out.println(getDefend());
	}
}
