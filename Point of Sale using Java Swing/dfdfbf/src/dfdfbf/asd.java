package dfdfbf;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.JButton;

import java.io.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
public class asd extends JFrame {
	static JTextField	ts=null;
	private static JPanel contentPane;
	private static JTextField value1;
	 static JTable table=null;
	  static int count=1;
 static	 int counter=0;
 static  int ccc=0;
 static int ccc2=0;
 static int sno=1;
static boolean found=false;
 static double gtotal=0;
 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
	
					asd frame = new asd();
					frame.setTitle("POS");
					//frame.setOpacity(6.12);
				//	frame.setBackground(Color.BLACK);
					frame.setVisible(true);
				//	frame.pack();
				Connection ac=connectivity();
					getpos(ac);	
					getmenutype(ac);
					getorder(ac);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public asd() throws SQLException {
		//setting of the panel in the selected Jframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	contentPane.setBackground(Color.gray);
		

	//panel for key pad
	        JPanel key = new JPanel();
			key.setBounds(925, 400, 230,300 );
		    key.setBorder(getborrder());
			key.setBackground(Color.darkGray);
			contentPane.add(key);
			 value1= new JTextField();
			//	value1.setBounds(300, 20, 100, 25);
			 value1.setColumns(10);
			 value1.setMargin(new Insets(8, 46, 8, 46));
				key.add(value1);
				
				JButton plus=new JButton("+");
				plus.setMargin(new Insets(7, 18, 0, 18));
				key.add(plus);
				plus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//String s=value1.getText();
					//s=s+"1";
					//value1.setText(s);
					} });
				
				JButton minus=new JButton("-");
				minus.setMargin(new Insets(7, 18, 0, 18));
				key.add(minus);
				minus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//String s=value1.getText();
					//s=s+"1";
					//value1.setText(s);
					} });
				
				JButton div=new JButton("/");
				div.setMargin(new Insets(7, 18, 0, 18));
				key.add(div);
				div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//String s=value1.getText();
					//s=s+"1";
					//value1.setText(s);
					} });
				JButton mul=new JButton("*");
				mul.setMargin(new Insets(7, 18, 0, 18));
				key.add(mul);
				mul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//String s=value1.getText();
					//s=s+"1";
					//value1.setText(s);
					} });
				
				
				JButton ok=new JButton("CE");
				ok.setMargin(new Insets(13, 13, 13, 13));
				key.add(ok);
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//String s=value1.getText();
				//	s=s+"1";
					value1.setText("");
					} });
				
			JButton b1=new JButton("1");
			b1.setMargin(new Insets(13, 18, 13, 18));
			key.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"1";
				value1.setText(s);
				} });
			JButton b3=new JButton("2");
			b3.setMargin(new Insets(13, 18, 13, 18));
			key.add(b3);
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"2";
				value1.setText(s);
				} });
			JButton b4=new JButton("3");
			b4.setMargin(new Insets(13, 18, 13, 18));
			key.add(b4);
			b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"3";
				value1.setText(s);
				} });
			JButton b5=new JButton("4");
			b5.setMargin(new Insets(13, 18, 13, 18));
			key.add(b5);
			b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"4";
				value1.setText(s);
				} });
			JButton b6=new JButton("5");
			b6.setMargin(new Insets(13, 18, 13, 18));
			key.add(b6);
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"5";
				value1.setText(s);
				} });
			JButton b7=new JButton("6");
			b7.setMargin(new Insets(13, 18, 13, 18));
			key.add(b7);
			b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"6";
				value1.setText(s);
				} });
			JButton b8=new JButton("7");
			b8.setMargin(new Insets(13, 18, 13, 18));
			key.add(b8);
			b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"7";
				value1.setText(s);
				} });
			JButton b9=new JButton("8");
			b9.setMargin(new Insets(13, 18, 13, 18));
			key.add(b9);
			b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"8";
				value1.setText(s);
				} });
			JButton b10=new JButton("9");
			b10.setMargin(new Insets(13, 18, 13, 18));
			key.add(b10);
			b10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"9";
				value1.setText(s);
				} });
			JButton b2=new JButton("0");
			b2.setMargin(new Insets(13, 18, 13, 18));
			key.add(b2);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+"0";
				value1.setText(s);
				} });
			JButton point=new JButton(".");		
			point.setMargin(new Insets(13, 19, 13, 19));
			key.add(point);
			point.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s+".";
				value1.setText(s);
				} });
			JButton back=new JButton("Back");
			back.setMargin(new Insets(13, 18, 13, 18));
			key.add(back);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String s=value1.getText();
				s=s.substring(0,s.length()-1);
				value1.setText(s);
				} });
			

		
		@SuppressWarnings("unused")
		Font font = new Font("monotype corsiva", Font.BOLD, 40);
		JScrollPane scrollPanefortable = new JScrollPane();
		scrollPanefortable.setBounds(523, 278, -102, -90);
		contentPane.add(scrollPanefortable);
		
		table = new JTable();
		scrollPanefortable.setViewportView(table);
		
		
	}
	static Connection connectivity()
	{
       Connection conn=null;
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
}catch(ClassNotFoundException e) {
System.err.println("The driver is not loaded properly");
}

