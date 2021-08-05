package week03.slot02;

public class TestMap {
	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate("Abu", 5);
		map.arena[3][2] = pirate1;
		printArena(map);
		
		map.arena[1][1] = new Pirate("Bakar", 8);
		printArena(map);
		
		map.arena[4][4] = new Pirate("Curi", 3);
		printArena(map);
		
		boolean success = 
				map.addPirate(0, 4, new Pirate("Daging", 6));
		if(success) {
			System.out.println("Add Successful");
		} else {
			System.out.println("Add Failed");
		}
		printArena(map);
		
		success = map.addPirate(4, 1, null);
		if(success) {
			System.out.println("Add Successful");
		} else {
			System.out.println("Add Failed");
		}
		printArena(map);
		
		map.arena[3][2].attackOtherPirate(map.arena[0][2]);
		printArena(map);
		
		map.addPirate(4, 1, new Pirate());
		printArena(map);
		
		map.movePirate(0, 4, 4, 1);
		printArena(map);
		
		map.movePirate(0, 4, 4, 1);
		printArena(map);
		
		map.movePirate(3, 2, 0, 2);
		printArena(map);
		
		map.movePirateRight(0, 2);
		printArena(map);
		
		map.movePirateUp(1, 2);
		printArena(map);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.arena[0].length; y++) {
			for(int x = 0; x < map.arena.length; x++) {
				System.out.print(map.arena[x][y] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
