package codedadu.std.id.ioalpabet;

public class ClassCharacter {
    public char inp_karakter;

    public void processCharacter() {
        String output = (inp_karakter >= 'a' && inp_karakter <= 'z') || (inp_karakter >= 'A' && inp_karakter <= 'Z')
                ? "Inputan " + inp_karakter + " termasuk sebuah karakter ALPHABET."
                : "Inputan " + inp_karakter + " BUKAN termasuk sebuah karakter ALPHABET.";

        System.out.println(output);
        System.out.println("---------------------------------------------------------------------------");
    }
}
