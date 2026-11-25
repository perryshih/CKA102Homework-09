package hwext;

public class hwext1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen[] pen = new Pen[2];
		pen[0] = new Pencil("ABC", 10);
		pen[1] = new InkBrush("DEF", 20);
		
		for(int i = 0; i < pen.length; i++) {
			System.out.println(pen[i].getPrice());
			pen[i].write();
		}
	}

}
