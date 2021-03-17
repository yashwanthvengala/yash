
public class Program3 {
	public static void main(String[] args) {
		String str1 = "yashwanth";

		String str2 = "";
		char[] ch = str1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			str2 = str2 + ch[i];
			// System.out.println(str2);

		}
		System.out.println(str2);

	}

}
