import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    print("Enter Nationality : ");
    var nat:String=obj.next();
    print("Enter Age : ");
    var age=obj.nextInt();
    if(age>=18 && nat=="indian")
        println("You can vote in India !!");
    else
        println("You cannot vote in India !!");
}