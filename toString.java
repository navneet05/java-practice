import static java.lang.System.out;
class College
{
int regNo;
String collegeName;
long contact;
College(int rNo,String cNm,long cont)
{
regNo=rNo;
collegeName=cNm;
contact=cont;
}
public String toString()
{
return (regNo+" "+collegeName+" "+contact);
}
// public void finalize()
// {
	// out.print("garbage collector at work");
// }
}
class MainClass
{
static public void main(String... arf)
{
College co=new College(08,"chdgi",98093879);
out.print(co);
// System.gc();
}
}