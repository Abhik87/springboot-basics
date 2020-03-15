package com.abhikdutta.springbootquickstart.courseapidata.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	public List<TopicEntity> getAllTopics() {
		return topicRepository.findAll();
	}

	public TopicEntity getTopic(String id) {
		Optional<TopicEntity> topicOptional = topicRepository.findById(id);
		TopicEntity topic = null;
		if (topicOptional.isPresent()) {
			topic = topicOptional.get();
		}
		return topic;
	}

	public TopicEntity addTopic(TopicEntity topic) {
		return topicRepository.save(topic);
	}

	public TopicEntity updateTopic(TopicEntity topic, String id) {
		return topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
