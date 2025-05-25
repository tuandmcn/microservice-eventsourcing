package com.ltfullstack.employeeservice.command.event;

import com.ltfullstack.employeeservice.command.data.Employee;
import com.ltfullstack.employeeservice.command.data.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@Component
public class EmployeeEventHandler {

    @Autowired
    private EmployeeRepository employeeRepository;

    @ExceptionHandler
    public void on(EmployeeCreatedEvent event) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(event, employee);
        employeeRepository.save(employee);
    }

    @ExceptionHandler
    public void on(EmployeeUpdatedEvent event) {
       Optional<Employee> oldEmployee = employeeRepository.findById(event.getId());
       oldEmployee.ifPresent(employee -> {
           employee.setFirstName(event.getFirstName());
           employee.setLastName(event.getLastName());
           employee.setKin(event.getKin());

       })
    }
}
