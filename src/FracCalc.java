//////////////////////////////////////////////////////////////////////////////
//
// AP CS A
// Unit Programming Project
//
// Fraction Calculator
//
// written by {$NAME}
//

import java.util.Scanner;

public class FracCalc {

    ////////////////////////////////////////////////////////
    // 
    // the main method is where you will interact with the
    // user by prompting for input and displaying results
    //
    public static void main(String[] args) {
        // TODO: (Checkpoint 1)
        //  * prompt the user for an equation
    	System.out.print("Please input an equation! ");
        //  * capture the input
    	Scanner console = new Scanner(System.in);
    	String equation = console.nextLine();
    	while(!equation.equals("quit")) {
    		//  * call the produceAnswer() method
    		String result = produceAnswer(equation);
    		//  * display the result
    		System.out.println(result);
    		System.out.print("Please input an equation! ");
    		//  * capture the input
    		equation = console.nextLine();
        	
    	}
        // TODO: (Checkpoint 2)
        //  * do all of the above inside a sentinel loop
    }
    
    ////////////////////////////////////////////////////////
    //
    // do not modify this method other than to activate the
    // checkpoint method that you are currently working on.
    //
    // after you finish Checkpoint #1, then comment out the
    // Checkpoint1 call and uncomment the Checkpoint2 call.
    // work on Checkpoint2 until all Checkpoint2 tests pass.
    //
    // after you finish Checkpoint #2, then comment out the
    // Checkpoint2 call and uncomment the Checkpoint3 call.
    // work on Checkpoint3 until all Checkpoint2 tests pass.
    //
    // And so forth.
    //
    ////////////////////////////////////////////////////////
    public static String produceAnswer(String input) { 
        
        // Checkpoint #1
        //return produceAnswerCheckpoint1(input);

        // Checkpoint #2
        //return produceAnswerCheckpoint2(input);

        // Checkpoint #3
        //return produceAnswerCheckpoint3(input);

        // Final Checkpoint
        return produceAnswerFinal(input);
        
        // Extra Credit (optional)
        //return produceAnswerExtraCredit(input);
    }

    public static String produceAnswerCheckpoint1(String input) { 
        // TODO (Checkpoint 1):
    	int index = input.indexOf(" ");
        // break up the input parameter into three Strings: the
    	String op1 = input.substring(0, index);
    	String operation= input.substring(index, index + 1);
    	String op2 = input.substring(index+3);
        // first operand (fraction), the operator (+ - * /), and 
        // the second operand (fraction). return second operand.

        /** not yet implemented **/
        return op2;
    }

    public static String produceAnswerCheckpoint2(String input) { 
        // TODO (Checkpoint 2):
        // break up the input parameter into three Strings: the 
        // first operand (fraction), the operator (+ - * /), and 
        // the second operand (fraction).  parse each operand
        // into 3 integer values, one each for the numerator,
        // denominator, and whole portion (for mixed fractions 
        // or integers).  return a string that describes each 
        // component of the second operand.  
        //    
        // The return format is as follows:
        //
        //     "whole:[w] numerator:[n] denominator:[d]"
        //
        // where [w], [n], and [d] represent the whole number,
        // numerator, and denominator components of the second 
        // operand.
        //
        // Example #1
        // if input is "5_3/4 - 6_5/8", the method would return
        // "whole:6 numerator:5 denominator:8"
        // 
        // Example #2
        // if input is "-3/7 - 20", the method would return
        // "whole:20 numerator:0 denominator:1"
        // 
        // Example #3
        // if input is "-32 - 27/21", the method would return
        // "whole:0 numerator:27 denominator:21"
    	int index = input.indexOf(" ");
        String op1 = input.substring(0, index);
    	String operation= input.substring(index, index + 1);
    	String op2 = input.substring(index+3);
    	
    	int whole;
    	int numerator;
    	int denominator;
    	
    	//if not a mixed number
    	if(op2.indexOf("_") == -1) {
    		//if whole number
    		if(op2.indexOf("/") == -1){
    			whole = Integer.parseInt(op2);
        		numerator = 0;
        		denominator = 1;
    		}
    		//if fraction
    		else {
    			whole = 0;
    			numerator = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
    			denominator = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    		}
       	}
    	//if mixed number
    	else {
    		whole = Integer.parseInt(op2.substring(0, op2.indexOf("_")));
    		numerator = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
        	denominator = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    	}
    	
    	
    	String returnValue = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
        /** not yet implemented **/
        return returnValue;
    }

