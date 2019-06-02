import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter Number to print its table : ");
    var a:Int=obj.nextInt();
    for(i in 1..10)
        println("$a x $i = "+a*i);
}