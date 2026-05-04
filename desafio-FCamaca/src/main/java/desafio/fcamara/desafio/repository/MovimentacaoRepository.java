package desafio.fcamara.desafio.repository;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

    Optional<Movimentacao> findByVeiculoAndFinalizadoFalse(Veiculo veiculo);

}
