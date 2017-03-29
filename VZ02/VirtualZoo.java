// File	: VirtualZoo.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author Hasna Nur Karimah - 13514106
 */
 
import java.util.concurrent.ThreadLocalRandom;

public class VirtualZoo {

	private MatrixCell matriksCell;
		
	private int nEntrance;
	private Cell[] listEntrance;
	private int nExit;
	private Cell[] listExit;

	private int nCage;
	private Cage[] cages;
	private View maps;	

	private Visitor person;

	private int nRoad; //termasuk entrance n exit
	private Cell[] listVisited;
	private int currentVisited;
	private int nVisited;
	
	/**
	* Constructor
	* @param input_file Nama file input yang berisi konfigurasi Zoo
	*/
	public VirtualZoo(String inputFile) {
		
		FileReader data = new FileReader(inputFile);
		
		data.read();	

		// 1. Inisialisasi Virtual Zoo
		matriksCell = new MatrixCell(data.getNBrs(), data.getNKol());
		// cout << matriksCell.getNBrs() << " ";
		// cout << matriksCell.getNKol() << endl;
		System.out.println(data.getNBrs());
		int max = (matriksCell.getNBrs() + matriksCell.getNKol())*2;
		listEntrance = new Cell[max];
		nEntrance = 0;
		listExit = new Cell[max];
		nExit = 0;
		nRoad = 0;
		
		char c;
		for(int i=0; i<matriksCell.getNBrs(); i++){
			for(int j=0; j<matriksCell.getNKol(); j++){
				c = data.getMaps(i,j);
				//cari index jenis Cell
				int k=0;
				boolean found = false;
				while (k<data.getNCellType() && !found) {
					if (c == data.getCellSimbol(k)) {
						found = true;
					}else
						k++;
				}

				//System.out.println(data.getCellType(k));
				//System.out.println(i + " " + j);
				//inisialisasi
				if (data.getCellType(k).equals("airhabitat")){
					//System.out.println("masuk ah");
					matriksCell.setCell(new Cell(i,j,c), i, j);
				}else if (data.getCellType(k).equals("waterhabitat")){
					matriksCell.setCell(new Cell(i,j,c), i, j);
				}else if (data.getCellType(k).equals("landhabitat")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if (data.getCellType(k).equals("road")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					nRoad++;
				}else if(data.getCellType(k).equals("park")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if(data.getCellType(k).equals("restourant")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if(data.getCellType(k).equals("entrance")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					listEntrance[nEntrance] = new Cell(i,j, c);
					nEntrance++;
					nRoad++;
				}else if(data.getCellType(k).equals("exit")){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					listExit[nExit] = new Cell(i,j, c);
					nExit++;
					nRoad++;
				} else System.out.println("ga keset");
				//System.out.print(matriksCell.getCell(i,j).getTipe());
				
				// cout << matriksCell.getCell(i,j).render();
			}
			//System.out.println();
			// cout <<endl;
		}


		// 2. Inisialisasi objek Cage
		nCage = data.getNCage();
		// cout << nCage << endl;
		cages = new Cage[nCage];

		int n = 0, m =0;
		for(int i=0; i<nCage; i++){
			cages[i]= new Cage(data.getCageSimbol(i), data.getCageType(i));
			//System.out.println(data.getCageType(i));
			// cout << cages[i].render() <<" "<<cages[i].getTipeHabitat()<<endl;

			int x,y;  
			n = n + data.getNCageArea(i);
			for(int j=m; j<n; j++){
				//posisi pada zoo
				x = data.getPosX(j);
				y = data.getPosY(j);
				System.out.println(x + " " + y);
				// cout << x <<" "<< y <<endl;
				// cek apakah cell memiliki tipe yang sesuai
				// cout<<matriksCell.getCell(x,y).getTipe() <<" ";
				// cout<< cages[i].getTipeHabitat()<<endl;
				if((matriksCell.getCell(x,y).getTipe()).equals(cages[i].getTipeHabitat())){
					cages[i].addCagePosition(matriksCell.getCell(x,y));
					System.out.println(matriksCell.getCell(x,y).getTipe());
				
					// cout << cages[i].getCagePosition(cages[i].getNArea()-1).getX()<<" ";
					// cout << cages[i].getCagePosition(cages[i].getNArea()-1).getY()<<endl;
				}
			}
			// cout << endl;
			m = m + data.getNCageArea(i);
		}
		printVirtualZoo();

		//3. Inisialcisasi objek2 binatang dan meletakkannya di Cage yang sesuai
		int jumlahAnimal;
		for(int i=0; i< nCage; i++){

			// cout << "max animal:" <<cages[i].getMaxAnimal() <<endl;
			jumlahAnimal = data.getNAnimal(i);
			if (jumlahAnimal > cages[i].getMaxAnimal()) {
				jumlahAnimal = cages[i].getMaxAnimal();
			}
			// cout << "n animal:" << jumlahAnimal <<endl;
			for(int j=0; j<jumlahAnimal; j++){
				//~ cout <<"yang udah ada:"<< cages[i].getNAnimal() <<endl;
				if (cages[i].getTipeHabitat().equals("land")){
					//random posisi awal, pastikan masih kosong 
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					do {
						//nr = rand() % cages[i].getNArea();
						nr = ThreadLocalRandom.current().nextInt(cages[i].getNArea());
			
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					} while (!found);
					
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" land "<<y<<endl;
					//ciptakan hewan
					//nr = rand() % 12 + 1;
					nr = ThreadLocalRandom.current().nextInt(1, 12+1);
					switch(nr){
						case 1: cages[i].addAnimal(new Animal(x,y,"cat"));break;
						case 2: cages[i].addAnimal(new Animal(x,y,"dog"));break;
						case 3: cages[i].addAnimal(new Animal(x,y,"lion"));break;
						case 4: cages[i].addAnimal(new Animal(x,y,"snake"));break;
						case 5: cages[i].addAnimal(new Animal(x,y,"goat"));break;
						case 6: cages[i].addAnimal(new Animal(x,y,"chicken"));break;
						case 7: cages[i].addAnimal(new Animal(x,y,"elephant"));break;
						case 8: cages[i].addAnimal(new Animal(x,y,"cow"));break;
						case 9: cages[i].addAnimal(new Animal(x,y,"hedgehog"));break;
						case 10: cages[i].addAnimal(new Animal(x,y,"rhino"));break;
						case 11: cages[i].addAnimal(new Animal(x,y,"frog"));break;
						case 12: cages[i].addAnimal(new Animal(x,y,"bird"));break;
					}
					// int d =cages[i].getNAnimal()-1; 
					// cout << d<< " ";
					// cout <<cages[i].getAnimal(d).getX()<<" land ";
					// cout <<cages[i].getAnimal(d).getY()<<endl;
				}else if (cages[i].getTipeHabitat().equals("water")){
					
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					do {
						//nr = rand() % cages[i].getNArea();
						nr = ThreadLocalRandom.current().nextInt(cages[i].getNArea());
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					} while (!found);
					// cout << pos << endl;
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" water "<<y<<endl;

					//nr = rand() % 5 + 1;
					nr = ThreadLocalRandom.current().nextInt(1, 5+1);
			
					// cout <<"nr = "<<nr<<endl;
					switch(nr){
						case 1: cages[i].addAnimal(new Animal(x,y,"bird"));break;
						case 2: cages[i].addAnimal(new Animal(x,y,"crocodile"));break;
						case 3: cages[i].addAnimal(new Animal(x,y,"frog"));break;
						case 4: cages[i].addAnimal(new Animal(x,y,"duck"));break;
						case 5: cages[i].addAnimal(new Animal(x,y,"flyingfish"));break;
					}
					// int d =cages[i].getNAnimal()-1; 
					// // cout << d<< " ";
					// cout <<cages[i].getAnimal(d).getX()<<" water ";
					// cout <<cages[i].getAnimal(d).getY()<<endl;
				}else if (cages[i].getTipeHabitat().equals("air")){
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					do {
						//nr = rand() % cages[i].getNArea();
						nr = ThreadLocalRandom.current().nextInt(cages[i].getNArea());
			
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					} while (!found);
					
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" air "<<y<<endl;

					//nr = rand() % 7 + 1;
					nr = ThreadLocalRandom.current().nextInt(1, 7+1);
			
					switch(nr){
						case 1: cages[i].addAnimal(new Animal(x,y,"beetle"));break;
						case 2: cages[i].addAnimal(new Animal(x,y,"bee"));break;
						case 3: cages[i].addAnimal(new Animal(x,y,"owl"));break;
						case 4: cages[i].addAnimal(new Animal(x,y,"eagle"));break;
						case 5: cages[i].addAnimal(new Animal(x,y,"butterfly"));break;
						case 6: cages[i].addAnimal(new Animal(x,y,"bird"));break;
						case 7: cages[i].addAnimal(new Animal(x,y,"flyingfish"));break;
					}
					// int d =cages[i].getNAnimal()-1; 
					// cout << d<< " ";
					// cout <<cages[i].getAnimal(d).getX()<<" air ";
					// cout <<cages[i].getAnimal(d).getY()<<endl;				
				}
			}
		}


		maps = new View(matriksCell.getNBrs(),matriksCell.getNKol());

		int x = getEntrance().getX();
		int y = getEntrance().getY();

		person = new Visitor(x,y);
		listVisited = new Cell[nRoad];
		nVisited = 0;
		currentVisited = -1;
	}

	/**
	 * Menambahkan simbol2 dari lingkungan Zoo ke Maps
	 */		
	public void addZooToMaps() {
		for(int i=0; i<matriksCell.getNBrs(); i++){
			for(int j=0; j<matriksCell.getNKol(); j++){
				maps.setVal(i,j,matriksCell.getCell(i,j).render());
			}
		}
	}
	
	/**
	* Menambahkan simbol2 dari Cage ke Maps
	*/	
	public void addCagetoMaps() {
	int x,y;
	for(int i=0; i<nCage; i++) {
		for(int j=0; j<cages[i].getNArea(); j++) {
			// cout << cages[i].getCagePosition(j) << endl;
			x = cages[i].getCagePosition(j).getX();
			y = cages[i].getCagePosition(j).getY();
			maps.setVal(x,y,cages[i].render());
			}
		}
	}
	
	/**
	* Menambahkan simbol2 dari Animal ke Maps
	*/
	public void addAnimalToMaps() {
		int x,y;
		char z;
		for(int i=0; i<nCage; i++) {
			for(int j=0; j<cages[i].getNAnimal(); j++) {
				x = cages[i].getAnimal(j).getX();
				y = cages[i].getAnimal(j).getY();
				z = cages[i].getAnimal(j).getSimbol();
				// cout << cages[i].getAnimal(j).getSimbol() << endl;
				maps.setVal(x,y,z);
				// cout <<x <<" "<<y << endl;
			}
		}
	}

	/**
	* Menambahkan simbol dari Visitor ke Maps
	*/
	public void addVisitorToMaps() {
		int x = person.getX();
		int y = person.getY();
		char z = person.getSimbol();
		maps.setVal(x,y,z);
	}

	/**
	* Menentukan apakah suatu area masih dalam 
	* jangkauan area Virtual Zoo 
	* @param kiri Indeks batas kiri Virtual Zoo
	* @param atas Indeks batas atas Virtual Zoo
	* @param kanan Indeks batas kanan Virtual Zoo
	* @param bawah Indeks batas bawah Virtual Zoo
	* @return true jika masih dalam jangkauan,
			  false jika diluar jangkauan
	*/
	public boolean isInRage(int kiri,int atas,int kanan,int bawah) {
		int xMax = matriksCell.getNBrs();
		int yMax = matriksCell.getNKol();
		if (atas>=0 && kiri>=0 && bawah<=xMax && kanan<=yMax) {
			return true;
		} else {
			return false;
		}
	}

	/**
	* Menentukan apakah suatu titik masih di dalam 
	*  area Virtual Zoo 
	* @param x 
	* @param y
	* @return true jika masih dalam jangkauan,
	*		  false jika diluar jangkauan
	*/
	public boolean isInRage(int x, int y) {
		int xMax = matriksCell.getNBrs();
		int yMax = matriksCell.getNKol();
		if (x>=0 && y>=0 && x<xMax && y<yMax) {
			return true;
		} else {
			return false;
		}
	}

	/**
	* Mencetak seluruh peta dan komponen Virtual Zoo
	*/
	public void printVirtualZoo() {
		addZooToMaps();
		addCagetoMaps();
		addAnimalToMaps();
		addVisitorToMaps();
		maps.printView();
	}
	
	/**
	* Mencetak peta dan komponen Virtual Zoo pada
	* area tertentu
	* @param kiri Indeks batas kiri Virtual Zoo
	* @param atas Indeks batas atas Virtual Zoo
	* @param kanan Indeks batas kanan Virtual Zoo
	* @param bawah Indeks batas bawah Virtual Zoo
	*/
	public void printVirtualZoo(int kiri,int atas,int kanan,int bawah) {
		addZooToMaps();
		addCagetoMaps();
		addAnimalToMaps();
		addVisitorToMaps();
		maps.printView(kiri,atas,kanan,bawah);
	}

	/**
	* Memindahkan posisi Animal pada Virtual Zoo
	*/
	public void moveAnimal() {
		for(int i = 0; i < nCage; i++) {
			for(int j = 0; j < cages[i].getNAnimal(); j++) {
				//random posisi
				int nr;
				boolean found = false;
				Cell pos;
				do {
					//nr = rand() % cages[i].getNArea();
					nr = ThreadLocalRandom.current().nextInt(cages[i].getNArea());
			
					pos = cages[i].getCagePosition(nr);

					//cek apa ada hewan yang udah di posisi itu
					found = cages[i].isPositionEmpty(pos);
				} while (!found);
 
				int x = pos.getX();
				int y = pos.getY();

				cages[i].getAnimal(j).setX(x);
				cages[i].getAnimal(j).setY(y);
			}
		}
	}

	/**
	* Mencetak seluruh interaksi yang dialami visitor
	*/
	public void interact() {
		int xNow = person.getX();
		int yNow = person.getY();

		int xMax = matriksCell.getNBrs()-1;
		int yMax = matriksCell.getNKol()-1;

		Cell[] cellAvailable = new Cell[4];
		int nAvailable = 0;

		int x,y;

		//kanan
		x = xNow + 1;
		y = yNow;
		if (isInRage(x,y)) {
			printInteraction(x,y);
		}
		
		//atas
		x = xNow;
		y = yNow + 1;
		if (isInRage(x,y)) {
			printInteraction(x,y);
		}

		//kiri
		x = xNow - 1;
		y = yNow;
		if (isInRage(x,y)) {
			printInteraction(x,y);
		}
		
		//bawah
		x = xNow;
		y = yNow - 1;
		if (isInRage(x,y)) {
			printInteraction(x,y);
		}
		
	}

	/**
	* Mencetak interaksi yang dialami visitor oleh Cage
	* yang berada di koordinat (x,y)
	* @param x Posisi x dari Cage
	* @param y Posisi y dari Cage
	*/
	public void printInteraction(int x, int y) {
		int i = 0;
		boolean found = false;
		while (i < nCage && !found) {
			if (cages[i].isPositionInCage(x, y)) {
				found = true;

				for(int j=0; j<cages[i].getNAnimal(); j++) {
					System.out.print(cages[i].getAnimal(j).interact() + " ");
				}
				System.out.println();
			}
			i++;
		}

	}

	/**
	* mendapatkan total makanan yang diperlukan Virtual Zoo
	* @return total_makanan
	*/
	public int getTotalMakanan() {
		int totalMakanan = 0;
		for(int i = 0; i < nCage; i++) {
			
			totalMakanan = totalMakanan + cages[i].getTotalMakanan();
			
		}

		return totalMakanan;
	}

	/**
	* Mendapatkan cell yang merupakan entrance random dari seluruh
	* entrance yang ada
	*/
	public Cell getEntrance() {
		//int rn = rand() % nEntrance;
		int rn = ThreadLocalRandom.current().nextInt(nEntrance);
			
		return listEntrance[rn];
	}

	/**
	* Memindahkan posisi visitor ke road terdekat
	*/
	public void moveVisitor() {
		int xNow = person.getX();
		int yNow = person.getY();

		int xMax = matriksCell.getNBrs()-1;
		int yMax = matriksCell.getNKol()-1;

		Cell[] cellAvailable = new Cell[4];
		int nAvailable = 0;

		int x,y;

		//kanan
		x = xNow + 1;
		y = yNow;

		if (x>=0 && y>=0 && x<=xMax && y<=yMax) {

			if (matriksCell.getCell(x,y).getTipe() == "road" || matriksCell.getCell(x,y).getTipe() == "exit" ) {

			// cout << "masuk kanan" << endl;
			
				if (!isVisited(matriksCell.getCell(x,y))) {
					cellAvailable[nAvailable] = matriksCell.getCell(x,y);
					nAvailable++;
				}
			}
		}

		//atas
		x = xNow;
		y = yNow + 1;

		if (x>=0 && y>=0 && x<=xMax && y<=yMax) {
			// cout << "masuk atas" << endl;
			if (matriksCell.getCell(x,y).getTipe() == "road" || matriksCell.getCell(x,y).getTipe() == "exit" ) {
				if (!isVisited(matriksCell.getCell(x,y))) {
					cellAvailable[nAvailable] = matriksCell.getCell(x,y);
					nAvailable++;
				}
			}
		}

		//kiri
		x = xNow - 1;
		y = yNow;

		if (x>=0 && y>=0 && x<=xMax && y<=yMax) {
			// cout << "masuk kiri" << endl;
			if (matriksCell.getCell(x,y).getTipe() == "road"  || matriksCell.getCell(x,y).getTipe() == "exit" ) {
				if (!isVisited(matriksCell.getCell(x,y))) {
					cellAvailable[nAvailable] = matriksCell.getCell(x,y);
					nAvailable++;
				}
			}
		}

		//bawah
		x = xNow;
		y = yNow - 1;

		if (x>=0 && y>=0 && x<=xMax && y<=yMax) {
			// cout << "masuk bawah" << endl;
			if (matriksCell.getCell(x,y).getTipe() == "road"  || matriksCell.getCell(x,y).getTipe() == "exit" ) {
				if (!isVisited(matriksCell.getCell(x,y))) {
					cellAvailable[nAvailable] = matriksCell.getCell(x,y);
					nAvailable++;
				}
			}
		}


		if (nAvailable == 0) {
			// cout << "tidak ada jalan" << endl;
			currentVisited--;
			int xNext = listVisited[currentVisited].getX();
			int yNext = listVisited[currentVisited].getY();
			person.setPosition(xNext, yNext);
		} else {
			// cout << "ada jalan " << nAvailable << endl;
			//int rn = rand() % nAvailable;
			int rn = ThreadLocalRandom.current().nextInt(nAvailable);
			int xNext = cellAvailable[rn].getX();
			int yNext = cellAvailable[rn].getY();
			listVisited[nVisited] = cellAvailable[rn];
			nVisited++;
			currentVisited++;
			person.setPosition(xNext, yNext);
		}


	}

	/**
	* Menentukan suatu cell apakah sudah pernah dikunjungi
	* atau belum
	* @param cel Cell yang dites
	* @return true Jika cel pernah dikunjungi,
	*		  false Jika cel belum pernah dikunjungi
	*/
	public boolean isVisited(Cell cel) {
		boolean visited = false;
		int i =0;
		while (i < nVisited && !visited) {
			if (listVisited[i].getX() == cel.getX() && listVisited[i].getY() == cel.getY()) {
				visited = true;
			}
			i++;
		}

		return visited;
	}

	/**
	* Menentukan apakah posisi visitor berada pada
	* cell exit
	* @return true Jika posisi visitor berada pada cell exit,
	*		  false Jika posisi visitor tidak berada pada cell exit
	*/
	public boolean isEndOfTour() {
		int x = person.getX();
		int y = person.getY();
		boolean endOfTour = false;
		if (matriksCell.getCell(x,y).getTipe() == "exit") {
			endOfTour = true;
		}
		return endOfTour;
	}

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  
   
	/**
	* Melakukan tour zoo. Menggerakkan visitor dari entrance
	* sampai ke exit
	*/
	public void tour() {
		clearScreen();
		printVirtualZoo();
		do {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			clearScreen();
			moveAnimal();
			moveVisitor();
			printVirtualZoo();
			interact();
		}while (!isEndOfTour());
	}


}


