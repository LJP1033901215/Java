import java.util.*;
public class STLX40403{
	//ð������
	public static void main(String[] agrs)
	{
		int[] unms = {1,5,-8,4,-20,-60,48};
		int[] g = f(unms);
		//����ԭ���ṩ�ķ���
		Arrays.sort(unms);
		System.out.print(Arrays.toString(unms));

		System.out.print(Arrays.toString(g));//Arrays.toString()������顣
	}

	public static int[] f(int[] s)
	{
		for(int i=0;i<s.length-1;i++)//s.length����ĳ���
		{
			for(int j=0;j<s.length-1-i;j++)
			{
				if(s[j]>s[j+1])
				{
					int f = s[j];
					s[j] = s[j+1];
					s[j+1] = f;
				}
			}
		}
		return s;
	}
}