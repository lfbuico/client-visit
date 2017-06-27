package ph.com.ibm.cvp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CvpAuthController {

	// user login to --> FB
	//  FB --> login page
	// FB returns auth token
	
	// save auth token to db for future lookup/login
	// return tokens to client
	//should expire after 2hours

	@CrossOrigin
    @RequestMapping("/greeting")
    public CvpUser greeting(@RequestParam(value="userName", defaultValue="greetings") String name) {
        return new CvpUser("buics", "hello");
    }
	
}
