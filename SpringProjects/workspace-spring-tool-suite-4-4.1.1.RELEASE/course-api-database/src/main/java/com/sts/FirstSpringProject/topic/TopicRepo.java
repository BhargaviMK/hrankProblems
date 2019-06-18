package com.sts.FirstSpringProject.topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topic, String> {

	
}
