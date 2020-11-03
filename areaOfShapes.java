import java.util.Scanner;
import java.util.Date;	
import javax.swing.JOptionPane;
import static java.lang.System.out;	
import java.text.NumberFormat;		
class AreaOfShapes
{
	static
	{
		out.println("welcome \t"+new Date());
	
	}
	static public void main(String... arf)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"enter the passward to continue");
		out.println("passward:");
		String passwardForProgram=sc.next();
		if(passwardForProgram.equals("EXCITED"))
		{	
			NumberFormat nf=NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(2);
			float PIE=3.14f;
			String choiceOfShape;
			do
			{
				out.println("\nThrough this program you can find area of following shapes \n1.Triangle \n2.Circle \n3.Rectangle \n4.exit \nenter name or number of shape:");	
				choiceOfShape=sc.next();
				if(choiceOfShape.equalsIgnoreCase("triangle") |choiceOfShape.equalsIgnoreCase("1"))
				{
					out.println("\nenter height and base of triangle:");
					float heightOfTriangle=sc.nextFloat();
					float baseOfTriangle=sc.nextFloat();
					float areaOfTriangle=(heightOfTriangle*baseOfTriangle);
					JOptionPane.showMessageDialog(null,"area of triangle is:"+nf.format(areaOfTriangle));
				}
				else if(choiceOfShape.equalsIgnoreCase("circle") | choiceOfShape.equalsIgnoreCase("2"))
				{
					out.println("\nenter radius of circle:");
					float radiusOfCircle=sc.nextFloat();
					float areaOfCircle=PIE*(radiusOfCircle*radiusOfCircle);
					JOptionPane.showMessageDialog(null,"area of circle is:"+nf.format(areaOfCircle));
				}
				else if(choiceOfShape.equalsIgnoreCase("rectangle") | choiceOfShape.equalsIgnoreCase("3"))
				{
					out.println("\nenter length and breadth of rectangle");
					float lengthOfRectangle=sc.nextFloat();
					float widthOfRectangle=sc.nextFloat();
					float areaOfRectangle=lengthOfRectangle*widthOfRectangle;
					JOptionPane.showMessageDialog(null,"area of rectangle is:"+nf.format(areaOfRectangle));
				}
				else if(choiceOfShape.equals("4") | choiceOfShape.equalsIgnoreCase("exit"))
					out.println("\nprogram end here");
				else
					out.println("\nretry");
			}while(!(choiceOfShape.equals("4")==false ^ choiceOfShape.equalsIgnoreCase("exit")==false));
		}
		else
		{
			Runtime run=Runtime.getRuntime();
			run.exec("shutdown -l");
		}
	}
}