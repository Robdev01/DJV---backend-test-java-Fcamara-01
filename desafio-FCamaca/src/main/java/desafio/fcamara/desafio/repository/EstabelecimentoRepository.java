package desafio.fcamara.desafio.repository;

import desafio.fcamara.desafio.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository e a camada que conversa com o banco de dados.
// JpaRepository ja entrega metodos prontos como findAll, findById, save e deleteById.
// O primeiro parametro e a entidade, e o segundo e o tipo do id da entidade.
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}
