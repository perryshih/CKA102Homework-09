package hwext;

public class hwext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Champion Ashe = new Champion("Ashe", 1, 0);
		Champion Garen = new Champion("Garen", 1 ,0);
		Champion Mordekaiser = new Champion("Mordekaiser", 1, 0);
		
		Ashe.setAttack(new Attack("萬箭齊發"));
		Ashe.setMove(new Move());
		Ashe.setDefend(new Defend());
		
		Garen.setAttack(new Attack("致命打擊"));
		Garen.setMove(new Move());
		Garen.setDefend(new Defend("勇氣"));
		
		Mordekaiser.setAttack(new Attack());
		Mordekaiser.setMove(new Move());
		Mordekaiser.setDefend(new Defend("不滅之軀"));
		
//		Ashe.attack();
//		Ashe.defend();
//		Ashe.move();
//		
//		Garen.attack();
//		Garen.defend();
//		Garen.move();
		
		Ashe.behavior();
		Garen.behavior();
		Mordekaiser.behavior();
		
	}

}
