package lamda;

public class main {

	public static void main(String[] args) {
		
	//without lambda
		childClass c=new childClass();
		c.print();
		
		///with lambda
		parentInter p=()->{
			System.out.println("atfer using lambda");
		};
		p.print();
	}

}