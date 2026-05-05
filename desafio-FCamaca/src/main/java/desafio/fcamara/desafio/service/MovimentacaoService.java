package desafio.fcamara.desafio.service;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.entity.Veiculo;
import desafio.fcamara.desafio.repository.MovimentacaoRepository;
import desafio.fcamara.desafio.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Movimentacao entrada(String placa) {

        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        Movimentacao mov = new Movimentacao();
        mov.setVeiculo(veiculo);
        mov.setEntrada(LocalDateTime.now());
        mov.setFinalizado(false);

        return movimentacaoRepository.save(mov);
    }

    public Movimentacao saida(String placa) {

        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        Movimentacao mov = movimentacaoRepository
                .findByVeiculoAndFinalizadoFalse(veiculo)
                .orElseThrow(() -> new RuntimeException("Veículo não está estacionado"));

        mov.setSaida(LocalDateTime.now());
        mov.setFinalizado(true);

        return movimentacaoRepository.save(mov);
    }
}