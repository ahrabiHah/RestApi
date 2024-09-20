package de.hah.jpa.restController;


import de.hah.jpa.service.IGreenings;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RestApi1 {


    @Autowired
    private IGreenings iGreenings;

    @GetMapping("/greet")
    @ResponseBody
    public ResponseEntity<String> getWished( ){

        String s= iGreenings.generateGreeting("Hesham");
        return new ResponseEntity<String>(s,HttpStatus.OK);
    }

    @GetMapping("/greet2")
    @ResponseBody
    public String getWisheds( ){
        return iGreenings.generateGreeting("Hesham");
    }







}
