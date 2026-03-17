public class ArrayEstatico {
    public static void main(String[] args) {
    int [] numeros; //criacao 
    numeros = new int[8]; //atribuicao
    System.out.println("Capacidade do Array " + numeros.length + "\n" );

    int tamanho = 0; 
    tamanho = inserirNofim(numeros, tamanho, 10);
    tamanho = inserirNofim(numeros, tamanho, 20);
   
    tamanho = removerPorIndice(numeros, tamanho, 1);
    exibir(numeros, tamanho);
    
}
   
public static int inserirNofim(int[] Array, int tamanho, int valor){
    if(tamanho >= Array.length){
        System.out.println("Ta cheio "+ valor);
        return tamanho;
    }
    Array[tamanho] = valor;
    return tamanho + 1;
}

public static void exibir(int [] Array, int tamanho){
    for(int i = 0; i < tamanho; i++){
        System.out.println("Indice "+ i + " -> " + Array[i]);
    } 
}

public static int removerPorIndice(int[]Array, int tamanho, int indice){
    if(tamanho == 0){
        System.out.println("Vazio");
        return tamanho;
    }
    if (indice < 0 || indice >= tamanho) {
        System.out.println("Indice inválido");
        return tamanho;
    }
    for (int i = indice; i < tamanho -1; i++) {
        Array[i] = Array[i = 1];
    }
    Array [tamanho - 1] = 0;
    return tamanho - 1;
}
}