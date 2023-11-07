import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int heat;
Scanner input = new Scanner(System.in);
System.out.println("bugunku havanın sıcaklığını girebilirmisiniz?");
heat=input.nextInt();

if(heat<=5){
    System.out.println("kayak yapmaya gidebilirsiniz");

}else if (heat<=25){
    if(heat<=15){
        System.out.println("sinemaya gidebilirsiniz");
    } if (heat>=15){
        System.out.println("piknik yapmaya gidebilirsiniz");
    }
}
else{
    System.out.println("havuzda yüzmeye gidebilirsiniz");
}



    }
}