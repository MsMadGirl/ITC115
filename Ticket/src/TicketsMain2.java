//client program 2
public class TicketsMain2 {
	
	//doesn't actually work
	//i give up
	//this is already late
	//i have too much else to do to continue messing with this
	
	public static void main(String[] args) {
		
		AdvanceTickets adv1 = new AdvanceTickets(1, 20);
		AdvanceTickets adv2 = new AdvanceTickets(2, 9);
		AdvanceTickets adv3 = new AdvanceTickets(3, 10);
		
		StudentAdvanceTickets sadv1 = new StudentAdvanceTickets(4, 30);
		StudentAdvanceTickets sadv2 = new StudentAdvanceTickets(5, 7);
		StudentAdvanceTickets sadv3 = new StudentAdvanceTickets(6, 10);
		
		WalkupTickets walk1 = new WalkupTickets(7);
		WalkupTickets walk2 = new WalkupTickets(8);
		
		System.out.println(adv1.toString());
		System.out.println(adv2.toString());
		System.out.println(adv3.toString());
		System.out.println(sadv1.toString());
		System.out.println(sadv2.toString());
		System.out.println(sadv3.toString());
		System.out.println(walk1.toString());
		System.out.println(walk2.toString());
		
	}

}