    public static String produceAnswerCheckpoint3(String input) { 
        // TODO (Checkpoint 3):
        // evaluate the input as two fractional operands and an
        // arithmetic operator, and return the actual answer of
        // that calculation.  The answer need not be in reduced 
        // form and need not be a mixed fraction, but it must 
        // be correct.
        //
        // HINT: 
        // use the Integer.parseInt(string) method to convert a 
        // string to its numeric equivalent.
    	int index = input.indexOf(" ");
        String op1 = input.substring(0, index);
    	String operation= input.substring(index+1, index + 2);
    	String op2 = input.substring(index+3);
    	System.out.println(input);
    	System.out.println("my input: " + op1 + operation + op2);
    	int wholeOp1;
    	int numeratorOp1;
    	int denominatorOp1;
    	
    	//if not a mixed number
    	if(op1.indexOf("_") == -1) {
    		//if whole number
    		if(op1.indexOf("/") == -1){
    			wholeOp1 = Integer.parseInt(op1);
        		numeratorOp1 = 0;
        		denominatorOp1 = 1;
    		}
    		//if fraction
    		else {
    			wholeOp1 = 0;
    			numeratorOp1 = Integer.parseInt(op1.substring(op1.indexOf("_")+1, op1.indexOf("/")));
    			denominatorOp1 = Integer.parseInt(op1.substring(op1.indexOf("/")+1));
    		}
       	}
    	//if mixed number
    	else {
    		wholeOp1 = Integer.parseInt(op1.substring(0, op1.indexOf("_")));
    		numeratorOp1 = Integer.parseInt(op1.substring(op1.indexOf("_")+1, op1.indexOf("/")));
        	denominatorOp1 = Integer.parseInt(op1.substring(op1.indexOf("/")+1));
    	}
    	
    	
    	int wholeOp2;
    	int numeratorOp2;
    	int denominatorOp2;

    	//if not a mixed number
    	if(op2.indexOf("_") == -1) {
    		//if whole number
    		if(op2.indexOf("/") == -1){
    			wholeOp2 = Integer.parseInt(op2);
        		numeratorOp2 = 0;
        		denominatorOp2 = 1;
    		}
    		//if fraction
    		else {
    			wholeOp2 = 0;
    			numeratorOp2 = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
    			denominatorOp2 = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    		}
       	}
    	//if mixed number
    	else {
    		wholeOp2 = Integer.parseInt(op2.substring(0, op2.indexOf("_")));
    		numeratorOp2 = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
        	denominatorOp2 = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    	}

    	int imNum1 = Math.abs(wholeOp1 * denominatorOp1) + Math.abs(numeratorOp1);
    	if(wholeOp1 <0 || numeratorOp1 < 0) {
    		imNum1 = imNum1 * -1;
    	}
    	int imNum2 = Math.abs(wholeOp2 * denominatorOp2) + Math.abs(numeratorOp2);
    	if(wholeOp2 < 0 || numeratorOp2 < 0) {
    		imNum2 = imNum2 * -1;
    	}
    	
    	int numFinal = 0;
    	int denomFinal = 0;
    	if(operation.equals("/")) {
    		numFinal = imNum1 * denominatorOp2;
    		denomFinal = denominatorOp1 * imNum2;
    	}else {
    		denomFinal = denominatorOp1 * denominatorOp2;
    		if(operation.equals("+")) {
        		numFinal = (imNum1 * denominatorOp2) + (imNum2 * denominatorOp1);
    		}else if (operation.equals("-")) {
        		numFinal = (imNum1 * denominatorOp2) - (imNum2 * denominatorOp1);
        	}else {
        		//multiplication
        		numFinal = imNum1 * imNum2;
        	}        	
    	}
    	//if both num and denom have same sign
    	if(numFinal * denomFinal >0) {
    		numFinal = Math.abs(numFinal);
    		denomFinal = Math.abs(denomFinal);
    	}
    	//if num = 0
    	else if (numFinal == 0) {
    		return "0";
    	}
    	//if only denom is neg
    	else if (denomFinal < 0) {
    		numFinal *= -1;
    		denomFinal = Math.abs(denomFinal);
    	}
    	
    	System.out.println(numFinal + "/" + denomFinal);
        return numFinal + "/" + denomFinal;
    }

