// trying filewriter here and also object of printstream 
import java.util.Scanner;
// import static java.lang.System.out;
import java.io.PrintStream;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.util.Date;
class PetrolRunUpto
{	
	try{
		static FileWriter fw=new FileWriter("petrolrunuptoresult.text",true);
	}catch(IOException ec){}
	static //throws Exception
	{
		// FileWriter fw=new FileWriter("petrolrunuptoresult.text",true);
		// fw.write("time:"+new Date());	
		// fw.close();
	}
	static public void main(String... ard)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		PrintStream ut=new PrintStream(System.out);//error is here printstream needs attribute
		JOptionPane.showMessageDialog(null,"enter the passward to continue");
		ut.println("passward:");
		String passwardForProgram=sc.next();
		// FileWriter fw=new FileWriter("petrolrunuptoresult.text",true);//remember
		fw.write("\ntime:"+new Date());
		// fw.close();
		if(passwardForProgram.equals("EXCITED"))
		{
			ut.println("this program find in how many days petrol will be finished \nenter petrol available:");
			float petrolnAvailable=sc.nextFloat();
			ut.println("\nenter per day consumption:");
			float consumptionPerDay=sc.nextFloat();
			ut.println("\nenter average of vehicle(in km):");
			float averageOfVehicle=sc.nextFloat();
			int petrolEndsIn;
			float distanceCovered;
			petrolEndsIn=(int) (petrolnAvailable/consumptionPerDay);
			distanceCovered=averageOfVehicle*petrolnAvailable;
			JOptionPane.showMessageDialog(null,"petrol runs upto "+petrolEndsIn +" days");
			ut.println(String.format("approx distance which can be covered is(in km):%.2f",distanceCovered));
			// ut.println(pass);
			 // FileWriter fw=new FileWriter("petrolrunuptoresult.text",true);
			fw.write("\npetrol runs upto "+petrolEndsIn);
			fw.write("\napprox distance which can be covered is(in km):"+distanceCovered);
			fw.close();
		}
		else
		{
			Runtime run=Runtime.getRuntime();
			run.exec("shutdown -l");
		}
	}
}