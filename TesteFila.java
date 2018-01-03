package pkgFila;
import java.util.*;
public class TesteFila {
	
	private static class Fila{
		public int num;
		public Fila prox;
	}//fim static class Fila

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Fila inicio = null;
		Fila fim = null;
		Fila aux;
		int op;
		do{
			System.out.println("\n\tMenu\n1 - Inserir na Fila\n2 - Consultar toda a Fila\n3 - Remover da Fila\n4 - Esvaziar Fila\n5 - Localizar valor e mostrar hash\n6 - Tamanho da fila\n7 - Sair\n\nDigite sua opção: ");
			op = entrada.nextInt();
			if(op <1 || op >7){
				System.out.println("Opção inexistente!");
			}//fim if op <1 ou >6
			// ==================================================== 1 - inserir na fila
			if(op == 1){
				Fila novo = new Fila();
				System.out.println("Digite o valor a ser inserido na fila: ");
				novo.num = entrada.nextInt();
				if(inicio == null){
					inicio = novo;
					fim = novo;
					novo.prox = null;
					}//fim if == null
					else{
						fim.prox = novo;
						fim = novo;
						novo.prox = null;
					}//fim else>if inicio == null
			}//fim op 1inserir na fila
			
			// ==================================================== 2 - consultar toda fila
			if(op == 2){
				if(inicio == null){
					System.out.println("A fila está vazia!");
				}//fim inicio == null
				else{
					aux = inicio;
					System.out.println("Consultando a fila...");
					while(aux != null){
						System.out.print(aux.num+", ");
						aux = aux.prox;
					}//fim while prox != null
				}//fim else>if inicio == null
			}//fim op 2 - consultar fila
			
			// ==================================================== 3 - remover da fila
			if(op == 3){
				if(inicio == null){
					System.out.println("A lista está vazia!");
				}//fim inicio == null
				else{
					System.out.println("O número "+inicio.num+" foi removido da lista!");
					inicio = inicio.prox;
				}//fim else> inicio == null
			}//fim op 3 - Remover da fila
			
			// ==================================================== 4 - esvaziar fila
			if(op == 4){
				if(inicio == null){
					System.out.println("A fila já está vazia");
				}//fim if inicio.prox == null
				else{
					inicio = null;
					System.out.println("A fila foi esvaziada!");
				}//fim else>if inicio.prox == null
			}//fim op 4 - esvaziar fila
			
			// ==================================================== 5 - localizar valor e mostrar hash
			if(op == 5){
				if(inicio == null){
					System.out.println("A pilha está vazia!");
				}//fim if inicio == null
				else{
				System.out.println("Digite o valor a ser localizado: ");
				int num = entrada.nextInt();
				int cont = 1;
				aux = inicio;
				while(aux != null){
					if(aux.num == num){
						System.out.println("O valor "+num+" foi encontrada na posição "+cont+" e seu endereço hash é "+aux.hashCode());
					}
					aux = aux.prox;
					cont++;
				}//fim while aux.num == null
				}//fim else>if aux!= null
			}//fim op 5 - localizar valor e mostrar hash
			
			// ==================================================== 6 - tamanho da fila
			if(op == 6){
				int cont = 0;
				aux = inicio;
				while(aux != null){
					cont++;
					aux = aux.prox;
				}
				System.out.println("O tamanho da fila é: "+cont);
			}//fim if op == 6 tamanho da fila
		}while(op != 7);//fim do while
		entrada.close();//fechamento do objeto de entrada(Scanner)entrada
		System.err.println("\tFim da aplicação!!!\n");
	}//fim main()

}//fim testeFila
