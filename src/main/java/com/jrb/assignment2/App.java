package com.jrb.assignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		Query query = entityManager.createQuery(
	            "select MemId from tblMembers");
//	    query.setParameter(1, "Jo%");
	    List<Member> members = query.getResultList();
	    System.out.println(members);
		Member member = entityManager.find(Member.class, "A043");
		
		
		ObjectMapper om = new ObjectMapper();
		try {
			System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(member));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		entityManager.close();

    }
}
