import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter number to check for prime : ");
    var a:Int=obj.nextInt();
    var isPrime=true;
    for(i in 2..a/2)
    {
        if(a%i==0)
        {
            isPrime=false;
            break;
        }
    }
    if(isPrime)
        println("It is Prime !!");
    else
        println("It is not Prime !!");
}