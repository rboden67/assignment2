package com.jrb.assignment2;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class MemberDaoJpaImpl implements MemberDao{
	@PersistenceContext
    private EntityManager entityManager;

	public void save(Member member) {
        entityManager.persist(member);		
	}
 
}
