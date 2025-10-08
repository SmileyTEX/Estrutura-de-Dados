public class DequeDuplamenteEncadeado<T> {
    private class No{
        T dado;
        No anterior;
        No proximo;

        public No(T dado) {
            this.dado = dado;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public DequeDuplamenteEncadeado() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    //Operações do Deque

    public void inserirInicio(T elemento) {
        No novoNo = new No(elemento);

        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(T elemento) {
        No novoNo = new No(elemento);

        if (estaVazia()) {
            incio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public T removerInicio() {
        if (estaVazia()) {
            throw new RuntimeException("Deque vazio");
        }

        T elemento = inicio.dado;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return elemento;
    }

    public T removerFim() {
        if (estaVazia()) {
            throw new RuntimeException("Deque vazio");
        }

        T elemento = fim.dado;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return elemento;
    }

    public T primeiro() {
        if (estaVazia()) {
            throw new RuntimeException("Deque vazio");
        }
        return inicio.dado;
    }

    public T ultimo() {
        if (estaVazia()) {
            throw new RuntimeException("Deque vazio");
        }
        return fim.dado;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        No atual = inicio;
        while (atual != null) {
            sb.append(atual.dado);
            if (atual.proximo != null) {
                sb.append(", ");
            }
            atual= atual.proximo;
        }
        sb.append("]");
        return sb.toString();
    }  
}