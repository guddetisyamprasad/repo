package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
