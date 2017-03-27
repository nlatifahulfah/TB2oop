// File : Snake.java
// PIC  : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class Snake extends Animal implements LandAnimal, Karnivora{
	private final String TIPEANIMAL = "snake";
	private final char SIMBOL = 's';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"goat", "chicken"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Snake
	* @param y posisi y awal Snake
	*/
	public Snake(int x, int y) {
		super(x, y);
		bobot = 15;
	}
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}
	/**
	* Mendapatkan nilai bobot dari Snake
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Snake
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Snake
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Snake
	*
	* @return musuh[i]
	*/
	public String getMusuh(int i) {
		return musuh[i];
	}
	/**
	* Mendapatkan tipe Animal (nama spesies)
	*
	* @return tipeAnimal
	*/
	public String getTipeAnimal() {
		return TIPEANIMAL;
	}
	/**
	* Mendapatkan reaksi Snake saat berinteraksi
	* dengan pengunjung
	*
	* @return "ssstt"
	*/
	@Override
	public String interact() {
		return "ssstt"; 
	}
	/**
	* Mendapatkan simbol dari Snake
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Snake
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}
