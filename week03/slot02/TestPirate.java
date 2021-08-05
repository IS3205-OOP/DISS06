package week03.slot02;

public class TestPirate {

	public static void main(String[] args) {
		Pirate pirate1 = new Pirate("Bakar", -10);
		System.out.println(pirate1);
		System.out.println(Pirate.numPirate);
		
		Pirate pirate2 = new Pirate("Curi", 5);
		System.out.println(pirate2);
		System.out.println(Pirate.numPirate);
		Pirate pirate3 = new Pirate("Daging", 8);
		System.out.println(pirate3);
		System.out.println(Pirate.numPirate);
		
		pirate2.health--;
		
		System.out.println(pirate1);
		System.out.println(pirate2);
		System.out.println(pirate3);
		
//		System.out.println(pirate1.name);
//		System.out.println(pirate1.health);
		
//		pirate1.name = "Abu";
//		pirate1.health = -5;
		
//		System.out.println(pirate1.name);
//		System.out.println(pirate1.health);
	}
	
}
