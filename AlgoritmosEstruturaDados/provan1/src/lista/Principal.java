package lista;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        System.out.println("Insercao!\n");
        fila.inserir("Thiago");
        fila.inserir("Mayque");
        fila.inserir("Thygas");
        fila.inserir("Maria");
        System.out.println("Remoção!");
        System.out.println("Irei remover> "+fila.remover());
        System.out.println("Listar!");
        fila.listar();
    }

}
