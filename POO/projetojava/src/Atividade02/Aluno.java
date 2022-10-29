package Atividade02;

public class Aluno {
    //definir os atributos
    
    private String nome;
    private String idade;
    private String cor;
    private boolean necessiadeespecial;
    private String RA;
    private String curso;
    private String periodo;
    
    Aluno(String nome, String idade, String cor,boolean necessiadeespecial, String RA, String curso,String periodo){
        this.nome=nome;
        this.idade = idade;
        this.cor=cor;
        this.necessiadeespecial=necessiadeespecial;
        this.RA=RA;
        this.curso=curso;
        this.periodo=periodo;
    }
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isNecessiadeespecial() {
        return necessiadeespecial;
    }

    public void setNecessiadeespecial(boolean necessiadeespecial) {
        this.necessiadeespecial = necessiadeespecial;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void Ajudar(){
        System.out.println(this.nome+" ajudou um colega!");
    }
    
    public void Estudar(){
        System.out.println(this.nome+" estudou muito hoje!");
    }
    public void Comprar(){
        System.out.println(this.nome+" comprou saguado!");
        
    }
    public void Faltar(){
        System.out.println(this.nome+" faltou aula hoje!");
        
    }
    public void Atividade(){
        System.out.println(this.nome+" fez a atividade!");
        
    }
    public void Reclamar(){
        System.out.println(this.nome+" reclamou da atividade que o professor passou!");
        
    }
    public void Passar(){
        System.out.println(this.nome+" passou de semestre!");
        
    }
    
}