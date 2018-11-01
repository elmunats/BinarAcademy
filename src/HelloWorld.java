import javax.sound.midi.Soundbank;
import java.util.ArrayList;
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
        //nestedloop();
        //arraytest();
        kereta();

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

    public static void arraytest(){
        String[] teman = {"Andi","Lukman","Faris","Ucok","Dani","Reza","Adi","Rizki"};
        for (int i=0; i < teman.length;i++){
            System.out.println("Indeks ke "+i+" :"+teman[i]);
        }
    }

    //aplikasi pesan tiket kereta
    public static void kereta(){
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Statsiun Serpong");
        System.out.println("1. Beli tiket Pergi");
        System.out.println("2. Beli tiket Pulang Pergi");
        System.out.print("silahkan pilih tiket kalian (1/2): ");
        int beliTiket = input.nextInt();
        if (beliTiket == 1){
            System.out.print("Masukkan jumlah tiket anda :");
            int jml = input.nextInt();
            String[] jmlTiket = new String[jml];

            for (int i=0; i < jmlTiket.length;i++){
                System.out.print("Masukkan tujuan anda : ");
                jmlTiket[i] = input.nextLine();
            }
            System.out.println("Teransaksi Berhasil !\n");
            for (int i=0; i< jmlTiket.length;i++){
                System.out.println("Tujaan anda ke : "+jmlTiket[i]);
            }
            System.out.println("Terimakasih, selamat menikmati perjalanan.!");
        }else if (beliTiket == 2){
            System.out.print("Masukkan jumlah tiket anda : ");
            int jml = input.nextInt();
            String[] jmlTiketPulang = new String[jml];
            String[] jmlTiketPergi = new String[jml];

            for (int i=0; i < jmlTiketPulang.length;i++){

                System.out.print("Masukkan tujuan Pulang anda : ");
                jmlTiketPulang[i] = input.next();
                System.out.print("Masukkan tujuan pergi anda : ");
                jmlTiketPergi[i] = input.next();
                System.out.println();

            }
            System.out.println("Teransaksi Berhasil !\n");
            for (int i=0; i< jmlTiketPulang.length;i++){
                System.out.println("Tujan Pulang anda ke : "+jmlTiketPulang[i]);
                System.out.println("Tujan Pergi anda ke : "+jmlTiketPergi[i]);
            }
            System.out.println("Terimakasih, selamat menikmati perjalanan.!");
        }else {
            System.out.println("\nMaaf peritah anda salah !");
            System.out.println("Silahkan coba lagi, Terimakasih !");
        }
    }
}