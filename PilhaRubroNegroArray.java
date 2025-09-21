public class PilhaRubroNegroArray implements PilhaRubroNegro {
    private int capacidade;
    private Object[] a;
    private int topoVermelha;
    private int topoPreta;

    public PilhaRubroNegroArray(int cap) {
        capacidade = cap;
        a = new Object[capacidade];
        topoVermelha = -1;       
        topoPreta = capacidade;  
    }

   
    private void redimensiona(int novaCapacidade) {
        Object[] b = new Object[novaCapacidade];
        int tamVermelha = sizeVermelha();
        int tamPreta = sizePetra();

        
        for (int i = 0; i < tamVermelha; i++) {
            b[i] = a[i];
        }

        
        int inicioPreta = novaCapacidade - tamPreta;
        for (int i = 0; i < tamPreta; i++) {
            b[inicioPreta + i] = a[topoPreta + i];
        }

        topoVermelha = tamVermelha - 1;
        topoPreta = novaCapacidade - tamPreta;
        capacidade = novaCapacidade;
        a = b;
    }

    
    private void verificaCapacidade() {
        if (topoVermelha + 1 == topoPreta) {
            redimensiona(capacidade * 2); 
        } else if ((sizeVermelha() + sizePetra()) <= capacidade / 3 && capacidade > 4) {
            redimensiona(capacidade / 2); 
        }
    }

    @Override
    public void pushVermelha(Object o) {
        verificaCapacidade();
        a[++topoVermelha] = o;
    }

    @Override
    public void pushPetra(Object o) {
        verificaCapacidade();
        a[--topoPreta] = o;
    }

    @Override
    public Object popVermelha() throws PilhaRubroNegroVaziaExcecao {
        if (isEmptyVermelha())
            throw new PilhaRubroNegroVaziaExcecao("Pilha vermelha vazia");
        Object r = a[topoVermelha];
        a[topoVermelha--] = null;
        verificaCapacidade();
        return r;
    }

    @Override
    public Object popPreta() throws PilhaRubroNegroVaziaExcecao {
        if (isEmptyPetra())
            throw new PilhaRubroNegroVaziaExcecao("Pilha preta vazia");
        Object r = a[topoPreta];
        a[topoPreta++] = null;
        verificaCapacidade();
        return r;
    }

    @Override
    public Object topVermelha() throws PilhaRubroNegroVaziaExcecao {
        if (isEmptyVermelha())
            throw new PilhaRubroNegroVaziaExcecao("Pilha vermelha vazia");
        return a[topoVermelha];
    }

    @Override
    public Object topPreta() throws PilhaRubroNegroVaziaExcecao {
        if (isEmptyPetra())
            throw new PilhaRubroNegroVaziaExcecao("Pilha preta vazia");
        return a[topoPreta];
    }

    @Override
    public boolean isEmptyVermelha() {
        return topoVermelha == -1;
    }

    @Override
    public boolean isEmptyPetra() {
        return topoPreta == capacidade;
    }

    @Override
    public int sizeVermelha() {
        return topoVermelha + 1;
    }

    @Override
    public int sizePetra() {
        return capacidade - topoPreta;
    }
}
