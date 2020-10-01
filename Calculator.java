package Problem_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.Math;

/*
Links used for this problems
https://www.geeksforgeeks.org/java-swing-simple-calculator/
https://www.tutorialspoint.com/Create-a-simple-calculator-using-Java-Swing


 */

public class Calculator extends JFrame implements ActionListener{
    public static void main(String[] args) {

        Calculator test = new Calculator();
        test.setVisible(true);
    }


    private double number1;
    private double number2;
    private double todocalculation;
    private double result;
    private boolean equalspressed=false;
    private boolean sqrtpressed=false;
    private boolean inversepressed=false;

    String temp,resultstring;
    JTextArea txt =new JTextArea();
    JButton Button1 = new  JButton("1");
    JButton Button2 = new  JButton("2");
    JButton Button3 = new  JButton("3");
    JButton Button4 = new  JButton("4");
    JButton Button5 = new  JButton("5");
    JButton Button6 = new  JButton("6");
    JButton Button7 = new  JButton("7");
    JButton Button8 = new  JButton("8");
    JButton Button9 = new  JButton("9");
    JButton Button0 = new  JButton("0");
    JButton Buttonplusminus = new  JButton("+/-");
    JButton Buttondecimal = new  JButton(".");
    JButton Buttonplus = new  JButton("+");
    JButton Buttonequals = new  JButton("=");
    JButton Buttonminus = new  JButton("-");
    JButton Buttonpercent = new  JButton("%");
    JButton Buttonmultiply = new  JButton("*");
    JButton Buttondivide = new  JButton("/");
    JButton Buttoninverse = new  JButton("1/x");
    JButton Buttonsqrt = new  JButton("sqrt");
    JButton Buttonbackspace = new  JButton("Backspace");
    JButton Buttonclear = new  JButton("C");
    JButton ButtonCE = new  JButton("CE");


    JMenuBar menuBar= new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem menuitem1=new JMenuItem("Close");

    JMenu menu1= new JMenu("Help");





