// File	: Bee.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author  Hasna Nur Karimah - 13514106
 */
public class Bird extends Animal implements FlyingAnimal, Herbivora {
	private final String TIPEANIMAL = "bee";
	private final char SIMBOL = 'z';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"owl", "beetle"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Bee
	* @param y posisi y awal Bee
	*/
	public Bee(int x, int y) {
		super(x, y);
		bobot = 1;
	}
	
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}

	/**
	* Mendapatkan nilai bobot dari Bee
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Bee
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Bee
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Bee
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
	* Mendapatkan reaksi Bee saat berinteraksi
	* dengan pengunjung
	*
	* @return "ngggnggg"
	*/
	@Override
	public String interact() {
		return "ngggnggg"; 
	}

	/**
	* Mendapatkan simbol dari Bee
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Bee
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
