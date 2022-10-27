package com.koushik.jokesforyou;

import org.springframework.context.ApplicationContext;

import com.koushik.jokesforyou.controler.FetchJokesControler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokesforyouApplication {

	public static void main(String[] args) {
		ApplicationContext ctx	= (ApplicationContext) SpringApplication.run(JokesforyouApplication.class, args);
		FetchJokesControler fc = (FetchJokesControler)ctx.getBean("fetchJokesControler");
		System.out.println(fc.getJokeQute());
		System.out.println(fc.getJokeQute());
		System.out.println(fc.getJokeQute());

	}

}
