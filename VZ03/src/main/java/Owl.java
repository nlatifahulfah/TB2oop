// File	: Owl.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author  Hasna Nur Karimah - 13514106
 */
public class Bird extends Animal implements FlyingAnimal, Karnivora {
	private final String TIPEANIMAL = "owl";
	private final char SIMBOL = 'o';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"bee", "beetle"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Owl
	* @param y posisi y awal Owl
	*/
	public Owl(int x, int y) {
		super(x, y);
		bobot = 7;
	}
	
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}

	/**
	* Mendapatkan nilai bobot dari Owl
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan simbol dari Owl
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Owl
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Owl
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
	* Mendapatkan reaksi Owl saat berinteraksi
	* dengan pengunjung
	*
	* @return "uhukuhuk"
	*/
	@Override
	public String interact() {
		return "uhukuhuk"; 
	}

	/**
	* Mendapatkan simbol dari Owl
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Owl
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
