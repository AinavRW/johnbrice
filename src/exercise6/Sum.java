package exercise6;

public class Sum {
		
	public Sum (int defaultValue) {
		sum = defaultValue;
	}
	
		private int sum;
		
		public void add(int num) {
			this.sum += num; 
			
		}
		public int getSum() {
			return sum;
		}
		
		
	}

