import java.util.*;
class PerfectNum
{
public static void main(String[] args)
{
int n,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter any integer");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("number you entered is perfect");
}
else
{
System.out.println("number you entered is not perfect");
}
}
}


