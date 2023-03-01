import java.text.DecimalFormat;

public class Informacao {

    private String nomeEstado, regiao;
    private float pib, soma, porcentagem;
    
    public String getNomeEstado() {
        return nomeEstado;
    }
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
    public float getPib() {
        return pib;
    }
    public void setPib(float pib) {
        this.pib = pib;
    }    
    public float getSoma() {
        return soma;
    }
    public void setSoma(float soma) {
        this.soma = soma;
    }    
    public float getPorcentagem() {
        return porcentagem;
    }
    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }    
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##0.000");
        return "Nome do Estado: " + nomeEstado 
        + "\nPib: R$ " + pib + " Bilhoes"
        + "\nPorcentagem: " + format.format(porcentagem) + "%\n";
        //String.format("%.2f", porcentagem) 
    }

    public Informacao() {}
} 
