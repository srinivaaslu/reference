package com.concretepage.dao;

import com.concretepage.persistence.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by 205025 on 6/6/2016.
 */
@Repository
@Transactional(readOnly = false)
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;
    public void saveUserDetail(User user){
        entityManager.persist(user);
        System.out.println("--Data Saved--");
    }
}
