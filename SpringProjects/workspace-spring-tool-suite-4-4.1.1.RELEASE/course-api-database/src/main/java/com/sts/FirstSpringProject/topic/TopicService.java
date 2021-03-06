package com.sts.FirstSpringProject.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicrepo;
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Programming Language", "1", "JAVA"),
			new Topic("Programming Language", "2", "JAVA SCRIPT"),
			new Topic("Spring Framework", "3", "SPRINGBOOT")
			));
	
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicrepo.findById(id).get();
	}
	
	public List<Topic> getAllTopics()
	{
		//return topics;

		List<Topic> topicList = new ArrayList<>();
		topicrepo.findAll().forEach(topicList::add);
		return topicList;
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicrepo.save(topic);
	}

	public void updateTopic(Topic topic) {
		
		/*for(int i=0; i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}}
			*/
		topicrepo.save(topic);
	}

	public void deleteTopic(String id) {
		
		//topics.removeIf(t->t.getId().equals(id));
		
		topicrepo.deleteById(id);
	
	}
	
	
}
