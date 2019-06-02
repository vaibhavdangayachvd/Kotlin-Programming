import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter Number to Find Factorial : ");
    var a:Int=obj.nextInt();
    var sum:Int=1;
    for(i in 2..a)
        sum*=i;
    println("Factorial of $a is : "+sum);
}