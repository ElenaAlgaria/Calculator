/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
   private  Float data = 0f;
   
    @FXML
 private  int operation = -1;
    
    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button point;

    @FXML
    private Button divided;

    @FXML
    private Button multi;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private Button equal;

    @FXML
    private Label label;

    @FXML
    private TextField display;

   
       @FXML
    void handleButtonAction(ActionEvent event) {
   if (event.getSource() == one){
           display.setText(display.getText() + "1");
         label.setText(label.getText() + "1");
   
   }else if(event.getSource() == two){
        display.setText(display.getText() + "2");
         label.setText(label.getText() + "2");
   
   }else if(event.getSource() == three){
       display.setText(display.getText() + "3");
         label.setText(label.getText() + "3");
   
   }else if(event.getSource() == four){
        display.setText(display.getText() + "4");
         label.setText(label.getText() + "4");
    
   }else if(event.getSource() == five){
        display.setText(display.getText() + "5");
         label.setText(label.getText() + "5");

    }else if(event.getSource() == six){
        display.setText(display.getText() + "6");
         label.setText(label.getText() + "6");

}else if(event.getSource() == seven){
        display.setText(display.getText() + "7");
         label.setText(label.getText() + "7");

    }else if(event.getSource() == eight){
        display.setText(display.getText() + "8");
         label.setText(label.getText() + "8");
    
    }else if(event.getSource() == nine){
        display.setText(display.getText() + "9");
         label.setText(label.getText() + "9");
    
    }else if(event.getSource() == zero){
        display.setText(display.getText() + "0");
         label.setText(label.getText() + "0");
         
    }else if(event.getSource() == point){
        display.setText(display.getText() + ".");
         label.setText(label.getText() + ".");     
         
    }else if(event.getSource() == clear){
       display.setText("");
       label.setText("");
   
    }else if (event.getSource() == plus){
        
        data = Float.parseFloat(display.getText());
        operation = 1; 
        display.setText("");
        label.setText(label.getText() + " + ");
      
    
    }else if (event.getSource() == minus){
        
        data = Float.parseFloat(display.getText());
        operation = 2; 
        display.setText("");
         label.setText(label.getText() + " - ");
    }else if (event.getSource() == multi){
        
        data = Float.parseFloat(display.getText());
        operation = 3; 
         display.setText("");
         label.setText(label.getText() + " * ");
   
    }else if (event.getSource() == divided){
        
        data = Float.parseFloat(display.getText());
        operation = 4; 
        display.setText("");
         label.setText(label.getText() + " / ");
         
       
    }else if (event.getSource() == equal){
        
        if(display.getText().equals("")){
        display.setText("Error");
            
        }else{
       Float secondOperand = Float.parseFloat(display.getText());
        
        
         switch (operation) {
           case 1:
              Float  ans = data + secondOperand;
               display.setText(String.valueOf(ans));
               
              
               break;
               case 2:
                ans = data - secondOperand;
               display.setText(String.valueOf(ans));
            
               break;
               case 3:
                ans = data * secondOperand;
               display.setText(String.valueOf(ans));
            
               break;
               case 4:
                   ans = 0f;
                   try{
                ans = data / secondOperand;
              }catch(Exception e){ display.setText("Error");}
                    display.setText(String.valueOf(ans));
                    
               break;
               default:
                   System.out.println("Error");
                   break;
                   
                   
           
       
        }
    }
    }
    }
    
    
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
       
}