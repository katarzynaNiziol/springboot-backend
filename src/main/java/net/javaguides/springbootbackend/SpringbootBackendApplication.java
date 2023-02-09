package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Kate");
//        employee.setLastName("Mishan");
//        employee.setEmailId("kate@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Maria");
//        employee1.setLastName("Foolish");
//        employee1.setEmailId("maria@gmail.com");
//        employeeRepository.save(employee1);
//
//        Employee employee2 = new Employee();
//        employee2.setFirstName("Hanna");
//        employee2.setLastName("Gargan");
//        employee2.setEmailId("hannag@gmail.com");
//        employeeRepository.save(employee2);
    }
}
