//Jesse Mäkelä
//Java tehtävä 2

package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Hedgehog siili = new Hedgehog();
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );

        
            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);


                switch(i) {
                    case 1:
                    System.out.println("Mitä siili sanoo:");
                    String siiliSanoo = sc.nextLine();
                        if (siiliSanoo.isEmpty()){
                            siili.esittaytua();
                        }
                        else {
                            siili.speak(siiliSanoo);
                        }
                        break;

                    

                    case 2:
                        int Ika = 0;
                        System.out.println("Anna siilin nimi:");
                        String uusiNimi = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String uusiIka = sc.nextLine();
                        Ika = Integer.parseInt(uusiIka);
                        siili = new Hedgehog(uusiNimi, Ika);
                        break;
                        

                    
                    case 3: 
                        int kierrokset = 0;
                        System.out.println("Kuinka monta kierrosta?");
                        String kierro = sc.nextLine();
                        kierrokset = Integer.parseInt(kierro); 
                        siili.juoksu(kierrokset);
                        break;
                    
                    case 0:
                        exit = true;
                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;

                    default:
                        System.out.println("Syöte on väärä");
                        break;
                }
            }
                else {
                    System.out.println("Syöte on väärä");
            }
            
        sc.close();
        }
    }
}