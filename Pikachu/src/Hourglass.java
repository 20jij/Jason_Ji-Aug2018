
public class Hourglass {
	public static String printBase() {
		return "|\"\"\"\"\"\"\"\"\"\"|\n";
	}
	public static String printMiddle() {
		return "     ||\n";
	}
	public static String printTopHalf() {
		String tophalf = "";
		int numbersOfColons = 8;
		for (int i = 1; i<5; i++) { 
			for (int a = 0; a<i ; a++){
				tophalf = tophalf + " ";
			}
			tophalf = tophalf + "\\";
			for (int colon = numbersOfColons; colon>0; colon--) {
				tophalf = tophalf + ":";
				}
			numbersOfColons = numbersOfColons - 2;
			tophalf = tophalf +"/\n";
			}	
		return tophalf;
		}
		
	
	public static String printBottomHalf(){
		String bottomHalf = ""; 
		int numbersOfColons = 2;
		for (int i =1; i<5; i++) {
			for (int a = 5; a>i ; a--){
				bottomHalf = bottomHalf + " ";
			}
			bottomHalf = bottomHalf + "/";
			for (int colon = numbersOfColons; colon>0; colon--) {
				bottomHalf = bottomHalf + ":";
				}
			numbersOfColons = numbersOfColons +2;
			bottomHalf = bottomHalf +"\\\n";
			}	
		return bottomHalf;
		}

	
	public static void main(String[] args) {
		String output = printBase() + printTopHalf() + printMiddle() + printBottomHalf()  + printBase() ;
		System.out.println(output);
}	
}

