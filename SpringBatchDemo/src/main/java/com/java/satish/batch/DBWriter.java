package com.java.satish.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.satish.model.User;
import com.java.satish.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> items) throws Exception {
		// TODO Auto-generated method stub
		System.err.println("Data Saved for users"+items);
		userRepository.saveAll(items);
		
	}

}
