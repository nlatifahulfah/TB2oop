
public class Goat extends Animal implements LandHabitat, Herbivora{
	private final String TIPEANIMAL = "goat";
	private final char SIMBOL = 'g';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"snake", "chicken"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Goat
	* @param y posisi y awal Goat
	*/
	public Goat(int x, int y) {
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
	* Mendapatkan nilai bobot dari Goat
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Goat
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Goat
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Goat
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
	* Mendapatkan reaksi Goat saat berinteraksi
	* dengan pengunjung
	*
	* @return "embeee"
	*/
	@Override
	public String interact() {
		return "embeee"; 
	}
	/**
	* Mendapatkan simbol dari Goat
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Goat
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}