 class Women
{
String name;
String color;
double price;
public Women(String n,String c,double p)
{
name=n;
color=c;
price=p;
}
public void display()
{
System.out.println(name);
System.out.println(color);
System.out.println(price);
}
public static void main(String args[])
{
Women m=new Women("silk","white",20000.00);
m.display();
}
}
