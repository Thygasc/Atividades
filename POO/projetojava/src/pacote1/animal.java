package pacote1;

public class animal{
    private String Nome;
    private String Alimentação;
    private int Patas;
    private String Vida;
    private String Habitat;
    private String NomeCientifico;
    private String Filo;
    private String Sexo;
    
    animal(String Nome, String Alimentacao,int Patas,String Vida, String Habitat, String NomeCientifico, String Filo, String Sexo){
        this.Nome = Nome;
        this.Alimentação = Alimentacao; 
        this.Patas = Patas;
        this.Vida = Vida;
        this.Habitat = Habitat;
        this.NomeCientifico = NomeCientifico;
        this.Filo = Filo;
        this.Sexo = Sexo;
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getAlimentação() {
        return Alimentação;
    }
    public void setAlimentação(String alimentação) {
        Alimentação = alimentação;
    }
    public int getPatas() {
        return Patas;
    }
    public void setPatas(int patas) {
        Patas = patas;
    }
    public String getVida() {
        return Vida;
    }
    public void setVida(String vida) {
        Vida = vida;
    }
    public String getHabitat() {
        return Habitat;
    }
    public void setHabitat(String habitat) {
        Habitat = habitat;
    }
    public String getNomeCientifico() {
        return NomeCientifico;
    }
    public void setNomeCientifico(String nomeCientifico) {
        NomeCientifico = nomeCientifico;
    }
    public String getFilo() {
        return Filo;
    }
    public void setFilo(String filo) {
        Filo = filo;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public void Andar(){
        System.out.println("O animal andou!");
    }    
    public void Nadar(){
        System.out.println("O animal nadou!");
    }    
    public void Comer(){
        System.out.println("O animal comeu!");
    }    
    public void Reprocriar(){
        System.out.println("O animal fez vuco vuco!");
    }    
    public void Brincar(){
        System.out.println("O animal está se divertindo!");
    }    
    public void Dormir(){
        System.out.println("O animal foi a mimir!");
    }    
    public void Pular(){
        System.out.println("O animal ta dando uns pulo!");
    }    
    public void Correr(){
        System.out.println("O animal correu!");
    }    
    

}