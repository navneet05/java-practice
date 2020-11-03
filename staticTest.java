import java.io.FileWriter;
import java.util.Date;
import java.io.IOException;
class MainClass
{
	
	void get()
	{
	try
	{
		static FileWriter fw=new FileWriter("testingfw.txt",true);
	}catch(IOException e){}
	}
	
static
{
	try{
		fw.write(""+new Date());
		fw.close();
	}catch(IOException e){}
	
}
static public void main(String... arf)
{
	System.out.println("batman");
}
}