// File : Dog.java
// PIC  : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class Dog extends Animal implements LandHabitat, Karnivora{
	private final String TIPEANIMAL = "dog";
	private final char SIMBOL = 'd';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"cat", "lion"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Dog
	* @param y posisi y awal Dog
	*/
	public Dog(int x, int y) {
		super(x, y);
		bobot = 10;
	}
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}
	/**
	* Mendapatkan nilai bobot dari Dog
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Dog
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Dog
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Dog
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
	* Mendapatkan reaksi Dog saat berinteraksi
	* dengan pengunjung
	*
	* @return "barkbark"
	*/
	@Override
	public String interact() {
		return "barkbark"; 
	}
	/**
	* Mendapatkan simbol dari Dog
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Dog
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}