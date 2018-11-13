import java.util.Arrays;
public class LotsOfCopies {
//part 1
	public static void main (String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num, strMain, arrMain);
		System.out.println("Part 1:");
		System.out.println("num:" + num);
		System.out.println("strMain:" + strMain);
		System.out.println("arrMain:" + Arrays.toString(arrMain));
		
		part2WithInts();
		part2WithStrings();
		part2WithArrays();
	
	}
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str+=str;
		arr[2]=2;
	}
//part 2
	public static void part2WithInts() {
		System.out.println("Part 2:");
		int a =7;
		int b = a;
		a = 1;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	public static void part2WithStrings() {
		String a ="Hi";
		String b = a;
		a = "lulululu";
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	public static void part2WithArrays() {
		int[] a = {1,2,3,4,5};
		int[] b = a;
		a[1] = 3 ;
		System.out.println("a:" + Arrays.toString(a));
		System.out.println("b:" + Arrays.toString(b));
	}


}
