import java.util.*;
public class copystack
{
    public static void print(char mat[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("| "+mat[i][j]+" | ");
            }
            System.out.println("\n");
        }

    }
    public static boolean rowwin(char mat[][])
    {
        for(int j=0;j<3;j++)
        {
            if(mat[j][0]==mat[j][1] && mat[j][1]==mat[j][2] && mat[j][0]!=' ')
                return true;
        }
        return false;

    }
    public static boolean colwin(char mat[][])
    {
        for(int j=0;j<3;j++)
        {
            if(mat[0][j]==mat[1][j] && mat[1][j]==mat[2][j] && mat[0][j]!=' ')
                return true;
        }
        return false;

    }
    public static boolean diagonalwin(char mat[][])
    {

            if(mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2] && mat[0][0]!=' ')
                return true;
            else if(mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0] && mat[1][1]!=' ')
                return true;

        return false;

    }
    public static void giveValue(char mat[][])
    {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat[i][j]=' ';
            }
        }
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char mat[][] = new char[3][3];
        int row,col,pos;
        char ch;
        boolean flag=false;

        giveValue(mat);

        for(int i=1; i<=9; i++){
            pos=sc.nextInt();

            if(i%2 != 0) ch = 'O';
            else ch = 'X';

              row =(pos-1)/3;
            if(pos%3!=0)
                 col=(pos%3)-1;
            else
                 col=2;

            mat[row][col]=ch;
            print(mat);

            if(rowwin(mat) || colwin(mat) || diagonalwin(mat))
            {
                flag=true;
                System.out.println(mat[row][col]+"is the winner");
                break;
            }
        }
        if(!flag)
            System.out.println("draw");
        
    }
}
