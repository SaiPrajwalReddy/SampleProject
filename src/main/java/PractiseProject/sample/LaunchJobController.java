package PractiseProject.sample;

import java.io.IOException;
import java.util.Properties;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchJobController {
	
	@PostMapping(value = "/jobs",produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> invokeJob() {
		
		LaunchJob lj = new LaunchJob();
		try {
			int code = lj.execute("PractiseProject.sample.AnalyticClass", new Properties());
			System.out.println("Code is " + code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Object>("Job Submitted Successfully",HttpStatus.OK);
		
	}
	
}
