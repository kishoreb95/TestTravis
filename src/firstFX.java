

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.Scene;


public class firstFX extends Application{
   Label Display;
   Label Operation;
   Button button1;
   Button button2;
   Button button3;
   Button button4;
   Button button5;
   Button button6;
   Button button7;
   Button button8;
   Button button9;
   Button buttonAdd;
   Button buttonSubtract;
   Button buttonMultiply;
   Button buttonDivide;
   Button buttonEquals;
   Button button0;
   double BUTTON_PADDING = 2;
   String displayText;
   String chosenOperation = "";
   float x, y;
   int i = 1;
   public static void main(String[] args)
   {
      launch(args);
   }
   
   public void start(Stage stage) throws Exception{
      stage.setTitle("Calculator");
      displayText = "";
      Display = new Label("");
      Operation = new Label(""); 
      VBox root = new VBox(8);
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(0, 10, 0, 10));
      button0 = new Button("0");
      button1 = new Button("1");
      button2 = new Button("2");
      button3 = new Button("3");
      button4 = new Button("4");
      button5 = new Button("5");
      button6 = new Button("6");
      button7 = new Button("7");
      button8 = new Button("8");
      button9 = new Button("9");
     
      buttonAdd = new Button("+");
      buttonSubtract = new Button("-");
      buttonMultiply = new Button("x");
      buttonDivide = new Button("/");
      buttonEquals = new Button("=");
     
      button1.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
            {
               if(chosenOperation.equals("="))
               {
                  chosenOperation = "";
                  displayText = "";
               }
               displayText = displayText + "1";
               Display.setText(displayText);
            }
            });
      button2.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
            {
               if(chosenOperation.equals("="))
               {
                  chosenOperation = "";
                  displayText = "";
               }
               displayText = displayText + "2";
               Display.setText(displayText);
            }
            });
      button3.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
            {
               if(chosenOperation.equals("="))
               {
                  chosenOperation = "";
                  displayText = "";
               }
               displayText = displayText + "3";
               Display.setText(displayText);
            }
            });
      button4.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "4";
         Display.setText(displayText);
      }
      });
      button4.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "4";
         Display.setText(displayText);
      }
      });
      button5.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "5";
         Display.setText(displayText);
      }
      });
      button6.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "6";
         Display.setText(displayText);
      }
      });
      button7.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "7";
         Display.setText(displayText);
      }
      });
      button8.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "8";
         Display.setText(displayText);
      }
      });
      button9.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("="))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "9";
         Display.setText(displayText);
      }
      });
      button0.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         if(chosenOperation.equals("0"))
         {
            chosenOperation = "";
            displayText = "";
         }
         displayText = displayText + "0";
         Display.setText(displayText);
      }
      });
      buttonAdd.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         
         chosenOperation = "+";
         x = Float.parseFloat(displayText);
         displayText = "";
         Display.setText(displayText);
      }
      });
      buttonSubtract.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         chosenOperation = "-";
         x = Float.parseFloat(displayText);
         displayText = "";
         Display.setText(displayText);
      }
      });
      buttonMultiply.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         chosenOperation = "x";
         x = Float.parseFloat(displayText);
         displayText = "";
         Display.setText(displayText);
      }
      });
      buttonDivide.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         chosenOperation = "/";
         x = Float.parseFloat(displayText);
         displayText = "";
         Display.setText(displayText);
      }
      });
      buttonEquals.setOnAction(new EventHandler<ActionEvent>()
      {
      public void handle(ActionEvent event)
      {
         Calculator calc;
         y = Float.parseFloat(displayText);
         if(chosenOperation.equals("+"))
         {
            calc = new Addition();
         }
         else if(chosenOperation.equals("-"))
         {
            calc = new Subtraction();
         }
         else if(chosenOperation.equals("x"))
         {
            calc = new Multiplication();
         }
         else
         {
            calc = new Division();
         }
         float z = calc.calculate(x, y);
         System.out.println(z);
         displayText = Float.toString(z); 
         chosenOperation = "=";
         Display.setText(displayText);
      }
      });
      grid.add(Display, 0, 0);
      grid.add(button1, 0, 1, 1, 1);
      grid.add(button2, 1, 1, 1, 1);
      grid.add(button3, 2, 1, 1, 1);
      grid.add(buttonAdd, 3, 1, 1, 1);
      grid.add(button4, 0, 2, 1, 1);
      grid.add(button5, 1, 2, 1, 1);
      grid.add(button6, 2, 2, 1, 1);
      grid.add(buttonSubtract, 3, 2, 1, 1);
      grid.add(button7, 0, 3, 1, 1);
      grid.add(button8, 1, 3, 1, 1);
      grid.add(button9, 2, 3, 1, 1);
      grid.add(buttonMultiply, 3, 3, 1, 1);
      grid.add(button0, 1, 4, 1, 1);
      grid.add(buttonEquals, 2, 4, 1, 1);
      grid.add(buttonDivide, 3, 4, 1, 1);
      Scene scene = new Scene(grid);
      //root.getChildren().addAll(Display, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals);
      stage.setScene(scene);
      
      stage.show();
   }

}
