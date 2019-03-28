package lyyljs.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lyyljs.cloud.eureka.config.FatherConfig;

@RestController
public class ConfigController {

	@Autowired
	FatherConfig fc;
	
	@RequestMapping("/hello")
    public String index() {
        return fc.toString();
    }
}
