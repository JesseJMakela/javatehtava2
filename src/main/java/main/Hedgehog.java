package main;


public class Hedgehog {
    private String nimi;
    private int ika;

    public Hedgehog() {
        this.nimi = "Pikseli";
        this.ika = 5;
    }

    public Hedgehog(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public void speak(String teksti) {
        System.out.println(this.nimi + ": "+teksti);
    }
    public void esittaytua() {
        System.out.println("Olen " + this.nimi + " ja ikäni on " + this.ika + " vuotta, mutta antaisitko silti syötteen?");
    }
    public void juoksu(int kierrokset) {
        while(kierrokset != 0) {
            System.out.println(this.nimi + " juoksee kovaa vauhtia!");
            kierrokset = kierrokset - 1;
        }
    }   
}