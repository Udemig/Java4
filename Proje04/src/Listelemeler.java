import java.util.ArrayList;

public class Listelemeler {

    /*
    * parametre -> ifade
    * (parametre1, parametre2) -> ifade
    * (parametre1, parametre2) -> { code block }
    *
    * */
    void listele(){
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(0);
        sayilar.add(10);
        sayilar.add(9);
        sayilar.add(-1);
        sayilar.forEach((eleman) -> { System.out.println("n: " + eleman);});

    }

    void listele2(){

    }
}
