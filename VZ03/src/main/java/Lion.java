// File : Lion.java
// PIC  : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class Lion extends Animal implements LandAnimal, Karnivora{
	private final String TIPEANIMAL = "lion";
	private final char SIMBOL = 'l';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"cat", "dog"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Lion
	* @param y posisi y awal Lion
	*/
	public Lion(int x, int y) {
		super(x, y);
		bobot = 20;
	}
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}
	/**
	* Mendapatkan nilai bobot dari Lion
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Lion
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Lion
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Lion
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
	* Mendapatkan reaksi Lion saat berinteraksi
	* dengan pengunjung
	*
	* @return "auuum"
	*/
	@Override
	public String interact() {
		return "auuum"; 
	}
	/**
	* Mendapatkan simbol dari Lion
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Lion
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}
