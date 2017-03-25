// File : Cow.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Cow extends Animal implements LandHabitat, Herbivora {
	private final String TIPEANIMAL = "cow";
	private final char SIMBOL = 'w';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"elephant", "hedgehog"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Cow
	* @param y posisi y awal Cow
	*/
	public Cow(int x, int y) {
		super(x, y);
		bobot = 25;
	}

	/**
	* Menambahkan bobot satu satuan
	*/

	@Override
	public void addBobot() {
		bobot++;
	}
	
	/**
	* Mendapatkan nilai bobot dari Cow
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Cow
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Cow
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Cow
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
	* Mendapatkan reaksi Cow saat berinteraksi
	* dengan pengunjung
	*
	* @return "mooow"
	*/
	@Override
	public String interact() {
		return "mooow"; 
	}

	/**
	* Mendapatkan simbol dari Cow
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Cow
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}