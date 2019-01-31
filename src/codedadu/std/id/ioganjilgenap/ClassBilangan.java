package codedadu.std.id.ioganjilgenap;

public class ClassBilangan {
    public int inp_bilangan;

    BilanganGenap genap = new BilanganGenap();
    BilanganGanjil ganjil = new BilanganGanjil();

    public void generate_bilangan() {
        if(inp_bilangan % 2 == 0) {
            System.out.println(inp_bilangan + genap.ini_genap);
        }
        else {
            System.out.println(inp_bilangan + ganjil.ini_ganjil);
        }
    }
}

class BilanganGenap {
    String ini_genap = " Adalah bilangan GENAP";
}

class BilanganGanjil {
    String ini_ganjil = " Adalah bilangan GANJIL";
}
