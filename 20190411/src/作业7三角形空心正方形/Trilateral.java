package 作业7三角形空心正方形;
//打印三角形
public class Trilateral {

	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{
			for (int k =5-i; k >=0; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
