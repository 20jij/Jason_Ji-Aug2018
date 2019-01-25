public class Pikachu {
	
	public static String base() {
		return "|\"\"\"\"\"\"\"\"\"\"|\n";
	}
	
	public static String upHalf() {
		String up = "";
		int start = 8;
		for (int i = 1; i < 5; i++) {
			for (int k =0; k < i; k++) {
				up += " ";
			}
			up += "\\";
			int j = start;
			while (j > 0) {
				up += ":";
				j -= 1;
			}
			start -= 2;
			up += "/\n";
		}
		return up + "     ||\n";
	}
	
	public static String lowerHalf() {
		String down = "";
		int start = 2;
		for (int i = 1; i < 5; i++) {
			for (int k = 5; k > i; k--) {
				down += " ";
			}
			down += "/";
			int j = start;
			while (j > 0) {
				down += ":";
				j -= 1;
			}
			start += 2;
			down += "\\\n";
		}
		return down;
	}
	
	
	public static String hourglass() {
		return base() + upHalf() + lowerHalf() + base();
	}
	
	public static void main(String[] args) {
		System.out.println(hourglass());
	}

}

