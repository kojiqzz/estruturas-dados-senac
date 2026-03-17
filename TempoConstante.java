public class TempoConstante {
    // Método que demonstra operação de TEMPO CONSTANTE - O(1)
    // A complexidade é O(1) porque o número de operações não depende do tamanho da entrada
    public static int calcularSoma(int a, int b) {
        // Linha 8: Inicialização de variável (operação primária) - 1 operação
        // Em Big O, inicializações são consideradas operações elementares
        // Custo: O(1) - constante, não depende de nada
        int contador = 0;
        
        // Linha 13: Operação aritmética (soma de dois inteiros) - 1 operação
        // A operação '+' é uma operação primária (não conhecemos o tamanho real dos números)
        // Custo: O(1) - constante
        int resultado = a + b;
        
        // Linha 18: Incremento de variável - 1 operação (termo de menor ordem)
        // Em Big O, incrementos são operações elementares
        // Custo: O(1) - constante
        contador++;
        
        // Linha 22: Chamada de método print com concatenação de strings - 1 operação primária
        // Custo: O(1) - constante (desconsiderando a complexidade interna do println)
        System.out.println("Operações: " + contador);
        
        // Linha 26: Retorno de valor - 1 operação
        // Custo: O(1) - constante
        return resultado;
    }
    
    // ANÁLISE GERAL DO MÉTODO calcularSoma():
    // Total de operações: 5 operações elementares (inicialização + soma + incremento + print + return)
    // Forma: T(n) = 5 (constante, não depende da entrada)
    // Assim que aplicamos as regras de Big O:
    //   1. Removemos constantes multiplicativas: 5 → 1
    //   2. Mantemos a ordem: ordem constante
    //   3. Resultado: O(1)
    // 
    // A função EXEMPLIFICA tempo constante porque:
    // - Independentemente dos valores de 'a' e 'b', sempre faz o mesmo número de operações
    // - O tempo de execução não cresce com o tamanho da entrada
    // - Não possui loops ou recursão que dependa da entrada
    
    public static void main(String[] args) {
        // Demonstrativfo: ambas as chamadas abaixo executam em tempo O(1)
        // mesmo com valores diferentes, pois a complexidade é constante
        System.out.println("Soma(5, 3): " + calcularSoma(5, 3));
        System.out.println("Soma(100, 200): " + calcularSoma(100, 200));
        // Ambas as chamadas acima demoram o mesmo tempo (ou extremamente similar)
        // porque a operação é O(1) de tempo constante
    }
}
