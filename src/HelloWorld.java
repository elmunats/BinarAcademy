import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 8;
        double y = 5;
        double z;


        System.out.println("Hello World\n");
        System.out.println("X + Y = "+ (z=x+y) );
        System.out.println("X - Y = "+ (x-y) );
        System.out.println("X * Y = "+ (x*y));
        System.out.println("X / Y = "+ (x/y));

        y++;
        System.out.println(z);
        input();


    }

    public static void input(){
        Scanner input = new Scanner(System.in);

        System.out.println("hi");
        System.out.print("Nama Lengkap : ");
        String name = input.nextLine();
        System.out.print("Tinggi Badan : ");
        Double tBadan = input.nextDouble();
        System.out.print("Umur :");
        Integer umur = input.nextInt();
        System.out.println("nama saya "+name+", tinggi badan "+tBadan+", ");
    }
}