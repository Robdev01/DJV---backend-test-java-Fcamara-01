package desafio.fcamara.desafio.controller;

import desafio.fcamara.desafio.entity.Movimentacao;
import desafio.fcamara.desafio.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService service;

    @PostMapping("/entrada/{placa}")
    public Movimentacao entrada(@PathVariable String placa) {
        return service.entrada(placa);
    }

    @PostMapping("/saida/{placa}")
    public Movimentacao saida(@PathVariable String placa) {
        return service.saida(placa);
    }
}
