package atividadea3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Program { 
	
	public static void main(String[] args) {

		ArrayList lista = new ArrayList<>(5);
		ArrayDeque pilha = new ArrayDeque<>(5);
		Queue<Integer> fila = new LinkedList<>();
		
		System.out.println("**Preenchendo a lista**");
		
		for(int i=1;i<6;i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		System.out.println("------------------------");
		System.out.println("**Esvazeando a lista e inserindo na pilha**");
		
		while(!lista.isEmpty()) {	
			lista.remove(0);
		}
		
		System.out.println("Lista vazia!");
		System.out.println("------------------------");
		System.out.println("**Preenchendo a pilha**");
		
		
		
		for(int i=1;i<6;i++) {
			pilha.push(i);
		}
		
		System.out.println(pilha);
		
		System.out.println("------------------------");
		System.out.println("**Esvazeando a pilha**");
		
		pilha.clear();
		
		System.out.println(pilha);
		
		System.out.println("Pilha vazia!");
		System.out.println("------------------------");
		
		
		System.out.println("**Preenchendo a fila**");
			
		
		
		for(int i=1;i<5;i++) {
			fila.add(i);
		}
		
		System.out.println("------------------------");
		
		System.out.println("**Preenchendo a lista**");
		
		for(int i=6;i<11;i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		System.out.println("------------------------");
		System.out.println("**Esvazeando a lista e inserindo na pilha**");
		
		while(!lista.isEmpty()) {
	
		   lista.remove(0);
		}
		
		System.out.println("Lista vazia!");
		System.out.println("------------------------");
		System.out.println("**Preenchendo a pilha**");
		
		
		
		for(int i=6;i<11;i++) {
			pilha.push(i);
		}
		
		System.out.println(pilha);
		
		System.out.println("------------------------");
		System.out.println("**Esvazeando a pilha**");
		
		pilha.clear();
		
		System.out.println(pilha);
		
		System.out.println("Pilha vazia!");
		System.out.println("------------------------");
		
		
		System.out.println("**Preenchendo a fila**");
			
		
		
		for(int i=6;i<11;i++) {
			fila.add(i);
		}
		
		System.out.println(fila);
		
	}
}

		 

