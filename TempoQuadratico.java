// Classe que demonstra TEMPO QUADRÁTICO - O(n²)
// A complexidade é O(n²) porque temos dois loops aninhados, cada um dependente da entrada
public class TempoQuadratico {
    // Método que demonstra operação de TEMPO QUADRÁTICO - O(n²)
    // Simula multiplicação através de soma repetida com loops aninhados
    public static int multiplicar(int a, int b) {
        // Linha 9: Inicialização de variável - 1 operação
        // Custo: O(1) - termo de menor ordem (desprezível comparado a n²)
        int resultado = 0;
        
            // Linha 13: Inicialização de variável - 1 operação
        // Custo: O(1) - termo de menor ordem
        int contador = 0;
        
            // Linha 23: Loop externo - PRIMEIRA DIMENSÃO DA OPERAÇÃO QUADRÁTICA
        // Este loop executa EXATAMENTE 'a' iterações (de i=0 até i<a)
        // Características:
        //   - Percorre todos os valores de 0 até a-1
        //   - Se o corpo fosse O(1), seria O(a)
        //   - MAS o corpo contém um loop O(b), então: O(a) × O(b) = O(a×b)
        //   - Quando a=b=n (caso comum): O(n) × O(n) = O(n²)
        // Loop externo: a vezes
        for (int i = 0; i < a; i++) {
            // Linha 35: Loop interno - SEGUNDA DIMENSÃO DA OPERAÇÃO QUADRÁTICA
            // Este loop ANINHADO executa EXATAMENTE 'b' iterações para CADA iteração do loop externo
            // Características do loop interno:
            //   - Para cada valor de i (de 0 até a-1), executa b iterações completas
            //   - Total de iterações do loop interno: a × b
            //   - Quando a=b=n: n × n = n² iterações
            // Exemplo prático:
            //   - a=3, b=4: loop externo 3×, loop interno 4× cada = 3×4 = 12 operações
            //   - a=5, b=5: loop externo 5×, loop interno 5× cada = 5×5 = 25 operações
            // Loop interno: b vezes
            for (int j = 0; j < b; j++) {
                // Linha 39: Incremento de resultado - operação elementar
                // Custo individual: O(1), mas executada a×b vezes
                // Total: O(1) × (a×b) = O(a×b)
                resultado++;
                
                    // Linha 44: Incremento de contador - operação elementar
                // Custo individual: O(1), executada a×b vezes
                // Total: O(1) × (a×b) = O(a×b)
                contador++;
            }
            // TOTAL DO LOOP INTERNO: Para cada i, executa b operações
            // Como o loop externo executa a vezes: a × b = a×b operações totais
        }
        // TOTAL DOS LOOPS ANINHADOS:
        // Loop externo: a iterações
        // Loop interno: b iterações por cada iteração externa
        // Total: a × b operações
        // Caso especial quando a = b = n: n × n = n² operações → O(n²)
        
            // Linha 54: Print - 1 operação
        // Custo: O(1) - termo de menor ordem (irrelevante comparado a a×b)
        System.out.println("Operações: " + contador);
        
            // Linha 58: Retorno de valor - 1 operação
        // Custo: O(1) - termo de menor ordem
        return resultado;
    }
    
    // ANÁLISE GERAL DO MÉTODO multiplicar():
    //
    // Contagem de operações:
    //   - Inicializações: 2 × O(1) = 2 (termos de menor ordem)
    //   - Loop externo: a iterações
    //     * Loop interno: b iterações
    //       - Incremento resultado++: O(1)
    //       - Incremento contador++: O(1)
    //       - Total por iteração interna: 2 operações
    //     * Total do loop interno: 2b operações
    //   - Total dos loops aninhados: a × (2b) = 2ab operações
    //   - Print final: O(1) = 1 (termo de menor ordem)
    //   - Retorno: O(1) = 1 (termo de menor ordem)
    //
    // Forma da função: T(a,b) = 2 + 2ab + 1 + 1 = 2ab + 4
    //
    // Caso geral (a ≠ b): T(a,b) = O(a×b)
    // Caso especial (a = b = n): T(n) = 2n² + 4
    //
    // Aplicando as REGRAS DE BIG O (para caso a=b=n):
    //   1. Identificar termos: 2n² (dominante) + 4 (constante)
    //   2. Remover constantes multiplicativas: 2n² → n²
    //   3. Remover termos de menor ordem: n² + 4 → n²
    //      (Quando n → ∞, o +4 se torna irrelevante)
    //
    // RESULTADO FINAL: O(n²) quando a = b = n
    // RESULTADO GERAL: O(a×b) quando a e b são diferentes
    //
    // POR QUE É QUADRÁTICO?
    // 1. LOOPS ANINHADOS com dependência da entrada:
    //    - Loop EXTERNO: executa 'a' vezes
    //    - Loop INTERNO: executa 'b' vezes para CADA iteração externa
    //    - Total: a × b iterações
    // 2. Quando a = b = n (caso comum em análise):
    //    - Total: n × n = n² iterações
    // 3. CRESCIMENTO QUADRÁTICO:
    //    - Se n dobra (5→10), operações quadruplicam (25→100)
    //    - Se n triplica (5→15), operações aumentam 9× (25→225)
    // 4. Cada elemento do "grid" a×b é processado uma vez:
    //    - Matriz conceitual de dimensões a × b
    //    - Todas as (a×b) células são visitadas
    //
    // EXEMPLOS NUMÉRICOS:
    //   - a=3, b=4: 3×4 = 12 operações (não é n², mas é proporcional a a×b)
    //   - a=5, b=5: 5×5 = 25 operações (n²=25)
    //   - a=10, b=10: 10×10 = 100 operações (n²=100) - dobrou n, quadruplicou operações!
    //
    // COMPARAÇÃO COM OUTROS TEMPOS:
    // - O(n): n=5 → 5 ops; n=10 → 10 ops (dobra)
    // - O(n log n): n=5 → ~12 ops; n=10 → ~33 ops (2.75× mais)
    // - O(n²): n=5 → 25 ops; n=10 → 100 ops (4× mais!) ← ESTE CASO
    // - O(n³): n=5 → 125 ops; n=10 → 1000 ops (8× mais!)
    //
    // ALGORITMOS CLÁSSICOS COM O(n²):
    // - Bubble Sort (ordenação por bolha)
    // - Selection Sort (ordenação por seleção)
    // - Insertion Sort (ordenação por inserção)
    // - Multiplicação de matrizes (algoritmo ingênuo)
    // - Comparar todos os pares de elementos (par a par)
    
    public static void main(String[] args) {
        // Demonstração: valores diferentes mostram crescimento proporcional a a×b
        System.out.println("3 × 4 = " + multiplicar(3, 4));
        // Para a=3, b=4: 3 × 4 = 12 operações (loops aninhados: 3 × 4)
        
        System.out.println("5 × 5 = " + multiplicar(5, 5));
        // Para a=5, b=5: 5 × 5 = 25 operações (quando a=b=n, caracteriza n²)
        
        // Observe: quando dobramos ambos os valores (de 3→6 ou 5→10),
        // as operações QUADRUPLICAM (12→48 ou 25→100)
        // Isso caracteriza crescimento QUADRÁTICO O(n²)!
    }
    
}
