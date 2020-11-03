import java.util.Scanner;
import static java.lang.System.out;
class CtlProblem
{
	static public void main(String... arg)
	{
		Scanner sc=new Scanner(System.in);
		out.println("enter no.");
		int limit=sc.nextInt();
		int array[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			out.println(""+i);
			array[i]=i+1;
		}
		// out.println("j");
		int TOP=0;
		int CHECK1=limit;
		do
		{
			if(CHECK1==1)
				break;
			else
			{
				if(array[TOP]==limit)
				{
					for(int i=0;i<CHECK1-1;i++)
						array[i]=array[i+1];
					TOP=0;
					--CHECK1;
				}
				else{
					for(int i=TOP+1;i<CHECK1-1;i++)
						array[i]=array[i+1];
					--CHECK1;
					++TOP;
				}
			}
		}while(CHECK1!=1);
		out.println(array[0]);
	}
}