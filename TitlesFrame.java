import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {

	/**
	 * ����������� �������� ����,
	 * ������� ��� �� � ����������
	 */
   public TitlesFrame() {
      this.initUI();
   }

   private void initUI() {
      this.setTitle("������ ������");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(14));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   /**
    * ������� ������� ���������
    * @param args ��������� ��������� ������
    */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
