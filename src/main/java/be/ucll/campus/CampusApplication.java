package be.ucll.campus;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.repository.AppConfig;
import be.ucll.campus.repository.GebouwRepository;
import be.ucll.campus.service.GebouwService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class CampusApplication {

	public static void main(String[] args) {



		/*EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("campus");
		EntityManager entityManager =  factory.createEntityManager();

		entityManager.getTransaction().begin();

		entityManager.persist(new Gebouw("Campus Leive","Tiensestraat 2 ,3000 Leuven",20));
		entityManager.persist(new Gebouw("Campus Hoegaarden","Hauthem 81C ,3320 Hoegaarden",220));

		entityManager.getTransaction().commit();

		entityManager.close();*/
		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		GebouwService service = context.getBean(GebouwService.class);
		service.addGebouw("Campus Tienen","Waaibergstraat 41,3300 Tienen",200,2);*/

		SpringApplication.run(CampusApplication.class, args);
	}

}
