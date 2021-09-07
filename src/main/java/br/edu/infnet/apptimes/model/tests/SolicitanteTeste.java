package br.edu.infnet.apptimes.model.tests;

import br.edu.infnet.apptimes.model.domain.Solicitante;

public class SolicitanteTeste {

	public static void main(String[] args) {
		
		Solicitante s1 = new Solicitante("Elberth Moraes", "elberth.moraes@gmail.com", 20);
		System.out.println("Solicitante: " + s1);
	}
}