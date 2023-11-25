public class Inventario {

    //variaveis para os slots de armaduras;
    boolean capacete;
    boolean peitoral;
    boolean calca;
    boolean bota;
    boolean arma;

    //variaveis que agrupam os slots do inventario;
    int numeroDoSlot = 10; //Vai indicar em qual slot está e qual o limite da array;
    int numeroDoItem = 30; //Vai indicar qual item é pela enumeração e tambem definir limite do array
    int[][] slots = new int[numeroDoSlot][numeroDoItem];

}
