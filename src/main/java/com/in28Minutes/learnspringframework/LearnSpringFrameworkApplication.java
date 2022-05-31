package com.in28Minutes.learnspringframework;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.MarioGame;
import com.in28Minutes.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28Minutes.learnspringframework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		context.getBean(GameRunner.class);
		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		runner.runGame();

	}

}
