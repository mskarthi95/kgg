package builderpattern;

public class Shop {

	public static void main(String[] args) {
		
		Phone p = new PhoneBuilder().setOs("android").getphone();
		Phone p1 = new PhoneBuilder().setOs("ios").getphone();
		System.out.println(p);
		System.out.println(p1);
	}

}
