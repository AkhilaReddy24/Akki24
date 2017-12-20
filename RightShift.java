import java.util.Scanner;
class RightShift
{
public static void main(String arg[])
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();
num=num>>2;
System.out.println("division is:"+num);
}
}