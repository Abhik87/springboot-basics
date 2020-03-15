package com.abhikdutta.springbootquickstart.courseapidata.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		return topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		Optional<Topic> topicOptional = topicRepository.findById(id);
		Topic topic = null;
		if (topicOptional.isPresent()) {
			topic = topicOptional.get();
		}
		return topic;
	}

	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	public Topic updateTopic(Topic topic, String id) {
		return topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
