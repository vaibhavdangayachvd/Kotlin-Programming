import java.util.Scanner;
import kotlin.system.exitProcess

fun main(args:Array<String>)
{
    var obj=Scanner(System.`in`);
    println("Enter Marks for first level");
    var lvl1=obj.nextInt();
    if(lvl1>=80)
    {
        println("Level 1 Cleared\n");
        println("Enter lvl 2 marks");
        var lvl2 = obj.nextInt();
        if (lvl2 >= 90)
        {
            println("Level 2 Cleared\n");
            println("Enter lvl 3 marks");
            var lvl3 = obj.nextInt();
            if (lvl3 >= 120)
            {
                println("Congratulation");
            }
        }
    }
    else
    {
        println("Try Again !!");
    }
}