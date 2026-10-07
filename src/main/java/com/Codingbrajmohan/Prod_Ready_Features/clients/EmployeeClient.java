package com.Codingbrajmohan.Prod_Ready_Features.clients;



import com.Codingbrajmohan.Prod_Ready_Features.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(Long employeeId);

    EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO);
}
