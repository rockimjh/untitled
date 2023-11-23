package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.OfficeApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OfficeApplication.class })
public class CucumberSpingConfiguration {}
