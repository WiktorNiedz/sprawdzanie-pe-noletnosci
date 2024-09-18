import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("podaj swoj wiek:  ");// pyta użytkownika o wiek
    
    Scanner sc = new Scanner(System.in);//otwiera skaner
    int age= sc.nextInt();//tworzy zmienna
    if (age >=18) {
        System.out.println("jestes pełnoletni");//instrukcja warunkowa if 
    }
    else if (age<18){
        System.out.println("jestes niepełnoletni"); //kolejna instrukcja warunkowa
    }
    else{

    }
    sc.close();//zamyka skaner

   } 
}
