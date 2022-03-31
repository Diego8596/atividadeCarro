public class Carro {

    private Integer quantidadeCalotas;
    private Integer quantidadePneus;
    private Integer quantidadePortas;
    private String cor;
    private Integer quantidadeParafusos;
    private Integer anoFabricacao;
    private Integer combustivel;
    private Integer arCondicionado;

    public Carro (Integer quantidadePneus, Integer quantidadePortas, String cor, Integer quantidadeParafusos, Integer quantidadeCalotas){
        this.quantidadePneus = quantidadePneus;
        this.quantidadePortas = quantidadePortas;
        this.cor = cor;
        this.quantidadeParafusos = quantidadeParafusos;
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidadeParafusos() {
        return quantidadeParafusos;
    }

    public void setQuantidadeParafusos(Integer quantidadeParafusos) {
        this.quantidadeParafusos = quantidadeParafusos;
    }
    
    public void imprimiValores(){
        System.out.println("Quantidade de Pneus " + getQuantidadePneus());
        System.out.println("Quantidade de Portas " + getQuantidadePortas());
        System.out.println("Cor " + getCor());
        System.out.println("Quantidade Parafusos " + getQuantidadeParafusos());
        System.out.println("Quantidade Calotas " + getQuantidadeCalotas());
    }


}