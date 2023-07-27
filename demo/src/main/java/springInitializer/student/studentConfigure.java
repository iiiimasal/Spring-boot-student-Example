package springInitializer.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfigure {
    @Bean
    CommandLineRunner commandLineRunner(
            studentRepository repository){
        return args -> {
           student asal= new student(
                    1L,
                    "asal",
                    LocalDate.of(2003, Month.JUNE,21),
                    "asal.salmani@gmail.com"
            );
           student Alex=new student(
                   "alex",
                   LocalDate.of(2005,Month.JUNE,25),
                   "alex@email.com"
           );
    repository.saveAll(
            List.of(asal,Alex)
    );

        };
    }
}
