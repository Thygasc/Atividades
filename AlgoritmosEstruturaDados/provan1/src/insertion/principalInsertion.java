package insertion;

public class principalInsertion{
public static void main(String[] args) {
    int lista[] = {0,4156,456,465,45,4564,52,15,1564,1651,51,56,165,156,1};
    int i, j, chave;
        for (i = 1; i < lista.length; i++){
            chave = lista[i];
            for (j = i - 1; (j>=0 ) && (lista[j] < chave); j--){
                lista [j+1] = lista[j];
            }
            lista[j+1]= chave;
        }
    for (int num : lista) {
        System.out.println(num);
    } 
}
}