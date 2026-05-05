package desafio.fcamara.desafio.controller;

import desafio.fcamara.desafio.entity.Estabelecimento;
import desafio.fcamara.desafio.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller e a porta de entrada HTTP da API.
// Tudo que chegar em /estabelecimentos cai nos metodos dessa classe.
@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoRepository repository;

    // GET /estabelecimentos
    // Lista todos os estabelecimentos cadastrados.
    @GetMapping
    public List<Estabelecimento> listar() {
        return repository.findAll();
    }

    // POST /estabelecimentos
    // Recebe um JSON no corpo da requisicao e salva no banco.
    @PostMapping
    public Estabelecimento criar(@RequestBody Estabelecimento estabelecimento) {
        return repository.save(estabelecimento);
    }

    // PUT /estabelecimentos/{id}
    // Atualiza um estabelecimento usando o id recebido pela URL.
    @PutMapping("/{id}")
    public Estabelecimento atualizar(@PathVariable Long id, @RequestBody Estabelecimento estabelecimento) {
        // O id da URL tem prioridade sobre qualquer id que venha no JSON.
        estabelecimento.setId(id);
        return repository.save(estabelecimento);
    }

    // DELETE /estabelecimentos/{id}
    // Remove o registro pelo id.
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
