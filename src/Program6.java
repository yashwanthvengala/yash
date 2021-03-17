
public class Program6 {
	public static void main(String[] args) {
		String str= "codility";
		String str1="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println(ReturnDuplicate(ch));
		}
	public static int ReturnDuplicate(char[] ch) {
		int n=0;
		if(n==0||n==1) {
			return n;
		}
		int j=0;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=ch[i+1]) {
				ch[j++]=ch[i];
			}
			ch[j++]= (char) ((char)ch.length-1);
			return j;
		
		}
		return j;
		
	}

}
