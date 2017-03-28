// File : Visitor.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiasuti - 13514008
 */
public class Visitor {
  private int x;
  private int y;
  private char simbol = 'V';

  /**
  * Menginiasi letak koordinat visitor (constructor)
  *
  * @param x Koordinat sumbu X visitor
  * @param y Koordinat sumbu Y visitor
  */
  public Visitor (int x, int y) {
	 this.x = x;
	 this.y = y;
  }

  /**
  * Mengirim koordinat sumbu X dari letak visitor saat ini
  *
  * @return x
  */
  public int getX() {
	 return x;
  }

  /**
  * Mengirim koordinat sumbu Y dari letak visitor saat ini
  *
  * @return y
  */
  public int getY() {
  	return y;
  }


  /**
  * Mengeset posisi
  *
  * @param x Koordinat sumbu X visitor
  * @param y Koordinat sumbu Y visitor
  */
  public void setPosition(int x, int y) {
  	this.x = x;
  	this.y = y;
  }

  /**
  * Mengirim simbol dari visitor pada view
  *
  * @return simbol
  */
  public char getSimbol() {
  	return simbol;
  }
}