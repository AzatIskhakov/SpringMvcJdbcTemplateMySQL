package com.airplanes.dao;

import java.util.List;

import com.airplanes.model.Airplane;

public class DaoUtil {
	
	public static void printAirplane(Airplane airplane) {
		System.out.println("\n**********  printing airplane ********\n" + airplane);
	}
	
	public static void printAirplanes(List<Airplane> airplanes) {
		System.out.println("\n*********** printing airplanes  ********");
		for (Airplane airplane : airplanes) {
			System.out.println(airplane);
		}
	}

}
