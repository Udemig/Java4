public class Hesaplama {

    int topla(int deger){ // 5 4 3 2 1 0
        if (deger > 0){
            return deger + topla(deger - 1); // 5 + 4 + 3 + 2 + 1 + 0
        } else {
            return  0;
        }
    }


}
