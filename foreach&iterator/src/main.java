import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		ArrayList<login>users=new ArrayList<login>();
		users.add(new login("mohame", "123"));
	
		users.add(new login("ahmed", "123456"));
		
		users.add(new login("mostafa", "123465451"));
		
		
		// foreaach
		for (login user : users) {
			System.out.println("username ="+user.userName);
			System.out.println("password ="+user.pasword);
		}
		
		//iterator 
		Iterator<login>ite=users.iterator();
		while (ite.hasNext()) {
			login temp=ite.next();
			System.out.println(temp.userName +temp.pasword);
			
		}
		
		//lambda 
		users.forEach(user->{
			System.out.println("username ="+user.userName);
			System.out.println("password ="+user.pasword);
			
		});
		
	}

}
