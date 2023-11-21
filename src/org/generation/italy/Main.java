package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Scrivere un programma che simula lo scrutinio di una votazione.
		All'avvio il programma presenta un elenco di candidati tra cui scegliere, 
		successivamente chiede quale candidato è stato scelto.
		Dopo ogni scelta chiede se si vuole inserire un'altra votazione.
		Alla fine dell'inserimento, il programma mostra per ogni candidato quanti voti sono stati ottenuti.
		ES:

		Candidati disponibili:
		Mario Rossi

		Franco Verdi

		Pino Gialli

		Gino Marroni
		Quale candidato scegli? Franco Verdi

		vuoi inserire un altro voto (s/n)? sì
		Quale candidato scegli? Pino Gialli

		vuoi inserire un altro voto (s/n)? no
		Risultato votazioni:

		Mario Rossi - voti 0

		Franco Verdi - voti 1

		Pino Gialli - voti 1

		Gino Marroni - voti 0 */
		
		Scanner sc=new Scanner(System.in);
		String scelta, risposta;
		HashMap<String,Integer> Candidati=new HashMap<>() {
			{
				put("Mario Rossi",0);
				put("Franco Gialli",0);
				put("Pino Verdi",0);
				put("Gino Marroni",0);
		}};
		for (String v:Candidati.keySet())
			System.out.println(v);
		do {
			System.out.println("Quale candidato scegli?");
			scelta=sc.nextLine();		
			if (Candidati.containsKey(scelta))    // se il nome inserito viene verificato, viene aggiunto all'HashMap
				Candidati.put(scelta, Candidati.get(scelta)+1);
			else 
				System.out.println("Il candidato non esiste");
			System.out.println("vuoi inserire un altro voto (s/n)?");
			risposta=sc.nextLine();
				
			} while (risposta.equals("s"));
		
		System.out.println("Risultato votazioni: ");
		for (String v:Candidati.keySet())
			System.out.println(v+"- "+Candidati.get(v));
		
	}

}
