public class Veiculo{
    
    private String nome;
    private String marca;
    private String cor;
    private int ano;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return this.cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return this.ano;
    }



    public Veiculo (String nome, String marca, String cor, int ano){
        this.nome=nome;
        this.marca=marca;
        this.cor=cor;
        this.ano=ano;
    }
    public Veiculo(){
        
    }
}