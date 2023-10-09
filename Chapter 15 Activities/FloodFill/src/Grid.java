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
        for (int r = 0; r < SIZE; r++)
        {
            for (int c = 0; c < SIZE; c++)
            {
                pixels[r][c] = 0; 
            }
        }
        Pair pairStuff = new Pair(row, column);
        Pair pairStuff2 = new Pair(row-1, column); 
        Pair pairStuff3 = new Pair(row+1, column); 
        Pair pairStuff4 = new Pair(row, column+1); 
        Pair pairStuff5 = new Pair(row, column-1);
        pixels[row][column]+=1; 
        pixels[row-1][column]+=1; 
        pixels[row+1][column]+=1; 
        pixels[row][column+1] +=1; 
        pixels[row][column-1]+=1;
        cubes.push(pairStuff);  
        cubes.push(pairStuff2); 
        cubes.push(pairStuff3); 
        cubes.push(pairStuff4); 
        cubes.push(pairStuff5); 
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
