// File : Fish.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Fish extends Animal implements WaterAnimal, Omnivora {
	private final String TIPEANIMAL = "fish";
	private final char SIMBOL = 'i';
	private int bobot;
	private String tipeHabitat[] = {"water"};
	private String musuh[] = {"duck", "crocodile"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Fish
	* @param y posisi y awal Fish
	*/
	public Fish(int x, int y) {
		super(x, y);
		bobot = 5;
	}

	/**
	* Menambahkan bobot satu satuan
	*/

	@Override
	public void addBobot() {
		bobot++;
	}
	
	/**
	* Mendapatkan nilai bobot dari Fish
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Fish
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Fish
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Fish
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
	* Mendapatkan reaksi Fish saat berinteraksi
	* dengan pengunjung
	*
	* @return "wetwet"
	*/
	@Override
	public String interact() {
		return "wetwet"; 
	}

	/**
	* Mendapatkan simbol dari Fish
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Fish
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}
