package com.cg.demo.pl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.demo.entity.Employee;

public class Client3 {

	
public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
	
		
		
		TypedQuery<Employee> qry = em.createNamedQuery("findEmployeeBySalary",Employee.class);
		
		qry.setParameter("", 10000);
		List<Employee> list = qry.getResultList();
		
		for(Employee  e :  list)
		{
			System.out.println(e.getEmployeeName());
		}
		
		em.close();
		emf.close();

	}
}
