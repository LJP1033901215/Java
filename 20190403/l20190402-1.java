import java.util.*;
public class l201904021{
	public static void main(String[] args){
		int a=1;
		a=++a;
		a=a++;
		a=a++ + ++a;
		System.out.println(a-- + ++a + a++ +a);
		System.out.println(a);
	}
}