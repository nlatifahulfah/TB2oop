// File : Hedgehog.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Hedgehog extends Animal implements LandHabitat, Herbivora {
	private final String TIPEANIMAL = "hedgehog";
	private final char SIMBOL = 'h';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"elephant", "cow"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Hedgehog
	* @param y posisi y awal Hedgehog
	*/
	public Hedgehog(int x, int y) {
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
	* Mendapatkan nilai bobot dari Hedgehog
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Hedgehog
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Hedgehog
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Hedgehog
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
	* Mendapatkan reaksi Hedgehog saat berinteraksi
	* dengan pengunjung
	*
	* @return "duriduri"
	*/
	@Override
	public String interact() {
		return "duriduri"; 
	}

	/**
	* Mendapatkan simbol dari Hedgehog
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Hedgehog
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}