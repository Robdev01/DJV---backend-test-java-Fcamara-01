package desafio.fcamara.desafio.controller;

import desafio.fcamara.desafio.entity.Veiculo;
import desafio.fcamara.desafio.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController diz que esta classe recebe requisicoes HTTP e devolve dados no corpo da resposta.
@RestController
// Define o caminho base de todos os endpoints desta classe.
@RequestMapping("/veiculos")
public class VeiculoController {

    // @Autowired pede para o Spring injetar automaticamente uma instancia do repository.
    @Autowired
    private VeiculoRepository repository;

    // GET /veiculos
    // Retorna todos os veiculos cadastrados.
    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    // POST /veiculos
    // @RequestBody transforma o JSON da requisicao em um objeto Veiculo.
    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    // PUT /veiculos/{id}
    // @PathVariable pega o id que veio na URL.
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo v) {
        // Define o id recebido na URL para indicar qual registro sera atualizado.
        v.setId(id);
        return repository.save(v);
    }

    // DELETE /veiculos/{id}
    // Remove o veiculo pelo id.
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
