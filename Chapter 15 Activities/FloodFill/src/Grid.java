import java.util.Stack;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack <Pair> cubes = new Stack<>(); 

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int numEmptySquares = 100; 
        for (int r = 0; r < SIZE; r++)
        {
            for (int c = 0; c < SIZE; c++)
            {
                pixels[r][c] = 0;
            }
        }

        cubes.push(new Pair(row, column)); 
        int fillNumber = 1; 
        
        while (numEmptySquares!=0)
        {
            Pair currentPair = cubes.pop();
            int row2 = currentPair.getRow(); 
            int col2 = currentPair.getCol(); 

            if (pixels[row2][col2]==0)
            {
                pixels[row2][col2] = fillNumber++;
                numEmptySquares--; 
            }

            if (row2>0)
            {
                cubes.push(new Pair(row2-1, col2));
            }
            if (col2<9)
            {
                cubes.push(new Pair(row, col2+1));
            }
            if (row2<9)
            {
                cubes.push(new Pair(row2+1, col2));
            }
            if (col2>0)
            {
                cubes.push(new Pair(row2, col2-1));
            }


        }



        /* 
        Pair pairStuff = new Pair(row, column); //the pair 
        Pair pairStuff2 = new Pair(row-1, column); //north pair
        Pair pairStuff3 = new Pair(row+1, column); //south pair
        Pair pairStuff4 = new Pair(row, column+1); //east pair
        Pair pairStuff5 = new Pair(row, column-1); //west pair
        cubes.push(pairStuff);  
        cubes.push(pairStuff2); 
        cubes.push(pairStuff3); 
        cubes.push(pairStuff4); 
        cubes.push(pairStuff5); 
        pixels[row][column]+=1; 
        pixels[row-1][column]+=1; 
        pixels[row+1][column]+=1; 
        pixels[row][column+1] +=1; 
        pixels[row][column-1]+=1;
        
            floodfill(row, column);
            floodfill(row-1, column);
            floodfill(row+1, column);
            floodfill(row, column+1);
            floodfill(row, column-1); */

        

        
    }
    

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
