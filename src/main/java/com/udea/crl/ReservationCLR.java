package com.udea.crl;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udea.entity.Reservation;
import com.udea.repository.ReservationRepository;

@Component
public class ReservationCLR implements CommandLineRunner {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public void run (String... args) throws Exception{
	  Stream.of("andres", "diana", "claudia", "beatriz").forEach(s -> reservationRepository.save(new Reservation(s)));
	 reservationRepository.findAll().forEach(System.out::println);
	}
}
