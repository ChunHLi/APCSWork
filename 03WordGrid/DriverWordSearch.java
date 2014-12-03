import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DriverWordSearch{
    public static void main(String[]args){
	WordGrid A = new WordGrid(30,30);
	A.setWordSearch();
	System.out.println(A.WordBank());
	A.randomize();
        System.out.println(A.toString());
    }
}
