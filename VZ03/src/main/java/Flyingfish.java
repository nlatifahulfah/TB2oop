// File : Flyingfish.java
// PIC  : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class Flyingfish extends Animal implements WaterAnimal, FlyingAnimal, Karnivora {
	private final String TIPEANIMAL = "flyingfish";
	private final char SIMBOL = 'y';
	private int bobot;
	private String tipeHabitat[] = {"water", "air"};
	private String musuh[] = {"frog", "rhino"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Flyingfish
	* @param y posisi y awal Flyingfish
	*/
	public Flyingfish(int x, int y) {
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
	* Mendapatkan nilai bobot dari Flyingfish
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Flyingfish
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Flyingfish
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Flyingfish
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
	* Mendapatkan reaksi Flyingfish saat berinteraksi
	* dengan pengunjung
	*
	* @return "flysplash"
	*/
	@Override
	public String interact() {
		return "flysplash"; 
	}
	/**
	* Mendapatkan simbol dari Flyingfish
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Flyingfish
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}