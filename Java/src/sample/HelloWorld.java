package sample;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Hello \nWorld\n");

//		String s = "夕日";
//		System.out.println("s=" + s.hashCode());
//
//		System.out.println("夕日=" + "夕日".hashCode());
		int[] s = new int[3];
		s[0] = 1;
		s[1] = 2;
		s[2] = 3;

		System.out.println("s="+s.hashCode());

	}
}
