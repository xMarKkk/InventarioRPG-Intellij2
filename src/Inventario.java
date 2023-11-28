public class Inventario {

    //variaveis para os slots de armaduras;
    boolean capacete;
    boolean peitoral;
    boolean calca;
    boolean bota;
    boolean arma;

    //variaveis que agrupam os slots do inventario;
    int numeroDoSlot = 10; //Vai indicar em qual slot está e qual o limite da array;
    int numeroDoItem = 24; //Vai indicar qual item é pela enumeração e tambem definir limite do array
    int[][] slots = new int[numeroDoSlot][numeroDoItem];

  
  public Inventario(){
    slots[0][3] = 3;
    slots[9][22] = 1;
  }

  
  public void exibirInventario(){
    //Exibe a quantidade de itens, o tipo e em qual slot o item esta:
    for(int i=0; i<numeroDoItem; i++){
        for(int j=0; j<numeroDoSlot; j++){
            if(slots[j][i]>0) {
                System.out.println("Slot "+(j+1)+" tem "+slots[j][i]+" itens do tipo "+(i+1));
            }
            else if(slots[j][i]==0){
                continue;
            }
        }
    }

  }


  public void exibirMapaInv(){
    //Exibe um "mapa" do seu inventario, onde as linhas são os slots e colunas os itens e o valor é a quantidade:
    for(int[] slot : slots){
        for(int slot1 : slot){
                System.out.print(slot1 + " ");
        }
        System.out.println();
    }
  }
}
//slot[i][0] = Adaga();