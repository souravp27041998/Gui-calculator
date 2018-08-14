/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Sourav
 */
public class FXMLDocumentcalController implements Initializable {
                String s;
                StringTokenizer st;
                float res;
                int flag=0;
                
                
        @FXML
        private Button clear;

        @FXML
        private Button exit;

        @FXML
        private Button b0;

        @FXML
        private Button b1;

        @FXML
        private Button b2;

        @FXML
        private Button b3;

        @FXML
        private Button b4;

        @FXML
        private Button b5;
        
        @FXML
        private Button b6;
        
        @FXML
        private Button b7;

        @FXML
        private Button b8;

        @FXML
        private Button b9;
  

        @FXML
        private Button equ;

        @FXML
        private Button dot;
        
        @FXML
        private Button mul;
    
       @FXML
       private Button sub;

       @FXML
        private Button add;
       
       @FXML
       private Button div;

       @FXML
       private TextField tf;

       @FXML
       private Label lab1;



       
            @FXML
            void handleexit(ActionEvent event) {
              System.exit(0);
            }
    
            @FXML
            void handleclear(ActionEvent event) {
                   tf.clear();
                   lab1.setText("");
            }


            @FXML
            void handleadd(ActionEvent event) {
                  tf.appendText("+");
            }

            @FXML
            void handleb0(ActionEvent event) {
                  tf.appendText("0");
            }

            @FXML
            void handleb1(ActionEvent event) {
                tf.appendText("1");
            }

            @FXML
            void handleb2(ActionEvent event) {
                      tf.appendText("2");
            }

            @FXML
            void handleb3(ActionEvent event) {
                 tf.appendText("3");
            }

            @FXML
            void handleb4(ActionEvent event) {
                 tf.appendText("4");
            }

            @FXML
            void handleb5(ActionEvent event) {
                    tf.appendText("5");
            }

            @FXML
            void handleb6(ActionEvent event) {
                  tf.appendText("6");
            }

            @FXML
            void handleb7(ActionEvent event) {
                  tf.appendText("7");
            }

            @FXML
            void handleb8(ActionEvent event) {
                 tf.appendText("8");
            }

            @FXML
            void handleb9(ActionEvent event) {
                    tf.appendText("9");
            }

            @FXML
            void handlediv(ActionEvent event) {
                 tf.appendText("/");
            }

            @FXML
            void handledot(ActionEvent event) {
                  tf.appendText(".");
            }

            @FXML
            void handleequ(ActionEvent event) {
                   
                   s=tf.getText();
                   st=new  StringTokenizer(s,"+,-,*,/",true);
                   res=Float.parseFloat(st.nextToken());
                           while(st.hasMoreTokens()){
                                     switch(st.nextToken()){
                                        case "+":res=res+Float.parseFloat(st.nextToken());
                                                break;
                                        case "-":res=res-Float.parseFloat(st.nextToken());
                                                break;
                                        case "*":res=res *Float.parseFloat(st.nextToken());
                                                break;
                                        case "/":res=res /Float.parseFloat(st.nextToken());
                                                break;
                                        default:Alert alert=new Alert(AlertType.ERROR);
                                                alert.setContentText("some error found!!");
                                                alert.showAndWait();
                                                flag=1;
                                       }
                            }
              
                            if(flag==0)
                            lab1.setText(String.valueOf(res));

            }

            @FXML
            void handlemul(ActionEvent event) {
                 tf.appendText("*");
            }
 
            @FXML
            void handlesub(ActionEvent event) {
                 tf.appendText("-");
            }
    
            @FXML
            void handletf(ActionEvent event) {
             
                 s=tf.getText();
                 st=new  StringTokenizer(s,"+,-,*,/",true);
                 res=Float.parseFloat(st.nextToken());
                            while(st.hasMoreTokens()){
                                    switch(st.nextToken()){
                                        case "+":res=res+Float.parseFloat(st.nextToken());
                                                 break;
                                        case "-":res=res-Float.parseFloat(st.nextToken());
                                                 break;
                                        case "*":res=res *Float.parseFloat(st.nextToken());
                                                 break;
                                        case "/":res=res /Float.parseFloat(st.nextToken());
                                                 break;
                                        default:Alert alert=new Alert(AlertType.ERROR);
                                                alert.setContentText("some error found!!");
                                                alert.showAndWait();
                                                flag=1;
                                    }
                            }
           
                         if(flag==0)
                         lab1.setText(String.valueOf(res));

           }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
