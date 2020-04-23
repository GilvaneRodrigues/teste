package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //DECLARANDO UMA LISTA
		
		list.add("Maria");
		list.add("João");
		list.add("Mario");
		list.add("Jeromino");
		list.add("Craudete");
		list.add(2, "Tenório"); //PASSANDO A POSIÇÃO E O VALOR PARA ADICIONAR NA LISTA
		
		for(String obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("----- ABAIXO TEMOS AS REMOÇÕES------");
		
		//REMOÇÕES DE LISTA
		list.remove(1); //REMOVENDO PELA POSIÇÃO
		list.remove("Jeromino"); //REMOVENDO PELO VALOR
		list.removeIf(obj -> obj.charAt(0) == 'M');  //REMOVENDO POR PREDICADO, PASSANDO UMA FUNÇÃO LAMBDA PARA REMOÇÃO
		
		for(String obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("------- ABAIXO TEMOS TIPOS DE BUSCA NA LISTA ------");
		System.out.println ("Buscando uma posição na lista do Tenório: " + list.indexOf("Craudete"));
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'C').collect(Collectors.toList());
		//PARA FILTRAR UM RESULTADO NA LISTA, CRIAMOS UMA NOVA LISTA PASSAMOS O FILTER, A FUNÇÃO LAMBADA
		//E ATRAVÉS DO COLLECT TRANSFORMAMOS ESSE RESULTADO EM LISTA DE NOVO
		
		for(String obj : result) {
			System.out.println(obj);
			
		}
		
		String name = list.stream().filter(obj -> obj.charAt(0) == 'T').findFirst().orElse(null);
		System.out.println("Primeiro elemento passado na função lambda: " + name);
		

	}

}
