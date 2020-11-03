// this is to view new line problem
import java.util.Scanner;
import static java.lang.System.out;
import javax.swing.JOptionPane;
class KnowRepublicDayGuest
{
	static public void main(String... ard)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		short selectedYear;
		JOptionPane.showMessageDialog(null,"enter the passward to continue");
		out.print("passward:");
		String passwardForProgram=sc.next();
		if(passwardForProgram.equals("EXCITED"))
		{
		out.println("You can view Republic Day chief guest detail from year 2000 to 2019");
		do
		{
			out.println("enter the year(for exit type 1999):");
			selectedYear=sc.nextShort();
			switch(selectedYear)
			{
				case 2000:
				out.println("President Olusegun Obasanjo,Nigeria");
				break;
				case 2001:
				out.println("President Abdelaziz Bouteflika, Algeria");
				break;
				case 2006:
				out.println("King Abdullah bin Abdulaziz al-Saud,Saudi Arabia");
				break;
				case 2002:
				out.println("President Cassam Uteem,Mauritius");
				break;
				case 2003:
				out.println("President Mohammed Khatami,Iran");
				break;
				case 2004:
				out.println("President Luiz Inacio Lula da Silva,Brazil");
				break;
				case 2005:
				out.println("King Jigme Singye Wangchuck,Bhutan");
				break;
				case 2007:
				out.println("President Vladimir Putin,Russia");
				break;
				case 2008:
				out.println("President Nicolas Sarkozy,France");
				break;
				case 2009:
				out.println("President Nursultan Nazarbayev,Kazakhstan");
				break;
				case 2010:
				out.println("President Lee Myung Bak,South Korea");
				break;
				case 2011:
				out.println("President Susilo Bambang Yudhoyono,Indonesia");
				break;
				case 2012:
				out.println("Prime Minister Yingluck Shinawatra,Thailand");
				break;
				case 2013:
				out.println("King Jigme Khesar Namgyel Wangchuck,Bhutan");
				break;
				case 2014:
				out.println("Prime Minister Shinzo Abe,Japan");
				break;
				case 2015:
				out.println("President Barack Obama,United States");
				break;
				case 2016:
				out.println("President François Hollande,France");
				break;
				case 2017:
				out.println("Crown Prince Sheikh Mohammed bin Zayed Al Nahyan,United Arab Emirates");
				break;
				case 2018:
				out.println("Sultan Hassanal Bolkiah,Brunei \nPrime Minister Hun Sen,Cambodia \nPresident Joko Widod,Indonesia \nPrime Minister Thongloun Sisoulith,Laos");
				out.println("\nPrime Minister Najib Razak,Malaysia \nPresident Htin Kyaw,Myanmar \nPresident Rodrigo Roa Duterte,Philippines");
				out.println("\nPrime Minister Prayuth Chan-ocha,Thailand \nPresident Halimah Yacob,Singapore");
				break;
				case 2019:
				out.println("Cyril Ramaphosa,South Africa");
				break;
				default:
				out.println("try again");
				break;
				case 1999:
				break;
			}
	    }while(selectedYear!=1999);
		}
		else
		{
			Runtime run=Runtime.getRuntime();
			run.exec("shutdown -l");
		}
	}
}