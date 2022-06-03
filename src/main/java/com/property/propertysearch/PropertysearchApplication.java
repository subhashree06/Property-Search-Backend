package com.property.propertysearch;

import com.property.propertysearch.model.Role;
import com.property.propertysearch.model.User;
import com.property.propertysearch.model.UserRole;
import com.property.propertysearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PropertysearchApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(PropertysearchApplication.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
//		User user = new User();
//		user.setFirstName("Subhashree");
//		user.setLastName("Subhadarshinee");
//		user.setUsername("subh0607");
//		user.setPassword(this.bCryptPasswordEncoder.encode("password"));
//		user.setEmail("subh06@gmail.com");
//
//		Role role1 = new Role();
//		role1.setRoleId(11L);
//		role1.setRoleName("Admin");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}
}
