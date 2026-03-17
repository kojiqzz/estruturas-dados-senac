// Classe que demonstra TEMPO LOGARÍTMICO - O(log n)
// A complexidade é O(log n) porque dividimos o problema pela metade a cada iteração
public class TempoLogaritmico {
    // Método que demonstra operação de TEMPO LOGARÍTMICO - O(log n)
    // A função conta quantas vezes podemos dividir n por 2 até chegar a 1
    public static int contarDivisoes(int n) {
        // Linha 9: Inicialização de variável - 1 operação
        // Custo: O(1) - operação constante
        int divisoes = 0;
        
        // Linha 13: Inicialização de variável - 1 operação
        // Custo: O(1) - operação constante
        int contador = 0;
        
        // Linha 21: Loop while - executa log₂(n) vezes
        // ESTA É A OPERAÇÃO CRÍTICA que define a complexidade O(log n)
        // Por quê? A cada iteração, n é dividido por 2: n → n/2 → n/4 → n/8 → ...
        // Número de iterações até n ≤ 1: log₂(n)
        // Exemplo: n=8 → 3 iterações (8→4→2→1), n=16 → 4 iterações (16→8→4→2→1)
        // Custo total deste loop: O(log n)
        while (n > 1) {
            // Linha 25: Divisão por 2 - operação aritmética
            // Custo individual: O(1), mas executada log₂(n) vezes
            // Esta operação REDUZ o problema pela metade (chave do logarítmico!)
            n = n / 2;
            
            // Linha 29: Incremento - operação elementar
            // Custo individual: O(1), executada log₂(n) vezes
            divisoes++;
            
            // Linha 33: Incremento - operação elementar
            // Custo individual: O(1), executada log₂(n) vezes
            contador++;
            
            // Linha 37: Print - operação de saída
            // Custo individual: O(1), executada log₂(n) vezes
            System.out.println("Passo " + contador + ": n = " + n);
        }
        // TOTAL DO LOOP: 4 operações O(1) × log₂(n) iterações = O(log n)
        
        // Linha 43: Print final - 1 operação
        // Custo: O(1) - termo de menor ordem (irrelevante na análise assintótica)
        System.out.println("Total de operações: " + contador);
        
        // Linha 47: Retorno de valor - 1 operação
        // Custo: O(1) - termo de menor ordem
        return divisoes;
    }
    
    // ANÁLISE GERAL DO MÉTODO contarDivisoes():
    // 
    // Contagem de operações:
    //   - Inicializações: 2 × O(1) = O(1)
    //   - Loop while: executado log₂(n) vezes
    //     * Dentro do loop: 4 operações O(1) por iteração
    //     * Total do loop: 4 × log₂(n) = O(log n)
    //   - Print final: O(1)
    //   - Retorno: O(1)
    //
    // Forma da função: T(n) = 2 + 4·log₂(n) + 1 + 1 = 4·log₂(n) + 4
    //
    // Aplicando as REGRAS DE BIG O:
    //   1. Remover constantes multiplicativas: 4·log₂(n) → log₂(n)
    //   2. Remover termos de menor ordem: log₂(n) + 4 → log₂(n)
    //   3. Trocar base do logaritmo por notação genérica: log₂(n) → log(n)
    //      (Em Big O, a base não importa pois log_a(n) = log_b(n) / log_b(a))
    //
    // RESULTADO FINAL: O(log n)
    //
    // POR QUE É LOGARÍTMICO?
    // 1. A cada iteração, o tamanho do problema é DIVIDIDO por uma constante (2)
    // 2. Quantas vezes podemos dividir n por 2 até chegar a 1? Resposta: log₂(n) vezes
    // 3. Crescimento: se n dobra (n → 2n), apenas 1 iteração é adicionada
    //    Exemplo: n=8 → 3 iterações; n=16 → 4 iterações (apenas +1!)
    // 4. Muito mais eficiente que O(n): para n=1.000.000, apenas ~20 iterações!
    
    public static void main(String[] args) {
        // Demonstração: valores diferentes levam a número logarítmico de operações
        System.out.println("n=8:");
        contarDivisoes(8);   // Executará log₂(8) = 3 iterações
        
        System.out.println("\nn=16:");
        contarDivisoes(16);  // Executará log₂(16) = 4 iterações (apenas +1!)
        
        // Observe: dobramos o valor de n (8 → 16), mas apenas 1 operação adicional!
        // Isso caracteriza o crescimento logarítmico
    }
}
    

