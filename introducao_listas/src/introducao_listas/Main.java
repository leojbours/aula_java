package introducao_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Anaconda");
		list.add("Maria");
		list.add("Leo");
		list.add("Bob");
		list.add("Ana");
		list.add("Kaua");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("--------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String name : result) {
			System.out.println(name);
		}
		
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}

}
