package sorteador;

public class PrincipalSorteo{
    public static void main(String[] args) {
        int lista[] = {156165,15,156,1,1,231,23,1231,85,1,651,655,1,651};
        int num;
        for (int i = 0;i<lista.length; i++){
            for (int j = 0; j< lista.length - 1; j++ ){
                if (lista[j] > lista[j + 1]){
                    num = lista[j];
                    lista [j] = lista [j + 1];
                    lista [j+1] = num;
                }
            }
        }
        for (int x : lista){
            System.out.println(x);
        }
    }
}