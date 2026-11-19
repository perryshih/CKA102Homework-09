package hw4;

public class colleague {
	private int id;
	private int money;
	public colleague(int id, int money) {
		setId(id);
		setMoney(money);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
}
