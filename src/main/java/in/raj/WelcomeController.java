package in.raj;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
      @GetMapping("/course")
	public ResponseEntity<String> getCourseDetails(@RequestParam String name)

	{
		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + "Will start in 3rd October";
		} else if ("JRTP".equals(name)) {

			msg = name + "Will start in september";

		} else {
			msg = "Please contact +9912728356 for more details" + name;
		}

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
