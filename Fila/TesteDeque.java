public class TesteDeque {
    public static void main(String[] args) {
        System.out.println("=== Teste Deque Duplamente Encadeado ===");
        testarDeque(new DequeDuplamenteEncadeado<>());
        
        System.out.println("\n=== Teste Deque Simplesmente Encadeado ===");
        testarDeque(new DequeSimplesmenteEncadeado<>());
    }
    
    public static void testarDeque(DequeDuplamenteEncadeado<Integer> deque) {
        // Teste com DequeDuplamenteEncadeado
        System.out.println("Inserindo no início: 1, 2, 3");
        deque.inserirInicio(1);
        deque.inserirInicio(2);
        deque.inserirInicio(3);
        System.out.println("Deque: " + deque);
        
        System.out.println("Inserindo no fim: 4, 5");
        deque.inserirFim(4);
        deque.inserirFim(5);
        System.out.println("Deque: " + deque);
        
        System.out.println("Primeiro: " + deque.primeiro());
        System.out.println("Último: " + deque.ultimo());
        System.out.println("Tamanho: " + deque.tamanho());
        
        System.out.println("Removendo do início: " + deque.removerInicio());
        System.out.println("Removendo do fim: " + deque.removerFim());
        System.out.println("Deque: " + deque);
    }
    
    public static void testarDeque(DequeSimplesmenteEncadeado<Integer> deque) {
        // Teste com DequeSimplesmenteEncadeado
        System.out.println("Inserindo no início: 1, 2, 3");
        deque.inserirInicio(1);
        deque.inserirInicio(2);
        deque.inserirInicio(3);
        System.out.println("Deque: " + deque);
        
        System.out.println("Inserindo no fim: 4, 5");
        deque.inserirFim(4);
        deque.inserirFim(5);
        System.out.println("Deque: " + deque);
        
        System.out.println("Primeiro: " + deque.primeiro());
        System.out.println("Último: " + deque.ultimo());
        System.out.println("Tamanho: " + deque.tamanho());
        
        System.out.println("Removendo do início: " + deque.removerInicio());
        System.out.println("Removendo do fim: " + deque.removerFim());
        System.out.println("Deque: " + deque);
    }
}