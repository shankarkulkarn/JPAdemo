package com.cg.demo.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.demo.entity.Employee;

public class Client1 {

	
public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	    Employee  emp = new Employee();
	    emp.setEmployeeName("seema");
	    emp.setEmployeeSalary(9000);
	    em.persist(emp);
	    em.getTransaction().commit();
	    System.out.println(" Added success ");
		em.close();
		emf.close();

	}
}
