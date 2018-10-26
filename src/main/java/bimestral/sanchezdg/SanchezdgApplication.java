package bimestral.sanchezdg;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SanchezdgApplication implements CommandLineRunner{
    
    @Autowired
    RepositorioTarjetas repoTar;

	public static void main(String[] args) {
		SpringApplication.run(SanchezdgApplication.class, args);
	}
        
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hola mundo");
        //repoPagos.servicioPagar();

        //Guarda un mensaje
        //repoMensa.save(new Mensajito("Malo", "Topoyiyo", LocalDate.now()));
        //Buscamos todos los mensajes
        for(TarjetaHabiente tar: repoTar.findAll()){
        System.out.println(tar);
        }
        //Buscamos por id
        System.out.println(repoTar.findById("1").get());
        //Buscamos por titulo
        //repoTar.save(new Mensajito("malo", "yo", "topoyiya", LocalDate.now()));
        //System.out.println(repoTar.findByTitulo("yo"));
        //repoTar.save(new TarjetaHabiente("1", "Diego", "diegosd2297@gmail.com", new Tarjeta(5543632, "banamex", 99999f)));

    }    
}