    public Calculator(){
        menuitem1.addActionListener(this);
        menuBar.add(menu);
        menuBar.add(menu1);
        menu.add(menuitem1);
        setJMenuBar(menuBar);

        setSize(400,500);
        setTitle("Calulator");
        setLayout(null);



       txt.setBounds(30,40,280,30);
        add(txt);
       Button1.setBounds(40,170,50,40);
        add(Button1);
       Button2.setBounds(95,170,50,40);
       add(Button2);
       Button3.setBounds(150,170,50,40);
       add(Button3);
       Buttondivide.setBounds(205,170,70,40);
       add(Buttondivide);
       Buttonsqrt.setBounds(280,170,70,40);
       add(Buttonsqrt);

       Button4.setBounds(40,240,50,40);
       add(Button4);
       Button5.setBounds(95,240,50,40);
       add(Button5);
       Button6.setBounds(150,240,50,40);
       add(Button6);
       Buttonmultiply.setBounds(205,240,70,40);
       add(Buttonmultiply);
       Buttoninverse.setBounds(280,240,70,40);
       add(Buttoninverse);

       Button7.setBounds(40,310,50,40);
       add(Button7);
       Button8.setBounds(95,310,50,40);
       add(Button8);
       Button9.setBounds(150,310,50,40);
       add(Button9);
       Buttonminus.setBounds(205,310,70,40);
       add(Buttonminus);
       Buttonpercent.setBounds(280,310,70,40);
       add(Buttonpercent);


       Button0.setBounds(40,380,50,40);
       add(Button0);
       Buttonplusminus.setBounds(95,380,50,40);
       add(Buttonplusminus);
       Buttondecimal.setBounds(150,380,50,40);
       add(Buttondecimal);
       Buttonplus.setBounds(205,380,70,40);
       add(Buttonplus);
       Buttonequals.setBounds(280,380,70,40);
       add(Buttonequals);




       Buttonbackspace.setBounds(40,100,110,40);
       add(Buttonbackspace);
       ButtonCE.setBounds(205,100,50,40);
       add(ButtonCE);
       Buttonclear.setBounds(260,100,50,40);
       add(Buttonclear);



       Button1.addActionListener(this);
       Button2.addActionListener(this);
       Button3.addActionListener(this);
       Button4.addActionListener(this);
       Button5.addActionListener(this);
       Button6.addActionListener(this);
       Button7.addActionListener(this);
       Button8.addActionListener(this);
       Button9.addActionListener(this);
       Button0.addActionListener(this);
       Buttonplusminus.addActionListener(this);
       Buttondecimal.addActionListener(this);
       Buttonplus.addActionListener(this);
       Buttonequals.addActionListener(this);
       Buttonminus.addActionListener(this);
       Buttonpercent.addActionListener(this);
       Buttonmultiply.addActionListener(this);
       Buttoninverse.addActionListener(this);
       Buttondivide.addActionListener(this);
       Buttonsqrt.addActionListener(this);
       Buttonbackspace.addActionListener(this);
       ButtonCE.addActionListener(this);
       Buttonclear.addActionListener(this);













    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getActionCommand());
        if (e.getSource()==menuitem1)
        {
          System.exit(0);
        }
        if(e.getSource()== Button1)
        {
            if(equalspressed) {
                equalspressed=false;
                txt.setText("");

            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("1"));
        }
        if(e.getSource()== Button2)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
            sqrtpressed = false;
            txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("2"));
        }
        if(e.getSource()== Button3)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("3"));
        }
        if(e.getSource()== Button4)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("4"));
        }
        if(e.getSource()== Button5)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("5"));
        }
        if(e.getSource()== Button6)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("6"));
        }
        if(e.getSource()== Button7)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("7"));
        }
        if(e.getSource()== Button8)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("8"));
        }
        if(e.getSource()== Button9)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("9"));
        }
        if(e.getSource()== Button0)
        {
            if(equalspressed)
            {
                equalspressed=false;
                txt.setText("");
            }
            if(sqrtpressed)
            {
                sqrtpressed = false;
                txt.setText("");
            }
            if(inversepressed)
            {
                inversepressed = false;
                txt.setText("");
            }
            txt.setText(txt.getText().concat("0"));
        }
        if(e.getSource()== Buttondecimal)
        {
            if(equalspressed) {
                equalspressed=false;
                txt.setText("");

            }
            txt.setText(txt.getText().concat("."));
        }
        if(e.getSource()== Buttonplus)
        {
            number1=Double.valueOf(txt.getText());
            txt.setText("");
            todocalculation=1;

        }
        if(e.getSource()== Buttonminus)
        {
            number1=Double.valueOf(txt.getText());
            txt.setText("");
            todocalculation=2;
        }
        if(e.getSource()== Buttondivide)
        {
            number1=Double.valueOf(txt.getText());
            txt.setText("");
            todocalculation=3;
        }

        if(e.getSource()== Buttonmultiply)
        {
            number1=Double.valueOf(txt.getText());
            txt.setText("");
            todocalculation=4;
        }
        if(e.getSource()== Buttonplusminus)
        {
            number1=Double.valueOf(txt.getText());
            result = (number1*-1);
            txt.setText(String.valueOf(result));

        }
        if(e.getSource()== Buttonpercent)
        {
          number1=Double.valueOf(txt.getText());
          result=number1/100;
          txt.setText(String.valueOf(result));
        }
        if(e.getSource()== Buttonsqrt)
        {

            number1=Double.valueOf(txt.getText());
            result = Math.sqrt(number1);
            sqrtpressed=true;
            txt.setText(String.valueOf(result));

        }
        if(e.getSource()== Buttoninverse)
        {
            number1=Float.valueOf(txt.getText());

            result = Math.pow(number1,-1);
            inversepressed=true;
            txt.setText(String.valueOf(result));

        }
        if(e.getSource()== ButtonCE)
        {
            txt.setText("");

        }
        if(e.getSource()== Buttonclear)
        {
            number1= 0;
            number2 = 0;
            txt.setText("");

        }
        if(e.getSource()== Buttonbackspace)
        {

           temp =txt.getText();

           resultstring=temp.substring(0,temp.length()-1);
           txt.setText(resultstring);


        }

        if(e.getSource()==Buttonequals)
        {
            equalspressed=true;

            if (todocalculation==1)
            {
                number2=Double.valueOf(txt.getText());
                result=number1 + number2;
                txt.setText(String.valueOf(result));
            }
            if (todocalculation==2)
            {
                number2=Double.valueOf(txt.getText());
                result=number1 - number2;
                txt.setText(String.valueOf(result));
            }
            if (todocalculation==3)
            {
                number2=Double.valueOf(txt.getText());
                result=number1 / number2;
                txt.setText(String.valueOf(result));
            }
            if (todocalculation==4)
            {
                number2=Double.valueOf(txt.getText());
                result=number1 * number2;
                txt.setText(String.valueOf(result));
            }
        }






    }



}
