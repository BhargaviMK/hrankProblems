package com.sts.FirstSpringProject.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicSer;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return topicSer.getAllTopics();
		}
	
	
	//getting a single resource
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id){
		
		return topicSer.getTopic(id);
		}
	
	//post request takes instance from request body and adds to topic list
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		  topicSer.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic) {
	
		  topicSer.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id) {
	
		  topicSer.deleteTopic(id);
	}
	
}
