public class TempoConstanteEncapsulado {
    // Atributos privados (encapsulamento)
    private int valorA;
    private int valorB;
    private int resultado;
    private int contadorOperacoes;
    
    // Construtor
    public TempoConstanteEncapsulado(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = 0;
        this.contadorOperacoes = 0;
    }
    
    // Getters
    public int getValorA() {
        return valorA;
    }
    
    public int getValorB() {
        return valorB;
    }
    
    public int getResultado() {
        return resultado;
    }
    
    public int getContadorOperacoes() {
        return contadorOperacoes;
    }
    
    // Setters
    public void setValorA(int valorA) {
        this.valorA = valorA;
    }
    
    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
    
    // Método que demonstra operação de TEMPO CONSTANTE - O(1)
    // A complexidade é O(1) porque o número de operações não depende do tamanho da entrada
    public void calcularSoma() {
        // Linha 53: Inicialização de variável (operação primária) - 1 operação
        // Em Big O, inicializações são consideradas operações elementares
        // Custo: O(1) - constante, não depende de nada
        contadorOperacoes = 0;
        
        // Linha 58: Operação aritmética (soma de dois inteiros) - 1 operação
        // A operação '+' é uma operação primária (não conhecemos o tamanho real dos números)
        // Custo: O(1) - constante
        resultado = valorA + valorB;
        
        // Linha 63: Incremento de variável - 1 operação (termo de menor ordem)
        // Em Big O, incrementos são operações elementares
        // Custo: O(1) - constante
        contadorOperacoes++;
        
        // ANÁLISE GERAL DO MÉTODO calcularSoma():
        // Total de operações: 3 operações elementares (atribuição + soma + incremento)
        // Forma: T(n) = 3 (constante, não depende da entrada)
        // Assim que aplicamos as regras de Big O:
        //   1. Removemos constantes multiplicativas: 3 → 1
        //   2. Mantemos a ordem: ordem constante
        //   3. Resultado: O(1)
        //
        // A função EXEMPLIFICA tempo constante porque:
        // - Independentemente dos valores de 'valorA' e 'valorB', sempre faz o mesmo número de operações
        // - O tempo de execução não cresce com o tamanho da entrada
        // - Não possui loops ou recursão que dependa da entrada
    }
    
    // Método para obter informações formatadas
    public void exibirResultado() {
        System.out.println("Valores: " + valorA + " + " + valorB);
        System.out.println("Resultado: " + resultado);
        System.out.println("Operações realizadas: " + contadorOperacoes);
        System.out.println("Complexidade: O(1) - TEMPO CONSTANTE");
    }
    
    public static void main(String[] args) {
        // Demonstrativo: ambas as instâncias abaixo executam em tempo O(1)
        // mesmo com valores diferentes, pois a complexidade é constante
        
        // Primeira instância
        TempoConstanteEncapsulado tempo1 = new TempoConstanteEncapsulado(5, 3);
        tempo1.calcularSoma();
        System.out.println("--- Instância 1 ---");
        tempo1.exibirResultado();
        
        System.out.println();
        
        // Segunda instância
        TempoConstanteEncapsulado tempo2 = new TempoConstanteEncapsulado(100, 200);
        tempo2.calcularSoma();
        System.out.println("--- Instância 2 ---");
        tempo2.exibirResultado();
        
        System.out.println();
        
        // Modificando valores usando setters
        System.out.println("--- Modificando valores da Instância 1 ---");
        tempo1.setValorA(50);
        tempo1.setValorB(75);
        tempo1.calcularSoma();
        tempo1.exibirResultado();
        
        // Ambas as chamadas acima demoram o mesmo tempo (ou extremamente similar)
        // porque a operação é O(1) de tempo constante
    }
}
