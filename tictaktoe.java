import java.util.*;
public class tictaktoe{

    public static void print(char mat[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("| "+mat[i][j]+" | ");
            }
            System.out.println("\n");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char mat[][] = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat[i][j]=' ';
            }
        }

        print(mat);
        
        char ch;
        int pos;

        outerloop:
        for(int i=1; i<=9; i++){
            pos=sc.nextInt(); // 1,2,3,4,5,6,7,8,9
            
            if(i%2 != 0){
                ch= 'O';
               
                if(pos==1){
                    mat[0][0]=ch;
                }
                else if(pos==2){
                    mat[0][1]=ch;
                }
                else if(pos==3){
                    mat[0][2]=ch;
                }
                else if(pos==4){
                    mat[1][0]=ch;
                }
                else if(pos==5){
                    mat[1][1]=ch;
                }
                else if(pos==6){
                    mat[1][2]=ch;
                }
                else if(pos==7){
                    mat[2][0]=ch;
                }
                else if(pos==8){
                    mat[2][1]=ch;
                }
                else if(pos==9){
                    mat[2][2]=ch;
                }
            }
            else{
                ch='X';

                if(pos==1){
                    mat[0][0]=ch;
                }
                else if(pos==2){
                    mat[0][1]=ch;
                }
                else if(pos==3){
                    mat[0][2]=ch;
                }
                else if(pos==4){
                    mat[1][0]=ch;
                }
                else if(pos==5){
                    mat[1][1]=ch;
                }
                else if(pos==6){
                    mat[1][2]=ch;
                }
                else if(pos==7){
                    mat[2][0]=ch;
                }
                else if(pos==8){
                    mat[2][1]=ch;
                }
                else if(pos==9){
                    mat[2][2]=ch;
                }
            }
            print(mat);

            for(int j=0; j<3; j++){
                int k=0;
                if(mat[j][k]==mat[j][k+1]){
                    if(mat[j][k]==mat[j][k+2]){
                        if(mat[j][k]!=' '){
                            System.out.println(mat[j][k]+" is win");
                            break outerloop;}
                    }
                }
                    else if(mat[k][j]==mat[k+1][j]){
                        if(mat[k][j]==mat[k+2][j]){
                            if(mat[k][j]!=' '){
                                System.out.println(mat[k][j]+" is win");
                                break outerloop;
                            }
                         }
                     }

                     else if(mat[0][0]==mat[1][1]){
                        if(mat[0][0]==mat[2][2]){
                            if(mat[0][0]!=' '){
                                System.out.println(mat[0][0]+" is win");
                                break outerloop;
                            }
                         }
                     }

                     else if(mat[0][2]==mat[1][1]){
                        if(mat[0][2]==mat[2][0]){
                            if(mat[0][2]!=' '){
                                System.out.println(mat[0][2]+" is win");
                                break outerloop;
                            }
                         }
                     }
            }
        }
    }
}