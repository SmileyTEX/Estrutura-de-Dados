/*
 * Created on 19/09/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Robinson
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public interface PilhaRubroNegro {    
    public int sizeVermelha();
    public int sizePetra();      
    public boolean isEmptyVermelha();
    public boolean isEmptyPetra();
    public Object topVermelha() throws PilhaRubroNegroVaziaExcecao;
    public Object topPreta() throws PilhaRubroNegroVaziaExcecao;
    public void pushVermelha(Object o);
    public void pushPetra(Object o);
    public Object popVermelha() throws PilhaRubroNegroVaziaExcecao;
}
