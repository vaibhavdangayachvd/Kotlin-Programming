import java.util.Scanner;
fun main(args:Array<String>) {
    var obj = Scanner(System.`in`);
    print("Enter three numbers : ");
    var a: Int = obj.nextInt();
    var b: Int = obj.nextInt();
    var c: Int = obj.nextInt();
    if (a > b && a > c)
        println("A($a) is Greatest");
    else if(b > a && b > c)
        println("B($b) is Greatest");
    else
        println("C($c) is Greatest");
}