package course.api.springbootstarter.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public  List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("spring","spring framewor","no des"),
				new Topic("java","my framework","no des"),
				new Topic("Core Java","ls framework","no des")
				
				
				);	
	}
	
	
	

}
