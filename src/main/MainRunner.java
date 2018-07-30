package main;

class MainRunner {
  
  public static void main(String [] args) {
    System.out.println("test");
    int firstNumber = 4;
    int secondNumber = 5;
    
    FirstClass theClass = new FirstClass(firstNumber, secondNumber);
    
    int addResult = theClass.simpleAddition();
    int multiplyResult = theClass.simpleMultiply();
    
    System.out.println("The addition of " + firstNumber + ""
        + " + " + secondNumber 
        + " is " + addResult);
    
    
    System.out.println("The multiplication of " + firstNumber
        + " * " + secondNumber
        + " is " + multiplyResult);
  }
  
  
}