
public class login {
	String userName;
	String pasword;
	public login(String userName,String password) {
		this.pasword=password;
		this.userName=userName;
	}
	public boolean isWeak() {
		if(this.pasword.length()<4) {
			return true;
		}
		return false;
		}
}
