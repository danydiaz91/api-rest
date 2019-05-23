package io.dany.apirest.bootstrap;

import io.dany.apirest.model.Bicicleta;
import io.dany.apirest.repositories.BicicletaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Dany Diaz
 */
@Component
public class InitDB implements CommandLineRunner {

    private BicicletaRepository bicicletaRepository;

    public InitDB(BicicletaRepository bicicletaRepository) {
        this.bicicletaRepository = bicicletaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setColor("Rojo");
        bicicleta.setModelo(2014);
        bicicleta.setNumRin(26);
        bicicleta.setPrecio(BigDecimal.TEN);
        bicicleta.setMarca("GW");

        bicicletaRepository.save(bicicleta);
    }
}
