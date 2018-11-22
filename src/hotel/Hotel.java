package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtFriedRice;
	private JTextField txtShawarma;
	private JTextField txtChicken;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
	
	double firstnum; 
	double secondnum;
	double result;
	String operations; 
	String answer;
	
	double Nigerian_Naira = 360.00;
	double Kenyan_Shilling = 101.00;
	double Chinese_Yuan = 6.29;
	double Indian_Rupee = 65.02;
			
	private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void datetime()
	{
		Thread datetime = new Thread()
		{
			public void run()
			{
				try
				{
					for(;;)
					{
						Calendar cal = new GregorianCalendar();
						int day = cal.get(Calendar.DAY_OF_MONTH);
						int month = cal.get(Calendar.DAY_OF_MONTH);
						int year = cal.get(Calendar.YEAR);
						int second = cal.get(Calendar.SECOND);
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR);
						
						lblClock.setText("Time:" + hour + ":" + minute + ":" + second + "       " + year + "/" + month + "/" + day); 
						sleep(1000);
						
					}
				}
				catch(Exception e)
				{
					
				}
			}
				};
				datetime.start();
	}

	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(0, 72, 509, 678);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 489, 654);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(0, 23, 483, 55);
		panel_2.add(txtDisplay);
		
		JButton button_percent = new JButton("%");
		button_percent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			
			}
		});
		button_percent.setFont(new Font("Tahoma", Font.BOLD, 50));
		button_percent.setBounds(260, 82, 100, 100);
		panel_2.add(button_percent);
		
		JButton button_clean = new JButton("C");
		button_clean.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
				
			}
		});
		button_clean.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_clean.setBounds(137, 82, 100, 100);
		panel_2.add(button_clean);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			
		    public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		button_plus.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_plus.setBounds(383, 82, 100, 100);
		panel_2.add(button_plus);
		
		JButton button_backspace = new JButton("<-");
		button_backspace.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			if(txtDisplay.getText().length()>0)
			{
				String backspace = null;
				
				StringBuilder strB = new StringBuilder(txtDisplay.getText());
				strB.deleteCharAt(txtDisplay.getText().length()-1);
				backspace = strB.toString();
				txtDisplay.setText(backspace);
			}
		}
	});
		
		
		button_backspace.setFont(new Font("Tahoma", Font.BOLD, 50));
		button_backspace.setBounds(0, 82, 100, 100);
		panel_2.add(button_backspace);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_7.setBounds(0, 193, 100, 100);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_8.setBounds(137, 193, 100, 100);
		panel_2.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_9.setBounds(260, 193, 100, 100);
		panel_2.add(button_9);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		
		button_minus.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_minus.setBounds(383, 193, 100, 100);
		panel_2.add(button_minus);
		
		JButton button_multiple = new JButton("X");
		button_multiple.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "x";
			}
		});
		button_multiple.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_multiple.setBounds(383, 304, 100, 100);
		panel_2.add(button_multiple);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_6.setBounds(260, 304, 100, 100);
		panel_2.add(button_6);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_5.setBounds(137, 304, 100, 100);
		panel_2.add(button_5);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_4.setBounds(0, 304, 100, 100);
		panel_2.add(button_4);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_1.setBounds(0, 415, 100, 100);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_2.setBounds(137, 415, 100, 100);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_3.setBounds(260, 415, 100, 100);
		panel_2.add(button_3);
		
		JButton button_division = new JButton("/");
		button_division.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		button_division.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_division.setBounds(383, 415, 100, 100);
		panel_2.add(button_division);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 String answer;
				 secondnum = Double.parseDouble(txtDisplay.getText()); 
				 if(operations == "+")
				 { 
					 result = firstnum + secondnum; 
					 answer = String.format("%.2f", result); 
					 txtDisplay.setText(answer);
					 } 
				 else if(operations == "-") 
				 { 
					 result = firstnum - secondnum;
				     answer = String.format("%.2f", result);     
				     txtDisplay.setText(answer);
				     }
				 else if(operations == "x")
				 { 
					 result = firstnum * secondnum;
					 answer = String.format("%.2f", result);
					 txtDisplay.setText(answer);
					 }
				 else if(operations == "/")
				 { 
					 result = firstnum / secondnum;
					 answer = String.format("%.2f", result);
					 txtDisplay.setText(answer); 
					 } 
				 else if(operations == "%")
				 { 
					 result = firstnum % secondnum;
					 answer = String.format("%.2f", result);
					 txtDisplay.setText(answer);                          } 
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 70));
		button.setBounds(383, 526, 100, 100);
		panel_2.add(button);
		
		JButton button_plusminus = new JButton("\u00B1");
		button_plusminus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus*(-1);
				txtDisplay.setText(String.valueOf(plusminus));
			}
		});
		button_plusminus.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_plusminus.setBounds(260, 526, 100, 100);
		panel_2.add(button_plusminus);
		
		JButton button_coma = new JButton(".");
		button_coma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterValue = txtDisplay.getText()+ button_coma.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_coma.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_coma.setBounds(137, 526, 100, 100);
		panel_2.add(button_coma);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
				String EnterValue = txtDisplay.getText()+button_0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		button_0.setFont(new Font("Tahoma", Font.BOLD, 70));
		button_0.setBounds(0, 526, 100, 100);
		panel_2.add(button_0);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea ReceiptArea = new JTextArea();
		ReceiptArea.setBounds(10, 21, 450, 567);
		panel_4.add(ReceiptArea);
		ReceiptArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_3.setBounds(513, 471, 903, 279);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
		btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTotalCostOfMeal.setBounds(29, 62, 171, 31);
		panel_3.add(btnTotalCostOfMeal);
		
		JLabel btnTotalCostOfDrink = new JLabel("Total Cost of Drink");
		btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTotalCostOfDrink.setBounds(29, 104, 171, 31);
		panel_3.add(btnTotalCostOfDrink);
		
		JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
		btnCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCostOfDelivery.setBounds(29, 146, 171, 31);
		panel_3.add(btnCostOfDelivery);
		
		JLabel btnCostOfRoom = new JLabel("Cost of Room");
		btnCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCostOfRoom.setBounds(29, 188, 171, 31);
		panel_3.add(btnCostOfRoom);
		
		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfMeal.setBounds(291, 62, 204, 31);
		panel_3.add(txtTotalCostOfMeal);
		
		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfDrink.setBounds(291, 104, 204, 31);
		panel_3.add(txtTotalCostOfDrink);
		
		JLabel txtCostOfDelivery = new JLabel("");
		txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfDelivery.setBounds(291, 146, 204, 31);
		panel_3.add(txtCostOfDelivery);
		
		JLabel txtCostOfRoom = new JLabel("");
		txtCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfRoom.setBounds(291, 188, 204, 31);
		panel_3.add(txtCostOfRoom);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(530, 29, 2, 213);
		panel_3.add(separator_4);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTax1.setBounds(558, 84, 171, 31);
		panel_3.add(btnTax1);
		
		JLabel btnSubTotal = new JLabel("Sub Total");
		btnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubTotal.setBounds(558, 126, 171, 31);
		panel_3.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTotal.setBounds(558, 168, 171, 31);
		panel_3.add(btnTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTax.setBounds(667, 84, 204, 31);
		panel_3.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtSubTotal.setBounds(667, 126, 204, 31);
		panel_3.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotal.setBounds(667, 168, 204, 31);
		panel_3.add(txtTotal);
		
		lblClock = new JLabel("Clock");
		lblClock.setBounds(555, 42, 316, 31);
		panel_3.add(lblClock);
		lblClock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(519, 58, 1188, 102);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1484, 36);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mnNew);
		
		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmTotal);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenu mnConvert = new JMenu("Convert");
		mnConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnConvert);
		
		JMenu mnTotal = new JMenu("Total");
		mnTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnTotal);
		
		JMenu mnReset = new JMenu("Reset");
		mnReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReset);
		
		JMenu mnReceipt = new JMenu("Receipt");
		mnReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReceipt);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setBounds(513, 171, 903, 289);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(607, 11, 1, 267);
		panel_1.add(separator_2);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.BLUE);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblMenu.setBounds(20, 22, 108, 31);
		panel_1.add(lblMenu);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setForeground(Color.BLUE);
		lblQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblQty.setBounds(282, 22, 108, 31);
		panel_1.add(lblQty);
		
		JLabel lblPrice = new JLabel("Price $");
		lblPrice.setForeground(Color.BLUE);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblPrice.setBounds(507, 22, 108, 31);
		panel_1.add(lblPrice);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFriedRice.setBounds(20, 59, 108, 31);
		panel_1.add(btnFriedRice);
		
		JLabel btnShawarma = new JLabel("Shawarma");
		btnShawarma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnShawarma.setBounds(20, 104, 108, 31);
		panel_1.add(btnShawarma);
		
		JLabel btnChicken = new JLabel("Chicken");
		btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChicken.setBounds(20, 146, 108, 31);
		panel_1.add(btnChicken);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtFriedRice.setBounds(282, 64, 108, 26);
		panel_1.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtShawarma = new JTextField();
		txtShawarma.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtShawarma.setColumns(10);
		txtShawarma.setBounds(282, 110, 108, 26);
		panel_1.add(txtShawarma);
		
		txtChicken = new JTextField();
		txtChicken.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtChicken.setColumns(10);
		txtChicken.setBounds(282, 152, 108, 26);
		panel_1.add(txtChicken);
		
		JLabel label = new JLabel("5.676");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(507, 59, 108, 31);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("3.987");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(507, 104, 108, 31);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("11.452");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(507, 146, 108, 31);
		panel_1.add(label_2);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coca Cola", "Heineken", "Pepsi"}));
		btnChooseDrink.setBounds(20, 187, 154, 26);
		panel_1.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtChooseDrink.setColumns(10);
		txtChooseDrink.setBounds(282, 189, 108, 26);
		panel_1.add(txtChooseDrink);
		
		JLabel label_3 = new JLabel("_");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(531, 176, 26, 31);
		panel_1.add(label_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 219, 576, 2);
		panel_1.add(separator_3);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "201", "VIP"}));
		btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseRoom.setBounds(20, 227, 154, 26);
		panel_1.add(btnChooseRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelivery.setBounds(20, 255, 97, 23);
		panel_1.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTax.setBounds(133, 255, 97, 23);
		panel_1.add(btnTax);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// =============================================Drink========================================
				
				double Drinks = Double.parseDouble(txtChooseDrink.getText());
				double CocaCola = 0.957 * Drinks;
				double Heineken  = 2.432 * Drinks;
				double Pepsi = 1.674 * Drinks;
				
				if(btnChooseDrink.getSelectedItem().equals("Coca Cola"))
					
				{
					String pCoca_Cola = String.format("%.3f", CocaCola);
					txtTotalCostOfDrink.setText(pCoca_Cola);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Heineken"))
					
				{
					String pHeineken = String.format("%.3f", Heineken);
					txtTotalCostOfDrink.setText(pHeineken);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
					
				{
					String pPepsi = String.format("%.3f", Pepsi);
					txtTotalCostOfDrink.setText(pPepsi);
				}
				if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
					
				{
					txtTotalCostOfDrink.setText("0.000");
				}
				
				//=====================================Meal====================================
				
				
				double FriedRice = Double.parseDouble(txtFriedRice.getText());
				double pFriedRice = 5.676;
				double getFriedRice;
				getFriedRice = (FriedRice * pFriedRice);
				String TotalFriedRice = String.format("%.3f", getFriedRice);
				txtTotalCostOfMeal.setText(TotalFriedRice);
		
				double Shawarma = Double.parseDouble(txtShawarma.getText());
				double pShawarma = 3.987;
				double getShawarma;
				getShawarma = (Shawarma * pShawarma);
				String TotalShawarma = String.format("%.3f",getShawarma + getFriedRice);
				txtTotalCostOfMeal.setText(TotalShawarma);
		
				double Chicken = Double.parseDouble(txtChicken.getText());
				double pChicken = 9.452;
				double getChicken;
				getChicken = (Chicken * pChicken);
				String TotalChicken = String.format("%.3f", getChicken + getShawarma + getFriedRice);
				txtTotalCostOfMeal.setText(TotalChicken);
				
				
				//========================Delivery==================================================
				
				double cDelivery = 4.50;
				if(btnDelivery.isSelected())
				{
					String pDelivery = String.format("%.3f", cDelivery);
					txtCostOfDelivery.setText(pDelivery);
				}
				else
				{
					txtCostOfDelivery.setText("0.000");
				}
				
				//============================Tax=====================================================
				
				double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
				double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
				double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
				double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;
				if(btnTax.isSelected())
				{
					String xTotal = String.format("%.3f", cTotal);
					txtTax.setText(xTotal);
				}
				
				//====================================Total==============================
				
				double pTotal4 = Double.parseDouble(txtTax.getText());
				
				String zTaxTotal = String.format("$%.3f", pTotal4);
				txtTax.setText(zTaxTotal);
				
				double SubTotal = (pTotal1+ pTotal2 + pTotal3);
				String pSubTotal = String.format("%.3f", SubTotal);
				txtSubTotal.setText(pSubTotal);
				
				double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
				String yTotal = String.format("%.3f", xTotal);
				txtTotal.setText(yTotal);
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBounds(331, 232, 114, 31);
		panel_1.add(btnSubmit);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblCurrencyConverter.setBounds(618, 22, 275, 31);
		panel_1.add(lblCurrencyConverter);
		
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Nigeria", "Kenya", "China", "India"}));
		btnSelectCountry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSelectCountry.setBounds(643, 63, 204, 26);
		panel_1.add(btnSelectCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(643, 104, 204, 32);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCurrencyOutput.setBounds(643, 164, 204, 31);
		panel_1.add(txtCurrencyOutput);
		
		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Double Invoice1 = Double.parseDouble(txtFriedRice.getText());
				Double Invoice2 = Double.parseDouble(txtShawarma.getText());
				Double Invoice3 = Double.parseDouble(txtChicken.getText());
				Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
				
				ReceiptArea.append("\t\nHotel Management System:\n"
						+ "\nFried Rice:\t\t" + Invoice1
								+ "\nShawarma: \t\t" + Invoice2
								+ "\nChicken: \t\t" + Invoice3
								+ "\n" + btnChooseDrink.getSelectedItem()+ ":\t\t" + Invoice4
								+ "\nTotal: \t\t" + txtTotal.getText()
								+ "\n\nWelcome and Thank you for your patronage"
								);
			}
		});
		mntmReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNew.add(mntmReceipt);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a drink");
				btnChooseRoom.setSelectedItem("Choose a room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
			}
		});
	
		mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNew.add(mntmReset);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a drink");
				btnChooseRoom.setSelectedItem("Choose a room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
			}
		});
		mntmRefresh.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmRefresh);
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
				
				if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
				{
					String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
					txtCurrencyOutput.setText(Naira);
				}
				if (btnSelectCountry.getSelectedItem().equals("Kenya"))
				{
					String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
					txtCurrencyOutput.setText(Shilling);
				}
				if (btnSelectCountry.getSelectedItem().equals("China"))
				{
					String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
					txtCurrencyOutput.setText(Yuan);
				}
				if (btnSelectCountry.getSelectedItem().equals("India"))
				{
					String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
					txtCurrencyOutput.setText(Rupee);
				}
			}
		});
		
		mntmConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmConvert);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmExit);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
			
			if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
			{
				String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
				txtCurrencyOutput.setText(Naira);
			}
			if (btnSelectCountry.getSelectedItem().equals("Kenya"))
			{
				String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
				txtCurrencyOutput.setText(Shilling);
			}
			if (btnSelectCountry.getSelectedItem().equals("China"))
			{
				String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
				txtCurrencyOutput.setText(Yuan);
			}
			if (btnSelectCountry.getSelectedItem().equals("India"))
			{
				String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
				txtCurrencyOutput.setText(Rupee);
			}
		}
		});
		
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConvert.setBounds(629, 232, 114, 31);
		panel_1.add(btnConvert);
		
		JButton btnReset1 = new JButton("Reset");
		btnReset1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
		txtFriedRice.setText(null);
		txtShawarma.setText(null);
		txtChicken.setText(null);
		txtChooseDrink.setText(null);
		txtTotalCostOfMeal.setText(null);
		txtTotalCostOfDrink.setText(null);
		txtCostOfDelivery.setText(null);
		txtCostOfRoom.setText(null);
		txtTax.setText(null);
		txtSubTotal.setText(null);
		txtTotal.setText(null);
		txtEnterCurrency.setText(null);
		txtCurrencyOutput.setText(null);
		txtDisplay.setText(null);
		btnChooseDrink.setSelectedItem("Choose a drink");
		btnChooseRoom.setSelectedItem("Choose a room");
		btnSelectCountry.setSelectedItem("Country");
		ReceiptArea.setText(null);
		
	}
		});
		btnReset1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset1.setBounds(454, 231, 114, 31);
		panel_1.add(btnReset1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent arg0) {
		txtFriedRice.setText(null);
		txtShawarma.setText(null);
		txtChicken.setText(null);
		txtChooseDrink.setText(null);
		txtTotalCostOfMeal.setText(null);
		txtTotalCostOfDrink.setText(null);
		txtCostOfDelivery.setText(null);
		txtCostOfRoom.setText(null);
		txtTax.setText(null);
		txtSubTotal.setText(null);
		txtTotal.setText(null);
		txtEnterCurrency.setText(null);
		txtCurrencyOutput.setText(null);
		txtDisplay.setText(null);
		btnChooseDrink.setSelectedItem("Choose a drink");
		btnChooseRoom.setSelectedItem("Choose a room");
		btnSelectCountry.setSelectedItem("Country");
		ReceiptArea.setText(null);
		
	}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(752, 231, 114, 31);
		panel_1.add(btnReset);
	}
}
