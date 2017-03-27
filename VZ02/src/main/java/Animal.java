// File : Animal.java
// PIC : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class Animal {
	private int x;
	private int y;
	private int bobot;
	private char simbol;
	private String tipeHabitat[];
	private final String tipeAnimal;
	private int nHabitat;
	private String tipeMakanan;
	private String musuh[];

	/**
	* Konstruktor Animal.
	*
	* @param x Posisi x Animal ketika diciptakan
	* @param y Posisi y Animal ketika diciptakan
	* @param tipe Tipe hewan / nama spesies
	*/
	public Animal(int x, int y, String tipe) {
		tipeAnimal = tipe;
		this.x = x;
		this.y = y;
		
		if (tipeAnimal=="frog" || tipeAnimal=="flyingfish" || tipeAnimal=="bird") {
			nHabitat=2;
		} else 
			nHabitat=1;

		tipeHabitat = new String[nHabitat];
		musuh = new String[2];

		if (tipeAnimal=="frog") {
			simbol = 'f';
			tipeHabitat[0] = "land";
			tipeHabitat[1] = "water";
			bobot = 5;
			tipeMakanan = "karnivora";
			musuh[0] = "rhino";
			musuh[1] = "flyingfish";
		} else if (tipeAnimal=="flyingfish") {
			simbol = 'y';
			tipeHabitat[0] = "air";
			tipeHabitat[1] = "water";
			bobot = 10;
			tipeMakanan = "karnivora";
			musuh[0] = "frog";
			musuh[1] = "rhino";
		} else if (tipeAnimal=="bird") {
			simbol = 'b';
			tipeHabitat[0] = "land";
			tipeHabitat[1] = "air";
			bobot = 7;
			tipeMakanan = "omnivora";
			musuh[0] = "butterfly";
			musuh[1] = "eagle";
		} else if (tipeAnimal=="cat") {
			simbol = 'c';
			tipeHabitat[0] = "land";
			bobot = 10;
			tipeMakanan = "karnivora";
			musuh[0] = "dog";
			musuh[1] = "lion";
		} else if (tipeAnimal=="dog") {
			simbol = 'd';
			tipeHabitat[0] = "land";
			bobot = 10;
			tipeMakanan = "karnivora";
			musuh[0] = "cat";
			musuh[1] = "lion";
		} else if (tipeAnimal=="lion") {
			simbol = 'l';
			tipeHabitat[0] = "land";
			bobot = 20;
			tipeMakanan = "karnivora";
			musuh[0] = "cat";
			musuh[1] = "dog";
		} else if (tipeAnimal=="snake") {
			simbol = 's';
			tipeHabitat[0] = "land";
			bobot = 15;
			tipeMakanan = "karnivora";
			musuh[0] = "goat";
			musuh[1] = "chicken";
		} else if (tipeAnimal=="goat") {
			simbol = 'g';
			tipeHabitat[0] = "land";
			bobot = 18;
			tipeMakanan = "herbivora";
			musuh[0] = "snake";
			musuh[1] = "chicken";
		} else if (tipeAnimal=="chicken") {
			simbol = 'n';
			tipeHabitat[0] = "land";
			bobot = 7;
			tipeMakanan = "omnivora";
			musuh[0] = "snake";
			musuh[1] = "goat";
		} else if (tipeAnimal=="elephant") {
			simbol = 'e';
			tipeHabitat[0] = "land";
			bobot = 30;
			tipeMakanan = "herbivora";
			musuh[0] = "cow";
			musuh[1] = "hedgehog";
		} else if (tipeAnimal=="cow") {
			simbol = 'w';
			tipeHabitat[0] = "land";
			bobot = 25;
			tipeMakanan = "herbivora";
			musuh[0] = "elephant";
			musuh[1] = "hedgehog";
		} else if (tipeAnimal=="hedgehog") {
			simbol = 'h';
			tipeHabitat[0] = "land";
			bobot = 3;
			tipeMakanan = "herbivora";
			musuh[0] = "elephant";
			musuh[1] = "cow";
		} else if (tipeAnimal=="rhino") {
			simbol = 'r';
			tipeHabitat[0] = "land";
			bobot = 20;
			tipeMakanan = "herbivora";
			musuh[0] = "frog";
			musuh[1] = "flyingfish";
		} else if (tipeAnimal=="fish") {
			simbol = 'i';
			tipeHabitat[0] = "water";
			bobot = 5;
			tipeMakanan = "omnivora";
			musuh[0] = "duck";
			musuh[1] = "crocodile";
		} else if (tipeAnimal=="crocodile") {
			simbol = 'j';
			tipeHabitat[0] = "water";
			bobot = 25;
			tipeMakanan = "karnivora";
			musuh[0] = "duck";
			musuh[1] = "fish";
		} else if (tipeAnimal=="duck") {
			simbol = 'k';
			tipeHabitat[0] = "water";
			bobot = 10;
			tipeMakanan = "omnivora";
			musuh[0] = "fish";
			musuh[1] = "crocodile";
		} else if (tipeAnimal=="beetle") {
			simbol = 'q';
			tipeHabitat[0] = "air";
			bobot = 2;
			tipeMakanan = "herbivora";
			musuh[0] = "bee";
			musuh[1] = "owl";
		} else if (tipeAnimal=="bee") {
			simbol = 'z';
			tipeHabitat[0] = "air";
			bobot = 1;
			tipeMakanan = "herbivora";
			musuh[0] = "owl";
			musuh[1] = "beetle";
		} else if (tipeAnimal=="owl") {
			simbol = 'o';
			tipeHabitat[0] = "air";
			bobot = 7;
			tipeMakanan = "karnivora";
			musuh[0] = "bee";
			musuh[1] = "beetle";
		} else if (tipeAnimal=="eagle") {
			simbol = 'a';
			tipeHabitat[0] = "air";
			bobot = 12;
			tipeMakanan = "karnivora";
			musuh[0] = "bird";
			musuh[1] = "butterfly";
		} else if (tipeAnimal=="butterfly") {
			simbol = 't';
			tipeHabitat[0] = "air";
			bobot = 3;
			tipeMakanan = "herbivora";
			musuh[0] = "bird";
			musuh[1] = "eagle";
		}
	}

	/**
	* Set posisi x dari Animal.
	*
	* @param x Posisi x Animal yang diset
	*/
	public void setX(int x) {
		this.x = x;
	}

	/**
	* Set posisi y dari Animal.
	*
	* @param y Posisi y Animal yang diset
	*/
	public void setY(int y) {
		this.y = y;
	}

	public void addBobot() {
		bobot++;
	}

	/**
	* Get posisi x dari Animal.
	*
	* @return Posisi x Animal saat ini
	*/
	public int getX() {
		return x;
	}

	/**
	* Get posisi y dari Animal.
	*
	* @return Posisi y Animal saat ini
	*/
	public int getY() {
		return y;
	}

	/**
	* Mendapatkan nilai bobot dari Animal
	*
	* @return bobot saat ini
	*/
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan nHabitat dari suatu Animal
	*
	* return nHabitat
	*/
	public int getNHabitat() {
		return nHabitat;
	}

	/**
	* Mendapatkan tipeHabitat dari Animal
	* 
	* @return tipeHabitat
	*/
	public String getTipeHabitat(int i) {
		return tipeHabitat[i];
	}

	/**
	* Mendapatkan tipeAnimal / nama spesies dari Animal
	* 
	* @return tipeHabitat
	*/
	public String getTipeAnimal() {
		return tipeAnimal;
	}

	/**
	* Mendapatkan simbol dari Animal
	*
	* @return simbol
	*/
	public char getSimbol() {
		return simbol;
	}

	/**
	* Mendapatkan reaksi Animal saat berinteraksi
	* dengan pengunjung
	*
	* @return Interaksi yang diberikan Animal
	*/
	public String interact() {
		String ret="";
		if (tipeAnimal=="frog") {
			ret = "ribbit";
		} else if (tipeAnimal=="flyingfish") {
			ret = "flysplash";
		} else if (tipeAnimal=="bird") {
			ret = "cuitcuit";
		} else if (tipeAnimal=="cat") {
			ret = "meowmeow";
		} else if (tipeAnimal=="dog") {
			ret = "barkbark";
		} else if (tipeAnimal=="lion") {
			ret = "auuum";
		} else if (tipeAnimal=="snake") {
			ret = "ssstt";
		} else if (tipeAnimal=="goat") {
			ret = "embeee";
		} else if (tipeAnimal=="chicken") {
			ret = "chipchip";
		} else if (tipeAnimal=="elephant") {
			ret = "belalaihuee";
		} else if (tipeAnimal=="cow") {
			ret = "mooow";
		} else if (tipeAnimal=="hedgehog") {
			ret = "duriduri";
		} else if (tipeAnimal=="rhino") {
			ret = "culacula";
		} else if (tipeAnimal=="fish") {
			ret = "wetwet";
		} else if (tipeAnimal=="crocodile") {
			ret = "splashsplash";
		} else if (tipeAnimal=="duck") {
			ret = "kwekwek";
		} else if (tipeAnimal=="beetle") {
			ret = "kepakkepak";
		} else if (tipeAnimal=="bee") {
			ret = "ngggnggg";
		} else if (tipeAnimal=="owl") {
			ret = "uhukuhuk";
		} else if (tipeAnimal=="eagle") {
			ret = "gakgak";
		} else if (tipeAnimal=="butterfly") {
			ret = "flyfly";
		}
		return ret;
	}

	/**
	* Mendapatkan musuh suatu Animal
	* Yaitu binatang yang tidak dapat diletakkan satu kandang dengan
	* tipe animal tersebut
	*
	* @return musuh[i]
	*/
	public String getMusuh(int i) {
		return musuh[i];
	}

}
