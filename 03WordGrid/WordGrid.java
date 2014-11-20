import java.util.*;

public class WordGrid{
    
    public static void main(String[]args){
	WordGrid A = new WordGrid();
	A.addWordHorizontal("soup",5,3);
	A.addWordHorizontal("place",5,0);
	System.out.println(A.toString());
    }

    public char data[][];
    private String Grid;

    public WordGrid(){
	data = new char[10][10];
	clear();
    }

    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	clear();
    }

    public void clear(){
	int counter = 0;
	int counter2 = 0;
	while (counter < data.length){
	    while (counter2 < data[counter].length){
		data[counter][counter2] = ' ';
		counter2 += 1;
	    }
	    counter2 = 0;
	    counter += 1;
	}
    }

    public String toString(){
	String grid = "";
	int counter = 0;
	int counter2 = 0;
	while (counter < data.length){
	    grid += "[";
	    while (counter2 < data[counter].length){
		grid += data[counter][counter2] + " ";
		counter2 += 1;
	    }
	    counter2 = 0;
	    counter += 1;
	    grid += "]\n";
	}
        setGrid(grid);
	return Grid;
    }

    public void setGrid(String newGrid){
	Grid = newGrid;
    }

    public void getGrid(){
	System.out.println(Grid);
    }

    public boolean addWordHorizontal(String word,int row, int col){
	int counter = 0;
	boolean doesItFit = true;
	char[][] copyData = data;
	if (word.length() > copyData[row].length - col){
	    doesItFit = false;
	}
	while (counter < word.length() && doesItFit){
	    if ((copyData[row][col + counter] != ' ') && (copyData[row][col + counter] != word.charAt(counter))){
		doesItFit = false;
	    }
	    copyData[row][col + counter] = word.charAt(counter);
	    counter += 1;
	}
	return doesItFit;
    }

    //public boolean addWordVertical(String word, int row, int col){
    //}

    //public boolean addWordDiagonal(String word, int row, int col){
    //}
}
