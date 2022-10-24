package atividade2110;

/**
 *
 * @author coelh
 */
public class Atividade2110 {

    public static void main(String[] args) {
     //instanciando objeto carro
        Carro palio = new Carro();
        Carro hb20 = new Carro();
        Carro uno = new Carro();
        Carro celta = new Carro();

        //definindo valores para os atributos do carro;
        //PALIO
        palio.Fabricante = "Fiat";
        palio.Modelo = "Palio";
        palio.Marca = "Fiat";
        palio.Chassi =  "POO21102022#10";
        palio.Nome = "Palio Adventure";
        palio.Ano = "2012";
        palio.Odometro = "123456";
        palio.Combustivel = "Gasolina/alcool";
        
        palio.Ligar();
        palio.Acelerar();
        palio.Frear();
        palio.Derrapou();
        palio.Bateu();
        palio.Desligar();

        System.out.println("Fabricante: "+palio.Fabricante);
        System.out.println("Modelo: "+palio.Marca);
        System.out.println("Marca: "+palio.Marca);
        System.out.println("Chassi: "+palio.Chassi);
        System.out.println("Nome: "+palio.Nome);
        System.out.println("Ano: "+palio.Ano);
        System.out.println("Odometro: "+palio.Odometro);
        System.out.println("Combustivel: "+palio.Combustivel);
        //HB20
        hb20.Fabricante = "Hyunday";
        hb20.Modelo = "HB20";
        hb20.Marca = "Hyundai";
        hb20.Chassi =  "POO21102022#10_1";
        hb20.Nome = "HB20 Sedan";
        palio.Ano = "2015";
        palio.Odometro = "654321";
        palio.Combustivel = "Gasolina";
        
        
        hb20.Ligar();
        hb20.Acelerar();
        hb20.Frear();
        hb20.Derrapou();
        hb20.Bateu();
        hb20.Desligar();
        
        System.out.println("Fabricante: "+hb20.Fabricante);
        System.out.println("Modelo: "+hb20.Marca);
        System.out.println("Marca: "+hb20.Marca);
        System.out.println("Chassi: "+hb20.Chassi);
        System.out.println("Nome: "+hb20.Nome);
        
    
        //UNO
        uno.Fabricante = "Fiat";
        uno.Modelo = "Uno";
        uno.Marca = "Fiat";
        uno.Chassi =  "POO21102053#10";
        uno.Nome = "Uno Quadrado";
        uno.Ano = "2012";
        uno.Odometro = "546822";
        uno.Combustivel = "Gasolina";
        
        uno.Ligar();
        uno.Acelerar();
        uno.Frear();
        uno.Derrapou();
        uno.Bateu();
        uno.Desligar();
        
        System.out.println("Fabricante: "+uno.Fabricante);
        System.out.println("Modelo: "+uno.Marca);
        System.out.println("Marca: "+uno.Marca);
        System.out.println("Chassi: "+uno.Chassi);
        System.out.println("Nome: "+uno.Nome);
        System.out.println("Ano: "+uno.Ano);
        System.out.println("Odometro: "+uno.Odometro);
        System.out.println("Combustivel: "+uno.Combustivel);
        
        //CELTA
        celta.Fabricante = "Chevrolet";
        celta.Modelo = "celta";
        celta.Marca = "Chevrolet";
        celta.Chassi =  "POO210552053#10";
        celta.Nome = "Celta";
        celta.Ano = "2012";
        celta.Odometro = "546822";
        celta.Combustivel = "Gasolina";
        
        celta.Ligar();
        celta.Acelerar();
        celta.Frear();
        celta.Derrapou();
        celta.Bateu();
        celta.Desligar();
        
        System.out.println("Fabricante: "+celta.Fabricante);
        System.out.println("Modelo: "+celta.Marca);
        System.out.println("Marca: "+celta.Marca);
        System.out.println("Chassi: "+celta.Chassi);
        System.out.println("Nome: "+celta.Nome);
        System.out.println("Ano: "+celta.Ano);
        System.out.println("Odometro: "+celta.Odometro);
        System.out.println("Combustivel: "+celta.Combustivel);
        
        
    }
 }
