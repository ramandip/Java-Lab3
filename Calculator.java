import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

// Using Swing examples posted on ecentennial Swing 13 GridBag (Calculator)\

public class Calculator extends JFrame implements ActionListener {

	static double op1 = 0.1, op2 = 0.2;
	private JButton btn[] = new JButton[25];//
	private JButton bsp = new JButton("Backspace");
	private JButton ce = new JButton("CE");
	private JButton clear = new JButton("Clear");
	int index = 0, code;

	private String lblName[] = { "MC", "MR", "MS", "M+", "M-",//
			"7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };

	private JLabel result = new JLabel();//

	private JTextField tDisplay = new JTextField(20);
	private int operation = 0;
							 

	public Calculator() {

		// Set the GridBagLayout for the frame
		GridBagLayout gridBag = new GridBagLayout();
		setLayout(gridBag);

		// constraints for the text field display
		GridBagConstraints Constr1 = new GridBagConstraints();
		Constr1.gridx = 0; // first column
		Constr1.gridy = 0; // first row
		Constr1.gridwidth = 5; // number of cells in the row that will be
								// covered
		Constr1.gridheight = 1; // number of cells in the column
		Constr1.fill = GridBagConstraints.HORIZONTAL; // resize the component
														// horozontally
		// add the text field
		gridBag.setConstraints(tDisplay, Constr1); // apply the constraints to
													// the grid
		add(tDisplay);

		// constraints for the backspace button
		GridBagConstraints Constr2 = new GridBagConstraints();
		Constr2.gridx = 0; // first column
		Constr2.gridy = 1; // second row

		Constr2.gridwidth = 2; // number of cells in the row that will be
								// covered
		Constr2.gridheight = 1; // number of cells in the column
		Constr2.fill = GridBagConstraints.HORIZONTAL; // resize the component
														// horizontally
		Constr2.insets = new Insets(3, 3, 3, 3);
		// //add the backspace button
		gridBag.setConstraints(bsp, Constr2);
		add(bsp);

		// constraints for the CE button
		GridBagConstraints Constr3 = new GridBagConstraints();
		Constr3.gridx = 2; // starts at third column
		Constr3.gridy = 1; // second row

		Constr3.gridwidth = 1; // number of cells in the row that will be
								// covered
		Constr3.gridheight = 1; // number of cells in the column
		Constr3.fill = GridBagConstraints.HORIZONTAL; // resize the component
														// horizontally
		Constr3.insets = new Insets(3, 3, 3, 3);
		// add the CE button
		gridBag.setConstraints(ce, Constr3);
		add(ce);

		// constraints the clear button
		GridBagConstraints Constr4 = new GridBagConstraints();
		Constr4.gridx = 3; // starts at fourth column
		Constr4.gridy = 1; // second row

		Constr4.gridwidth = 2;
		Constr4.gridheight = 1;
		Constr4.fill = GridBagConstraints.BOTH; // make the component fill its
												// display area entirely
		Constr4.insets = new Insets(3, 3, 3, 3);

		// add the clear button
		gridBag.setConstraints(clear, Constr4);
		add(clear);

		// add the numerical pad
		for (int i = 1; i <= 5; i++)//
		{
			for (int j = 1; j <= 5; j++) {
				GridBagConstraints constrNum = new GridBagConstraints();
				constrNum.gridx = j - 1; // column number
				constrNum.gridy = i + 1; // row number
				constrNum.gridwidth = 1;
				constrNum.gridheight = 1;
				constrNum.fill = GridBagConstraints.BOTH;
				constrNum.insets = new Insets(3, 3, 3, 3); // inset from the
															// top,left,bottom,
															// right

				btn[index] = new JButton(lblName[index]);

				gridBag.setConstraints(btn[index], constrNum);
				add(btn[index]);
				index = index + 1;

			}
		}
		for (int index = 0; index < 25; index++) {
			btn[index].addActionListener(this);
		}
		clear.addActionListener(this);
		ce.addActionListener(this);
		bsp.addActionListener(this);

	} // constructor

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.setTitle("Calculator");
		calc.setSize(300, 300);
		calc.setVisible(true);
	}

	

