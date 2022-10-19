// Com base nos conteúdos apresentados, implemente uma lista encadeada 
// em Java que apresentará 10 nomes de pessoas, para isto, deve-se utilizar 
// a Interface List e a Classe ArrayList, que são apresentadas na vídeo aula 
// do módulo 2

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01{

    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<String>();
        Scanner leia = new Scanner(System.in);
        int x=1,opcao;

        System.out.println("Esse sistema tem como função imprimir 10 nomes de uma lista.\nDeseja escrever cada um dos 10 nomes?\nCaso Sim digite 1\nCaso Não digite 0");
        opcao = leia.nextInt();
        if (opcao == 1){
                while (x<11){
                System.out.println("Digite o "+x+" nome: ");
                lista.add(leia.next());
                x+=1;
            }
        }
        else if (opcao == 0){
            System.out.println("Vamos utilizar uma lista de nomes que meu querido criador selecionou :D");
            lista.add("Thiago");
            lista.add("Mayque");
            lista.add("Mateus");
            lista.add("Maysa");
            lista.add("Maria");
            lista.add("Carol");
            lista.add("Letycia");
            lista.add("Guilherme");
            lista.add("Victor");
            lista.add("Jonathan");
            lista.add("Rafael");
        }
        else
            System.out.println("Opção invalida");
       
    
        for (String aux :lista){
            System.out.println(aux);
        }
    }
}