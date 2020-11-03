import javax.swing.JOptionPane;
import static java.lang.System.out;
class StringOperation
{
	static public void main(String... arg)
	{
		int choice;
		String inputString=JOptionPane.showInputDialog("enter a sentence:");
		do
		{
			choice=Integer.parseInt(JOptionPane.showInputDialog("you can perform following operation: \n1.convert string into uppercase \n2.convert string into lower case \n3.vowels and consonent in string \n4.convert first character of string in uppercase \n5.find length of string \n6.exit"));
			switch(choice)
			{
			case 1:
			char ch[]=new char[inputString.length()];
			for(int i=0;i<inputString.length();i++)
			{
				ch[i]=inputString.charAt(i);
			}
			for(int i=0;i<inputString.length();i++)
			{
			if(ch[i]>=97)
				ch[i]-=32;
			out.print(ch[i]);
			}
			out.println(new String(ch));
			JOptionPane.showMessageDialog(null,"output:"+new String(ch));//here converstion from array is producing a space before t
			break;
			case 2:
			char ch1[]=new char[inputString.length()];
			for(int i=0;i<inputString.length();i++)
			{
				ch1[i]=inputString.charAt(i);
			}
			for(int i=0;i<inputString.length();i++)
			{
				if(ch1[i]!=32)
				{
					if(ch1[i]<=90)
						ch1[i]+=32;
				}
			}
			JOptionPane.showMessageDialog(null,"output:"+new String(ch1));
			break;
			case 3:
			char ch2[]=new char[inputString.length()];
			for(int i=0;i<inputString.length();i++)
			{
				ch2[i]=inputString.charAt(i);
			}
			double count;
			count=0;
			for(int i=0;i<inputString.length();i++)
			{
				if(ch2[i]=='a' | ch2[i]=='A' | ch2[i]=='e' | ch2[i]=='E' | ch2[i]=='i' | ch2[i]=='I' | ch2[i]=='o' | ch2[i]=='O' | ch2[i]=='U' | ch2[i]=='u')
					count++;
			}
			JOptionPane.showMessageDialog(null,"number of vowels:"+(int) count+"\nnummber of consonents:"+(int) (inputString.length()-count));
			break;
			case 4:
			char ch3[]=new char[inputString.length()];
			for(int i=0;i<inputString.length();i++)
			{
				ch3[i]=inputString.charAt(i);
			}
			for(int i=0;i<inputString.length();i++)
			{
				if(ch3[i]>=97)
				{
				ch3[i]-=32;
					break;
				}
			}
			JOptionPane.showMessageDialog(null,"output:"+new String(ch3));
			break;
			case 5:
			char ch4[]=inputString.toCharArray();//here is a error solve it
			int count1;
			count1=0;
			for (char data:ch4)
				count1++;
			JOptionPane.showMessageDialog(null,"length of string:"+count1);
			break;
			case 6:
			out.println("program is ending");
			break;
			}
		}while(choice!=6);
	}
}