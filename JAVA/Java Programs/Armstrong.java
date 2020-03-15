class Armstrong
{
public static void main(String args[])
{
int n=153,r,c,sum=0,temp=n;
while(n!=0)
{
r=n%10;
c=r*r*r;
sum=sum+c;
n=n/10;
}
if(temp==sum)
{
System.out.println("arm strong");
}
else
{
System.out.println("not arm strong");
}
}
}
