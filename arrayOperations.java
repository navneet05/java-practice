// assignment on array
//main diagonal finder have to add fir non-square matrix
import javax.swing.JOptionPane;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Date;
 class ArrayOperations
 {
	 static
	{
		try{
			FileWriter fw=new FileWriter("arrayoperationlog.txt",true);
			fw.write("Time:"+new Date());
			fw.close();
			}catch(IOException e){}
	}
    static public void main(String... arg)
	{
		String passwardForProgram=JOptionPane.showInputDialog("enter passward to continue");
		if(passwardForProgram.equals("EXCITED"))
		{
			Scanner sc=new Scanner(System.in);
			int choice;
			do
			{
				first :{}
				choice=Integer.parseInt(JOptionPane.showInputDialog("perform opertaion on \n1.array \n2.matrix \n3.exit"));
				switch(choice)
				{
					case 1:
					int sizeOfArray=Integer.parseInt(JOptionPane.showInputDialog("enter size of array"));
					int array[]=new int[sizeOfArray];
					out.println("enter element of array");
					for(int i=0;i<sizeOfArray;i++)
					{
						array[i]=sc.nextInt();
					}
					int choice1;
					do
					{
						choice1=Integer.parseInt(JOptionPane.showInputDialog("you can do following operation here: \n1.searching \n2.sorting \n3.main menu \n4.exit"));
						switch(choice1)
						{
							case 1:
							int searchChecker,k;
							searchChecker=0;
							int search=Integer.parseInt(JOptionPane.showInputDialog("enter element to be searched"));
							for(k=0;k<sizeOfArray;k++)
							{
								if(search==array[k])
								{
									searchChecker++;
								}
							}
							if(searchChecker==1)
								JOptionPane.showMessageDialog(null,"number "+search+" is found on index:"+k);
							else if(searchChecker>1)
								JOptionPane.showMessageDialog(null,"number "+search+" is found on "+searchChecker+" place");
							else
								JOptionPane.showMessageDialog(null,"number "+search+" is not found");
							break;
							case 2:
							for(int i=0;i<sizeOfArray;i++)
							{
								for(int j=0;j<(sizeOfArray-1)-i;j++)
								{
									if(array[j]>array[j+1])
									{
										int temp;
										temp=0;
										temp=array[j];
										array[j]=array[j+1];
										array[j+1]=temp;
									}
								}
							}
							for(int data:array)
								out.print(" "+data);
							break;
							case 3:
							break;//return to main menu
							case 4:
							System.exit(0);
						}
					}while (choice1!=3);
					break;
					case 2:
					int rows=Integer.parseInt(JOptionPane.showInputDialog("enter no. of rows"));
					int cols=Integer.parseInt(JOptionPane.showInputDialog("enter no. of columns"));
					int arraym[][]=new int[rows][cols];
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							out.printf("\nmatrix[%d][%d]:",i,j);
						arraym[i][j]=sc.nextInt();	
						}
					}
					int choice2;
					do
					{
					choice2=Integer.parseInt(JOptionPane.showInputDialog("you can do following operation here: \n1.addition of matrix \n2.addition of diagonal element \n3.addition of all element \n4.main menu \n5.exit"));
						switch(choice2)
						{
							case 1:
							out.println(String.format("enter a addend of size addend[%d][%d]",rows,cols));
							int addend[][]=new int[rows][cols];
							int result[][]=new int[rows][cols];
							for(int i=0;i<rows;i++)
							{
								for(int j=0;j<cols;j++)
								{
									out.printf("\nmatrix[%d][%d]:",i,j);
									addend[i][j]=sc.nextInt();
								}
							}
							for(int i=0;i<rows;i++)
							{
								for(int j=0;j<cols;j++)
								{
									result[i][j]=addend[i][j]+arraym[i][j];
									out.print(" "+result[i][j]);
								}
								out.println();
							}
							break;
							case 2:
							if(rows==cols)
							{
								int sum;
								sum=0;
								for(int i=0;i<cols;i++)
									sum=sum+arraym[i][i];
								JOptionPane.showMessageDialog(null,"sum of diagonal element is:"+sum);
							}
							else
								JOptionPane.showMessageDialog(null,"it is not a square matrix");
							break;
							case 3:
							int sum1;
							sum1=0;
							for(int i=0;i<rows;i++)
							{
								for(int j=0;j<cols;j++)
									sum1=sum1+arraym[i][j];
							}
							JOptionPane.showMessageDialog(null,"sum of all element:"+sum1);
							case 4:break;
							case 5:
							System.exit(0);
						}
					}while(choice2!=4);
				}	
			}while(choice!=3);
		}
		else
		{
			// Runtime run=Runtime.getRuntime();
			// run.exec("shutdown -l);
		}
	} 
 }