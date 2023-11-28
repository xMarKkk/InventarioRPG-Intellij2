public class Pocoes {
    //variaveis que agrupam as poções;
    int[] pocao = new int[5];
  /*As poçoes estao ordenadas da seguinte forma:

  Poção de Cura = pocao[0];
  Poção de Mana = pocao[1];
  Poção de Invisibilidade = pocao[2];
  Poção de ResistenciaAoFogo = pocao[3];
  Poção de Veneno = pocao[4];

  */

  public Pocoes(){
    pocao[0] = 7;
    pocao[1] = 1;
    pocao[2] = 0;
    pocao[3] = 2;
    pocao[4] = 2;
  }
  
  public void exibirPocoes(){
    //Exibe quais poções você tem:
      for(int i=0; i<5; i++){
      if(pocao[i]>0){
          System.out.print("Você tem "+pocao[i]+" poções");
          if(i==0){
              System.out.println(" de Cura");
              continue;
          }
          else if(i==1){
              System.out.println(" de Mana");
              continue;
          }
          else if(i==2){
              System.out.println(" de Invisibilidade");
              continue;
          }
          else if(i==3){
              System.out.println(" de Resistencia ao Fogo");
              continue;
          }
          else if(i==4){
              System.out.println(" de Veneno");
          }
      }
      else if(pocao[i]==0){
          System.out.println("Você não tem poções do tipo "+(i+1));
      }
    }
  }
}
