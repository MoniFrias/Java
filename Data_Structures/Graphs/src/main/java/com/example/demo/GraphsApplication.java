package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphsApplication.class, args);
		long matrizA[][]={{0,3,4,999999999,8,999999999},
				{999999999,0,999999999,999999999,5,999999999},
				{999999999,999999999,0,999999999,3,999999999},
				{999999999,999999999,999999999,0,999999999,999999999},
				{999999999,999999999,999999999,7,0,3},
				{999999999,999999999,999999999,2,999999999,0}};
		
		FloydWarshallAlgorithm ruta = new FloydWarshallAlgorithm();
		System.out.println(ruta.agoritmoFloyd(matrizA));
	}

}
