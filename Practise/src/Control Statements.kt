import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    println("Enter number 1 : ");
    var a=obj.nextInt();
    println("Enter number 2 : ");
    var b=obj.nextInt();
    println("Enter number 3 : ");
    var c=obj.nextInt();
    var res=if(a>=b && a>=c)
        "$a is Greater";
    else if(b>=a && b>=c)
        "$b is Greater";
    else
        "$c is Greater";
    println(res);
}