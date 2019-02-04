package codedadu.std.id;

import codedadu.std.id.ioalpabet.ClassCharacter;

import java.util.Scanner;

public class MainAlphabeth extends ClassCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassCharacter character = new ClassCharacter();

        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("===========================================================================");
            System.out.print("Masukan sebuah karakter : ");
            character.inp_karakter = scanner.next().charAt(0);
            System.out.println("---------------------------------------------------------------------------");

            character.processCharacter();

            System.out.print("Ingin Memproses Bilangan Lagi? [Y/T] : ");
            i = scanner.next();
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Anda keluar dari Operasi Alphabet, Terima Kasih.");
        System.out.println("===========================================================================");

    }
}
