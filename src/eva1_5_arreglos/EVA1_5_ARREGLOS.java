
package eva1_5_arreglos;
/*PROYECTO PARA TRABAJAR CON ARREGLOS */
/**
 * @author 16550549
 */
public class EVA1_5_ARREGLOS {

    public static void main(String[] args) {
        //ARREGLO DE TIPO ENTERO TAMAÑO 10
        int aiMisNume[] = new int[10];
        for (int i = 0; i < 10; i++) {
            aiMisNume[i] = (int) (Math.random() * 10) + 1;
        //FOR EACH 
        }
        for (int x : aiMisNume) {
            System.out.println("X = " + x);
        }
        //MULTIPLES ARREGLOS
        int[] aiArreglo1, aiArreglo2, aiArreglo3; //TODOS SON ARREGLOS
        aiArreglo1 = new int[3];
        aiArreglo2 = new int[10];
        aiArreglo3 = new int[100];
        //ARREGLOS Y VARIABLES
        int aiArre[], iVar, iVar2; //SOLO aiArre ES ARREGLO
        iVar = 10;
        iVar2 = 30;

    }

}
