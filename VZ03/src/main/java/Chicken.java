// File : Chicken.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Chicken extends Animal implements LandAnimal, Omnivora {
	private final String TIPEANIMAL = "chicken";
	private final char SIMBOL = 'n';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"snake", "goat"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Chicken
	* @param y posisi y awal Chicken
	*/
	public Chicken(int x, int y) {
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
	* Mendapatkan nilai bobot dari Chicken
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Chicken
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Chicken
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Chicken
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
	* Mendapatkan reaksi Chicken saat berinteraksi
	* dengan pengunjung
	*
	* @return "chipchip"
	*/
	@Override
	public String interact() {
		return "chipchip"; 
	}

	/**
	* Mendapatkan simbol dari Chicken
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Chicken
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}
