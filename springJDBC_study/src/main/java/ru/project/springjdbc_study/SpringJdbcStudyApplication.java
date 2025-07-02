package ru.project.springjdbc_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.project.springjdbc_study.model.Alien;
import ru.project.springjdbc_study.model.AlienDao;

@SpringBootApplication
public class SpringJdbcStudyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcStudyApplication.class, args);

        /*Alien alien = (Alien) context.getBean("alien");
        alien.setId(1);
        alien.setName("Alien");
        alien.setTech("Java");*/

        AlienDao repository = context.getBean(AlienDao.class);
        /*repository.save(alien);*/

        System.out.println(repository.findAll());
    }
}