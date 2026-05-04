package desafio.fcamara.desafio.entity;

import jakarta.persistence.*;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    private Integer vagasMoto;
    private Integer vagasCarro;
}
