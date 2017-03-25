// File : Duck.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Duck extends Animal implements WaterHabitat, Omnivora {
	private final String TIPEANIMAL = "duck";
	private final char SIMBOL = 'k';
	private int bobot;
	private String tipeHabitat[] = {"water"};
	private String musuh[] = {"fish", "crocodile"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Duck
	* @param y posisi y awal Duck
	*/
	public Duck(int x, int y) {
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
	* Mendapatkan nilai bobot dari Duck
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Duck
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Duck
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Duck
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
	* Mendapatkan reaksi Duck saat berinteraksi
	* dengan pengunjung
	*
	* @return "kwekkwek"
	*/
	@Override
	public String interact() {
		return "kwekkwek"; 
	}

	/**
	* Mendapatkan simbol dari Duck
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Duck
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}