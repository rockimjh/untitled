package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.HomeApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { HomeApplication.class })
public class CucumberSpingConfiguration {}
