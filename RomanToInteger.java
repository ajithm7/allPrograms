
import java.util.HashMap;
import java.util.Scanner;

public class RomanInteger {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		RomanInteger roman = new RomanInteger();
		roman.solving();

	}

	
	private void solving() {
		System.out.println("Enter your number : ");
		String k = scanner.nextLine();
		int n = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("M", 1000);
		map.put("D", 500);
		map.put("C", 100);
		map.put("L", 50);
		map.put("X", 10);
		map.put("V", 5);
		map.put("I", 1);
		String string = "";
		String before = "";
		for (int i = 0; i < k.length(); i++) {
			
			string += k.charAt(i);
			if (i - 1 >= 0) {
				before += k.charAt(i - 1);
			}
			
			switch (string) {
			
			case "M" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 800;
					else n+= 1000;
				}else n+= 1000;
			}
			case "D" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 300;
					else n+= 500;
				}else n+= 500;
			}
			case "C" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 80;
					else n+= 100;
				}else n+= 100;
			}
			case "L" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 30;
					else n+= 50;
				}else n+= 50;
			}
			case "X" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 8;
					else n+= 10;
				}else n+= 10;
			}
			case "V" -> {
				if (i - 1 >= 0) {
					if (map.get(before) < map.get(string))
						n += 3;
					else n+= 5;
				}else n+= 5;
			}
			case "I" -> n += 1;
			}
		string="";}
		System.out.println(n);

	}
}

