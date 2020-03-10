package br.com.desafio.entity.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static EntityManagerFactory enf = null;
	private static EntityManager em = null ;
	
	public static EntityManager getEntityManager() {
		
		
		if(enf == null ) {
		   enf = Persistence.createEntityManagerFactory("heitor"); // inicia o vínculo com o banco de dados
			
		}if(em == null) {
			em = enf.createEntityManager(); // Objeto consultado ou persistido
			

		}
		return em;
	}

}
