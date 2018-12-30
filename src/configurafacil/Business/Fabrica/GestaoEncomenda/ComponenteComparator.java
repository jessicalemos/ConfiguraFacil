/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business.Fabrica.GestaoEncomenda;

import java.util.Comparator;

/**
 *
 * @author utilizador
 */
public class ComponenteComparator implements Comparator<Componente> {

	/**
     * Compara duas maxPosts consoante o contador
     * @param c1 maxPosts 1
     * @param c2 maxPosts 2
     * @return O contador da maxPosts 1 é maior (-1); O contador da maxPosts 2 é maior (1); São iguais (0);
     */
    public int compare(Componente c1, Componente c2) {
        if (c1.getPreco()< c2.getPreco()) return 1;
        if (c1.getPreco() > c2.getPreco()) return -1;
        return 0;
    }
}