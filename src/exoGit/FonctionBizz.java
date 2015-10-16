package exoGit;

public class FonctionBizz {
	public int n,m;
	public static void main(String[] args) 
	{
	bizzBuzz(10);
	}
	public static void bizzBuzz(int n) 
	{
		int mult3=n%3;
		if (mult3==0)
		{		
			System.out.println("multiple de 3");
		}
		else
		{		
			System.out.println("multiple de 5");
		}	
	}
}
