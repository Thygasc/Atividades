package pacote1;

public class objetoanimal {
    public static void main (String [] args){
        
        //instanciando animais
      //  animal(String Nome, String Alimentacao,int Patas,String Vida, String Habitat, String NomeCientifico, String Filo, String Sexo){

        animal tigre = new animal("Tigre","Carnivoros",4,"8-10 anos","Florestas, pastagem, tundra e taiga","Panthera tigris","Cordados","M");
        animal gato = new animal("Gato","Carnivoros",4,"12-18 Anos","Cidades","Felis Catus","Cordados","F");
        animal cachorro = new animal("Cachorro","Carnivoro",4,"10-13 Anos","Cidades","Canis Lupus Familiaris","Cordados","M");
        animal rato = new animal("Golfinho","Carnivoros",0,"10-45 Anos","Maior parte do oceano,exceto nos polos","Delphinus Delphis","Cordados","M");
        animal leao = new animal("Leão","Carnivoro",4,"15-16 anos","Savanas","Panthera Leo","Cordados","F");
        animal golfinho = new animal("Rato Branco","Racao",4,"3-5 Anos","Laboratorio","Rattus Norwegicus","Cordados","F");

        //definindo os dados de cada aniaml
        //trigre 

        System.out.println("Nome do Animal: "+tigre.getNome());
        System.out.println("Nome Cientifico: "+tigre.getNomeCientifico());
        System.out.println("Alimentacao: "+tigre.getAlimentação());
        System.out.println("Filo: "+tigre.getFilo());
        System.out.println("Habitat: "+tigre.getHabitat());
        System.out.println("Numero de patas: "+tigre.getPatas());
        System.out.println("Sexo: "+tigre.getSexo());
        System.out.println("Vida: "+tigre.getVida());

        tigre.Andar();
        tigre.Brincar();
        tigre.Comer();
        tigre.Correr();
        tigre.Dormir();
        tigre.Nadar();
        tigre.Pular();
        tigre.Reprocriar();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //gato

        System.out.println("Nome do Animal: "+gato.getNome());
        System.out.println("Nome Cientifico: "+gato.getNomeCientifico());
        System.out.println("Alimentacao: "+gato.getAlimentação());
        System.out.println("Filo: "+gato.getFilo());
        System.out.println("Habitat: "+gato.getHabitat());
        System.out.println("Numero de patas: "+gato.getPatas());
        System.out.println("Sexo: "+gato.getSexo());
        System.out.println("Vida: "+gato.getVida());


        gato.Andar();
        gato.Brincar();
        gato.Comer();
        gato.Correr();
        gato.Dormir();
        gato.Nadar();
        gato.Pular();
        gato.Reprocriar();

 
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //cachorro
        
        System.out.println("Nome do Animal: "+cachorro.getNome());
        System.out.println("Nome Cientifico: "+cachorro.getNomeCientifico());
        System.out.println("Alimentacao: "+cachorro.getAlimentação());
        System.out.println("Filo: "+cachorro.getFilo());
        System.out.println("Habitat: "+cachorro.getHabitat());
        System.out.println("Numero de patas: "+cachorro.getPatas());
        System.out.println("Sexo: "+cachorro.getSexo());
        System.out.println("Vida: "+cachorro.getVida());


        cachorro.Andar();
        cachorro.Brincar();
        cachorro.Comer();
        cachorro.Correr();
        cachorro.Dormir();
        cachorro.Nadar();
        cachorro.Pular();
        cachorro.Reprocriar();
        
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //Rato

        System.out.println("Nome do Animal: "+rato.getNome());
        System.out.println("Nome Cientifico: "+rato.getNomeCientifico());
        System.out.println("Alimentacao: "+rato.getAlimentação());
        System.out.println("Filo: "+rato.getFilo());
        System.out.println("Habitat: "+rato.getHabitat());
        System.out.println("Numero de patas: "+rato.getPatas());
        System.out.println("Sexo: "+rato.getSexo());
        System.out.println("Vida: "+rato.getVida());


        rato.Andar();
        rato.Brincar();
        rato.Comer();
        rato.Correr();
        rato.Dormir();
        rato.Nadar();
        rato.Pular();
        rato.Reprocriar();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //Leao        
        
        System.out.println("Nome do Animal: "+leao.getNome());
        System.out.println("Nome Cientifico: "+leao.getNomeCientifico());
        System.out.println("Alimentacao: "+leao.getAlimentação());
        System.out.println("Filo: "+leao.getFilo());
        System.out.println("Habitat: "+leao.getHabitat());
        System.out.println("Numero de patas: "+leao.getPatas());
        System.out.println("Sexo: "+leao.getSexo());
        System.out.println("Vida: "+leao.getVida());

        leao.Andar();
        leao.Brincar();
        leao.Comer();
        leao.Correr();
        leao.Dormir();
        leao.Nadar();
        leao.Pular();
        leao.Reprocriar();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //Golfinho
        System.out.println("Nome do Animal: "+golfinho.getNome());
        System.out.println("Nome Cientifico: "+golfinho.getNomeCientifico());
        System.out.println("Alimentacao: "+golfinho.getAlimentação());
        System.out.println("Filo: "+golfinho.getFilo());
        System.out.println("Habitat: "+golfinho.getHabitat());
        System.out.println("Numero de patas: "+golfinho.getPatas());
        System.out.println("Sexo: "+golfinho.getSexo());
        System.out.println("Vida: "+golfinho.getVida());


        golfinho.Andar();
        golfinho.Brincar();
        golfinho.Comer();
        golfinho.Correr();
        golfinho.Dormir();
        golfinho.Nadar();
        golfinho.Pular();
        golfinho.Reprocriar();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
    }
}
