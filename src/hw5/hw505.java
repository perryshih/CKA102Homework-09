package hw5;

public class hw505 {
	public static final String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hw505 fn = new hw505();
		
		System.out.println(fn.genAuthCode());
	}
	
	public String genAuthCode() {
		String ver_code = "";
		int rd_num = 0;
		
		for (int i = 0; i < 8; i++) {
			rd_num = (int)(Math.random() * charPool.length());
			ver_code += charPool.charAt(rd_num);
		}
		
		return ver_code;
	}
}
