package phone;

public class PhoneTester {
	
	public static void main(String[] args) {
		IPhone ip= new IPhone("X",100,"AT&T","RING RING RING");
		Galaxy s6=new Galaxy("S6",99,"Verizon","TONT TONT TONT");
		
		ip.displayInfo();
		System.out.println(ip.unlock());
		System.out.println(ip.ring());
		s6.displayInfo();
		System.out.println(s6.unlock());
		System.out.println(s6.ring());
		
		
	}
}
