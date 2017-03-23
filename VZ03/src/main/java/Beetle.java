public class Bird extends Animal implements FlyingAnimal, Herbivora {
	private final String TIPEANIMAL = "beetle";
	private final char SIMBOL = 'q';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"owl", "bee"};

	public Beetle(int x, int y) {
		super(x, y);
		bobot = 2;
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
		return "kepakkepak"; 
	}

	public char render() {
		return SIMBOL;
	}

	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
