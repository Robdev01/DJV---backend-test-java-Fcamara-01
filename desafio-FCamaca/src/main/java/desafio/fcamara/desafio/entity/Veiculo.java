package desafio.fcamara.desafio.entity;

import desafio.fcamara.desafio.enuns.TipoVeiculo;
import jakarta.persistence.*;

// @Entity informa ao JPA que esta classe representa uma tabela no banco de dados.
@Entity
public class Veiculo {

    // @Id marca o campo como chave primaria da tabela.
    @Id
    // IDENTITY deixa o banco gerar o id automaticamente quando salvar um novo registro.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campos simples viram colunas da tabela veiculo.
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    // EnumType.STRING salva o nome do enum no banco, por exemplo CARRO ou MOTO.
    // Isso e mais legivel do que salvar a posicao numerica do enum.
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipo;

    // Getters e setters permitem que o Spring/Jackson leia e preencha o objeto pelo JSON.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
}
