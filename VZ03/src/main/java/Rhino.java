// File : Rhino.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class Rhino extends Animal implements LandAnimal, Herbivora {
	private final String TIPEANIMAL = "rhino";
	private final char SIMBOL = 'r';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"frog", "flyingfish"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Rhino
	* @param y posisi y awal Rhino
	*/
	public Rhino(int x, int y) {
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
	* Mendapatkan nilai bobot dari Rhino
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Rhino
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Rhino
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Rhino
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
	* Mendapatkan reaksi Rhino saat berinteraksi
	* dengan pengunjung
	*
	* @return "cilacula"
	*/
	@Override
	public String interact() {
		return "cilacula"; 
	}

	/**
	* Mendapatkan simbol dari Rhino
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Rhino
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}
