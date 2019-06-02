import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter Age : ");
    var age:Int=obj.nextInt();
    print("Enter Gender : ");
    var gen:String=obj.next();
    if(age>=18)
    {
        if(gen=="female" || age>=21)
            println("You can Marry");
        else
            println("You cannot Marry right now !!");
    }
}