import java.util.Scanner;
fun main(args:Array<String>) {
    var obj = Scanner(System.`in`);
    print("Enter a character : ");
    var ch=obj.next();
    if(ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u")
        println("It is a vowel");
    else
        println("It is a consonant");
}