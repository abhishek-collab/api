package in.cmss.apidemo.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/demo")
public class QurtzController {



	@GetMapping("/ {/ans}")
	@Scheduled(cron="5 * * 18 * ")
	
	public void answer(@PathVariable ("ans") String ans)
	{
		System.out.print("CurrentD");
	}

	
}
