package jdbc_test;

//mySQL JDBC GUI connection
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;

import java.awt.event.*;
public class Retrieve implements ActionListener {
	
	/** The name of the MySQL account to use (or empty for anonymous) */
	private final static String userName = "root";

	/** The password for the MySQL account (or empty for anonymous) */
	private final static String password = "";

	/** The name of the computer running MySQL */
	private final static String serverName = "localhost";

	/** The port of the MySQL server (default is 3306) */
	private final static int portNumber = 3306;

	/** The name of the database we are testing with (this default is installed with MySQL) */
	private final static String dbName = "test_create_DB";
	
	/** The name of the table we are testing with */
	private final static String tableName = "JDBC_TEST";
	
	public static void main(String[] args){
		
		int baseSSN = 1;
		JFrame f = new JFrame();
		JLabel lSSN = new JLabel("SSN: ");
		JLabel lBDate = new JLabel("Birth Date: ");
		JLabel lName = new JLabel("Name: ");
		JLabel lAddress = new JLabel("Address: ");
		JLabel lSalary = new JLabel("Salary: ");
		JLabel lSex = new JLabel("Sex: ");
		JTextField tSSN = new JTextField(10);
		JTextField tBDate = new JTextField(20);
		JTextField tName= new JTextField(20);
		JTextField tAddress = new JTextField(20);
		JTextField tSalary = new JTextField(20);
		JTextField tSex = new JTextField(8);
		JButton addButton = new JButton("ADD");
		JButton deleteButton = new JButton("DELETE");
		JLabel lEmpty = new JLabel("");
		JLabel lEmpty1 = new JLabel("");
		JLabel lEmpty2 = new JLabel("");
		JLabel lEmpty3 = new JLabel("");
		JLabel lEmpty4 = new JLabel("");
		JLabel lEmpty5 = new JLabel("");
		JLabel lEmpty6 = new JLabel("");
		JLabel lEmpty7 = new JLabel("");
		JLabel lEmpty8 = new JLabel("");
		JLabel lEmpty9 = new JLabel("");
		JLabel lEmpty10 = new JLabel("");
		JLabel lEmpty11 = new JLabel("");
		JLabel lEmpty12 = new JLabel("");
		JLabel lEmpty13 = new JLabel("");
		BasicArrowButton right = new BasicArrowButton(BasicArrowButton.EAST);
		BasicArrowButton left = new BasicArrowButton(BasicArrowButton.WEST);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName,
					userName, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where ssn = " + baseSSN);
			String ssn = "", bDate = "", name = "", address = "", salary = "", sex = "";
			if(rs.next()) {
				ssn = rs.getString("Ssn");
				bDate = rs.getString("Bdate");
				name = rs.getString("name");
				address = rs.getString("address");
				salary = rs.getString("salary");
				sex = rs.getString("sex");
			}
			tSSN.setText(ssn);
			tBDate.setText(bDate);
			tName.setText(name);
			tAddress.setText(address);
			tSalary.setText(salary);
			tSex.setText(sex);
		}
		catch(Exception e){
		}
		JPanel p = new JPanel(new GridLayout(6, 5));
		//Line 1
		p.add(lSSN);
		p.add(tSSN);
		p.add(lEmpty);
		p.add(lEmpty1);
		p.add(lEmpty2);
		//Line 2
		p.add(lBDate);
		p.add(tBDate);
		p.add(lEmpty3);
		p.add(deleteButton);
		p.add(lEmpty4);
		//Line 3
		p.add(lName);
		p.add(tName);
		p.add(lEmpty5);
		p.add(addButton);
		p.add(lEmpty6);
		//Line 4
		p.add(lAddress);
		p.add(tAddress);
		p.add(lEmpty7);
		p.add(lEmpty8);
		p.add(lEmpty9);
		//Line 5
		p.add(lSalary);
		p.add(tSalary);
		p.add(lEmpty10);
		p.add(lEmpty11);
		p.add(lEmpty12);
		//Line 6
		p.add(lSex);
		p.add(tSex);
		p.add(left);
		p.add(lEmpty13);
		p.add(right);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}