// File : Crocodile.java
// PIC : Denita Hanna Widiastuti - 13514008

public class Crocodile extends Animal implements WaterHabitat, Karnivora {
	private final String TIPEANIMAL = "crocodile";
	private final char SIMBOL = 'j';
	private int bobot;
	private String tipeHabitat[] = {"water"};
	private String musuh[] = {"duck", "fish"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Crocodile
	* @param y posisi y awal Crocodile
	*/
	public Crocodile(int x, int y) {
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
	* Mendapatkan nilai bobot dari Crocodile
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Crocodile
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Crocodile
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Crocodile
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
	* Mendapatkan reaksi Crocodile saat berinteraksi
	* dengan pengunjung
	*
	* @return "splashsplash"
	*/
	@Override
	public String interact() {
		return "splashsplash"; 
	}

	/**
	* Mendapatkan simbol dari Crocodile
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Crocodile
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}