// Classe que demonstra TEMPO LINEAR - O(n)
// A complexidade é O(n) porque executamos operações proporcionais ao tamanho da entrada
public class TempoLinear {
    // Método que demonstra operação de TEMPO LINEAR - O(n)
    // A função soma todos os números de 1 até n, percorrendo cada valor uma vez
    public static int somarNumeros(int n) {
        // Linha 9: Inicialização de variável - 1 operação
        // Custo: O(1) - operação constante (termo de menor ordem)
        int soma = 0;
        
        // Linha 14: Inicialização de variável - 1 operação
        // Custo: O(1) - operação constante (termo de menor ordem)
        int contador = 0;
        
        // Linha 23: Loop for - ESTA É A OPERAÇÃO CRÍTICA que define O(n)
        // O loop executa EXATAMENTE n iterações (de i=1 até i=n)
        // Características do tempo linear:
        //   - Cada elemento/valor é processado UMA vez
        //   - Número de iterações = tamanho da entrada (n)
        //   - Se n dobra, o tempo de execução dobra
        // Exemplo: n=5 → 5 iterações; n=10 → 10 iterações (dobrou!)
        // Custo total do loop: O(n)
        for (int i = 1; i <= n; i++) {
            // Linha 27: Adição e atribuição - operação aritmética
            // Custo individual: O(1), mas executada n vezes
            // Total: O(1) × n = O(n)
            soma += i;
            
            // Linha 32: Incremento - operação elementar
            // Custo individual: O(1), executada n vezes
            // Total: O(1) × n = O(n)
            contador++;
        }
        // TOTAL DO LOOP: 2 operações O(1) × n iterações = 2n = O(n)
        
        // Linha 37: Print - 1 operação
        // Custo: O(1) - termo de menor ordem (irrelevante quando n é grande)
        System.out.println("Operações: " + contador);
        
        // Linha 41: Retorno de valor - 1 operação
        // Custo: O(1) - termo de menor ordem
        return soma;
    }
    
    // ANÁLISE GERAL DO MÉTODO somarNumeros():
    //
    // Contagem de operações:
    //   - Inicializações: 2 × O(1) = 2 (termos de menor ordem)
    //   - Loop for: executado n vezes
    //     * Dentro do loop: 2 operações O(1) por iteração
    //     * Total do loop: 2 × n = 2n
    //   - Print final: O(1) = 1 (termo de menor ordem)
    //   - Retorno: O(1) = 1 (termo de menor ordem)
    //
    // Forma da função: T(n) = 2 + 2n + 1 + 1 = 2n + 4
    //
    // Aplicando as REGRAS DE BIG O:
    //   1. Identificar termos: 2n (termo dominante) + 4 (constante)
    //   2. Remover constantes multiplicativas: 2n → n
    //   3. Remover termos de menor ordem: n + 4 → n
    //      (Quando n → ∞, o +4 se torna irrelevante)
    //
    // RESULTADO FINAL: O(n)
    //
    // POR QUE É LINEAR?
    // 1. O loop executa EXATAMENTE n iterações (proporcional à entrada)
    // 2. Cada iteração faz operações O(1) constantes
    // 3. Crescimento: se n dobra (5→10), o tempo dobra (5 ops → 10 ops)
    // 4. Relação DIRETA: T(n) ∝ n (tempo é diretamente proporcional a n)
    // 5. Gráfico: linha reta crescente (y = mx + b, onde m=2, b=4)
    //
    // DIFERENÇA DE OUTROS TEMPOS:
    // - O(1): tempo fixo, não importa o n → 5 ou 10 = mesmo tempo
    // - O(log n): tempo logarítmico → n=5: ~2 ops, n=10: ~3 ops (+1 apenas)
    // - O(n): tempo linear → n=5: 5 ops, n=10: 10 ops (dobra!) ← ESTE CASO
    // - O(n²): tempo quadrático → n=5: 25 ops, n=10: 100 ops (4x mais!)
    
    public static void main(String[] args) {
        // Demonstração: valores diferentes levam a número LINEAR de operações
        System.out.println("Soma até 5: " + somarNumeros(5));    // Executará 5 iterações
        System.out.println("Soma até 10: " + somarNumeros(10));  // Executará 10 iterações
        
        // Observe: dobramos o valor de n (5 → 10), e o número de operações DOBROU!
        // Isso caracteriza o crescimento LINEAR - proporcionalidade direta
    }
}

    

