package com.example.hospitalmvc;

import com.example.hospitalmvc.entities.Patient;
import com.example.hospitalmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalMvcApplication.class, args);
	}

	//@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			patientRepository.save(
					new Patient(null,"Hassan",new Date(),false,412));
			patientRepository.save(
					new Patient(null,"Mohamed",new Date(),false,322));
			patientRepository.save(
					new Patient(null,"aya",new Date(),true,112));
			patientRepository.save(
					new Patient(null,"marouane",new Date(),true,212));

			patientRepository.findAll().forEach(p-> {
				System.out.println(p.getNom());
			});
		};

	}}
