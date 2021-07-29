package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(0, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------Removendo-----------");

		list.remove(0);
		list.remove("Anna");
		list.removeIf(x -> x.charAt(0) == 'A');

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----Encontrar a Posiscao do elemento-----");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Anna: " + list.indexOf("Anna")); // quando não tem na lista da "-1"
		
		System.out.println("----Deixar a lista só com a primeira letra desejada 'M'---");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result){
			System.out.println(x);
		}
		
		System.out.println("----Deixar a lista só com a primeira letra desejada e a posicao 1---");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
	}
}
