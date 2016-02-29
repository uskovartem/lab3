import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {

	/**
	 * Конструктор главного окна,
	 * который его же и отображает
	 */
   public TitlesFrame() {
      this.initUI();
   }

   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(14));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   /**
    * Главная функция программы
    * @param args Параметры командной строки
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
