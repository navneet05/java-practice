import java.util.Scanner;
import static java.lang.System.out;
import javax.swing.JOptionPane;
class TellFullForm
{
	public static void main(String... arf)throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"enter the passward to continue");
		out.println("passward:");
		String passwardForProgram=sc.next();
		if(passwardForProgram.equals("EXCITED"))
		{
			out.println("you can view full form of follwing words in this program: \nPDF \tJPG \tPMB \tMP4 \nAVI \tWAV \tWAB \tAM \nPM \tGST \tIST");
			out.println("\ntype a word to see its full form:");
			String wordChoosed=sc.next();
			if(wordChoosed.equalsIgnoreCase("pdf"))
				JOptionPane.showMessageDialog(null,"Portable Document Format");
			else if(wordChoosed.equalsIgnoreCase("jpg"))
				JOptionPane.showMessageDialog(null,"Joint Photogaphic Experts Group");
			else if(wordChoosed.equalsIgnoreCase("pmb"))
				JOptionPane.showMessageDialog(null,"Private Message Box");
			else if(wordChoosed.equalsIgnoreCase("gif"))
				JOptionPane.showMessageDialog(null,"Graphics Interchange Fornat");
			else if(wordChoosed.equalsIgnoreCase("mp4"))
				JOptionPane.showMessageDialog(null,"MPEG-4 Adavance Video Coding MPEG(Moving Picture Experts Group)");
			else if(wordChoosed.equalsIgnoreCase("avi"))
				JOptionPane.showMessageDialog(null,"Audio Video Interleave");
			else if(wordChoosed.equalsIgnoreCase("wav"))
				JOptionPane.showMessageDialog(null,"Wave Form Audio File Format");
			else if(wordChoosed.equalsIgnoreCase("wab"))
				JOptionPane.showMessageDialog(null,"Web Application Builder");
			else if(wordChoosed.equalsIgnoreCase("am"))
				JOptionPane.showMessageDialog(null,"Anti Meridien");
			else if(wordChoosed.equalsIgnoreCase("pm"))
				JOptionPane.showMessageDialog(null,"Post Meridien");
			else if(wordChoosed.equalsIgnoreCase("gst"))
				JOptionPane.showMessageDialog(null,"Goods And service Tax");
			else if(wordChoosed.equalsIgnoreCase("ist"))
				JOptionPane.showMessageDialog(null,"Indian Standard Time");
			else
				JOptionPane.showMessageDialog(null,"sorry full form is not available");
		}
		else
		{
			Runtime run=Runtime.getRuntime();
			run.exec("shutdown -l");
		}
	}
}