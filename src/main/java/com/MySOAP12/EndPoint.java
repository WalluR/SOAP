package com.MySOAP12;
import javax.xml.ws.Endpoint;
import com.MySOAP12.Calculator1;

public class EndPoint {
    
   
        
        public static void main(String[] args) {
           Endpoint.publish("https://arcane-journey-84857.herokuapp.com/", new Calculator1());
        }

    }


