package Prova;

public class Bubble {
    public static void Blube(int Lista[]){
        int num;
        for (int i = 0;i<Lista.length; i++){
            for (int j = 0; j< Lista.length - 1; j++ ){
                if (Lista[j] > Lista[j + 1]){
                    num = Lista[j];
                    Lista [j] = Lista [j + 1];
                    Lista [j+1] = num;
                }
            }
        }
    }
}
