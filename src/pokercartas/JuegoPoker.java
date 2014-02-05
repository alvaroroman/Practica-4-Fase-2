
package pokercartas;



public class JuegoPoker {
    
    private int combinacion;
        
    public static final int NADA = 0;
    public static final int PAREJA = 1;
    public static final int TRIO = 2;
    public static final int POKER = 3;
    public static final int REPOKER = 4;
    
    public JuegoPoker(int combinacion) {
        this.combinacion = combinacion;
    }
    public static int getCombinacion(CartaFrancesa carta1, CartaFrancesa carta2, CartaFrancesa carta3, CartaFrancesa carta4,
                                        CartaFrancesa carta5) {
        return 0;
    }
    
    
}
