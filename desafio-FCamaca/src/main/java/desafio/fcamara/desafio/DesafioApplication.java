package desafio.fcamara.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication marca esta classe como o ponto inicial do Spring Boot.
// Ela tambem ativa configuracoes automaticas, varredura de componentes e configuracoes do projeto.
@SpringBootApplication
public class DesafioApplication {

	// O metodo main e a entrada da aplicacao Java.
	// SpringApplication.run sobe o servidor embutido, como o Tomcat, e inicia a API.
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

}
