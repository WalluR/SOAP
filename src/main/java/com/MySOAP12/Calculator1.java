package com.MySOAP12;



import javax.jws.WebService;
import com.MySOAP12.CalculatorService1;

//Service Implementation
/**
 * @version 21.9.2019
 *Calculator service that has three methods
 */
@WebService(endpointInterface = "com.MySOAP12.CalculatorService1")
public class Calculator1 implements CalculatorService1{
    
    private int number;
   
    
    public int iterate() {
        this.number ++;
        return this.number;
    }
    
    public String setZero() {
        this.number = 0;
        return "Now 0 again!";
    }
    public int getNumber() {
        
        return this.number;
    }

}
