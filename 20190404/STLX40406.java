import java.util.*;
public class STLX40406{
public static void main(String[] agrs)
	{
		String zfc ="����λ��еĴ��ֵĺ������ǳ���";
		f(zfc,'��');
	}
	public static void f(String zfc,char ch)
	{
		for(int i=0;i<zfc.length();i++)
		{
			char x =zfc.charAt(i);
			if(x==ch)
			{
			System.out.print(i);
			}
		}
	}
}