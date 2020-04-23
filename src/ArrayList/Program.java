package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //DECLARANDO UMA LISTA
		
		list.add("Maria");
		list.add("Jo�o");
		list.add("Mario");
		list.add("Jeromino");
		list.add("Craudete");
		list.add(2, "Ten�rio"); //PASSANDO A POSI��O E O VALOR PARA ADICIONAR NA LISTA
		
		for(String obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("----- ABAIXO TEMOS AS REMO��ES------");
		
		//REMO��ES DE LISTA
		list.remove(1); //REMOVENDO PELA POSI��O
		list.remove("Jeromino"); //REMOVENDO PELO VALOR
		list.removeIf(obj -> obj.charAt(0) == 'M');  //REMOVENDO POR PREDICADO, PASSANDO UMA FUN��O LAMBDA PARA REMO��O
		
		for(String obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("------- ABAIXO TEMOS TIPOS DE BUSCA NA LISTA ------");
		System.out.println ("Buscando uma posi��o na lista do Ten�rio: " + list.indexOf("Craudete"));
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'C').collect(Collectors.toList());
		//PARA FILTRAR UM RESULTADO NA LISTA, CRIAMOS UMA NOVA LISTA PASSAMOS O FILTER, A FUN��O LAMBADA
		//E ATRAV�S DO COLLECT TRANSFORMAMOS ESSE RESULTADO EM LISTA DE NOVO
		
		for(String obj : result) {
			System.out.println(obj);
			
		}
		
		String name = list.stream().filter(obj -> obj.charAt(0) == 'T').findFirst().orElse(null);
		System.out.println("Primeiro elemento passado na fun��o lambda: " + name);
		

	}

}
