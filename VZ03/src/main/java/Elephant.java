// File : Elephant.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Elephant extends Animal implements LandHabitat, Herbivora {
	private final String TIPEANIMAL = "elephant";
	private final char SIMBOL = 'e';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"cow", "hedgehog"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Elephant
	* @param y posisi y awal Elephant
	*/
	public Elephant(int x, int y) {
		super(x, y);
		bobot = 30;
	}

	/**
	* Menambahkan bobot satu satuan
	*/

	@Override
	public void addBobot() {
		bobot++;
	}
	
	/**
	* Mendapatkan nilai bobot dari Elephant
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Elephant
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Elephant
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Elephant
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
	* Mendapatkan reaksi Elephant saat berinteraksi
	* dengan pengunjung
	*
	* @return "belalaihuee"
	*/
	@Override
	public String interact() {
		return "belalaihuee"; 
	}

	/**
	* Mendapatkan simbol dari Elephant
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Elephant
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}