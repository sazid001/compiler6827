/*
This code split full text file every word,symbol and everything and give them certain tag as keyword,identifier or values
*/


package assignment;

import java.io.File;
import java.util.Scanner;

public class experiment {

	public static void main(String[] args) {
	
		
		
		
		String[] keyword = {"int", "if", "byte", "long", "String", "double", "else", "switch", "float"};
        String[] identifiers = {"a", "b", "c", "d", "e"};
        String[] operand = {"-", " +", "/","=", "*"};
        String[] operator = {"<", ">", "&&", "||", "!=", "=="};
        String[] value = {"1", "2", "3", "4", "5", "6", "7", "8","10"};
        String[] others = {"{", "}", ";", ")", "(", ","};

        String text = "";


        try {

    
            Scanner input = new Scanner (new File("C:\\Users\\Sazid_shihab\\Desktop\\ha.txt"));
         

            while (input.hasNext()){
                text += input.nextLine() + " ";
            }

          
            input.close();

        } catch (Exception e){
            System.out.println("File not found");
        }


        String[] splitingArray = text.split(" ");

    

        for( int i=0; i<splitingArray.length; i++){
            for( int j=i+1; j<splitingArray.length; j++){
                if((splitingArray[i]).equals(splitingArray[j]))
                    splitingArray[j] = "";
            }

        }

    
        System.out.print("\nkeyword:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<keyword.length; j++){
                if((splitingArray[i]).equals(keyword[j])){
                    System.out.print(" " + splitingArray[i] + ",");
                }
            }
        }

        System.out.print("\nIdentifiers:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<identifiers.length; j++){
                if((splitingArray[i]).equals(identifiers[j])){
                    System.out.print(" " +splitingArray[i] + ",");
                }
            }
        }

        System.out.print("\nMath Operators:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<operand.length; j++){
                if((splitingArray[i]).equals(operand[j])){
                    System.out.print(" " +splitingArray[i] + ",");
                }
            }
        }

        System.out.print("\nLogical Operators:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<operator.length; j++){
                if((splitingArray[i]).equals(operator[j])){
                    System.out.print(" " +splitingArray[i] + ",");
                }
            }
        }

        System.out.print("\nValues:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<value.length; j++){
                if((splitingArray[i]).equals(value[j])){
                    System.out.print(" " +splitingArray[i] + ",");
                }
            }
        }


        System.out.print("\nOthers:");
        for( int i=0; i<splitingArray.length; i++){
            for( int j=0; j<others.length; j++){
                if((splitingArray[i]).equals(others[j])){
                    System.out.print(" " +splitingArray[i]);
                }
            }
        }
		
	
		
	}   
	}

/*
              Output
	      
keyword: int, float, if,
Identifiers: a, b, c,
Math Operators: =,
Logical Operators: >,
Values: 5, 10,
Others: , ; ( )	      


*/



