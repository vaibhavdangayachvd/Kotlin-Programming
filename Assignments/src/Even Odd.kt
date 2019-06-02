import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter a number : ");
    var a:Int=obj.nextInt();
    if(a%2==0)
        println("Number is Even");
    else
        println("Number is Odd");
}