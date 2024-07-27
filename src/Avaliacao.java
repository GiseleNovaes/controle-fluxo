public class Avaliacao {
    public static void main(String[] args) {

		/*int nota = 5;
		String resultado = nota >= 7 ? "Aprovado" : "Reprovado";//otimizando o algoritimo, aprimorando a implementação
		System.out.println(resultado);*/


            int nota = 6;
            String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";/*trabalhando com duas condições, abreviando o controle de fluxo, código mais limpo analogia do else if*/
            System.out.println(resultado);
        }
    }

