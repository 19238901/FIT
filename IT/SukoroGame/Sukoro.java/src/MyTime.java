public class MyTime { //　残り時間クラス
	int second; // 残り時間
	MyTime() {this(1200);}; // 引数なしコンストラクタ
	MyTime(int t) { second = t; } // コンストラクタ
	public void countdown() { // 1秒ごとに減らす
		if(second > 0) {
			second--;
		} else {
			System.exit(0);
		}
	}
	int getSecond() {
		return second; // 時間を得る
	}
}