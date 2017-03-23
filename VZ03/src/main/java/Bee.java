public class Bird extends Animal implements FlyingAnimal, Herbivora {
	private final String TIPEANIMAL = "bee";
	private final char SIMBOL = 'z';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"owl", "beetle"};

	public Bee(int x, int y) {
		super(x, y);
		bobot = 1;
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
		return "ngggnggg"; 
	}

	public char render() {
		return SIMBOL;
	}

	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
