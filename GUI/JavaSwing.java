package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class JavaSwing implements ActionListener
{
       JFrame jfrm;
       JButton jbtn1, jbtn2, jbtn3, jbtn4;
       JPanel jpnl1, jpnl2, jpnl3, jpnl4,jpnl5;
       JLabel jlvl1, jlvl2, jlvl3;
       JTextField jtf1, jtf2, jtf3;
       JCheckBox cb;
       JRadioButton jrb1,jrb2;
       ButtonGroup bg;
       JMenuBar jmnubr;
       JMenu jmnu1,jmnu2, jmnu3;
       JMenuItem itm1, itm2, itm3, itm4, itm5, itm6;
       JTable jtbl;
       JScrollPane jsp;
       TitledBorder tb;
   
   public JavaSwing()
   {
       jfrm = new JFrame("Phone Book");
       jmnubr = new JMenuBar();
       jfrm.add(jmnubr);
       
       jmnu1 = new JMenu("File");
       jmnu2 = new JMenu("Edit");
       jmnu3 = new JMenu("Help");
       
       itm1 = new JMenuItem("Clear");
       itm2 = new JMenuItem("Search");
       itm3 = new JMenuItem("Add");
       itm4 = new JMenuItem("Remove");
       itm5 = new JMenuItem("Exit");
       itm6 = new JMenuItem("About");
       
       jmnubr.add(jmnu1);
       jmnubr.add(jmnu2);
       jmnubr.add(jmnu3);
      
       jmnu1.add(itm5);
       jmnu3.add(itm6);
       
       jmnu2.add(itm1);
       jmnu2.add(itm2);
       jmnu2.addSeparator();
       jmnu2.add(itm3);
       jmnu2.add(itm4);
       
       jpnl1 = new JPanel();
       jpnl2 = new JPanel();
       jpnl3 = new JPanel();
       jpnl4 = new JPanel();
       jpnl5 = new JPanel();
       
       jfrm.add(jpnl1);
       jfrm.add(jpnl2);
       jfrm.add(jpnl3);
       jfrm.add(jpnl4);
       jfrm.add(jpnl5);
       
       DefaultTableModel model=new DefaultTableModel();
       String [] column=new String[4];
       column[0]="First Name";
       column[1]="Second Name";
       column[2]="Phone";
       column[3]="Status";
       
       model.addColumn(column[0]);
       model.addColumn(column[1]);
       model.addColumn(column[2]);
       model.addColumn(column[3]);
       jtbl=new JTable(model);
       
       
       jsp=new JScrollPane(jtbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       jfrm.add(jsp); 
       
       jlvl1 = new JLabel("First Name");
       jlvl2 = new JLabel("Second Name");
       jlvl3 = new JLabel("Phone");
       
       jtf1 = new JTextField(15);
       jtf2 = new JTextField(15);
       jtf3 = new JTextField(15);
       
       jpnl2.add(jlvl1);
       jpnl2.add(jtf1);
       jpnl2.add(jlvl2);
       jpnl2.add(jtf2);
       jpnl2.add(jlvl3);
       jpnl2.add(jtf3);
       cb = new JCheckBox("Private", false);
       jpnl2.add(cb);
       
       bg = new ButtonGroup();
       jrb1 = new JRadioButton("Forename, Surname");
       jrb2 = new JRadioButton("Surname, Forename");
       
       bg.add(jrb1);
       bg.add(jrb2);
       jpnl3.add(jrb1);
       jpnl3.add(jrb2);
       
       jbtn1 = new JButton("Clear");
       jbtn2 = new JButton("Search");
       jbtn3 = new JButton("Add");
       jbtn4 = new JButton("Remove");
       
       jpnl4.add(jbtn1);
       jpnl4.add(jbtn2);
       jpnl4.add(jbtn3);
       jpnl4.add(jbtn4);
       
       
       jbtn1.addActionListener(this);
       jbtn2.addActionListener(this);
       jbtn3.addActionListener(this);
       jbtn4.addActionListener(this);
       
       jrb1.addActionListener(this);
       jrb2.addActionListener(this);
       
       itm1.addActionListener(this);
       itm2.addActionListener(this);
       itm3.addActionListener(this);
       itm4.addActionListener(this);
       itm5.addActionListener(new exitProgram());
       itm6.addActionListener(this);
       
      
       itm1.setMnemonic(KeyEvent.VK_C);
       itm2.setMnemonic(KeyEvent.VK_S);
       itm3.setMnemonic(KeyEvent.VK_A);
       itm4.setMnemonic(KeyEvent.VK_R);
       itm5.setMnemonic(KeyEvent.VK_E);
       itm6.setMnemonic(KeyEvent.VK_M);
       
       jbtn1.setMnemonic(KeyEvent.VK_C);
       jbtn2.setMnemonic(KeyEvent.VK_S);
       jbtn3.setMnemonic(KeyEvent.VK_A);
       jbtn4.setMnemonic(KeyEvent.VK_R);
       
      
      itm1.setToolTipText("Clear the all text fild's information.");
      itm2.setToolTipText("Search the informaton, but not available in this version.");
      itm3.setToolTipText("Add the text field's information on Table.");
      itm4.setToolTipText("Remove the table's information");
      itm5.setToolTipText("Exit/Close the program.");
      itm6.setToolTipText("Show the information of Program, but not available in this version.");
      
      jbtn1.setToolTipText("Clear the all text field's information.");
      jbtn2.setToolTipText("Search the informaton, but not available in this version.");
      jbtn3.setToolTipText("Add the text field's information on Table.");
      jbtn4.setToolTipText("Remove the table's information");
      
      
       
       tb=new TitledBorder("Name:");
       tb.setTitleJustification(TitledBorder.LEFT);
       tb.setTitlePosition(TitledBorder.CENTER);
       jpnl1.setBorder(tb);
       jpnl1.add(new JScrollPane(jtbl));
       jpnl1.setLayout(new FlowLayout());
       
       tb=new TitledBorder("Info:");
       tb.setTitleJustification(TitledBorder.LEFT);
       tb.setTitlePosition(TitledBorder.CENTER);
       jpnl2.setBorder(tb);
       jpnl2.setLayout(new GridLayout(4,2));
       
       tb=new TitledBorder("File as:");
       tb.setTitleJustification(TitledBorder.LEFT);
       tb.setTitlePosition(TitledBorder.CENTER);
       jpnl3.setBorder(tb);
       jpnl3.setLayout(new GridLayout(2,1));
       
       jpnl4.setLayout(new GridLayout(2,2));
       
       jpnl5.setLayout(new GridLayout(3,1));
       jpnl5.add(jpnl2);
       jpnl5.add(jpnl3);
       jpnl5.add(jpnl4);
       
       jfrm.setSize(845, 505);
       jfrm.setResizable(false);
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jfrm.setLayout(new BorderLayout());
       jfrm.add(jmnubr, BorderLayout.NORTH);
       jfrm.add(jpnl1, BorderLayout.WEST);
       jfrm.add(jpnl5, BorderLayout.EAST);
       jfrm.setVisible(true);
   }
   
   //  to check phone number  
   public static boolean integerCheck(String ajtf,String bjtf ) {
       try {
           String regex = "^[a-zA-Z]+$";
           if(!(ajtf.matches(regex))){
               throw new Exception();
           }
           else if(!(bjtf.matches(regex))){
               throw new Exception();
           }
       } 
       catch (Exception e) 
       {
           return false;
       }
       return true;
   }
   
   
   // This section is for Help menu's about item which pop up the effective message.
   @Override
   public void actionPerformed(ActionEvent b)
   {
   try
    {
		  if(b.getSource()==itm6)
		  {
		    JOptionPane.showMessageDialog(jfrm,"It is still in trail version!!");
		  } 
     	 if(b.getSource()==jbtn2 || b.getSource()==itm2)
		 {
		  JOptionPane.showMessageDialog(jfrm,"Search functionally will be supported in the professional version.");
	     } 
		if(b.getSource()==jbtn1|| b.getSource()==itm1 )
		    {
		         jtf1.setText(null);
		         jtf2.setText(null);
		         jtf3.setText(null);
		     }  
        
    if(b.getSource()==jbtn3 || b.getSource()== itm3)
    {
      String ajtf=jtf1.getText();
      String bjtf=jtf2.getText();
      String cjtf=jtf3.getText();
      String pri="Private";
      String notpri=" ";
      DefaultTableModel model=(DefaultTableModel) jtbl.getModel();
      {
    	  if(((jrb1.isSelected()==false) && (jrb2.isSelected()==false))){ 

              JOptionPane.showMessageDialog(jfrm,"Please select the format.");

          }
    	  
    	  else if(jtf1.getText().isEmpty()||jtf2.getText().isEmpty()||jtf1.getText().isEmpty())
    	  {
    		  JOptionPane.showMessageDialog(jfrm,"Please fill up the text fields.!!!");
	      }  

    long chng = Long.parseLong(cjtf);
    if(jrb1.isSelected())
    {
       Object[] columns={"First Name","Second Name","Phone","Status"};
       model.setColumnIdentifiers(columns);
                        
           if(integerCheck(ajtf,bjtf)==false)
               {
                 JOptionPane.showMessageDialog(jfrm,"Please insert string for names!!!.");    
               }
        else  
            {
          	     if(cb.isSelected()==true) {
          		 model.addRow(new Object[]{ajtf,bjtf,chng,pri});	 
          	}
	          	 else
	          	 {
	          		 model.addRow(new Object[]{ajtf,bjtf,chng,notpri});
	          	 }
           }	  
     } 
    
       	   if(jrb2.isSelected()==true)
       	   {
                 Object[] columns={"Second Name","First Name","Phone","Status"};
                 model.setColumnIdentifiers(columns);
                
	                 if(integerCheck(ajtf,bjtf)==false)
	                 {
	                     JOptionPane.showMessageDialog(jfrm,"Please insert  string for names!!!.");    
	                 }
                 
            else 
               {
                  if(cb.isSelected()==true) 
                  {
                	  
                  model.addRow(new Object[]{bjtf,ajtf,chng,pri});
                		 
                  }
                	 else
                	 {
                		 model.addRow(new Object[]{bjtf,ajtf,chng,notpri});
                	 }
                }
             }
    }  
 }
      if(b.getSource()==jbtn4 || b.getSource()== itm4)
      {
	   {
	        DefaultTableModel model= (DefaultTableModel) jtbl.getModel();
		    int selectRow = jtbl.getSelectedRow();
		    if (selectRow == -1)
		        {
		    		JOptionPane.showMessageDialog(jfrm,"Please select the items to remove.");
		        }
		    if(selectRow>=0)
		     {
		        model.removeRow(selectRow);
		     }
	 	}
     }

   if(b.getSource()==jrb1)
   {
       jrb1.setEnabled(false);
       jrb2.setEnabled(false);
    }
    else if (b.getSource()==jrb2){
         jrb2.setEnabled(false);
         jrb1.setEnabled(false);
   }
  }
  catch(java.lang.ArrayIndexOutOfBoundsException a)
  {
	  System.out.println(a);
	  System.out.println("Array index out of range -1");
	  System.out.println(a.toString());  
  }
  catch(java.lang.NumberFormatException c)
  {
  System.out.println(c);
  System.out.println("Please insert the integer values first. ");
  JOptionPane.showMessageDialog(jfrm,"Please, Insert the numeric value for phone."); 
  }  
   finally
   {
	   System.out.println("Finally, Handled the all Exception.");
   }
}
   
// This section is for file menu's item exit which exit the whole program.
 static class exitProgram implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
