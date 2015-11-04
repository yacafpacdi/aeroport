package essai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppliMain {
    public static void main(String[] args) {
        System.out.println("=================DEBUT=======================");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aeroportPU");
        EntityManager em = emf.createEntityManager();
        
        //Jeu de tests
        
        
        
        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();
        em.close();
        emf.close();
        System.out.println("=================FIN=======================");
    }

}
