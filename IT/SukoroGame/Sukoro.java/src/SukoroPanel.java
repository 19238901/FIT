import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import jp.fit.jc.it.BorderView;
import jp.fit.jc.it.CombinedView;
import jp.fit.jc.it.PPanel2;

class SukoroPanel extends PPanel2 implements MouseListener{
	CombinedView cview;

	SukoroPanel(int x, int y, JFrame f) {
		super(x, y, f);
		cview = new CombinedView(this);
		addPView(cview);
		addMouseListener(this);
		addPView(new BorderView(this, BorderView.FULL_BORDER, Color.black));
		cview.setDrawCharByString("１２３４①②③④");
	}
	String[] getCharaenge() {
	   	return cview.getCharenge();
	}
	void setMondai(String s[]) {

    	cview.setCharByString(s);
    }
	public void mouseClicked(MouseEvent e) {//クリックされた時の動作
		Point p = getUnit(e);  // クリックされたユニットを得る。
		int btn1 = e.getButton();
		if(btn1 == MouseEvent.BUTTON1) {
			cview.setRotateChars("１２３４．");
		} else if(btn1 == MouseEvent.BUTTON3) {
			cview.setRotateChars("４３２１．");
	    }
		cview.rotateCharacter(p,false); // 文字を変更する
		frame.repaint();
	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}