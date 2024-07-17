package CRUD;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


class Swing_demo implements ActionListener {
	JButton insert, exit, update, delete, reset, refresh;
	JTextField id_field, name_field, contact_field, address_field;
	JRadioButton male, female;
	JLabel label, name_label, contact_label, address_lable, id, gender_lable;
	ButtonGroup g1;

	JPanel panel;
	JTable table;

	DefaultTableModel model;
	JScrollPane scrollpane;

	public Swing_demo() {
//		frame
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1000, 500);
		frame.setLayout(null);
//		frame.setUndecorated(true);
//		frame.getRootPane().setBorder(
//		        BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));

//		All labels
		label = new JLabel("Registation FORM", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setBounds(100, 10, 200, 20);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label);

		id = new JLabel("Id : ");
		id.setBounds(100, 50, 120, 20);
//		id.setEnabled(false);
		frame.add(id);

		name_label = new JLabel();
		name_label.setText("Name : ");
		name_label.setBounds(100, 80, 120, 20);
		frame.add(name_label);

		contact_label = new JLabel();
		contact_label.setText("Contact : ");
		contact_label.setBounds(100, 120, 120, 20);
		frame.add(contact_label);

		address_lable = new JLabel();
		address_lable.setText("Address : ");
		address_lable.setBounds(100, 150, 120, 20);
		frame.add(address_lable);

		gender_lable = new JLabel();
		gender_lable.setText("Gender : ");
		gender_lable.setBounds(100, 180, 120, 20);
		frame.add(gender_lable);

//		All textfields
		id_field = new JTextField();
		id_field.setBounds(170, 50, 120, 20);
//		id_field.setEditable(false);
		frame.add(id_field);

		name_field = new JTextField();
		name_field.setBounds(170, 80, 120, 20);
		frame.add(name_field);

		contact_field = new JTextField();
		contact_field.setBounds(170, 120, 120, 20);
		frame.add(contact_field);

		address_field = new JTextField();
		address_field.setBounds(170, 150, 120, 20);
		frame.add(address_field);

		male = new JRadioButton();
		male.setText("Male");
		male.setBounds(170, 180, 60, 20);
		frame.add(male);

		female = new JRadioButton();
		female.setText("Female");
		female.setBounds(230, 180, 70, 20);
		frame.add(female);

		g1 = new ButtonGroup();
		g1.add(male);
		g1.add(female);

//		All Buttons
		insert = new JButton("Register");
		insert.setBounds(100, 220, 100, 20);
		frame.add(insert);

		exit = new JButton("Exit");
		exit.setBounds(210, 220, 100, 20);
		frame.add(exit);

		update = new JButton("Update");
//		update.setEnabled(false);
		update.setBounds(100, 250, 100, 20);
		frame.add(update);

		delete = new JButton("Delete");
//		delete.setEnabled(false);
		delete.setBounds(210, 250, 100, 20);
		frame.add(delete);

		reset = new JButton("Reset");
//		reset.setEnabled(false);
		reset.setBounds(150, 280, 100, 20);
		frame.add(reset);

		// Defining Refresh Button

		refresh = new JButton("Refresh Table");

		refresh.setBounds(500, 370, 270, 20);

		frame.add(refresh);

		insert.addActionListener(this);
		exit.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		reset.addActionListener(this);
		refresh.addActionListener(this);

		male.setActionCommand("male");
		female.setActionCommand("female");

		// Defining Panel

		panel = new JPanel();

		panel.setLayout(new GridLayout());

		panel.setBounds(400, 20, 480, 330);

//        panel.setBorder(BorderFactory.createDashedBorder(Color.blue));

		frame.add(panel);

		// Defining Model for table

		model = new DefaultTableModel();

		// Adding object of DefaultTableModel into JTable

		table = new JTable(model);

		// Fixing Columns move

		table.getTableHeader().setReorderingAllowed(false);

		// Defining Column Names on model

		model.addColumn("S.No");

		model.addColumn("ID");

		model.addColumn("Name");

		model.addColumn("Gender");

		model.addColumn("Address");
		model.addColumn("Contact");

