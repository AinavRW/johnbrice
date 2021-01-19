package exercise4;

public class While3 {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 101);
		int i = 0;
		
		while (i!=n) {
			if (i%2==0) {
				System.out.println(i);
				
			}
			i++;
			
		}
			
	}

}
