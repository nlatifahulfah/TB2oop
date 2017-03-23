// File : Frog.java
// PIC : Denita Hanna Widiastuti - 13514008

public class Frog extends Animal implements LandHabitat, WaterHabitat, Karnivora {
	private final String TIPEANIMAL = "frog";
	private final char SIMBOL = 'f';
	private int bobot;
	private String tipeHabitat[] = {"land", "water"};
	private String musuh[] = {"rhino", "flyingfish"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Frog
	* @param y posisi y awal Frog
	*/
	public Frog(int x, int y) {
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
	* Mendapatkan nilai bobot dari Frog
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	
	/**
	* Mendapatkan simbol dari Frog
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	
	/**
	* Mendapatkan musuh ke i dari Frog
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Frog
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
	* Mendapatkan reaksi Frog saat berinteraksi
	* dengan pengunjung
	*
	* @return "ribbit"
	*/
	@Override
	public String interact() {
		return "ribbit"; 
	}

	/**
	* Mendapatkan simbol dari Frog
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Frog
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}