import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        //input();
        //hitung();
        //test();
        //perulanganwhile();
        //perulanganfor();
        //perulangandowhile();
        //TestClass.Test();
        nestedloop();

    }

    public static void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap : ");
        String name = input.nextLine();

        System.out.print("Tinggi Badan : ");
        Double tBadan = input.nextDouble();

        System.out.print("Umur : ");
        //Integer umur = input.nextInt();
        float umur = input.nextFloat();

        System.out.println("\nhai... nama saya "+name+", tinggi badan saya "+tBadan+" cm, umur saya "+umur+" tahun.");
    }

    public static void hitung(){
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
    }

    public static void test() {
        String test = "Coba";
        System.out.println(test);

    }

    public static void perulanganwhile(){
        int i = 1;
        while (i <= 5){
            System.out.println(i + ". Belajar Perulangan (pakai while)");
            i++;
        }
    }

    public static void perulanganfor(){
        for(int i=0 ; i<5 ; i++){
            System.out.println(i+". Belajar Perulangan (pakai for)");
        }
    }

    public static void perulangandowhile(){
        int i = 0;
        do {
            System.out.println(i+". Belajar Perulangan (pakai do while)");
            i++;
        }while (i<5);

    }

    public static void nestedloop(){
        for (int i=1; i<=2 ; i++){
            System.out.println("Outer i = "+i);
            for (int j=1; j<=3; j++){
                System.out.println("   outer j = "+j);
            }
        }
    }
}