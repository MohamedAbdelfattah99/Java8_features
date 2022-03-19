package defaultMethods;

public interface parentInterface {
	
	 public void getSum(int x, int y);
	 public void getSub(int x,int y);
	default public void printStatus(int x,int y ) {
		System.out.println(x);
		System.out.println(y);
		
	}
	
}
