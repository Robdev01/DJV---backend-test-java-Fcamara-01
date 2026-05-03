package desafio.fcamara.desafio.entity;

import desafio.fcamara.desafio.enuns.TipoVeiculo;
import jakarta.persistence.*;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipo;
}
