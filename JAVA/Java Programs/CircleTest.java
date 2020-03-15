class Circle
{
public void Area(double r)
{
double res;
res=3.14*r*r;
System.out.println(r);
}
}
class CircleTest
{
public static void main(String args[])
{
Circle c=new Circle();
c.Area(5.2);
}
}