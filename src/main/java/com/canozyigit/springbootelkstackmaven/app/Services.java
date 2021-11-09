package com.canozyigit.springbootelkstackmaven.app;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class Services {


    private static final Logger logger = LogManager.getLogger(Services.class);

    @PostMapping
    public ResponseEntity<String> helloTest(@RequestBody Person person){
        logger.info(person.getName());
        logger.info(person.getSurname());
        logger.info(person.getAge());
        return ResponseEntity.ok("Hello");
    }


    @GetMapping
    public ResponseEntity<String> hello() {

        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");

        return ResponseEntity.ok("Hello");
    }
}
