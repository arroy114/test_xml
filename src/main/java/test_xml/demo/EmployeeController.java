package test_xml.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping(value="/test", produces =  "text/xml" )
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO getEmployeeByEmail() throws Exception {
        final EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(1);
        employeeDTO.setName("John");
        return employeeDTO;
    }
}
