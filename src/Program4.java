
public class Program4 {
	public static void main(String[] args) {
		//int j=0;
		String str1="yashhwannth";
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;i<ch.length-1;i++) {
				if(ch[i]==ch[j]) {
					ch[j]=ch[i];
				}
				System.out.print(ch[j]);
			}
			
			
		}
	}

}
