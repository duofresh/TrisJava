import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int posizioney=0;
        int posizionex=0;
        boolean vittoria=false;
        int[][] matrice = new int[3][3];
        for (int i = 0;!vittoria; i++) {
            do{
                do{
                    System.out.println("inserisci una riga");
                    posizioney = input.nextInt();
                    if(posizioney > 2)
                        System.out.println("La posizione deve essere fra 0 e 2");
                }while(posizioney > 2);
                do{
                    System.out.println("inserisci una colonna");
                    posizionex = input.nextInt();
                    if(posizionex > 2)
                        System.out.println("La posizione deve essere fra 0 e 2");
                }while(posizionex > 2);
            }while(matrice[posizioney][posizionex]!=0);
            if(i==0||(i%2==0)){
                matrice[posizioney][posizionex]=1;
            }else{
                matrice[posizioney][posizionex]=2;
            }
            stampa(matrice);
            vittoria = controllo(matrice);
            if(i==8){
                vittoria=true;
            }
        }
        System.out.println("Fine Gioco");
    }

    public static void stampa(int[][]matrice){
        int j = 0;
        System.out.println("-------------");
        while(j < 3){
            for(int i=0; i<3; i++){
                if(i == 0){
                    System.out.print("| ");
                }
                if(i != 2){
                    System.out.print(matrice[j][i] + " | ");
                }
                else{
                    System.out.print(matrice[j][i] + " |");
                }
            }
            System.out.println("");
            System.out.println("-------------");
            j++;
        }
    }

    public static boolean controllo(int[][]matrice){
        boolean v = false;
        if(matrice[0][0] == matrice[0][1] && matrice[0][1] == matrice[0][2] && matrice[0][0] != 0){
            if(matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            }
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if(matrice[1][0] == matrice[1][1] && matrice[1][1] == matrice[1][2] && matrice[1][2]!=0){
            if(matrice[1][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            } 
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if(matrice[2][0] == matrice[2][1] && matrice[2][1] == matrice[2][2] && matrice[2][2] != 0){
            if(matrice[2][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            }
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if(matrice[0][0] == matrice[1][0] && matrice[1][0] == matrice[2][0] && matrice[2][0] != 0){
            if(matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            } 
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if (matrice[0][1] == matrice[1][1] && matrice[1][1] == matrice[2][1] && matrice[2][1] != 0){
            if (matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            }
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if(matrice[0][2] == matrice[1][2] && matrice[1][2] == matrice[2][2] && matrice[2][2] != 0){
            if(matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            } 
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        if(matrice[0][0] == matrice[1][1] && matrice[1][1] == matrice[2][2]&&matrice[2][2]!=0){
            if (matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            } 
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v=true;
        }
        if(matrice[2][0] == matrice[1][1] && matrice[1][1] == matrice[0][2] && matrice[0][2] != 0){
            if(matrice[0][0] == 1){
                System.out.println("Il giocatore 1 ha vinto");
            } 
            else{
                System.out.println("il giocatore 2 ha vinto");
            }
            v = true;
        }
        return v;
    }
}
