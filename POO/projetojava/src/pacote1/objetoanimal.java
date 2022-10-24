package pacote1;

public class objetoanimal {
    public static void main (String [] args){
        
        //instanciando animais
        animal tigre = new animal();
        animal gato = new animal();
        animal cachorro = new animal();
        animal rato = new animal();
        animal leao = new animal();
        animal golfinho = new animal();

        //definindo os dados de cada aniaml
        //trigre
        tigre.Nome = "Tigre";
        tigre.NomeCientifico = "Panthera tigris";
        tigre.Alimentação = "Carnivoros";
        tigre.Filo = "Cordados";
        tigre.Habitat = "Florestas, pastagem, tundra e taiga";
        tigre.Patas = 4;
        tigre.Sexo = "M";
        tigre.Vida = "8 - 10 anos";
        
        System.out.println("Nome do Animal: "+tigre.Nome);
        System.out.println("Nome Cientifico: "+tigre.NomeCientifico);
        System.out.println("Alimentacao: "+tigre.Alimentação);
        System.out.println("Filo: "+tigre.Filo);
        System.out.println("Habitat: "+tigre.Habitat);
        System.out.println("Numero de patas: "+tigre.Patas);
        System.out.println("Sexo: "+tigre.Sexo);
        System.out.println("Vida: "+tigre.Vida);

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
        gato.Nome = "Gato ";
        gato.NomeCientifico = "Felis catus";
        gato.Alimentação = "Carnivoros";
        gato.Filo = "Cordados";
        gato.Habitat = "Cidades";
        gato.Patas = 4;
        gato.Sexo = "F";
        gato.Vida = "12 - 18 anos";

        System.out.println("Nome do Animal: "+gato.Nome);
        System.out.println("Nome Cientifico: "+gato.NomeCientifico);
        System.out.println("Alimentacao: "+gato.Alimentação);
        System.out.println("Filo: "+gato.Filo);
        System.out.println("Hhabitat: "+gato.Habitat);
        System.out.println("Numero de patas: "+gato.Patas);
        System.out.println("Sexo: "+gato.Sexo);
        System.out.println("Vida: "+gato.Vida);

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
        cachorro.Nome = "Cachorro";
        cachorro.NomeCientifico = "Canis lupus familiaris";
        cachorro.Alimentação = "Carnivoro";
        cachorro.Filo = "Cordados";
        cachorro.Habitat = "Cidades";
        cachorro.Patas = 4;
        cachorro.Sexo = "M";
        cachorro.Vida = "10 - 13 anos";        

        System.out.println("Nome do Animal: "+cachorro.Nome);
        System.out.println("Nome Cientifico: "+cachorro.NomeCientifico);
        System.out.println("Alimentacao: "+cachorro.Alimentação);
        System.out.println("Filo: "+cachorro.Filo);
        System.out.println("Habitat: "+cachorro.Habitat);
        System.out.println("Numero de patas: "+cachorro.Patas);
        System.out.println("Sexo: "+cachorro.Sexo);
        System.out.println("Vida: "+cachorro.Vida);

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
        rato.Nome = "Rato Branco ou Rato Wistar";
        rato.NomeCientifico = "Rattus norwegicus";
        rato.Alimentação = "Ração";
        rato.Filo = "Cordados";
        rato.Habitat = "Laboratorios";
        rato.Patas = 4;
        rato.Sexo = "F";
        rato.Vida = "3 - 5 anos";
        
        System.out.println("Nome do Animal: "+rato.Nome);
        System.out.println("Nome Cientifico: "+rato.NomeCientifico);
        System.out.println("Alimentacao: "+rato.Alimentação);
        System.out.println("Filo: "+rato.Filo);
        System.out.println("Habitat: "+rato.Habitat);
        System.out.println("Numero de patas: "+rato.Patas);
        System.out.println("Vida: "+rato.Sexo);
        System.out.println("Sexo: "+rato.Vida);

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
        leao.Nome = "Leão";
        leao.NomeCientifico = "Panthera leo";
        leao.Alimentação = "Carnivoro";
        leao.Filo = "Cordados";
        leao.Habitat = "Savanas";
        leao.Patas = 4;
        leao.Sexo = "F";
        leao.Vida = "15 - 16 anos ";
        
        
        System.out.println("Nome do Animal: "+leao.Nome);
        System.out.println("Nome Cientifico: "+leao.NomeCientifico);
        System.out.println("Alimentacao: "+leao.Alimentação);
        System.out.println("Filo: "+leao.Filo);
        System.out.println("Habitat: "+leao.Habitat);
        System.out.println("Numero de patas: "+leao.Patas);
        System.out.println("Sexo: "+leao.Sexo);
        System.out.println("Vida: "+leao.Vida);
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
        golfinho.Nome = "Golfinho";
        golfinho.NomeCientifico = "Delphinus delphis";
        golfinho.Alimentação = "Carnivoros";
        golfinho.Filo = "cordados";
        golfinho.Habitat = "Maior parte do oceano, exceto nos polos";
        golfinho.Patas = 0;
        golfinho.Sexo = "M";
        golfinho.Vida = "10 - 45 anos";
        

        
        System.out.println("Nome do Animal: "+golfinho.Nome);
        System.out.println("Nome Cientifico: "+golfinho.NomeCientifico);
        System.out.println("Alimentacao: "+golfinho.Alimentação);
        System.out.println("Filo: "+golfinho.Filo);
        System.out.println("Habitat: "+golfinho.Habitat);
        System.out.println("Numero de patas: "+golfinho.Patas);
        System.out.println("Sexo: "+golfinho.Sexo);
        System.out.println("Vida: "+golfinho.Vida);

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
