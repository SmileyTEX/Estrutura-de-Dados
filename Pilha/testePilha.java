/*
 * Created on 01/09/2004
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
public class TestePilha {
    public static void main(String[] args) {
        PilhaRubroNegroArray pilha = new PilhaRubroNegroArray(2);

        System.out.println("Inserindo na vermelha:");
        for (int f = 0; f < 10; f++) {
            System.out.println("Push Vermelha -> " + f);
            pilha.pushVermelha(f);
        }

        System.out.println("\nRetirando da vermelha:");
        for (int f = 0; f < 10; f++) {
            System.out.print("Pop Vermelha " + f);
            System.out.println(" -> " + pilha.popVermelha());
        }

        System.out.println("\nInserindo na preta:");
        for (int f = 0; f < 10; f++) {
            System.out.println("Push Preta -> " + f);
            pilha.pushPetra(f);
        }

        System.out.println("\nRetirando da preta:");
        for (int f = 0; f < 10; f++) {
            System.out.print("Pop Preta " + f);
            System.out.println(" -> " + pilha.popPreta());
        }
    }
}
