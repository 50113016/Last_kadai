package last_kadai;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;




public class FrameView extends Frame implements ActionListener,WindowListener{
	
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private Button button1 = new Button("How　much!?");

	public FrameView(FrameController controller) {
	
		addWindowListener(this);
		setTitle("車のメーカーの名前");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new Label("名前一覧"));
//		add(new Label("\n"));
		// TODO Auto-generated method stub
	//	int sales_value;
		String name;
	//	String book_name;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.AselectAll();
		try {
			while(rs.next()){
				name = rs.getString("name");
		//		book_price = rs.getString("price.value");
			    Label l1 = new Label("【"+name+"】");
			//    Label l2 = new Label(book_price);
			    add(l1);
			//    add(l2);add(new Label("�ｽ~�ｽA"));
			    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
		

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		text3.setText(String.valueOf(val1 + val2));
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
