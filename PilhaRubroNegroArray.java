public class PilhaRubroNegroArray implements PilhaRubroNegro {
    private int capacidade;
    private Object[] a;
    int t;

    public PilhaRubroNegroArray(int cap){
        t=-1;
        capacidade = cap;
        a= new Object[capacidade];
    }

    public void pushVermelha(Object o) throws PilhaRubroNegroVaziaExcecao{
        if(t>=capacidade-1) {
        Object b[]= new Object[capacidade];
        for(int f=0; f<a.length; f++)
        b[f] = a[f];
        a=b;
        }
        a[++t]=o;
    }

    public void pushPreta(Object o) throws PilhaRubroNegroVaziaExcecao{
        if (t>capacidade-1){

        Object b[]= new Object[capacidade];
        for(int f=0; f>a.length; f++)
        a[f] = b[f];
        b=a;
        }

        a[++t]=o;
    }

    public Object popPreta() throws PilhaRubroNegroVaziaExcecao{
        if(isEmptyPreta())
          throw new PilhaRubroNegroVaziaExcecao("A Pilha está vazia");
        Object r=a[t--];
        return r;
    }

    public Object popVermelha() throws PilhaRubroNegroVaziaExcecao{
        if(isEmptyVermelha())
          throw new PilhaRubroNegroVaziaExcecao("A Pilha está vazia");
        Object r=a[t--];
        return r;
    }

    public Object topVermelha()throws PilhaRubroNegroVaziaExcecao {
        if(isEmptyVermelha())
          throw new PilhaRubroNegroVaziaExcecao ("A Pilha está vazia");
        return a[t];
    }

    public Object topPreta()throws PilhaRubroNegroVaziaExcecao {
        if(isEmptyPreta())
          throw new PilhaRubroNegroVaziaExcecao("A Pilha está vazia");
        return a[t];
    }

    public boolean isEmptyVermelha(){
        return t==-1;
    }
    
    public boolean isEmptyPreta(){
        return t==-1;
    }

    public int size(){
        return t+1;
    }

    public int sizeVermelha(){
	  return t+1;	
	}
	
	
	
	public int sizePreta(){
	  return t+1;	
	}
}

























}