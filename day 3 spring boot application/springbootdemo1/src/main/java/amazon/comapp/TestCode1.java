package amazon.comapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestCode1 {
	
	@GetMapping(value= "/showmassage")
	
	String Massage () {
		return "hey mini how are you";
	}

}
