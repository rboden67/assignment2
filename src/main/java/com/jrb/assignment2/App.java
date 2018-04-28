package com.jrb.assignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
//    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//
//		transaction.begin();
//		Query query = entityManager.createQuery(
//	            "select memid from Member");
//	    List<Member> members = query.getResultList();
//	    System.out.println(members);
//		Member member = entityManager.find(Member.class, "A043");
//		
//		
//		ObjectMapper om = new ObjectMapper();
//		try {
//			System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(member));
//			
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		entityManager.close();
    	
    	ApplicationContext applicationContext = 
                new AnnotationConfigApplicationContext(Assgn2Configuration.class);
            
            MemberService MemberService = applicationContext.getBean(MemberService.class);
            
            Member Member = new Member();
            Member.setFirstname("John");
            MemberService.save(Member);

    }
}