	@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==btn[15]){
	if( op1 == Double.parseDouble(tDisplay.getText()))
	{
	tDisplay.setText("1");}
    else{
	tDisplay.setText(tDisplay.getText().concat("1"));
	}
	}
	
	if(arg0.getSource()==btn[16]){
		if( op1 == Double.parseDouble(tDisplay.getText()))
		{
		tDisplay.setText("2");}
       else{
		tDisplay.setText(tDisplay.getText().concat("2"));
	
		}
	}
	
	
	if(arg0.getSource()==btn[17]){
		code=3;
		if( op1==Double.parseDouble(tDisplay.getText()))
		{
		tDisplay.setText("3");}
        
	else{
		tDisplay.setText(tDisplay.getText().concat("3"));
	}
	}
	
	if(arg0.getSource()==btn[10]){
		
		
		
		if( op1 == Double.parseDouble(tDisplay.getText()))
			{
			tDisplay.setText("4");}
	        
		else{
			tDisplay.setText(tDisplay.getText().concat("4"));
		}
	}
	if(arg0.getSource()==btn[11]){
		

		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("5");
		}else{
        tDisplay.setText(tDisplay.getText().concat("5"));}
	
	
	
	}
	if(arg0.getSource()==btn[12]){
		
		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("6");
		}
		else{
        tDisplay.setText(tDisplay.getText().concat("6"));}
	}
	if(arg0.getSource()==btn[5]){
		
		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("7");
		}
		else{
        tDisplay.setText(tDisplay.getText().concat("7"));}
	}
	if(arg0.getSource()==btn[6]){
		
		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("8");
		}
		else{
        tDisplay.setText(tDisplay.getText().concat("8"));}
	}
	if(arg0.getSource()==btn[7]){
		
		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("9");
		}
		else{
	    tDisplay.setText(tDisplay.getText().concat("9"));}
	}
	if(arg0.getSource()==btn[20]){
		
		if(Double.parseDouble(tDisplay.getText())==0){
			tDisplay.setText("0");
		}
		else{
        tDisplay.setText(tDisplay.getText().concat("0"));}
	}
	if(arg0.getSource()==btn[22])
	{
		if(op1==Double.parseDouble(tDisplay.getText())){
			tDisplay.setText("0.");
		}
		
		else{
        tDisplay.setText(tDisplay.getText().concat("."));
	}}
	
	if(arg0.getSource()==btn[19]){//1/x
		
		op2=Double.parseDouble(tDisplay.getText());
        op1=1.0/op2;
        tDisplay.setText(""+op1);
        }

	////////////////////////////////////////////////////
	if(arg0.getSource()==btn[21])//+/-
	{
		if(Double.parseDouble(tDisplay.getText())!=0.0||tDisplay.getText()!="")
		{
			double temp=Double.parseDouble(tDisplay.getText());
			temp*=-1;
			tDisplay.setText(""+temp);
		}
	}
	
	if(arg0.getSource()==btn[9])//sqrt
	{
		op1 = Math.sqrt(Double.parseDouble(tDisplay.getText())); 
		
		        tDisplay.setText(Double.toString(op1));
	}
	if(arg0.getSource()==bsp)//backspace
	{
		String s=tDisplay.getText();
		tDisplay.setText(""); 
		for(int i=0;i<s.length()-1;i++)
			tDisplay.setText(tDisplay.getText()+s.charAt(i));
	}

	////////////////////////////////////////////////////
	if(arg0.getSource()==btn[8])//Divide
		{
		
	if(op1!=0&&op2!=0&&operation!=0)
	{
		
		op2=Double.parseDouble(tDisplay.getText());_equal();operation=4;tDisplay.setText(""+op1);
	}
	else {if(operation>0){
		op2=Double.parseDouble(tDisplay.getText());
		_equal();
		operation=4;
		tDisplay.setText(""+op1);
	}else{
		
		op1=Double.parseDouble(tDisplay.getText());
		operation=4;
		tDisplay.setText("/");
	}
	}}
	if(arg0.getSource()==btn[13])//Multiply
		{
		if(op1!=0&&op2!=0&&operation!=0)
		
		{
			
			op2=Double.parseDouble(tDisplay.getText());_equal();operation=3;tDisplay.setText(""+op1);
		}
		else {if(operation>0){
			op2=Double.parseDouble(tDisplay.getText());
			_equal();
			operation=3;
			tDisplay.setText(""+op1);
		}else{
			
			op1=Double.parseDouble(tDisplay.getText());
			operation=3;
			tDisplay.setText("*");
		}
		}}
		
	if(arg0.getSource()==btn[18])//Minus
		{
	
	if(op1!=0&&op2!=0&&operation!=0)
	{
		
		op2=Double.parseDouble(tDisplay.getText());_equal();operation=2;tDisplay.setText(""+op1);
	}
	else {if(operation>0){
		op2=Double.parseDouble(tDisplay.getText());
		_equal();
		operation=2;
		tDisplay.setText(""+op1);
	}else{
		
		op1=Double.parseDouble(tDisplay.getText());
		operation=2;
		tDisplay.setText("-");
	}
	}}
	
	//////////////////////////////////////////////////////
	if(arg0.getSource()==btn[23])//Plus
	{
	if(op1!=0&&op2!=0&&operation!=0)
	{
		
		op2=Double.parseDouble(tDisplay.getText());_equal();operation=1;tDisplay.setText(""+op1);
	}
	else {if(operation>0){
		op2=Double.parseDouble(tDisplay.getText());
		_equal();
		operation=1;
		tDisplay.setText(""+op1);
	}else{
		
		op1=Double.parseDouble(tDisplay.getText());
		operation=1;
		tDisplay.setText("+");
	}
	}
	}
	//////////////////////////////////////////////////////
	if(arg0.getSource()==clear)
        {tDisplay.setText("");
	op1=0;
	op2=0;
	operation=0;}
	if(arg0.getSource()==ce)//
		{operation=5;
        tDisplay.setText("Enter operator");}
	
	if(arg0.getSource()==btn[24])//equal
	{
        op2=Double.parseDouble(tDisplay.getText());
        _equal();
        operation=5;
        
    
        tDisplay.setText(""+op1);
}

	}

	private void check() {
		if (operation > 4)
			tDisplay.setText("");
		operation -= 5;

	}

	private void _equal() {
		// TODO Auto-generated method stub
		switch (operation) {
		case 1:
			op1 += op2;
			
			
			break;

		case 2:
			op1 -= op2;
			
			
			break;

		case 3:
			op1 *= op2;
			
			break;

		case 4:
			if (op2 != 0.0) {
				op1 /= op2;
				
				break;
			}

		
			

		default:
			operation = 0;
		}
	}
} 
