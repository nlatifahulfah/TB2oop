
public class Cat extends Animal implements LandHabitat, Karnivora{
	private final String TIPEANIMAL = "cat";
	private final char SIMBOL = 'c';
	private int bobot;
	private String tipeHabitat[] = {"land"};
	private String musuh[] = {"dog", "lion"};
	/**
	* Constructor
	* 
	* @param x posisi x awal Cat
	* @param y posisi y awal Cat
	*/
	public Cat(int x, int y) {
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
	* Mendapatkan nilai bobot dari Cat
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}
	/**
	* Mendapatkan simbol dari Cat
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}
	/**
	* Mendapatkan musuh ke i dari Cat
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Cat
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
	* Mendapatkan reaksi Cat saat berinteraksi
	* dengan pengunjung
	*
	* @return "meowmeow"
	*/
	@Override
	public String interact() {
		return "meowmeow"; 
	}
	/**
	* Mendapatkan simbol dari Cat
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}
	/**
	* Mendapatkan tipeHabitat dari Cat
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; //blm fix
	}
}