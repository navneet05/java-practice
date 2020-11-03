import java.util.Scanner;
import static java.lang.System.out;
import javax.swing.JOptionPane;
class VolumeOfShapes
{
	static public void main(String... arf)throws Exception
	{
		JOptionPane.showMessageDialog(null,"enter passward to continue");
		Scanner sc=new Scanner(System.in);
		String passwardForProgram=sc.next();
		if(passwardForProgram.equals("EXCITED"))
		{
			String choiceOfShape;
			do
			{
			out.println("\nThrough this program you can find volume of following shapes \n1.Cone \n2.Cylinder \n3.sphere \n4.exit \nenter name or number of shape:");	
			choiceOfShape=sc.next();
			if(choiceOfShape.equalsIgnoreCase("Cone") |choiceOfShape.equalsIgnoreCase("1"))
			{
				out.println("\nenter radius and base of Cone:");
				float radiusOfCone=sc.nextFloat();
				float heightOfCone=sc.nextFloat();
				float volumeOfCone=(radiusOfCone*radiusOfCone)*3.14f*(heightOfCone/3);
				// out.println("\n"+volumeOfCone);
				JOptionPane.showMessageDialog(null,"volume of cone"+volumeOfCone);
			}
			else if(choiceOfShape.equalsIgnoreCase("Cylinder") | choiceOfShape.equalsIgnoreCase("2"))
			{
				out.println("\nenter radius and height of Cylinder:");
				float radiusOfCylinder=sc.nextFloat();
				float heightOfCylinder=sc.nextFloat();
				float volumeOfCylinder=3.14f*(radiusOfCylinder*radiusOfCylinder)*heightOfCylinder;
				// out.println("\n"+volumeOfCylinder);
				JOptionPane.showMessageDialog(null,"volume of cylinder"+volumeOfCylinder);
			}
			else if(choiceOfShape.equalsIgnoreCase("sphere") | choiceOfShape.equalsIgnoreCase("3"))
			{
				float radiusOfSphere=sc.nextFloat();
				float volumeOfSphere=(4/3)*3.14f*(radiusOfSphere*radiusOfSphere*radiusOfSphere);
				// out.println("\n"+volumeOfSphere);
				JOptionPane.showMessageDialog(null,"volume of sphere"+volumeOfSphere);
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
			run.exec("C:\\Windows\\System32\\rundll32.exe user32.dll LockWorkStation ");
		}
	}
}