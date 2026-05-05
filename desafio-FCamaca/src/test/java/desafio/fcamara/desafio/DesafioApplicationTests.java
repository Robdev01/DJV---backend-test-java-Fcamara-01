package desafio.fcamara.desafio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest sobe o contexto do Spring para verificar se a aplicacao inicia corretamente.
@SpringBootTest
class DesafioApplicationTests {

	// Este teste nao executa uma regra especifica.
	// Ele valida que o Spring consegue carregar controllers, services, repositories e entidades.
	@Test
	void contextLoads() {
	}

}
