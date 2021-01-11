package in.cmss.apidemo.controller;

/*import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.apidemo.model.Question;
import in.cmss.apidemo.repository.FeedbackRepository;



@ComponentScan(basePackages= {"in.cmss.apidemo.model"})
@CrossOrigin(origins = "http://localhost:8077")
@RestController
@RequestMapping("/questions")
public class FeedbackController {
	
	 private FeedbackRepository feedbackRepository;
	 
	 public FeedbackController(FeedbackRepository feedbackRepository) {
		 this.feedbackRepository = feedbackRepository;
	 }
	 @GetMapping("/a")
	 public String print()
	 {
		return "Hello";
		 
	 }
	 
	 @GetMapping("/all")
	 public List<Question> getAll() {
		 List<Question> questions = this.feedbackRepository.findAll();
		 return questions;
	 }
	 
	 @PutMapping
	 public void insert(@RequestBody Question question) {
		 this.feedbackRepository.insert(question);
	 }
	 @PostMapping
	 public void update(@RequestBody Question question) {
		 this.feedbackRepository.save(question);
	 }
	 
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable ("id") String id) {
		 this.feedbackRepository.delete(id);
		 
	 }
	 


	
	
	
	

}*/
