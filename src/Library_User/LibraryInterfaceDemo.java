package Library_User;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KidUsers kid = new KidUsers();
		KidUsers secondKid = new KidUsers();
		
		kid.setAge(10);
		secondKid.setAge(18);
		kid.registerAccount();
		secondKid.registerAccount();
		kid.setBookType("Kids");
		secondKid.setBookType("Fiction");
		kid.requestBook();
		secondKid.requestBook();
		
		AdultUser adult1 = new AdultUser();
		adult1.setAge(5);
		adult1.registerAccount();
		adult1.setBookType("Kids");
		adult1.requestBook();
		
		AdultUser adult2 = new AdultUser();
		adult2.setAge(23);
		adult2.registerAccount();
		adult2.setBookType("Fiction");
		adult2.requestBook();
		
		
	}

}
