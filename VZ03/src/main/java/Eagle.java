public class Bird extends Animal implements FlyingAnimal, Karnivora {
	private final String TIPEANIMAL = "eagle";
	private final char SIMBOL = 'a';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"bird", "butterfly"};

	public Eagle(int x, int y) {
		super(x, y);
		bobot = 12;
	}
	
	public void addBobot() {
		bobot++;
	}

	public int getBobot() {
		return bobot;
	}

	public char getSimbol() {
		return SIMBOL;
	}

	public String getMusuh(int i) {
		return musuh[i];
	}

	public String getTipeAnimal() {
		return TIPEANIMAL;
	}

	public String interact() {
		return "gakgak"; 
	}

	public char render() {
		return SIMBOL;
	}

	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
