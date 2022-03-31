# atividadeCarro
Atividade Objeto e Classes - Utilizando get e set.

Foi desenvolvido nessa atividade itens obrigatorios e opcionais de um carro.
Os itens obrigatorios foram designados no construtor e os opcionais fora do construtor.

--Itens do Carro--

private Integer quantidadeCalotas;
    private Integer quantidadePneus;
    private Integer quantidadePortas;
    private String cor;
    private Integer quantidadeParafusos;
    private Integer anoFabricacao;
    private Integer combustivel;
    private Integer arCondicionado;

--Construtor--

public Carro (Integer quantidadePneus, Integer quantidadePortas, String cor, Integer quantidadeParafusos, Integer quantidadeCalotas){
        this.quantidadePneus = quantidadePneus;
        this.quantidadePortas = quantidadePortas;
        this.cor = cor;
        this.quantidadeParafusos = quantidadeParafusos;
        this.quantidadeCalotas = quantidadeCalotas;
    }
