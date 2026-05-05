package desafio.fcamara.desafio.service;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.entity.Veiculo;
import desafio.fcamara.desafio.repository.MovimentacaoRepository;
import desafio.fcamara.desafio.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

// @Service marca esta classe como a camada de regra de negocio.
// Regras como "veiculo existe?" e "veiculo esta estacionado?" ficam melhor aqui do que no controller.
@Service
public class MovimentacaoService {

    // Repository usado para salvar e buscar movimentacoes.
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    // Repository usado para buscar o veiculo pela placa.
    @Autowired
    private VeiculoRepository veiculoRepository;

    // Registra a entrada de um veiculo no estacionamento.
    public Movimentacao entrada(String placa) {

        // Busca o veiculo pela placa. Se nao encontrar, lanca uma exception.
        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        // Cria uma nova movimentacao aberta.
        Movimentacao mov = new Movimentacao();
        mov.setVeiculo(veiculo);
        mov.setEntrada(LocalDateTime.now());
        mov.setFinalizado(false);

        // save grava no banco e retorna o objeto salvo com id preenchido.
        return movimentacaoRepository.save(mov);
    }

    // Registra a saida de um veiculo que ja esta estacionado.
    public Movimentacao saida(String placa) {

        // Primeiro encontramos o cadastro do veiculo.
        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        // Depois procuramos a movimentacao aberta desse veiculo.
        Movimentacao mov = movimentacaoRepository
                .findByVeiculoAndFinalizadoFalse(veiculo)
                .orElseThrow(() -> new RuntimeException("Veículo não está estacionado"));

        // Fecha a movimentacao preenchendo a hora de saida.
        mov.setSaida(LocalDateTime.now());
        mov.setFinalizado(true);

        return movimentacaoRepository.save(mov);
    }
}
