package com.victordantas.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victordantas.workshopmongo.domain.User;
import com.victordantas.workshopmongo.dto.UserDTO;
import com.victordantas.workshopmongo.repository.UserRepository;
import com.victordantas.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User user) {
		return userRepository.insert(user);
	}
	
	public void delete(String id) {
		this.findById(id);
		userRepository.deleteById(id);
	}
	
	public User update(User obj) {
		User newObj = this.findById(obj.getId());
		updateData(newObj, obj);
		return userRepository.save(newObj);
	
	}
	
	public void updateData(User obj1, User obj2) {
		obj1.setName(obj2.getName());
		obj1.setEmail(obj2.getEmail());
	}
	
	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(),userDTO.getName(), userDTO.getEmail());
	}
	
}
