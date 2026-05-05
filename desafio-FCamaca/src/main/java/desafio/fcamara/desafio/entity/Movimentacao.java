package desafio.fcamara.desafio.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// Esta entidade registra a entrada e a saida de um veiculo no estacionamento.
@Entity
public class Movimentacao {

    // Chave primaria da movimentacao.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Muitas movimentacoes podem pertencer ao mesmo veiculo.
    // Exemplo: o mesmo carro pode entrar e sair varias vezes em dias diferentes.
    @ManyToOne
    private Veiculo veiculo;

    // Guarda o momento em que o veiculo entrou.
    private LocalDateTime entrada;

    // Guarda o momento em que o veiculo saiu. Enquanto estiver estacionado, fica null.
    private LocalDateTime saida;

    // Indica se essa movimentacao ja foi encerrada com uma saida.
    private Boolean finalizado;

    // Getters e setters permitem acessar e alterar os campos da entidade.

    public Long getId() {
        return id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
}