try
{

System.out.println("Trying to connect to database");
conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.110:1521:greens","has","hashserver");
System.out.println("Connected");
//return conn;
}
catch(SQLException e)
{

System.err.println("Error while connecting!");
}
return conn;
}

static void getpos(Connection c) throws SQLException
{


	JPanel panel = new JPanel();
	panel.setBounds(165, 0, 755, 50);
	contentPane.add(panel);
	panel.setBorder(getborrder());
	panel.setBackground(Color.decode("12345"));
	panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
	   Statement pos = null;
	try {
		pos = c.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String posquery="select * from POS";
	ResultSet posresult = null;
	try {
		posresult = pos.executeQuery(posquery);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	
		while (posresult.next()) {
			JButton poss = new JButton(posresult.getString(2));
			poss.setPreferredSize(new Dimension(85, 40));
			poss.setFont(new Font("Tahoma", Font.BOLD, 10));
			poss.setMargin(new Insets(0, 0, 0, 0));
			panel.add(poss);

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
}

@SuppressWarnings("null")
static void getmenutype(final Connection c) throws SQLException
{      
	//panel for the selected menu type items	
	final JPanel panel2 = new JPanel();
	panel2.setBounds(165, 50, 755,655 );
	contentPane.add(panel2);				
	panel2.setBorder(getborrder());
	panel2.setBackground(Color.decode("#B0C4DE"));
	
	//panel for menu types
	 final Box panel = Box.createVerticalBox();
	panel.setBounds(0, 0, 170, 710);
	panel.setBackground(Color.decode("12340"));
	panel.setBorder(getborrder());
	JScrollPane scrollPane_1 = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scrollPane_1.setBounds(0, 0,170, 710);
	contentPane.add(scrollPane_1);
	scrollPane_1.setViewportView(panel);

	
	//query execution for manu type=mt
	Statement  mt= null;
	try {
		mt = c.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String getmt="select * from menutype";
	String getmtcount="select count(*) from menutype";
	ResultSet mtresult = null;
	ResultSet mtresultcount = null;
	 

	try {
		mtresultcount = mt.executeQuery(getmtcount);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 int size=0;
	while(mtresultcount.next())
	{
	 size=mtresultcount.getInt(1);
	 ccc2=size;
	}
	try {
		mtresult = mt.executeQuery(getmt);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
///final	 int ccc=0;
//	final int ccc2=ccc;
	try {
     // mtresult.last();
      //   @SuppressWarnings("unused")
//		int size = mtresult.getRow();
  //        mtresult.beforeFirst();
//         final  JButton mts[] = new JButton[size];
         final int clicked[]=new int[size];  
          while (mtresult.next()) {
        	  
        	  clicked[ccc]=0;
			panel.add(Box.createVerticalStrut(4));
			//buttons for the menu types
	     //     JButton btn = new JButton();
			System.out.print(ccc2);
	         final  JButton mts = new JButton(mtresult.getString(2));
			
	          mts.setToolTipText(mtresult.getString(2));
			mts.setMaximumSize(new Dimension(Integer.MAX_VALUE, mts.getMinimumSize().width));		
			mts.setMargin(new Insets(0, 0, 0, 0));
			Font font = new Font("", Font.BOLD, 12);
			mts.setFont(font);
			mts.setBackground(Color.decode("#AFEEEE"));
			panel.add(mts);
			final String text=mtresult.getString(1);
			mts.addActionListener(new ActionListener() {
				@SuppressWarnings("unused")
				public void actionPerformed(ActionEvent arg0) {
	
				//	System.out.print(ccc1);
				//	for(int i1=0;i1<ccc2;i1++)
				//	{
				//	System.out.print("I am running !");
				///		mts[i1].setBackground(Color.decode("#008B8B"));
					
				//	}
		
				mts.setBackground(Color.decode("#008B8B"));				
					
					//mts.setBackground(Color.decode("#AFEEEE"));
				//	mts[ccc2].setBackground(Color.decode("#008B8B"));
					found=false;
//query execution of the menu items=mi
					   Statement  mi= null;
					try {
						mi = c.createStatement();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					String miquery="select * from menu where mtypeid='"+text+"'";// always use this syntax('"+text+"') when comparison is made on a variable
					ResultSet miresult = null;
					try {
						miresult = mi.executeQuery(miquery);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
					panel2.removeAll();
					panel2.revalidate();
					panel2.repaint();
					
					//panel.revalidate();
				
					panel.repaint();
					try {
						while (miresult.next()) {
							//buttons for manu items
			            	String wrap=miresult.getString(3)+"(R."+miresult.getString(4)+")";			
							JButton mis = new JButton("<html>" + wrap.replaceAll(" ", "<br>") + "</html>");
							mis.setToolTipText(miresult.getString(3)+"\n - Rs. "+miresult.getString(4)+" (Per Serving)");
							mis.setPreferredSize(new Dimension(100, 75));									
							mis.setFont(new Font("Tahoma", Font.ITALIC, 10));
							mis.setMargin(new Insets(0, 0, 0, 0));
							mis.setBackground(Color.decode("#FF00FF"));
							panel2.add(mis);
							int serial=0;
							final int  serial1=serial;
							final ResultSet  item=miresult;
							
							// int qty=1;
						final int qty1=count;
						
						final String menutid=miresult.getString(2);
						final String name=miresult.getString(3);
						mis.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent ae) {
				     if(counter==0 )
				     {
				    	 //for the first time of an item
				    		Statement si = null;
							
							try {
								si = c.createStatement();
							
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							String siquery= null;
							siquery = "select * from menu where menuid='"+menutid+"'";
							ResultSet siresult= null;
							try {
								siresult = si.executeQuery(siquery);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							try {
								while(siresult.next())
								{
								double unitprice = 0;
									try {
										unitprice = Double.parseDouble(siresult.getString(4));
									} catch (NumberFormatException
											| SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									final double total=qty1*unitprice;
									try {
										Object[] row={serial1,siresult.getString(3),qty1,siresult.getString(4),total};
										DefaultTableModel model1 =(DefaultTableModel)table.getModel();
								    	model1.addRow(row);	
							System.out.print("for the first time of an item \n");
								    	gtotal=gtotal+total;
								    	ts.setText(String.valueOf(gtotal));
									
									
									} catch (SQLException e){// TODO Auto-generated catch block
								e.printStackTrace();} 
								}
							}
					catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				    	 
				     }
							counter++;
						//	System.out.print("dsffds");
				     }
				     else
				     {
									for(int i=0;i<table.getRowCount();i++)
				                      {
										//System.out.print(table.getRowCount());
									//	System.out.print(table.getValueAt(i, 1));
									//	System.out.print("\n"+name);
										String ssss= table.getValueAt(i, 1).toString();
										boolean j=true;
				                    	  if(name.equals(ssss))
				                    	  {
				                    		  
				                    		  found=true;
				                    	 System.out.print("for the more then i time of an item\n");
				                    		  int q=(int) table.getValueAt(i, 2);
				                    		  q++;
				                    		  table.setValueAt(q, i, 2);
				                    		  double p=Double.parseDouble( table.getValueAt(i, 3).toString());
				                    		 // p=p*2.0;
				                    		  double tp=Double.parseDouble( table.getValueAt(i, 4).toString());
				                    		  tp=tp+p;
				                    		  table.setValueAt(tp, i, 4);
				                    		  ((AbstractTableModel) table.getModel()).fireTableDataChanged();  
				                    		  //for the more then i time of an item
				                    		  gtotal=gtotal+p;
										    	ts.setText(String.valueOf(gtotal));
				                    		break;  
				                    	  }
				                    	  
				                    	  found=false;
				                    	  
				                      }
				                    	   
				                    	  
				                    		  if(!found)
				                    		  {
				                    			  
				                    		//query for adding selected items=si in to table 
												Statement si = null;
												
												try {
													si = c.createStatement();
												
												} catch (SQLException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												String siquery= null;
												siquery = "select * from menu where menuid='"+menutid+"'";
												ResultSet siresult= null;
												try {
													siresult = si.executeQuery(siquery);
												} catch (SQLException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												try {
													while(siresult.next())
													{
													double unitprice = 0;
														try {
															unitprice = Double.parseDouble(siresult.getString(4));
														} catch (NumberFormatException
																| SQLException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														final double total=qty1*unitprice;
														try {
															Object[] row={serial1,siresult.getString(3),qty1,siresult.getString(4),total};
															DefaultTableModel model1 =(DefaultTableModel)table.getModel();
													    	model1.addRow(row);	
													    	//again for the more then 1 time for an item
													    	System.out.print("again for more then 1 time for an item");
													    	gtotal=gtotal+total;
													    	ts.setText(String.valueOf(gtotal));	
														
														
														} catch (SQLException e){// TODO Auto-generated catch block
													e.printStackTrace();} 
													}
												}
										catch (SQLException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
										}		
												
												
				                    		  }
				                      
											
										
				     
				     }
								}});
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
				//	mts.setBackground(Color.decode("#AFEEEE"));
			ccc++;
		//	ccc2++;
				}
			
			
				
			});}}
		
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	
static public Border getborrder()
{
	Border compound;
	Border loweredetched, raisedetched;
	Border blackline = BorderFactory.createLineBorder(Color.black);
	//This creates a nice frame.
	raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	compound = BorderFactory.createCompoundBorder( raisedetched, raisedetched);
	compound = BorderFactory.createCompoundBorder(blackline, compound);
return compound;
}

static public void getorder(final Connection c)
{

	JTextField textField1;
	final JTextField textField2;
	JTextField textField3;
	JTextField textField21;
	JTextField textField31;
	
	JPanel panel = new JPanel();
	panel.setBounds(920, 0, 440, 705);
	contentPane.add(panel);
	panel.setBackground(Color.decode("6598799"));
	panel.setLayout(null);
	panel.setBorder(getborrder());

	JPanel panel1 = new JPanel();
	//panel.setBounds(929, 90, 430, 610);
	panel.add(panel1);
	panel1.setBackground(Color.decode("6598799"));
	panel1.setLayout(null);
//	panel.setBorder(getborrder());
	JScrollPane scrollPane1 = new JScrollPane();
	scrollPane1.setBounds(929, 90, 430, 610);
	panel.add(scrollPane1);
	scrollPane1.setViewportView(panel1);
	

	//value1.setText("junaid");
	
	JLabel company= new JLabel("Company");
	company.setBounds(10, 30, 100, 60);
	panel.add(company);

	textField2 = new JTextField();
	textField2.setBounds(100, 50, 100, 20);
	panel.add(textField2);
	textField2.setColumns(10);


	JLabel guest= new JLabel("Guest  ");
	guest.setBounds(10, 55, 100, 60);
	panel.add(guest);

	textField3 = new JTextField();
	textField3.setBounds(100, 75, 100, 20);
	panel.add(textField3);
	textField3.setColumns(10);

	
	JLabel rate= new JLabel("Rate Type");
	rate.setBounds(220, 30, 100, 60);
	panel.add(rate);

	JComboBox	jcombobox2 = new JComboBox();
	jcombobox2.setBounds(330, 50, 100, 20);
	panel.add(jcombobox2);

	JLabel color= new JLabel("Cover");
	color.setBounds(220, 50, 100, 60);
	panel.add(color);

 final JTextField	textField4 = new JTextField();
	textField4.setBounds(330, 75, 100, 20);
	panel.add(textField4);
	textField4.setColumns(10);
	textField4.addMouseListener(new MouseListener() {

	    public void mouseClicked(MouseEvent e) {

	    	textField4.setText(value1.getText());	
		}

		@Override
		public void mouseEntered(
				MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(
				MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(
				MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(
				MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}});
	
	JLabel rph= new JLabel("Rate per Head");
	rph.setBounds(10, 80, 100, 60);
	panel.add(rph);

 final JTextField	textField5 = new JTextField();
	textField5.setBounds(100, 100, 100, 20);
	panel.add(textField5);
	textField5.setColumns(10);

	JLabel waiter= new JLabel("waiter");
	waiter.setBounds(220, 75, 100, 60);
	panel.add(waiter);

 final JTextField	textField6 = new JTextField();
	textField6.setBounds(330, 100, 100, 20);
	panel.add(textField6);
	textField6.setColumns(10);

	
	
	Font font = new Font("monotype corsiva", Font.BOLD, 40);
	JLabel room = new JLabel("Room No.");
	room.setBounds(10, -5, 100, 30);
	panel.add(room);
	final JComboBox room1= new JComboBox();
	room1.setBounds(5, 20, 80, 20);
//	comboBox.setSelectedIndex(4);
	panel.add(room1);
	
	room1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
		
			Statement s1 = null;
			try {
				s1 = c.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sv=(String)room1.getSelectedItem();
			String sql1="select * from stay where status='IN' and roomno='"+sv+"'";
			ResultSet rd1 = null;
			try {
				rd1 = s1.executeQuery(sql1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
					while (rd1.next()) {
						textField2.setText(rd1.getString(9));	
						
						
						
						
						
						
					}
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}});
		
	Statement s = null;
	try {
		s = c.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String sql="select distinct(roomno) from stay where status='IN'";
	ResultSet rd = null;
	try {
		rd = s.executeQuery(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
			while (rd.next()) {
			room1.addItem(rd.getString(1));
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Font font1 = new Font("monotype corsiva", Font.BOLD, 40);
	JLabel status = new JLabel("Status");
	status.setBounds(110, -20, 100, 60);
	panel.add(status);


	//String[] ordtypeStrings = { "CMP", "GEN", "PKG"};
	final JComboBox comboBox1 = new JComboBox();
	comboBox1.setBounds(200, 20, 100, 20);
	panel.add(comboBox1);

	String[] statusStrings = { "Order", "Server", "Cancel", "Close"};
	final JComboBox comboBox = new JComboBox(statusStrings);
	comboBox.setBounds(95, 20, 100, 20);
//	comboBox.setSelectedIndex(4);
	panel.add(comboBox);
	{
		  Statement p = null;
			try {
				p =  c.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String q="Select * from ordtype";	
			ResultSet rd1 = null;
			try {
				rd1 = p.executeQuery(q);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		try {
				while (rd1.next()) {
					comboBox1.addItem(rd1.getString(1));
				}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	Font font2 = new Font("monotype corsiva", Font.BOLD, 40);
	JLabel ordert = new JLabel("Ord:Type");
	ordert.setBounds(220, -20, 100, 60);
	panel.add(ordert);

		
/*
	Font font3 = new Font("monotype corsiva", Font.BOLD, 40);
	JLabel order = new JLabel("Order No.");
	order.setBounds(320, -20, 100, 60);
	panel.add(order);

	textField1 = new JTextField();
	textField1.setBounds(315, 30, 80, 20);
	panel.add(textField1);
	textField1.setColumns(10);
*/
/*	Font font4 = new Font("monotype corsiva", Font.BOLD,20);
	JLabel invoice = new JLabel("Invoice");
	invoice.setBounds(10, 70, 100, 60);
	panel.add(invoice);
*/
	//Font font4 = new Font("monotype corsiva", Font.BOLD,20);
	


	JScrollPane scrollPane = new JScrollPane();
	//panel.setBounds(920, 0, 440, 705);
	scrollPane.setBounds(5, 220, 430, 180);
	panel.add(scrollPane);
	table = new JTable();
	table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"S No.", "Particular", "Qty","Rate","Sale Price"
			}
		));
	
	   TableColumn column=null;
	   
	   column = table.getColumnModel().getColumn(0);
       column.setPreferredWidth(10);
	   column = table.getColumnModel().getColumn(1);
	   column.setPreferredWidth(215); //third column is bigger
	   column = table.getColumnModel().getColumn(2);
       column.setPreferredWidth(15);
       column = table.getColumnModel().getColumn(3);
       column.setPreferredWidth(25);
       column = table.getColumnModel().getColumn(4);
       column.setPreferredWidth(40);
	        scrollPane.setViewportView(table);

	        JLabel remarks=new JLabel("Remarks");
	        remarks.setBounds(10, 125, 80, 20);
			panel.add(remarks);
			
	        JTextArea textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setBounds(10, 145, 400, 70);
			textArea.setBorder(getborrder());
			panel.add(textArea);

			JLabel totalsale=new JLabel("Total Sale");
			totalsale.setBounds(290, 505, 70, 20);
			totalsale.setAlignmentX(LEFT_ALIGNMENT);
			panel.add(totalsale);
			
			 	ts = new JTextField();
				ts.setBounds(360, 505, 70, 20);
				panel.add(ts);
				ts.setColumns(10);
			
				
				
					
					JLabel sc=new JLabel("Service charges");
					sc.setBounds(210, 525, 100, 20);
					sc.setAlignmentX(LEFT_ALIGNMENT);
					panel.add(sc);

					
					final JTextField	SC = new JTextField();
					SC.setBounds(360, 525, 70, 20);
					panel.add(SC);
					SC.setColumns(10);

					final JTextField	scp = new JTextField();
					scp.setBounds(310, 525, 50, 20);
					panel.add(scp);
					scp.setColumns(10);
					
					final		 JTextField	BBT = new JTextField();
					BBT.setBounds(360, 545, 70, 20);
					panel.add(BBT);
					BBT.setColumns(10);
					
					scp.addMouseListener(new MouseListener() {

					    public void mouseClicked(MouseEvent e) {

						scp.setText(value1.getText());	
						}

						@Override
						public void mouseEntered(
								MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseExited(
								MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(
								MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseReleased(
								MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}});
					scp.getDocument().addDocumentListener(new DocumentListener() {
						  public void changedUpdate(DocumentEvent e) {
							Double SSC=	  (Double.parseDouble(ts.getText()) * Double.parseDouble(scp.getText()))/100.0;
							  SC.setText(String.valueOf(SSC));
							  SSC=SSC+Double.parseDouble(ts.getText());
							  BBT.setText(String.valueOf(SSC));
							  }
							  public void removeUpdate(DocumentEvent e) {
								  Double SSC=	  (Double.parseDouble(ts.getText()) * Double.parseDouble(scp.getText()))/100.0;
								  SC.setText(String.valueOf(SSC));			   
								  SSC=SSC+Double.parseDouble(ts.getText());
								  BBT.setText(String.valueOf(SSC));
							  }
							  public void insertUpdate(DocumentEvent e) {
							   Double SSC=	  (Double.parseDouble(ts.getText()) * Double.parseDouble(scp.getText()))/100.0;
								  SC.setText(String.valueOf(SSC));
								  SSC=SSC+Double.parseDouble(ts.getText());
								  BBT.setText(String.valueOf(SSC));
							  }
					});
					
					
						
						JLabel bbt=new JLabel("Bill Before Tex");
						bbt.setBounds(260, 545, 100, 20);
						bbt.setAlignmentX(LEFT_ALIGNMENT);
						panel.add(bbt);
						

						
							

							JLabel gst=new JLabel("GST");
							gst.setBounds(290, 565, 70, 20);
							gst.setAlignmentX(LEFT_ALIGNMENT);
							panel.add(gst);
							
							final		 JTextField	GST = new JTextField();
							GST.setBounds(360, 565, 70, 20);
							panel.add(GST);
							GST.setColumns(10);
							
							final	 JTextField	BAT = new JTextField();
							BAT.setBounds(360, 585, 70, 20);
							panel.add(BAT);
							BAT.setColumns(10);
					
							
								GST.getDocument().addDocumentListener(new DocumentListener() {
									  public void changedUpdate(DocumentEvent e) {
										Double SSC=	  (Double.parseDouble(BBT.getText()) * Double.parseDouble(GST.getText()))/100.0;
										  SSC=SSC+(Double.parseDouble(BBT.getText()));
										  BAT.setText(String.valueOf(SSC));
										  }
										  public void removeUpdate(DocumentEvent e) {
											  Double SSC=	  (Double.parseDouble(BBT.getText()) * Double.parseDouble(GST.getText()))/100.0;
											  SSC=SSC+(Double.parseDouble(BBT.getText()));  			   
											  BAT.setText(String.valueOf(SSC));
										  }
										  public void insertUpdate(DocumentEvent e) {
										   Double SSC=	  (Double.parseDouble(BBT.getText()) * Double.parseDouble(GST.getText()))/100.0;
										   SSC=SSC+(Double.parseDouble(BBT.getText()));
											  BAT.setText(String.valueOf(SSC));
										  }
								}	);	
							
							
							
								GST.addMouseListener(new MouseListener() {

								    public void mouseClicked(MouseEvent e) {

									GST.setText(value1.getText());	
									}

									@Override
									public void mouseEntered(
											MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mouseExited(
											MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mousePressed(
											MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mouseReleased(
											MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}});
								
								

								JLabel bat=new JLabel("Bill After Tex");
								bat.setBounds(260, 585, 100, 20);
								bat.setAlignmentX(LEFT_ALIGNMENT);
								panel.add(bat);
								
									
								
									JLabel d=new JLabel("Discount");
									d.setBounds(250, 605, 60, 20);
									d.setAlignmentX(LEFT_ALIGNMENT);
									panel.add(d);
									
									final JTextField dp = new JTextField();
									dp.setBounds(310, 605, 50, 20);
									panel.add(dp);
									dp.setColumns(10);

									
									final JTextField	D = new JTextField();
										D.setBounds(360, 605, 70, 20);
										panel.add(D);
										D.setColumns(10);
				
										dp.addMouseListener(new MouseListener() {

										    public void mouseClicked(MouseEvent e) {

											dp.setText(value1.getText());	
											}

											@Override
											public void mouseEntered(
													MouseEvent arg0) {
												// TODO Auto-generated method stub
												
											}

											@Override
											public void mouseExited(
													MouseEvent arg0) {
												// TODO Auto-generated method stub
												
											}

											@Override
											public void mousePressed(
													MouseEvent arg0) {
												// TODO Auto-generated method stub
												
											}

											@Override
											public void mouseReleased(
													MouseEvent arg0) {
												// TODO Auto-generated method stub
												
											}});
										
										
										
										
										JLabel nt=new JLabel("Net. Amount");
										nt.setBounds(290, 625, 70, 20);
										nt.setAlignmentX(LEFT_ALIGNMENT);
										panel.add(nt);
										
										final JTextField	NT = new JTextField();
											NT.setBounds(360, 625, 70, 20);
											panel.add(NT);
											NT.setColumns(10);
										
											dp.getDocument().addDocumentListener(new DocumentListener() {
												  public void changedUpdate(DocumentEvent e) {
													Double SSC=	  (Double.parseDouble(BAT.getText()) * Double.parseDouble(dp.getText()))/100.0;
													   D.setText(String.valueOf(SSC));
													   SSC=Double.parseDouble(BAT.getText())-(Double.parseDouble(D.getText()));
													   NT.setText(String.valueOf(SSC));
													  }
													  public void removeUpdate(DocumentEvent e) {
														  Double SSC=	  (Double.parseDouble(BAT.getText()) * Double.parseDouble(dp.getText()))/100.0;
														   D.setText(String.valueOf(SSC));
														   SSC=Double.parseDouble(BAT.getText())-(Double.parseDouble(D.getText()));
														   NT.setText(String.valueOf(SSC));
													  }
													  public void insertUpdate(DocumentEvent e) {
													   Double SSC=(Double.parseDouble(BAT.getText()) * Double.parseDouble(dp.getText()))/100.0;
													  
													   D.setText(String.valueOf(SSC));
													   SSC=Double.parseDouble(BAT.getText())-(Double.parseDouble(D.getText()));
													   NT.setText(String.valueOf(SSC));
													  }
											}	);	
											
											JButton KOT=new JButton("KOT"); 
											KOT.setBounds(220, 650, 100, 50);
										    panel.add(KOT);
										    
										    KOT.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent ae) {
													
													Statement s1 = null;
													try {
														s1 = c.createStatement();
													} catch (SQLException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
													String sv=(String)room1.getSelectedItem();
													String sql1="select * from stay where status='IN' and roomno='"+sv+"'";
													ResultSet rd1 = null;
													try {
														rd1 = s1.executeQuery(sql1);
													} catch (SQLException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
													try {
															while (rd1.next()) {
																
																
															
																
																
																
																
																String oti=(String)comboBox1.getSelectedItem();
																String os=(String)comboBox.getSelectedItem();
																String co=(String)textField4.getText();
																double rph=Double.parseDouble(textField5.getText());
																
																double sc=Double.parseDouble(scp.getText());
																double dis=Double.parseDouble(D.getText());
																double disp=Double.parseDouble(dp.getText());
																double gstt=Double.parseDouble(GST.getText());
																double bbtt=Double.parseDouble(BBT.getText());
																double batt=Double.parseDouble(BAT.getText());
																double ntt=Double.parseDouble(NT.getText());
																String waiter1=(String)textField6.getText();
																
																//value for second col
//																 DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
	//															Calendar calobj = Calendar.getInstance();
		//													       //System.out.println(df.format(calobj.getTime()));
			//													String date;
				//												date=df.format(calobj.getTime());
																//end 2
															       Statement s = null;
																try {
																	s = c.createStatement();
																} catch (SQLException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																
																ResultSet rrr=s.executeQuery("select koth_idseq.nextval from dual");
																int aaa=0;
																while(rrr.next())
																{
																	
																	 aaa=rrr.getInt(1);
																	System.out.print(aaa+"\n");
																	
																}		//ResultSet rrr=s.executeQuery("select koth_idseq.nextval from dual");
																
																
																//rrr=s.executeQuery("select kotd_idseq.nextval from dual");
																//int aaa1=0;
															//	while(rrr.next())
															//	{
																//	
															//		 aaa1=rrr.getInt(1);
																//	System.out.print(aaa1+"\n");
															//		
															//	}			
															
																rrr=s.executeQuery("select kotf_idseq.nextval from dual");
																int aaa2=0;
																while(rrr.next())
																{
																	
																	 aaa2=rrr.getInt(1);
																	System.out.print(aaa2+"\n");
																	
																}			
															
																rrr=s.executeQuery("select to_char(sysdate, 'DD-MON-YYYY HH24:MI:SS') from dual");
																String date = null;
																while(rrr.next())
																{
																	
																	 date=rrr.getString(1);
																	System.out.print(date+"\n");
																	
																}			
																
																PreparedStatement preparedStatement = null;
														//			try {
															//			s = c.createStatement();
																//	} catch (SQLException e) {
																	//	// TODO Auto-generated catch block
																		//e.printStackTrace();
																	
														int aaaa=1;		
String sql="insert into koth values ('"+aaa+"',sysdate,'"+oti+"',null,'"+rd1.getInt(1)+"',null,null,null,null,null,null,'FOD',null,null,null,null,'"+aaaa+"',null,null,null,null,null,null,null,null,null,null,null,null,null,'"+co+"','"+rph+"',null,'ORD',sysdate,sysdate,null,null,'"+waiter1+"')";
preparedStatement = c.prepareStatement(sql);
preparedStatement.executeUpdate(sql);
//preparedStatement=c.prepareStatement(query);
//st.executeUpdate(query);

														//		try {
																//	 s.executeUpdate(sql);
																	// s.executeQuery("select koth_idseq.nextval from dual");
															//	} catch (SQLException e) {
																	// TODO Auto-generated catch block
																//	e.printStackTrace();
															//	}
																	
													
																try {
																	int c11=table.getRowCount();
															int r=0; int cl=1;
															double tc1=0;
															double ts1=0;
																	while(c11!=0)
																		{
															
																		rrr=s.executeQuery("select kotd_idseq.nextval from dual");
																		int aaa1=0;
																		while(rrr.next())
																		{
																			
																			 aaa1=rrr.getInt(1);
																			System.out.print(aaa1+"\n");
																			
																		}			
																		
																		Object s12=table.getValueAt(r, cl);
																		String s2= String.valueOf(table.getValueAt(r, cl+1));
																		Object s3=table.getValueAt(r, cl+2);
																		String s4=String.valueOf(table.getValueAt(r, cl+3));
																		Statement sss=null;
																		
																		double cpp=0;
																			sss = c.createStatement();
																		
																//		String sv1=(String)room1.getSelectedItem();
																		String sql111="select * from menu where dishname='"+s12+"'";
																		ResultSet rd11 = null;
																		
																			rd11 = sss.executeQuery(sql111);
																			
																			while (rd11.next()) {
																				System.out.print("\n"+Double.parseDouble(rd11.getString(5))+"\n");
																			cpp=((Double.parseDouble(rd11.getString(5))*Double.parseDouble(rd11.getString(4)))/100.0)*Double.parseDouble(s2);
																			String kotdquery="insert into kotd values('"+aaa+"','"+aaa1+"','"+rd11.getString(2)+"',null,'"+rd11.getString(3)+"',null,'"+Double.parseDouble(rd11.getString(4))+"','"+Integer.parseInt((String)s2)+"','"+cpp+"','"+Double.parseDouble(rd11.getString(5))+"','"+Double.parseDouble(s4)+"',null,null)";
																	
																			preparedStatement = c.prepareStatement(kotdquery);
																			preparedStatement.executeUpdate(kotdquery);
										                           //               sss.executeUpdate(kotdquery);	
																				
																			tc1=tc1+cpp;
																			ts1=ts1+Double.parseDouble((String)s4);
																			}
																			c11--;
																	r++;
																		}
																
																	double sch=(ts1*sc)/100.0;
																int tc11= (int) tc1;
																int ts11= (int) ts1;
																int dis1= (int) dis;
																int ntt1= (int) ntt;
																int gstt1= (int) gstt;
																	String sql11="insert into kotf values ('"+aaa+"','"+aaa2+"',null,null,'"+tc11+"','"+ts11+"','"+truncate(sc,2)+"','"+truncate(sch,2)+"','"+dis1+"','"+gstt1+"',null,sysdate,null,'"+ntt1+"',null,null,null,null,null,null,null,'"+truncate(disp,2)+"','"+truncate(bbtt,2)+"','"+truncate(batt,2)+"')";
															
																	preparedStatement = c.prepareStatement(sql11);
																	preparedStatement.executeUpdate(sql11);
																	
																	//		 s.executeUpdate(sql11);		
																}
																
																catch (Exception e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																
															

																
															}
															} catch (SQLException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
													
													
												}});
										    
										    JButton BILL=new JButton("BILL"); 
											BILL.setBounds(320, 650, 100, 50);
										    panel.add(BILL);
										    
}

public static JTable gettable()
{
return table;	
}
public static ResultSet query(String s,Connection c)
{
    Statement p = null;
	try {
		p =  c.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ResultSet rd = null;
	try {
		rd = p.executeQuery(s);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
return rd;
}
static double truncate(double number, int precision)
{
    double prec = Math.pow(10, precision);
    int integerPart = (int) number;
    double fractionalPart = number - integerPart;
    fractionalPart *= prec;
    int fractPart = (int) fractionalPart;
    fractionalPart = (double) (integerPart) + (double) (fractPart)/prec;
    return fractionalPart;
}
}
