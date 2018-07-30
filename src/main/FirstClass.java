package main;

public class FirstClass {
  public int firstValue;
  public int secondValue;
  
  
  public FirstClass(int firstNumber, int secondNumber) {
    this.firstValue = firstNumber;
    this.secondValue = secondNumber;
  }
  
  public void setFirst(int firstNumber) {
    this.firstValue = firstNumber;
  }
  
  public void setSecond(int secondNumber) {
    this.secondValue = secondNumber;
  }
  
  public int getFirst() {
    return this.firstValue;
  }
  
  public int getSecond() {
    return this.secondValue;
  }
  
  public int simpleAddition() {
    return this.firstValue + this.secondValue; 
  }
  
  public int simpleMultiply() {
    return this.firstValue * this.secondValue; 
  }
  
}
