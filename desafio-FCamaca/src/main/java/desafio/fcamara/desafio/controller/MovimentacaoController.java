package desafio.fcamara.desafio.controller;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller responsavel pelos endpoints de entrada e saida de veiculos.
@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    // Aqui usamos Service porque entrada e saida possuem regra de negocio.
    @Autowired
    private MovimentacaoService service;

    // POST /movimentacoes/entrada/{placa}
    // Registra que o veiculo entrou no estacionamento.
    @PostMapping("/entrada/{placa}")
    public Movimentacao entrada(@PathVariable String placa) {
        return service.entrada(placa);
    }

    // POST /movimentacoes/saida/{placa}
    // Registra que o veiculo saiu do estacionamento.
    @PostMapping("/saida/{placa}")
    public Movimentacao saida(@PathVariable String placa) {
        return service.saida(placa);
    }
}
