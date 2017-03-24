// File	: View.java
// PIC	: Hasna Nur Karimah - 13514106

public class Bird extends Animal implements LandAnimal, FlyingAnimal, Karnivora {
	private final String TIPEANIMAL = "bird";
	private final char SIMBOL = 'b';
	private int bobot;
	private String tipeHabitat[] = {"land", "air"};
	private String musuh[] = {"butterfly", "eagle"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Snake
	* @param y posisi y awal Snake
	*/
	public Bird(int x, int y) {
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
	* Mendapatkan nilai bobot dari Snake
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan simbol dari Snake
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Snake
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Snake
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
	* Mendapatkan reaksi Snake saat berinteraksi
	* dengan pengunjung
	*
	* @return "ssstt"
	*/
	@Override
	public String interact() {
		return "cuitcuit"; 
	}

	/**
	* Mendapatkan simbol dari Snake
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Snake
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
