package com.example.mysqlquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/employeeService") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private EmployeeRepository employeeRepository;

	@PostMapping(path = "/addEmployee") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String fname, @RequestParam String lname,
			@RequestParam String email, @RequestParam String empID) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Employee n = new Employee();
		n.setFName(fname);
		n.setLName(lname);
		n.setEmail(email);
		n.setEmpID(empID);
		
		employeeRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/getAllEmployee")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		// This returns a JSON or XML with the users
		return employeeRepository.findAll();
	}
}