/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos_130pml;

import entidades.Jugador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lv1013
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador= new Jugador("John Wick","john.wick@gmail.com");
        Jugador jugador2= new Jugador("Don gato","don.gato@gmail.com");
        Jugador jugador3= new Jugador("leslie","leslie@gmail.com");
        
        EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("Videojuegos_130pmlPU");
        
        EntityManager em= emFactory.createEntityManager();
        
        em.getTransaction().begin();
        Jugador jugador4= em.find(Jugador.class, 10L);
        System.out.println(jugador4);
        em.getTransaction().commit();
    }
    
}
