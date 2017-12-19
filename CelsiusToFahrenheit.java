import java.util.*;
class CelsiusToFahrenheit
{
public static void main(String[] args)
{
float cel,far;
Scanner sc=new Scanner(System.in);
System.out.println("enter temperature in celsius");
cel=sc.nextInt();
far=((cel+32)*9/5);
System.out.println("temperature in fahrenheit is" +far);
}
}
