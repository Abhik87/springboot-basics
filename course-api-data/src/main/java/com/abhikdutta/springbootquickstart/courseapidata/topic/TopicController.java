package com.abhikdutta.springbootquickstart.courseapidata.topic;

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
	TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public String addTopic(@RequestBody Topic topic) {
		Topic savedTopic = topicService.addTopic(topic);
		return savedTopic.toString();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		Topic updatedTopic = topicService.updateTopic(topic, id);
		return updatedTopic.toString();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
