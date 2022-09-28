package video_rental;

import video_rental.inventory.*;
import video_rental.material.*;

public class Main {
    public static void main(String[]args){
        Inventory inv = new Inventory();

        CD cd0 = new CD("LEGO, HARRY POTTER", 5.50, true, 4.00);
        CD cd1 = new CD("X-MEN, Der Letzte wiederstand", 5.50, false, 4.00);
        CD cd2 = new CD("LEGO, Marvel SUPER HEROS", 6.50, false, 4.50);
        CD cd3 = new CD("POKEMON: Der Aufstieg von Darkrai", 10.50, true, 10.00);
        CD cd4 = new CD("ted", 2.50, false, 1.00);
        CD cd5 = new CD("Percy Jackson: Sea of monsters", 5.50, false, 4.00);
        CD cd6 = new CD("MARVEL: AVENGERS AGE OF ULTRON", 9.50, false, 6.00);
        CD cd7 = new CD("MARVEL: AVENGERS", 8.00, true, 6.00);
        CD cd8 = new CD("Transformers: Die Rache", 9.50, false, 7.00);
        CD cd9 = new CD("WandaVision", 20.50, false, 15.00);
        CD cd10 = new CD("Das Hier möchte rein aber das Array ist voll", 666.00, true, 5.00);

        cd0.setTitel("guardians of the galaxy");

        inv.addCD(cd0);
        inv.addCD(cd1);
        inv.addCD(cd2);
        inv.addCD(cd3);
        inv.addCD(cd4);
        inv.addCD(cd5);
        inv.addCD(cd6);
        inv.addCD(cd7);
        inv.addCD(cd8);
        inv.addCD(cd9);
        inv.addCD(cd10);

        DVD dvd0 = new DVD("Inglourious Basterds", 4.00, false, 2.00);
        DVD dvd1 = new DVD("Spider Man 1", 5.00, true, 4.00);
        DVD dvd2 = new DVD("The Order", 10.00, false, 5.00);
        DVD dvd3 = new DVD("The wolf of Wallsstreet", 5.00, false, 4.00);
        DVD dvd4 = new DVD("Now you see me", 10.00, true, 8.00);
        DVD dvd5 = new DVD("Mr Bean", 8.00, true, 5.00);
        DVD dvd6 = new DVD("John Wick", 15.00, false, 1.00);
        DVD dvd7 = new DVD("Fantastic Beasts and where to find them", 5.00, true, 3.00);
        DVD dvd8 = new DVD("RUSH Hour", 8.00, true, 5.00);
        DVD dvd9 = new DVD("IRON MAN", 6.99, true, 4.00);
        DVD dvd10 = new DVD("IRON MAN3 ", 6.99, true, 4.00);

        inv.addDVD(dvd0);
        inv.addDVD(dvd1);
        inv.addDVD(dvd2);
        inv.addDVD(dvd3);
        inv.addDVD(dvd4);
        inv.addDVD(dvd5);
        inv.addDVD(dvd6);
        inv.addDVD(dvd7);
        inv.addDVD(dvd8);
        inv.addDVD(dvd9);
        inv.addDVD(dvd10);

        FSKRating rating0 = FSKRating.FSKsix;
        FSKRating rating1 = FSKRating.FSKeighteen;
        FSKRating rating2 = FSKRating.FSKsixten;
        FSKRating rating3 = FSKRating.FSKzero;

        rating0.alter(13);
        rating1.alter(25);
        rating2.alter(-2);
        rating3.alter(5);

        System.out.println("**********");

        System.out.println(inv.str());


        System.out.println("**********");
        System.out.println("Einzelne CD");

        System.out.println(cd0.str());
        System.out.println(cd5.str());


        System.out.println("**********");
        System.out.println("Einzelne DVD");

        System.out.println(dvd0.str());
        System.out.println(dvd1.str());
        System.out.println(dvd2.str());


        System.out.println("**********");
        System.out.println(rating0.str());
        System.out.println(rating1.str());
        System.out.println(rating2.str());
        System.out.println(rating3.str());



    }
}

/*
Die CD.java und die DVD.java sind in dem Ordner material. Diese gibt Ordnung unter den ganzen Klassen. 
CD.java und die DVD.java ähneln sich sehr, daher sind die in einem Ordner/Datei.
Bessere Strukturierung, da man weiß was in der Datei ist und somit gleich sein wird.
*/


/* 
Die Inventory.java ist in einer anderen Datei als CD.java und die DVD.java, weil die sich nicht ähneln!
Die Inventory Klasse hat andere aufgaben als die CD und DVD Klassen. Bessere Orientierung über die Klassen.
*/