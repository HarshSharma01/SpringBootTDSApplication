/**The main method from where the application starts
 * It returns the application context as it runs
*/

package com.learn.tds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cg.tds.controller")
@ComponentScan("com.cg.tds.dao")
@ComponentScan("com.cg.tds.service")
@ComponentScan("com.cg.tds.model")
@EntityScan(basePackages = { "com.cg.tds.model" })
@SpringBootApplication
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}
}