    public static String produceAnswerFinal(String input) { 
        // TODO (Final Checkpoint): 
        // in addition to the requirements for Checkpoint #3, 
        // all answers must be reduced.
    	System.out.println("input: " + input);
    	int index = input.indexOf(" ");
        String op1 = input.substring(0, index);
    	String operation= input.substring(index+1, index + 2);
    	String op2 = input.substring(index+3);
    	
    	int wholeOp1;
    	int numeratorOp1;
    	int denominatorOp1;
    	
    	//if not a mixed number
    	if(op1.indexOf("_") == -1) {
    		//if whole number
    		if(op1.indexOf("/") == -1){
    			wholeOp1 = Integer.parseInt(op1);
        		numeratorOp1 = 0;
        		denominatorOp1 = 1;
    		}
    		//if fraction
    		else {
    			wholeOp1 = 0;
    			numeratorOp1 = Integer.parseInt(op1.substring(op1.indexOf("_")+1, op1.indexOf("/")));
    			denominatorOp1 = Integer.parseInt(op1.substring(op1.indexOf("/")+1));
    		}
       	}
    	//if mixed number
    	else {
    		wholeOp1 = Integer.parseInt(op1.substring(0, op1.indexOf("_")));
    		numeratorOp1 = Integer.parseInt(op1.substring(op1.indexOf("_")+1, op1.indexOf("/")));
        	denominatorOp1 = Integer.parseInt(op1.substring(op1.indexOf("/")+1));
    	}
    	
    	
    	int wholeOp2;
    	int numeratorOp2;
    	int denominatorOp2;

    	//if not a mixed number
    	if(op2.indexOf("_") == -1) {
    		//if whole number
    		if(op2.indexOf("/") == -1){
    			wholeOp2 = Integer.parseInt(op2);
        		numeratorOp2 = 0;
        		denominatorOp2 = 1;
    		}
    		//if fraction
    		else {
    			wholeOp2 = 0;
    			numeratorOp2 = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
    			denominatorOp2 = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    		}
       	}
    	//if mixed number
    	else {
    		wholeOp2 = Integer.parseInt(op2.substring(0, op2.indexOf("_")));
    		numeratorOp2 = Integer.parseInt(op2.substring(op2.indexOf("_")+1, op2.indexOf("/")));
        	denominatorOp2 = Integer.parseInt(op2.substring(op2.indexOf("/")+1));
    	}

    	int imNum1 = Math.abs(wholeOp1 * denominatorOp1) + Math.abs(numeratorOp1);
    	if(wholeOp1 <0 || numeratorOp1 < 0) {
    		imNum1 = imNum1 * -1;
    	}
    	int imNum2 = Math.abs(wholeOp2 * denominatorOp2) + Math.abs(numeratorOp2);
    	if(wholeOp2 < 0 || numeratorOp2 < 0) {
    		imNum2 = imNum2 * -1;
    	}
    	
    	int numFinal = 0;
    	int denomFinal = 0;
    	if(operation.equals("/")) {
    		numFinal = imNum1 * denominatorOp2;
    		denomFinal = denominatorOp1 * imNum2;
    	}else {
    		denomFinal = denominatorOp1 * denominatorOp2;
    		if(operation.equals("+")) {
        		numFinal = (imNum1 * denominatorOp2) + (imNum2 * denominatorOp1);
    		}else if (operation.equals("-")) {
        		numFinal = (imNum1 * denominatorOp2) - (imNum2 * denominatorOp1);
        	}else {
        		//multiplication
        		numFinal = imNum1 * imNum2;
        	}        	
    	}
    	
    	//ensuring sign is right
    	boolean isNegative = false;
    	if(numFinal == 0) {
    		System.out.println("0");
    		return "0";
    	}else if (numFinal * denomFinal < 0) {
    		isNegative = true;
    	}

    	numFinal = Math.abs(numFinal);
    	denomFinal = Math.abs(denomFinal);
    	//reduce the positive impromper fraction
    	//whole number of improper fraction is numerator - remainder over denominator
    	int wholeFinal = (numFinal - (numFinal % denomFinal))/denomFinal;
    	//numerator is the remainder, denominator is the same
    	numFinal = numFinal % denomFinal;
       	System.out.println("wholeNum is:" + wholeFinal + "imNum is:" + numFinal + " imDenom is:" + denomFinal);
           	
    	//if no fraction, only return whole number
    	if(numFinal == 0) {
    		if (isNegative) {
    			wholeFinal *= -1;
    		}
    		System.out.println(wholeFinal);
    		return String.valueOf(wholeFinal);
    	}
    	
    	//it has the right fraction. But fraction always ends up as 1/0 for some reason
    	
    	//otherwise, reduce fraction
    	else {
    		//find greatest common denominator and divide both operands by gcd to obtain reduced fraction
    		int placeholder;
    		int a = numFinal;
    		int b = denomFinal;
    		if(b>a){
    			placeholder = a;
    			a = b;
    			b = placeholder;
    		}
    		while(b != 0){
    			placeholder = a % b;
    			a = b;
    			b = placeholder;
    		}
    		int gcd = Math.abs(a);
    		System.out.println(gcd);
    		numFinal /= gcd;
    		denomFinal /= gcd;
    	}
    	
    	//if only fraction, return fraction part
    	if(wholeFinal == 0) {
    		if(isNegative) {
    			numFinal *= -1;
    		}
    		System.out.println(numFinal + "/" + denomFinal);
    		return numFinal + "/" + denomFinal;
    	}
    	//otherwise, return whole and fraction
    	else {
    		if(isNegative){
    			wholeFinal *= -1;
    		}
    		System.out.println(wholeFinal+"_"+numFinal+"/"+denomFinal);
    		return wholeFinal+"_"+numFinal+"/"+denomFinal;
    	}
    }

    
    
    
    
    
    
    
    public static String produceAnswerExtraCredit(String input) { 
        // TODO (Extra Credit, optional): 
        // can evaluate an arbitrarily amount of operands and 
        // operators.  Equations are evaluated according to 
        // rules of precedence.
        

        //while string has multiplication/division operator
        while(input.contains(" / ") || input.contains("*")){
            int operandIndex;
            int division = input.indexOf(" / ") + 1;
            int multiplication = input.indexOf("*");
            
            //if string contains both multiplication and division...
            if(input.contains(" / ") && input.contains("*")){
                //if multiplication comes first
                if(division>multiplication){
                    operandIndex = multiplication;
                }
                //if division comes first
                else{
                    operandIndex = division;
                }
            }
            //if only multiplication
            else if(input.contains("*")){
                operandIndex = multiplication;  
            }
            //if only division
            else{
                operandIndex = division;
            }           
            
            //split into three strings
            // "a + "
            //"b * c"
            //" + d"

            int endOfOne;
            //if no string before multiplication/division equation
            if(input.lastIndexOf(" ", operandIndex - 2) == -1){
                endOfOne = 0;
            }else{
                endOfOne = input.lastIndexOf(" ", operandIndex - 2) + 1;
            }
            String one = input.substring(0, endOfOne);
            int endOfTest;
            //if no string after multiplication/division equation
            if(input.indexOf(" ", operandIndex + 2) == -1){
                endOfTest = input.length();
            }else{
                endOfTest = input.indexOf(" ", operandIndex + 2);
            }
            String test = input.substring(endOfOne, endOfTest);
            String two = input.substring(endOfTest);

            input = one + produceAnswerFinal(test) + two;
        }


        //while string has an addition/subtraction operator
        while(input.contains("+") || input.contains(" - ")){
            int operandIndex;
            int addition = input.indexOf("+");
            int subtraction = input.indexOf(" - ") + 1;
            
            //if string contains both addition and subtraction...
            if(input.contains("+") && input.contains(" - ")){
                //if addition comes first
                if(subtraction>addition){
                    operandIndex = addition;
                }
                //if subtraction comes first
                else{
                    operandIndex = subtraction;
                }
            }
            //if only subtraction
            else if(input.contains(" - ")){
                operandIndex = subtraction; 
            }
            //if only addition
            else{
                operandIndex = addition;
            }

            //split into two strings
            //"a + b"
            //" - c"
            String test;
            String two;
            int endOfTest;
            //if more than one operator, look for space
            if(input.indexOf(" ", operandIndex + 2) != -1){
                endOfTest = input.indexOf(" ", operandIndex + 2);
                test = input.substring(0, endOfTest);
                two = input.substring(endOfTest);
            }
            //if only one operator, whole string is test equation
            else{
                test = input;
                two = "";
            }

            input = produceAnswerFinal(test) + two;
        }       
        return input;
    }


}
