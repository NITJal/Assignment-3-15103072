import java.util.*;
public class CircularShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string:");
		s=sc.nextLine();
		String s1=new String();
	    int p=0;
	    while(p!=s.length())
		{
			s1+=s.substring(1, s.length());
			s1+=s.substring(0,1);
			s=s1;
			s1="";
			System.out.println(s);
			p++;
		}
	}

}
