
/*****************************************
******************************************
**					               **
**	     INDEX NO: 11194		     **
**            AM 3002		       	**
**		EXCERCISE 01	               **
**					               **
******************************************
*****************************************/

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class CalUNI extends JFrame implements ActionListener{


//adding components for calculator

     JTextField output         = new JTextField("");
     JButton addi              = new JButton("+");
     JButton sub               = new JButton("-");
     JButton mul               = new JButton("*");
     JButton div               = new JButton("/");
     JButton equal             = new JButton("=");
     JButton clear             = new JButton("clear");
     JButton expo              = new JButton("x^y");
     JButton min               = new JButton("MIN(x,y)");
     JButton gcd               = new JButton("gcd(x,y)");
     JButton prime             = new JButton("isPrime");
     JButton num0              = new JButton("0");
     JButton num1              = new JButton("1");
     JButton num2              = new JButton("2");
     JButton num3              = new JButton("3");
     JButton num4              = new JButton("4");
     JButton num5              = new JButton("5");
     JButton num6              = new JButton("6");
     JButton num7              = new JButton("7");
     JButton num8              = new JButton("8");
     JButton num9              = new JButton("9");
     JButton enter             = new JButton("enter");
     Panel controlPanel        = new Panel();
     JButton eqtion            = new JButton("SolveEq");
	JButton isEven            = new JButton("isEven");
	JButton sumOfDigit        = new JButton("DSUM");
	JButton raspt             = new JButton("1/x");
     JButton perfect           = new JButton("Perfect");
     JButton palindrom         = new JButton("Palindrome");
     JLabel hide               = new JLabel();

     
     // creating variables for calculations
     
     double num = 0;
     double sum = 0;
     int      c;
     
     

   // contructor  for run calculator
     public CalUNI(){
     
      super("Calculator");
      setSize(370, 450);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 
	 //setting font properties for output field
	 Font font1 = new Font("Serif", Font.PLAIN, 16);
	 
	 //set font in to the output field
	 output.setFont(font1);
	 
	 //change default size of the output field
	 output.setPreferredSize(new Dimension(320, 40));

      
      //change default size of the hidden label
      hide.setPreferredSize(new Dimension(320, 25));
      
	 //creating a grid layout  for to add output field and hide label 
	 GridLayout layout3 = new GridLayout(1,2);
      layout3.setHgap(10);
      layout3.setVgap(10); 
	
	 // creatting a panel for to add output field and hide label
	 Panel panel3 = new Panel();
	 
	 //setting panel3 layout
      panel3.setLayout(layout3);
      
      //setting panel3 size
	 panel3.setSize(300,40);
	 
	 //adding output field to the panel3
	 panel3.add(output);
	 
	 //creating grid layout for to add hide label and change default properties
      GridLayout layout2 = new GridLayout(1,1);
      layout2.setHgap(10);
      layout2.setVgap(10);
      
      
      //creating panel2 and adding hide label in to the panel2
      Panel panel2 = new Panel();
      panel2.setSize(300,40);
      panel2.setLayout(layout2);
      panel2.add(hide);
      
     
      // setting main panel(controlpanel) layout
      controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	
      /*
       *  create panel and change it's default size
       *  create a gridlayout and setting it's properties
       */	
      Panel panel = new Panel();
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(0,3);
      layout.setHgap(10);
      layout.setVgap(10);
      panel.setLayout(layout);   
      
      //adding componets in to the panel     
      addi.addActionListener(this);
      panel.add(addi);
      
      sub.addActionListener(this);
      panel.add(sub);
      
      mul.addActionListener(this);
      panel.add(mul);
      
      div.addActionListener(this);
      panel.add(div);
      
      expo.addActionListener(this);
      panel.add(expo);
      
      raspt.addActionListener(this);
      panel.add(raspt);
  
      num0.addActionListener(this);
      panel.add(num0);
      
      num1.addActionListener(this);
      panel.add(num1);
      
      num2.addActionListener(this);
      panel.add(num2);
      
      num3.addActionListener(this);
      panel.add(num3);
      
      num4.addActionListener(this);
      panel.add(num4);
      
      num5.addActionListener(this);
      panel.add(num5);
      
      num6.addActionListener(this);
      panel.add(num6);
      
      num7.addActionListener(this);
      panel.add(num7);
      
      num8.addActionListener(this);
      panel.add(num8);
      
      num9.addActionListener(this);
      panel.add(num9);

      clear.addActionListener(this);
      panel.add(clear);
      
      equal.addActionListener(this);
      panel.add(equal);
      
      gcd.addActionListener(this);
      panel.add(gcd);
      
      prime.addActionListener(this);
      panel.add(prime);
	      
      min.addActionListener(this);
      panel.add(min);	

      isEven.addActionListener(this);
      panel.add(isEven);
      
      sumOfDigit.addActionListener(this);
      panel.add(sumOfDigit);

      enter.addActionListener(this);
      panel.add(enter);
      
      perfect.addActionListener(this);
      panel.add(perfect);
      
      palindrom.addActionListener(this);
      panel.add(palindrom);
      
      eqtion.addActionListener(this);
      panel.add(eqtion);
      
      //adding panel ,panel2 and panel3 in to the controlpanel
      controlPanel.add(panel3);
      controlPanel.add(panel2);
      controlPanel.add(panel);
      
      //adding controlpanel in to the JFrame Object
      add(controlPanel);
      setResizable(false);    
      setVisible(true);
     
     }
     
     //create a method for to handle events componets in the frame
     public void actionPerformed(ActionEvent event){
     
     String command = event.getActionCommand();
  
	if (command == "0"){
		num = num *10 + 0;
		output.setText(String.valueOf(num));
	}
	if (command == "1"){	
	
	     num = num *10 + 1;
		output.setText(String.valueOf(num));
	
	}
	if (command == "2"){
		num = num *10 + 2;
		output.setText(String.valueOf(num));
	}
	if (command == "3"){
		num = num *10 + 3;
		output.setText(String.valueOf(num));
	}
	if (command == "4"){
		num = num *10 + 4;
		output.setText(String.valueOf(num));
	}
	if (command == "5"){
		num = num *10 + 5;
		output.setText(String.valueOf(num));
	}
	if (command == "6"){
		num = num *10 + 6;
		output.setText(String.valueOf(num));
	}
	if (command == "7"){
		num = num *10 + 7;
		output.setText(String.valueOf(num));
	}
	if (command == "8"){
		num = num *10 + 8;
		output.setText(String.valueOf(num));
	}
	if (command == "9"){
		num = num *10 + 9;
		output.setText(String.valueOf(num));
	}
	
	// for basic operations
	if (command =="+"){
	     output.setText("");
	     sum = num;
	     num = 0;
	     c   = 0;
	}
	
	if (command =="-"){
	     output.setText("");
	     sum = num;
	     num = 0;
	     c   = 1;
	}
	
	if (command =="*"){
	     output.setText("");
	     sum = num;
	     num = 0;
	     c   = 2;
	}
	
	if (command =="/"){
	     output.setText("");
	     sum = num;
	     num = 0;
	     c   = 3;
	}
	
	     //for clear 
	if(command =="clear"){
	     output.setText("");
	     hide.setText("");
	     num = 0;
		sum = 0;
		repaint();
		}
		
		//for power find button
     if(command =="x^y"){
	     output.setText("");
	     sum = num;
	     num = 0;
	     c   = 5;
	}
           // for min(x,y) button	
	if(command =="MIN(x,y)"){
	     
	     output.setText("");
	     
	     c = 4;
	     if(c==4){
	     hide.setText("Please enter y and press enter "); 
	     sum = num;
	     num = 0;
	     
	     }
	    
     }   
     
         // for gcd(x,y) button
     if(command =="gcd(x,y)"){
     
          output.setText("");
	     hide.setText("Please enter y and press enter "); 
	     sum = num;
	     num = 0;
         c = 6;
     }  
     //solve quadric equations
	if(command == "SolveEq"){
	     hide.setText("solutions of ax^2+bx+1 = 0 equation");
	     output.setText("Enter 'a'and press 'eneter'" );
	     c = 7;
	}
	     // for enter button
	  if(command =="enter"){
	         
	      if(c==4){
	          hide.setText("fist num = "+sum+" second num = "+num);
	          double min = Math.min(sum,num);
	          output.setText("the minimum num is "+min);
	          
	          if(sum>num)
	          output.setText("the minimum num is "+num);
	          else
	          output.setText("the minimum num is "+sum);

               }
       if(c==6){
	      hide.setText("fist num = "+sum+" second num = "+num);
	      int gcd = 1;
	          if(sum>num){
	               for(int i=2;i<sum;i++){
	                  if(sum%i==0 && num%i==0)
	                    gcd = i;  
	               }  
	          }
	          else{
	               for(int i=2;i<num;i++){
	                  if(sum%i==0 && num%i==0)
	                    gcd = i;  
	               }
	          }
	          
	      output.setText("the gcd is "+gcd);
	      }
	      
	     if(c==7){
               output.setText("Enter 'b'and press '='" );
               sum = num;
               
               num = 0;
               c   = 8;
               }         
	     }
	  //for find a number is prime?
	 if(command=="isPrime"){
	    
	     int flag = 0;
	    for(int i = 2;i<num;i++){
	    
	     if(num%i==0)
	       flag = 1;
          } 
	    if(flag == 1)
	    
	          output.setText(num+" is not a prime");
	    else
	          output.setText(num+" is a prime");

	  }      	
	  
     //for find a number is even?
 
	if(command =="isEven"){
	    if(num%2==0){
		output.setText(num+" is an even number");

	}
	else{
		output.setText(num+" is not is an even number");
		}

	}

	if(command == "1/x"){
	double x;
	 x= 1/num;
	output.setText(String.valueOf(x));
	
	}
	//find sum of the digit
	if(command =="DSUM"){
	int m =0;
	int s = (int)(num);
     int k;

	while(s !=0){
	k = s%10;
	m = m+k;
	s = s/10;
	output.setText(String.valueOf(m));		
	
	}

	num =0;
     }
     
     //find a number is palindrome?
     
     if(command =="Palindrome"){
          int s =(int)num;
          String  k = Integer.toString(s);     
          int flag = 1;
          for(int i=0;i<k.length()/2;i++){
               if(k.charAt(i)!= k.charAt(k.length()-1-i))
                   flag = 0;
          }
          
          if(flag == 0)
               output.setText(k+" is not a palindrome");
          else
               output.setText(k+" is a palindrome");
             
          num = 0;   
              
     }
     
     // find a number is perfet? 
     if(command=="Perfect"){
          int sum = 0;
          for(int i=1;i<num;i++){
               if(num %i==0){
               
               sum = sum +i;
               }

          }
          
          if(sum == num)
               output.setText(num+" is a perfect number");
          
          else
               output.setText(num+" is not a perfect number");
     
     }
     //for equal button actions
	if(command =="="){
	     if(c == 0){
	        sum = sum + num;
	        num = sum;
	        output.setText(String.valueOf(sum));
	     }
	     if(c == 1){
	        sum = sum - num;
	        num = sum;
	        output.setText(String.valueOf(sum));
	     }
	     if(c == 2){
	        sum = sum * num;
	        num = sum;
	        output.setText(String.valueOf(sum));
	        }
	     if(c == 3){
	          sum = sum / num;
	          num = sum;
	          output.setText(String.valueOf(sum));
	     }
	     if(c==4){
	          double min=Math.min(sum,num);
		       hide.setText("fist num = "+sum+" second num = "+num);
		       num = sum;
	            output.setText(String.valueOf(sum));
	    }
	     
	     if(c== 5){
	         
	         sum =(int) Math.pow(sum, num);
	         num = sum;
	         output.setText(String.valueOf(sum));
	         }
	     // for ax^2+bx+1 equation's solutions
	     if(c==8){
	     
	          double a  = sum;
	          double b  = num;
	          double x1;
	          double x2;
      	     double d = (b*b)-(4*a);
	          if(d == 0){
	             x1 = x2 = -b/(2*a) ;
	          output.setText("x1 = x2 = "+x1);   
	     }
	     if(d >0){
	     
	         x1 = (-b-Math.sqrt(d))/(2*a);
	         x2 = (b-Math.sqrt(d))/(2*a);
              output.setText("x1 = "+round(x1,3)+", x2 = "+round(x2,3));
	     }
	     if(d<0){
	                  x1 =  -b/(2*a);
	                  double x3 =  Math.sqrt(-d)/(2*a);
	                  x2 =  b/(2*a);
                       output.setText("x1 = "+round(x1,3)
                       +" +- "+round(x3,3)+"i , x2 = "
                       + round(x2,3)+" +- "+round(x3,3)
                       +"i");
	           }
	           num = sum = 0;
	       }
	     
	     }	
     }
     
     public static void main(String []agrs){
               CalUNI cal = new CalUNI();
     
     } 
     
     // rounding values in to the 3 decimal places
    public double round(double value, int places) {
    
         /*    
               this method is used for 
               throw an exception is occurred
               when an illlegal places value is entered
        */
         if (places < 0) throw new IllegalArgumentException();
         long factor = (long) Math.pow(10, places);
         value = value * factor;
         long tmp = Math.round(value);
           
         return (double) tmp / factor;
     }   

}

