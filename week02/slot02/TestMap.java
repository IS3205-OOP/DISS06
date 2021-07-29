package week02.slot02;

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
