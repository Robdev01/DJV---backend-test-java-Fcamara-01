package desafio.fcamara.desafio.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Veiculo veiculo;

    private LocalDateTime entrada;
    private LocalDateTime saida;

    private Boolean finalizado;
}
