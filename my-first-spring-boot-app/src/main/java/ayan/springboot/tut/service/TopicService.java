package ayan.springboot.tut.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ayan.springboot.tut.beans.Topic;

@Service
public class TopicService {
	private List<Topic> topicList=new ArrayList<>(Arrays.asList(new Topic(1,"1st Topic") , 
			new Topic (2,"2nd Topic")));
	public List<Topic> getTopicList()
	{
		return topicList;
	}
	public Topic getTopicById(int id)
	{
		return topicList.get(id);
	}
	public void addTopic(Topic topic)
	{
		topicList.add(topic);
	}
}
