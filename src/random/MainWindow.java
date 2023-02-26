package random;
import java.awt.Font;
import java.io.IOException;

import javax.swing.*;

/**
 * メイン画面
 */
public class MainWindow {

  private final JFrame frame;
  private final JLabel messageLabel;
  private final JButton button;
  private final JButton resetButton;
  private String outputText;

  /**
   * コンストラクタ
   */
  public MainWindow() {
    // 画面生成
    this.frame = new JFrame("Num Test");
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 画面サイズを指定
    this.frame.setBounds(200, 200, 800, 300);

    var pane = this.frame.getContentPane();

    // このcanvasに対して、ボタンやラベルを配置していく
    var canvas = new JPanel();

    // 自由レイアウトに変更する
    canvas.setLayout(null);

    Font font = new Font("Dialog", 1, 35);

    //メッセージラベルを作成する
    this.messageLabel = new JLabel("这位幸运儿是：");
    messageLabel.setBounds(20, 20, 800, 60);
    messageLabel.setFont(font);
    canvas.add(this.messageLabel);

    // ボタンを作成する
    this.button = new JButton("Run");
    button.setBounds(50, 100, 150, 60);
    this.button.addActionListener(e -> this.showResult());
    canvas.add(this.button);

    this.resetButton= new JButton("Reset");
    resetButton.setBounds(250, 100, 150, 60);
    this.resetButton.addActionListener(e -> {
      try {
        new WriteFile().reset();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    });
    canvas.add(this.resetButton);

    // 画面にCanvasを追加
    pane.add(canvas);
  }

  // 判断結果を出力
  public void showResult() {
    
    try {
      outputText = new WeightRandom().getName();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    messageLabel.setText(outputText);
  }

  /**
   * 画面表示
   */
  public void show() {
    // this.init();
    this.frame.setVisible(true);
  }

}