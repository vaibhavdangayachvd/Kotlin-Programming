import java.util.Scanner;
fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    println("Enter emp-name");
    var name:String=obj.next();
    println("Enter emp-age");
    var age:Int=obj.nextInt();
    println("Enter emp-basic sal");
    var base:Double=obj.nextDouble();
    base=base-(30.0/100.0)*base;
    println("Name is : "+name);
    println("Age is : "+age);
    println("Salary After Tax : "+base);
}