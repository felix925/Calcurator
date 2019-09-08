
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button n0;
    Button n1;
    Button n2;
    Button n3;
    Button n4;
    Button n5;
    Button n6;
    Button n7;
    Button n8;
    Button n9;
    Button plus;
    Button minus;
    Button times;
    Button divid;
    Button Clear;
    Button Back;
    Button equal;
    Button dot;
    Label formula;
    Panel text = new Panel();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();

    public MyFrame(){
        setTitle("calculator");
        setSize(800,600);
        addWindowListener(new MyWindowAdapter());
        setLayout(new GridLayout(6,1));
        add(text);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

        //Create Buttton
        plus = new Button("+");
        minus = new Button("-");
        times = new Button("×");
        divid = new Button("÷");
        n0 = new Button("0");
        n1 = new Button("1");
        n2 = new Button("2");
        n3 = new Button("3");
        n4 = new Button("4");
        n5 = new Button("5");
        n6 = new Button("6");
        n7 = new Button("7");
        n8 = new Button("8");
        n9 = new Button("9");
        Clear = new Button("Clear");
        Back = new Button("Back");
        equal = new Button("=");
        dot = new Button(".");
        //Instance Label
        formula = new Label();

        //Instance Layout
        //Dimension size = text.getSize();
        formula.setPreferredSize(new Dimension(750,100));
        formula.setFont(new Font("Century", Font.ITALIC, 30));
        n0.setFont(new Font("Century", Font.ITALIC, 24));
        n1.setFont(new Font("Century", Font.ITALIC, 24));
        n2.setFont(new Font("Century", Font.ITALIC, 24));
        n3.setFont(new Font("Century", Font.ITALIC, 24));
        n4.setFont(new Font("Century", Font.ITALIC, 24));
        n5.setFont(new Font("Century", Font.ITALIC, 24));
        n6.setFont(new Font("Century", Font.ITALIC, 24));
        n7.setFont(new Font("Century", Font.ITALIC, 24));
        n8.setFont(new Font("Century", Font.ITALIC, 24));
        n9.setFont(new Font("Century", Font.ITALIC, 24));
        plus.setFont(new Font("Century", Font.ITALIC, 24));
        minus.setFont(new Font("Century", Font.ITALIC, 24));
        times.setFont(new Font("Century", Font.ITALIC, 24));
        divid.setFont(new Font("Century", Font.ITALIC, 24));
        Clear.setFont(new Font("Century", Font.ITALIC, 24));
        Back.setFont(new Font("Century", Font.ITALIC, 24));
        equal.setFont(new Font("Century", Font.ITALIC, 24));
        dot.setFont(new Font("Century", Font.ITALIC, 24));
        //AddActionListener
        n0.addActionListener(this::actionPerformed);
        n1.addActionListener(this::actionPerformed);
        n2.addActionListener(this::actionPerformed);
        n3.addActionListener(this::actionPerformed);
        n4.addActionListener(this::actionPerformed);
        n5.addActionListener(this::actionPerformed);
        n6.addActionListener(this::actionPerformed);
        n7.addActionListener(this::actionPerformed);
        n8.addActionListener(this::actionPerformed);
        n9.addActionListener(this::actionPerformed);
        plus.addActionListener(this::actionPerformed);
        minus.addActionListener(this::actionPerformed);
        times.addActionListener(this::actionPerformed);
        divid.addActionListener(this::actionPerformed);
        Clear.addActionListener(this::actionPerformed);
        Back.addActionListener(this::actionPerformed);
        equal.addActionListener(this::actionPerformed);
        dot.addActionListener(this::actionPerformed);

        text.add(formula);
        p1.setLayout(new GridLayout(1,2));
        p1.add(Clear);
        p1.add(Back);
        p2.setLayout(new GridLayout(1,4));
        p2.add(n7);
        p2.add(n8);
        p2.add(n9);
        p2.add(plus);
        p3.setLayout(new GridLayout(1,4));
        p3.add(n4);
        p3.add(n5);
        p3.add(n6);
        p3.add(minus);
        p4.setLayout(new GridLayout(1,4));
        p4.add(n1);
        p4.add(n2);
        p4.add(n3);
        p4.add(times);
        p5.setLayout(new GridLayout(1,4));
        p5.add(n0);
        p5.add(dot);
        p5.add(equal);
        p5.add(divid);
    }
    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == n0){
            formula.setText(formula.getText() + "0");
        }
        if(ae.getSource() == n1){
            formula.setText(formula.getText() + "1");
        }
        if(ae.getSource() == n2){
            formula.setText(formula.getText() + "2");
        }
        if(ae.getSource() == n3){
            formula.setText(formula.getText() + "3");
        }
        if(ae.getSource() == n4){
            formula.setText(formula.getText() + "4");
        }
        if(ae.getSource() == n5){
            formula.setText(formula.getText()+ "5");
        }
        if(ae.getSource() == n6){
            formula.setText(formula.getText() + "6");
        }
        if(ae.getSource() == n7){
            formula.setText(formula.getText() + "7");
        }
        if(ae.getSource() == n8){
            formula.setText(formula.getText() + "8");
        }
        if(ae.getSource() == n9){
            formula.setText(formula.getText() + "9");
        }
        if(ae.getSource() == plus){
            int formulaSize = formula.getText().length();
            if(!formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                formula.setText(formula.getText() + " + ");
            }
        }
        if(ae.getSource() == minus){
            int formulaSize = formula.getText().length();
            if(!formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                formula.setText(formula.getText() + " - ");
            }
        }
        if(ae.getSource() == times){
            int formulaSize = formula.getText().length();
            if(!formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                formula.setText(formula.getText() + " × ");
            }
        }
        if(ae.getSource() == divid){
            int formulaSize = formula.getText().length();
            if(!formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                formula.setText(formula.getText() + " ÷ ");
            }
        }
        if(ae.getSource() == equal){
            Calc calcu = new Calc();
            formula.setText(calcu.calc(formula.getText()));
        }
        if(ae.getSource() == Clear){
            formula.setText("");
        }
        if(ae.getSource() == dot){
            int formulaSize = formula.getText().length();
            if(formulaSize != 0) {
                if (!formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                    formula.setText(formula.getText() + ".");
                }
            }
        }
        if(ae.getSource() == Back){
            int formulaSize = formula.getText().length();
            if (formulaSize != 0) {
                if (formula.getText().substring(formulaSize - 1, formulaSize).equals(" ")) {
                    formula.setText(formula.getText().substring(0, formulaSize - 3));
                }
                else{
                    formula.setText(formula.getText().substring(0, formulaSize - 1));
                }
            }
        }
    }

}