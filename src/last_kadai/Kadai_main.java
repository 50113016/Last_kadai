package last_kadai;

public class Kadai_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FrameController controller = new FrameController();
       FrameView frame = new FrameView(controller);
       frame.setBounds(5,5,1000,600);
       frame.setVisible(true);
	}

}
