import java.util.TimerTask;

import javax.swing.JLabel;

class TimerUtil extends TimerTask {
	MyTime time; // 管理する時間
	JLabel label; // 時間表示用ラベル
	public TimerUtil(MyTime t,JLabel l) {
		time = t;
		label = l;
	}
	public void run() {// タイマーの実行
		time.countdown(); // カウントダウンと表示
		label.setText(""+time.getSecond());
	}

}