		// Enable Scrolling on table

		scrollpane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,

				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		panel.add(scrollpane);

	}

	public static Connection driverconnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// addRows method

	private void addRows() {

		

			Object[] row = null;
			int serialNo;
			serialNo = 1;

			try {
				Connection conn = Swing_demo.driverconnection();
				String sql = "select * from student";
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rst = pst.executeQuery();
				while (rst.next()) {

					String string = serialNo++ + "," + String.valueOf(rst.getLong(1)) + "," + rst.getString(2) + ","
							+ rst.getString(3) + "," + rst.getString(4) + "," + rst.getString(5);

					row = string.split(",");

					// Adding records in table model

					model.addRow(row);

				}
				panel.revalidate();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == insert) {
			System.out.println("Insert Button clicked");
			String name = name_field.getText();
			String address = address_field.getText();
			Long contact = Long.parseLong(contact_field.getText());
			String gender = g1.getSelection().getActionCommand();

			System.out.println(name + contact + address + gender);

			try {
				Connection conn = Swing_demo.driverconnection();
				String sql = "insert into student (name,address,contact,gender) values (?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, name);
				pst.setString(2, address);
				pst.setLong(3, contact);
				pst.setNString(4, gender);

				if (pst.executeUpdate() == 1) {
					System.out.println("insert successfully");

					JOptionPane.showMessageDialog(null, "Data Insert Successfuly", "Insert",
							JOptionPane.INFORMATION_MESSAGE);
					update.setEnabled(true);
					delete.setEnabled(true);
					reset.setEnabled(true);

				} else {
					JOptionPane.showMessageDialog(null, "Data Not Inserted", "Insert", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

		else if (e.getSource() == exit) {
			System.out.println("Search Button clicked");
			System.exit(0);
		}

		else if (e.getSource() == update) {
			System.out.println("Update Button clicked");
			int id = Integer.parseInt(id_field.getText());
			String name = name_field.getText();
			String address = address_field.getText();
			Long contact = Long.parseLong(contact_field.getText());
			String gender = g1.getSelection().getActionCommand();

			try {
				Connection conn = Swing_demo.driverconnection();
				String sql = "update student set name=?,address=?,contact=?,gender=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);

				pst.setString(1, name);
				pst.setString(2, address);
				pst.setLong(3, contact);
				pst.setString(4, gender);
				pst.setInt(5, id);

				if (pst.executeUpdate() == 1) {
					JOptionPane.showMessageDialog(null, "Data updated Successfully", "Update",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Data Not Update", "Update", JOptionPane.ERROR_MESSAGE);
				}

			} catch (Exception e2) {
				e2.getStackTrace();
			}

		}

		else if (e.getSource() == delete) {
			System.out.println("Delete Button clicked");
			int id = Integer.parseInt(id_field.getText());
			try {
				Connection conn = Swing_demo.driverconnection();
				String sql = "delete from student where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);

				if (pst.executeUpdate() == 1) {
					System.out.println("record deleted");
					id_field.setText("");
					name_field.setText("");
					address_field.setText("");
					contact_field.setText("");
					male.setSelected(false);
					female.setSelected(false);

					JOptionPane.showMessageDialog(null, "Data Deleted Successfuly", "Delete",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					System.out.println("data not found");
					JOptionPane.showMessageDialog(null, "Data Not found", "Delete", JOptionPane.ERROR_MESSAGE);
				}
//				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		} else if (e.getSource() == reset) {
			System.out.println("reset btn clicked");
			id_field.setText("");
			name_field.setText("");
			address_field.setText("");
			contact_field.setText("");
			male.setSelected(false);
			female.setSelected(false);
		} else if (e.getSource() == refresh) {
			// removing all the rows of the table
			System.out.println("refresh btn clicked");

			DefaultTableModel dm = (DefaultTableModel) table.getModel();

			dm.getDataVector().removeAllElements();

			System.out.println("Refresh Table");

			// calling method addRows

			addRows();
		}

	}

}

public class CRUD {

	public static void main(String[] args) {
		new Swing_demo();
	}

}