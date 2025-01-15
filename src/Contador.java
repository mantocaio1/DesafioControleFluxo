import java.util.Scanner;

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
        
}

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            
            		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
           System.out.println(exception.getMessage());
            
		}
        finally {
            terminal.close();
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro. ");
        }
		//realizar o for para imprimir os números com base na variável contagem
        for (int resposta = parametroUm + 1; resposta <= parametroDois; resposta++) {
            System.out.println(resposta);
        }
        
    }
}
