
public class Program5 {
	public static void main(String[] args) {
		String str="yashw@#4$hwa*&";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]>64&&ch[i]<122) {
				System.out.println(ch[i]);
			}
		}
	}

}
