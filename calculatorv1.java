import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener{
   
   JTextField tres;
   JButton bOne, bTwo, bThree, bFour, bFive, bSix,
           bSeven, bEight, bNine, bZero, bPlus, bMinus,
           bTimes, bDiv, bPoint, bEqual;
   JPanel p1;
   Container c = getContentPane();
   boolean zero = true;
   boolean point = false;
   boolean oper = false;
   int operNum = 0;
   double num1 = 0, num2 = 0, res = 0;
   
   Calculator(){
      super("Calculator v1");
      
      tres = new JTextField("0"); tres.setEditable(false); tres.setHorizontalAlignment(JTextField.RIGHT);
      bOne = new JButton("1"); bOne.addActionListener(this);
      bTwo = new JButton("2"); bTwo.addActionListener(this);
      bThree = new JButton("3"); bThree.addActionListener(this);
      bFour = new JButton("4"); bFour.addActionListener(this);
      bFive = new JButton("5"); bFive.addActionListener(this);
      bSix = new JButton("6"); bSix.addActionListener(this);
      bSeven = new JButton("7"); bSeven.addActionListener(this);
      bEight = new JButton("8"); bEight.addActionListener(this);
      bNine = new JButton("9"); bNine.addActionListener(this);
      bZero = new JButton("0"); bZero.addActionListener(this);
      bPlus = new JButton("+"); bPlus.addActionListener(this);
      bMinus = new JButton("-"); bMinus.addActionListener(this);
      bTimes = new JButton("*"); bTimes.addActionListener(this);
      bDiv = new JButton("/"); bDiv.addActionListener(this);
      bPoint = new JButton("."); bPoint.addActionListener(this);
      bEqual = new JButton("="); bEqual.addActionListener(this);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(4,4));
      p1.add(bSeven); p1.add(bEight); p1.add(bNine); p1.add(bDiv);
      p1.add(bFour); p1.add(bFive); p1.add(bSix); p1.add(bTimes);
      p1.add(bOne); p1.add(bTwo); p1.add(bThree); p1.add(bMinus);
      p1.add(bZero); p1.add(bPoint); p1.add(bEqual); p1.add(bPlus);
      
      c.setLayout(new BorderLayout());
      c.add(tres, BorderLayout.NORTH);
      c.add(p1, BorderLayout.CENTER);
      c.setBackground(Color.white);
      setSize(300,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }
   
   public void actionPerformed(ActionEvent e){
      StringBuffer sb = new StringBuffer();
      
      
      if(e.getSource()==bOne){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().replace("0","1"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("1"));
      }
      else if(e.getSource()==bTwo){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("2"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("2"));
      }
      else if(e.getSource()==bThree){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("3"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("3"));
      }
      else if(e.getSource()==bFour){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("4"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("4"));
      }
      else if(e.getSource()==bFive){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("5"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("5"));
      }
      else if(e.getSource()==bSix){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("6"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("6"));
      }
      else if(e.getSource()==bSeven){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("7"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("7"));
      }
      else if(e.getSource()==bEight){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("8"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("8"));
      }
      else if(e.getSource()==bNine){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("9"));
         zero = false;
         }
         else
         tres.setText(tres.getText().concat("9"));
      }
      else if(e.getSource()==bZero){
         if(oper){
         tres.setText("");
         oper = false;
         }
         if(zero){
         tres.setText("");
         tres.setText(tres.getText().concat("0"));
         }
         else
         tres.setText(tres.getText().concat("0"));
      }
      else if(e.getSource()==bPoint){
         if(!point&&zero){
         tres.setText("0.");
         point = true;
         zero = false;
         }
         else if(!point&&!zero){
         tres.setText(tres.getText().concat("."));
         point = true;
         }
      }
      else if(e.getSource()==bPlus){
         num1 = Double.parseDouble(tres.getText());
         oper = true;
         point = false;
         operNum = 1;
      }
      else if(e.getSource()==bMinus){
         num1 = Double.parseDouble(tres.getText());
         oper = true;
         point = false;
         operNum = 2;
      }
      else if(e.getSource()==bTimes){
         num1 = Double.parseDouble(tres.getText());
         oper = true;
         point = false;
         operNum = 3;
      }
      else if(e.getSource()==bDiv){
         num1 = Double.parseDouble(tres.getText());
         oper = true;
         point = false;
         operNum = 4;
      }
      else if(e.getSource()==bEqual){
         num2 = Double.parseDouble(tres.getText());
         switch(operNum){
            case 1: res = add(num1,num2); operNum = 0;
            break;
            case 2: res = sub(num1,num2); operNum = 0;
            break;
            case 3: res = pro(num1,num2); operNum = 0;
            break;
            case 4: res = div(num1,num2); operNum = 0;
            break;
         }
         tres.setText(res+"");
         zero = true;
      }
      
   }
   
   public double add(double n1, double n2){
      return n1+n2;
   }
   public double sub(double n1, double n2){
      return n1-n2;
   }
   public double pro(double n1, double n2){
      return n1*n2;
   }
   public double div(double n1, double n2){
      return n1/n2;
   }
   
   public static void main(String[]args){
      Calculator c = new Calculator();
      c.show();
   }
}