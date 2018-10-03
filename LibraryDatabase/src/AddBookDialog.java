import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBookDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTextField;
	private JTextField aurthorTextField;
	private JTextField yearTextField;
	private JTextField publisherTextField;
	private JTextField isbnTextField;
	private JTextField pageCountTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddBookDialog dialog = new AddBookDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	Book newBook = new Book();

	/**
	 * Create the dialog.
	 */
	public AddBookDialog() {
		setBounds(100, 100, 600, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblEnterTheInformation = new JLabel("Enter the information then press ok");
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		
		aurthorTextField = new JTextField();
		aurthorTextField.setColumns(10);
		
		JLabel lblAurthor = new JLabel("Aurthor");
		
		yearTextField = new JTextField();
		yearTextField.setColumns(10);
		
		JLabel lblYear = new JLabel("Year Published");
		
		publisherTextField = new JTextField();
		publisherTextField.setColumns(10);
		
		JLabel lblPublisher = new JLabel("Publisher");
		
		isbnTextField = new JTextField();
		isbnTextField.setColumns(10);
		
		JLabel lblIsbn = new JLabel("ISBN");
		
		pageCountTextField = new JTextField();
		pageCountTextField.setColumns(10);
		
		JLabel lblPageCount = new JLabel("Page Count");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEnterTheInformation))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblName)
								.addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
								.addComponent(aurthorTextField)
								.addComponent(lblAurthor)
								.addComponent(yearTextField, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblYear)
								.addComponent(publisherTextField)
								.addComponent(lblPublisher)
								.addComponent(isbnTextField)
								.addComponent(lblIsbn)
								.addComponent(pageCountTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPageCount))))
					.addContainerGap(247, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterTheInformation)
					.addGap(45)
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(lblAurthor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(aurthorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblYear)
					.addGap(2)
					.addComponent(yearTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPublisher)
					.addGap(7)
					.addComponent(publisherTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblIsbn)
					.addGap(3)
					.addComponent(isbnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPageCount)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pageCountTextField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						newBook.setName(nameTextField.getText());
						newBook.setAurthor(aurthorTextField.getText());
						newBook.setYearPublished(Integer.parseInt(yearTextField.getText()));
						newBook.setPublihser(publisherTextField.getText());
						newBook.setISBN(Integer.parseInt(isbnTextField.getText()));
						newBook.setPageCount(Integer.parseInt(pageCountTextField.getText()));
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public String getName()
	{
		return nameTextField.getText();
	}
	public String getAurthor()
	{
		return aurthorTextField.getText();
	}
	public int getYearPublished()
	{
		return Integer.parseInt(yearTextField.getText());
	}
	public String getPublisher()
	{
		return publisherTextField.getText();
	}
	public int getISBN()
	{
		return Integer.parseInt(isbnTextField.getText());
	}
	public int getPageCount()
	{
		return Integer.parseInt(pageCountTextField.getText());
	}
	public Book getBook()
	{
		return newBook;
	}
}

