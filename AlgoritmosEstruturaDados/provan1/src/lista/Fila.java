package lista;
public class Fila {
    private No primeiro;
    private No ultimo;
    public void inserir(String elemento){
        No novo = new No ( );
        novo.elemento = elemento;
        if (primeiro != null) {
            ultimo.prox = novo;
            ultimo = novo;
        } else {
            primeiro = novo;
            ultimo = novo;
        }
    }
    public String remover ( ) { 
        if ( primeiro != null ) {
        String elemento = primeiro.elemento;
        primeiro = primeiro.prox;
        return elemento;
        } else {
        return null;
        } 
        }
    public void listar ( ) { 
    No aux = primeiro;
    while (aux != null) {
    System.out.println(aux.elemento);
    aux = aux.prox;
    } 
}
}
