import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DriverWordSearch{
    public static void main(String[]args){
	set(args);
    }
    public static WordGrid start(int row, int col, long seed){
	WordGrid Grid = new WordGrid(row, col, seed);
	return Grid;
    }
    public static void set(String[]args){
	if (args.length == 0 || args.length == 1 || args.length == 2){
	    System.out.println("Please input at least three integer arguments");
	}
	if (args.length == 4 || args.length == 3){
	    int row = Integer.parseInt(args[0]);
	    int col = Integer.parseInt(args[1]);
	    Long seed = Long.parseLong(args[2]);
	    if (args.length == 4 && args[3].equals("1")){
		    WordGrid Grid = start(row,col,seed);
		    Grid.setWordSearch();
		    System.out.println(Grid.WordBank());
		    System.out.println(Grid.toString());
	    }
	    else{
		WordGrid Grid = start(row, col, seed);
		Grid.setWordSearch();
		System.out.println(Grid.WordBank());
		Grid.randomize();
		System.out.println(Grid.toString());
	    }
	}
	else{
	    System.out.println("You may have inputted an incorrect argument, please try again");
	}
    }				        
}
