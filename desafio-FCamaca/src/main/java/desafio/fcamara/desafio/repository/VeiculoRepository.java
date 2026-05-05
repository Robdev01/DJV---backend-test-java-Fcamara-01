package desafio.fcamara.desafio.repository;

import desafio.fcamara.desafio.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Repository e a camada que conversa com o banco de dados.
// JpaRepository entrega metodos prontos como findAll, findById, save e deleteById.
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    // O Spring Data JPA entende o nome do metodo e cria a consulta automaticamente.
    // findByPlaca procura um veiculo pela coluna placa.
    // Optional representa que pode existir ou nao um veiculo com essa placa.
    Optional<Veiculo> findByPlaca(String placa);
}
