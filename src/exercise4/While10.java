package exercise4;

public class While10 {
	public static void main(String[] args) {
		int num = (int) (Math.random() *1001);
		System.out.println(num);
	
		
		while (num>9) {
			num = num/10;
			
		}
		System.out.println((int)num);
	}

}
