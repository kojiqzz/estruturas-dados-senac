// Classe que demonstra TEMPO LINEARÍTMICO - O(n log n)
// A complexidade é O(n log n) porque temos um loop O(n) contendo operações O(log n)
public class TempoLinearitmico {
    // Método que demonstra operação de TEMPO LINEARÍTMICO - O(n log n)
    // Combinação de loop linear (n) com operação logarítmica (log n) aninhada
    public static int operacaoComposta(int n) {
        // Linha 9: Inicialização de variável - 1 operação
        // Custo: O(1) - termo de menor ordem (irrelevante na análise assintótica)
        int contador = 0;
        
        // Linha 18: Loop externo - PRIMEIRA PARTE DA OPERAÇÃO CRÍTICA
        // Este loop executa EXATAMENTE n iterações (de i=1 até i=n)
        // Características:
        //   - Percorre todos os valores de 1 até n
        //   - Custo: O(n) se o corpo do loop for O(1)
        //   - MAS o corpo contém um loop O(log i), então: O(n) × O(log n) = O(n log n)
        // Loop externo: n vezes
        for (int i = 1; i <= n; i++) {
            // Linha 21: Inicialização de temp - 1 operação por iteração externa
            // Custo individual: O(1), executada n vezes = O(n) (termo de menor ordem)
            int temp = i;
            
            // Linha 34: Loop interno - SEGUNDA PARTE DA OPERAÇÃO CRÍTICA
            // Este loop ANINHADO executa log₂(i) iterações para cada valor de i
            // Características do loop interno:
            //   - Para i=1: executa log₂(1) = 0 vezes (temp=1, já é ≤1)
            //   - Para i=2: executa log₂(2) = 1 vez (2→1)
            //   - Para i=4: executa log₂(4) = 2 vezes (4→2→1)
            //   - Para i=8: executa log₂(8) = 3 vezes (8→4→2→1)
            //   - Para i=n: executa log₂(n) vezes
            // Custo individual: O(log i) por iteração externa
            // Loop interno: log(i) vezes
            while (temp > 1) {
                // Linha 37: Divisão por 2 - operação aritmética (chave do logarítmico!)
                // Custo: O(1), mas executada log₂(i) vezes no loop interno
                temp = temp / 2;
                
                // Linha 41: Incremento de contador - operação elementar
                // Custo: O(1), executada log₂(i) vezes no loop interno
                contador++;
            }
            // TOTAL DO LOOP INTERNO: Para cada i, executa log₂(i) operações
        }
        // TOTAL DOS LOOPS ANINHADOS (análise detalhada):
        // Somatório de i=1 até n de log₂(i) = log₂(1) + log₂(2) + ... + log₂(n)
        // Este somatório = log₂(1×2×3×...×n) = log₂(n!)
        // Pela aproximação de Stirling: log₂(n!) ≈ n log₂(n) - n log₂(e)
        // Simplificando com Big O: O(n log n)
        
        // Linha 51: Print - 1 operação
        // Custo: O(1) - termo de menor ordem (desprezível comparado a n log n)
        System.out.println("Operações: " + contador);
        
        // Linha 55: Retorno - 1 operação
        // Custo: O(1) - termo de menor ordem
        return contador;
    }
    
    // ANÁLISE GERAL DO MÉTODO operacaoComposta():
    //
    // Contagem de operações:
    //   - Inicialização contador: O(1) - termo de menor ordem
    //   - Loop externo: n iterações
    //     * Para cada i (de 1 até n):
    //       - Inicialização temp: O(1)
    //       - Loop interno: log₂(i) iterações
    //         * Divisão temp/2: O(1)
    //         * Incremento contador: O(1)
    //   - Print: O(1) - termo de menor ordem
    //   - Return: O(1) - termo de menor ordem
    //
    // Forma da função (contagem total do loop interno):
    //   T(n) = Σ(i=1 até n) log₂(i)
    //   T(n) = log₂(1) + log₂(2) + log₂(3) + ... + log₂(n)
    //   T(n) = log₂(1 × 2 × 3 × ... × n)
    //   T(n) = log₂(n!)
    //
    // Aplicando aproximação de Stirling: n! ≈ (n/e)^n × √(2πn)
    //   log₂(n!) ≈ n log₂(n) - n log₂(e) + (1/2)log₂(2πn)
    //   log₂(n!) ≈ n log₂(n) - 1.443n + 0.5 log₂(n) + constante
    //
    // Aplicando as REGRAS DE BIG O:
    //   1. Identificar termos: n log₂(n) (dominante), -1.443n (menor), 0.5 log₂(n) (menor)
    //   2. Remover termos de menor ordem: n log₂(n) - 1.443n → n log₂(n)
    //      (Pois n log₂(n) cresce mais rápido que n quando n → ∞)
    //   3. Remover constantes multiplicativas: (não há coeficiente multiplicando n log n)
    //   4. Base do log não importa: log₂(n) ≡ log(n) em Big O
    //
    // RESULTADO FINAL: O(n log n)
    //
    // POR QUE É LINEARÍTMICO?
    // 1. COMBINAÇÃO de duas operações:
    //    - Loop EXTERNO: linear O(n) - percorre n valores
    //    - Loop INTERNO: logarítmico O(log i) - divide por 2 repetidamente
    // 2. Somatório: Σ log(i) ≈ n log(n) - não é simplesmente n × log(n)!
    // 3. Crescimento INTERMEDIÁRIO:
    //    - Mais rápido que O(n) linear
    //    - Mais lento que O(n²) quadrático
    // 4. Exemplos práticos:
    //    - n=4: ~8 operações (4 × log₂4 = 4 × 2 = 8)
    //    - n=8: ~24 operações (8 × log₂8 = 8 × 3 = 24)
    //    - Crescimento: triplicou n (não dobrou), triplicou operações
    //
    // COMPARAÇÃO COM OUTROS TEMPOS:
    // - O(n): n=8 → 8 ops; n=16 → 16 ops (dobra)
    // - O(n log n): n=8 → 24 ops; n=16 → 64 ops (2.67× mais) ← ESTE CASO
    // - O(n²): n=8 → 64 ops; n=16 → 256 ops (4× mais)
    //
    // ALGORITMOS CLÁSSICOS COM O(n log n):
    // - Merge Sort (ordenação por intercalação)
    // - Quick Sort (caso médio)
    // - Heap Sort (ordenação por heap)
    // - Construção de árvores balanceadas
    
    public static void main(String[] args) {
        // Demonstração: valores diferentes mostram crescimento linearítmico
        System.out.println("n=4: " + operacaoComposta(4));
        // Para n=4: Σ log₂(i) de i=1 até 4 = log₂(1)+log₂(2)+log₂(3)+log₂(4)
        //         = 0 + 1 + 1.58 + 2 ≈ 4.58 ≈ 5 operações
        
        System.out.println("n=8: " + operacaoComposta(8));
        // Para n=8: Σ log₂(i) de i=1 até 8 ≈ log₂(8!) ≈ 15.3 ≈ 15 operações
        
        // Observe: dobramos n (4→8), mas operações NÃO dobraram (5→15, 3× mais)
        // Também NÃO quadruplicaram (seria 20 se fosse O(n²))
        // Crescimento intermediário caracteriza O(n log n)!
    }
}

    

