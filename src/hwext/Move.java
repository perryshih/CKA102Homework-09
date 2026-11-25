package hwext;

interface InterfaceMove{
	void move();
}

public class Move implements InterfaceMove{
	private String m;
	
	public Move(String m) {
		setMove(m);
	}
	public Move() {
		setMove("走位");
	}
	
	public void setMove(String m) {
		this.m = m;
	}
	
	public String getMove() {
		return m;
	}
	
	public void move() {
		System.out.println(getMove());
	}
}
