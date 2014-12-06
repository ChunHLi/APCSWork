import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class WordGrid{
    private int rows, cols;
    private ArrayList PokemonList=new ArrayList();
    private ArrayList PossiblePokemonList=new ArrayList();
    private String[][] Grid;
    private Random rand;

    public WordGrid(){
	this(10,10,0);
    }
    public WordGrid(int rows,int cols, long seed){
	Grid=new String[rows][cols];
	this.rows=rows;
	this.cols=cols;
	setSeed(seed);
	clear();
    }
    public void setSeed(long seed){
	rand = new Random(seed);
    }

    private void clear(){
	for (int counter = 0; counter < Grid.length; counter += 1){
	    for (int counter2 = 0; counter2 < Grid[0].length; counter2 += 1){
		Grid[counter][counter2]="_";
	    }
	}
    }

    public String toString(){
	String string = "";
	for (int counter = 0; counter < Grid.length; counter += 1){
	    for (int counter2 = 0; counter2 < Grid[0].length; counter2 += 1){
		string += " " + Grid[counter][counter2] + " ";
	    }
	    string += "\n";
	}
	return string;
	
    }
 
    public boolean isInside(int row, int col){
	return (row < Grid.length && row >= 0 && col < Grid[0].length && col >= 0); 
    }
    public boolean snug(String letter, int row, int col){
	return Grid[row][col].equals("_");
    }
    public boolean addWordHorizontalForwards(String word,int row, int col){
	int counter = col;
	for (int counter2 = 0; counter2 < word.length(); counter2 += 1){
	    if (isInside(row, counter) && snug(word.substring(counter2 , counter2 + 1), row, counter)){
	    } 
	    else{
		return false;
	    }
	    counter += 1;
	}
	counter = col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[row][counter] = word.substring(counter3 , counter3 + 1).toUpperCase();
	    counter += 1;
	}
	PokemonList.add(word);
	return true;
    }
    public boolean addWordHorizontalBackwards(String word,int row, int col){
	int counter = col;
	for (int counter2 = 0; counter2 < word.length(); counter2 += 1){
	    if (isInside(row, counter) && snug(word.substring(counter2, counter2 + 1), row, counter)){
	    } 
	    else{
		return false;
	    }
	    counter -= 1;
	}
	counter = col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[row][counter]=word.substring(counter3, counter3 + 1).toUpperCase();
	    counter -= 1;
	}
	PokemonList.add(word);
	return true;
    }
    public boolean addWordVerticalUpwards(String word,int row, int col){
	int counter = row;
	for (int counter2 = 0; counter2 < word.length(); counter += 1){
	    if (isInside(counter, col) && snug(word.substring(counter2,counter2+1), counter, col)){
	    } 
	    else{
		return false;
	    }
	    counter += 1;
	}
	counter = row;
	for (int counter3 = 0; counter3 < word.length(); counter += 1){
	    Grid[counter][col] = word.substring(counter3, counter3 + 1).toUpperCase();
	    counter += 1;
	}
	PokemonList.add(word);
	return true;
    }
    public boolean addWordVerticalDownwards(String word,int row, int col){
	int counter = row;
	for (int counter2 = 0; counter2 < word.length(); counter2 += 1){
	    if (isInside(counter, col) && snug(word.substring(counter2, counter2 + 1), counter, col)){
	    } 
	    else{
		return false;
	    }
	    counter -= 1;
	}
	counter = row;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[counter][col] = word.substring(counter3 ,counter3 + 1).toUpperCase();
	    counter -= 1;
	}
	PokemonList.add(word);
	return true;
    }
    public boolean addWordDiagonalNE(String word,int row, int col){
	int counter = row;
	int counter2 =col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    if (isInside(counter, counter2) && snug(word.substring(counter3, counter3 + 1), counter, counter2)){
	    } 
	    else {
		return false;
	    }
	    counter += 1;
	    counter2 += 1;;
	}
	counter = row;
	counter2 =col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[counter][counter2] = word.substring(counter3 , counter3 + 1).toUpperCase();
	    counter += 1;
	    counter2 += 1;;
	}
	PokemonList.add(word);
	return true;
    }
    public boolean addWordDiagonalNW(String word,int row, int col){
	int counter = row;
	int counter2 = col;
	for (int counter3 =0; counter3 < word.length(); counter3 += 1){
	    if (isInside(counter, counter2) && snug(word.substring(counter3, counter3 + 1), counter, counter2)){
	    } 
	    else{
		return false;
	    }
	    counter -= 1;
	    counter2 += 1;
	}
	counter = row;
	counter2 = col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[counter][counter2] = word.substring(counter3, counter3 + 1).toUpperCase();
	    counter -= 1;
	    counter2 += 1;
	}
	PokemonList.add(word);
	return true;
    }
    
    public boolean addWordDiagonalSW(String word,int row, int col){
	int counter = row;
	int counter2 = col;
	for (int counter3 = 0; counter3 < word.length(); counter += 1){
	    if (isInside(counter, counter2) && snug(word.substring(counter3, counter3 + 1), counter, counter2 )){
	    } else {
		return false;
	    }
	    counter += 1;
	    counter2 -= 1;
	}
	counter = row;
	counter2 = col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[counter][counter2]=word.substring(counter3,counter3+1).toUpperCase();
	    counter += 1;
	    counter2 -= 1;
	}
	PokemonList.add(word);
	return true;
    }
    
    public boolean addWordDiagonalSE(String word,int row, int col){
	int counter = row;
	int counter2 = col;
	for (int counter3 =0; counter3 < word.length(); counter3 += 1){
	    if (isInside(counter, counter2) && snug(word.substring(counter3, counter3 + 1), counter, counter2)){
	    } 
	    else{
		return false;
	    }
	    counter -= 1;
	    counter2 -= 1;
	}
	counter = row;
	counter2 = col;
	for (int counter3 = 0; counter3 < word.length(); counter3 += 1){
	    Grid[counter][counter2]=word.substring(counter3,counter3 + 1).toUpperCase();
	    counter -= 1;
	    counter2 -= 1;
	}
	PokemonList.add(word);
	return true;
    }
    
    public void randomize(){
	String letters = "abcdefghijklmnopqrstuvwxyz";
	for (int counter = 0; counter < Grid.length; counter += 1){
	    for (int counter2 = 0; counter2 < Grid[0].length; counter2 += 1){
		if (Grid[counter][counter2].equals("_")){
		    Random index = new Random();
		    int letter = index.nextInt(letters.length());
		    Grid[counter][counter2]=letters.substring(letter,letter + 1).toUpperCase();
		}
	    }
	}
    }

    public String WordBank(){
	String string = "";
	for (int counter = 0; counter < PokemonList.size(); counter += 1){
	    string += counter + 1 + ". " + PokemonList.get(counter)+" ";
	}
	return string;
    }

    public void insert(String word){
	Random Row=new Random();
	Random Col=new Random();
	Random Dir=new Random();
	int counter2,counter;
	for (int counter3 = 0; counter3 < rows*cols; counter3 += 1){
	    counter2 = Row.nextInt(rows);
	    counter = Col.nextInt(cols);
	    int dir = Dir.nextInt(8);
	    if (PokemonList.indexOf(word)==-1){
		for (int counter4 = 1; counter4 < 8; counter4 += 1){
		    if (dir==0 && addWordHorizontalForwards(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==1 && addWordHorizontalBackwards(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==2 && addWordVerticalUpwards(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==3 && addWordVerticalDownwards(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==4 && addWordDiagonalNE(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==5 && addWordDiagonalNW(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==6 && addWordDiagonalSE(word, counter2, counter)){
			break;
		    } else {
			dir += 1;
		    }
		    if (dir==7 && addWordDiagonalSW(word, counter2, counter)){
			break;
		    } else {
			dir = 0;
		    }
		}
	    }
	}
    }
	    
	
    public void setWordSearch(){
	File text = new File("words.txt");
	Scanner scanner = new Scanner(System.in);
	try {
	scanner = new Scanner(text);
	} catch(FileNotFoundException e){
	    System.out.println("File Not Found!");
	}
	while (scanner.hasNextLine()){
	    String word=scanner.nextLine();
	    PossiblePokemonList.add(word);
	}
	for (int counter = 0; counter <rows*cols/5; counter += 1){
	    Random rand=new Random();
	    int index=rand.nextInt(PossiblePokemonList.size());
	    insert(PossiblePokemonList.get(index).toString());
	}
    }
}
