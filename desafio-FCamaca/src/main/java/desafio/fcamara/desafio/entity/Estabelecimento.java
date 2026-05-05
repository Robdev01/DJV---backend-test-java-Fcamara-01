package desafio.fcamara.desafio.entity;

import jakarta.persistence.*;

// Esta entidade representa a empresa/estacionamento pedido no desafio.
@Entity
public class Estabelecimento {

    // @Id marca o campo que sera a chave primaria da tabela.
    @Id
    // IDENTITY deixa o banco gerar o valor do id automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Dados cadastrais do estabelecimento.
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    // Quantidade total de vagas disponiveis para cada tipo de veiculo.
    private Integer vagasMoto;
    private Integer vagasCarro;

    // Getters e setters permitem que o Spring/Jackson leia e monte o objeto pelo JSON.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getVagasMoto() {
        return vagasMoto;
    }

    public void setVagasMoto(Integer vagasMoto) {
        this.vagasMoto = vagasMoto;
    }

    public Integer getVagasCarro() {
        return vagasCarro;
    }

    public void setVagasCarro(Integer vagasCarro) {
        this.vagasCarro = vagasCarro;
    }
}
