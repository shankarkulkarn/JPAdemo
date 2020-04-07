package com.cg.demo.pl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.demo.entity.Employee;

public class Client2 {

public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
	
		String query="select e from Employee e where e.employeeId > 20";
		
		TypedQuery<Employee> qry = em.createQuery(query,Employee.class);
		
		List<Employee> list = qry.getResultList();
		
		for(Employee  e :  list)
		{
			System.out.println(e.getEmployeeName());
		}
		
		em.close();
		emf.close();

	}
}
