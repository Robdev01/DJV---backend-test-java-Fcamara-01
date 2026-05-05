package desafio.fcamara.desafio.repository;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Repository responsavel pelas consultas da entidade Movimentacao.
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

    // Busca uma movimentacao aberta de um veiculo.
    // "FinalizadoFalse" faz o Spring Data procurar registros onde finalizado = false.
    Optional<Movimentacao> findByVeiculoAndFinalizadoFalse(Veiculo veiculo);

}
