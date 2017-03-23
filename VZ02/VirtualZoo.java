// File	: VirtualZoo.java
// PIC	: Hasna Nur Karimah - 13514106

public class VirtualZoo {

	private MatrixCell[] matriksCell;
		
	private int nEntrance;
	private Cell[] listEntrance;
	private int nExit;
	private Cell[] listExit;

	private int nCage;
	private Cage[] cages;
	private View[] maps;	

	private Visitor person;

	private int nRoad; //termasuk entrance n exit
	private Cell[] listVisited;
	private int currentVisited;
	private int nVisited;
	
	public VirtualZoo(string inputFile) {
		FileReader data(inputFile);
		
		data.Read();	

		// 1. Inisialisasi Virtual Zoo
		matriksCell = new MatrixCell(data.getNBrs(), data.getNKol());
		// cout << matriksCell.getNBrs() << " ";
		// cout << matriksCell.getNKol() << endl;
		
		int max = (matriksCell.getNBrs() + matriksCell.getNKol())*2;
		listEntrance = new Cell[max];
		nEntrance = 0;
		listExit = new Cell[max];
		nExit = 0;
		n_road;
		
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


				//inisialisasi
				if (data.getCellType(k)=="airhabitat"){
					matriksCell.setCell(new Cell(i,j,c), i, j);
				}else if (data.getCellType(k)=="waterhabitat"){
					matriksCell.setCell(new Cell(i,j,c), i, j);
				}else if (data.getCellType(k)=="landhabitat"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if (data.getCellType(k)=="road"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					nRoad++;
				}else if(data.getCellType(k)=="park"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if(data.getCellType(k)=="restourant"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
				}else if(data.getCellType(k)=="entrance"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					listEntrance[nEntrance] = new Cell(i,j, c);
					nEntrance++;
					n_road++;
				}else if(data.getCellType(k)=="exit"){
					matriksCell.setCell(new Cell(i,j, c), i, j);
					listExit[nExit] = new Cell(i,j, c);
					nExit++;
					nRoad++;
				}
				
				// cout << matriksCell.getCell(i,j).render();
			}
			// cout <<endl;
		}


		// 2. Inisialisasi objek Cage
		nCage = data.getNCage();
		// cout << nCage << endl;
		cages = new Cage[nCage];

		int n = 0, m =0;
		for(int i=0; i<nCage; i++){
			cages[i]= new Cage(data.getCageSimbol(i), data.getCageType(i));
			// cout << cages[i].render() <<" "<<cages[i].getTipeHabitat()<<endl;

			int x,y;  
			n = n + data.getNCageArea(i);
			for(int j=m; j<n; j++){
				//posisi pada zoo
				x = data.getPosX(j);
				y = data.getPosY(j);
				// cout << x <<" "<< y <<endl;
				// cek apakah cell memiliki tipe yang sesuai
				// cout<<matriksCell.getCell(x,y).getTipe() <<" ";
				// cout<< cages[i].getTipeHabitat()<<endl;
				if(matriksCell.getCell(x,y).getTipe() == cages[i].getTipeHabitat()){
					cages[i].addCagePosition(matriksCell.getCell(x,y));
					// cout << cages[i].getCagePosition(cages[i].getNArea()-1).getX()<<" ";
					// cout << cages[i].getCagePosition(cages[i].getNArea()-1).getY()<<endl;
				}
			}
			// cout << endl;
			m = m + data.getNCageArea(i);
		}

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
				if (cages[i].getTipeHabitat()=="land"){
					//random posisi awal, pastikan masih kosong 
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					while (!found){
						nr = rand() % cages[i].getNArea();
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					}
					
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" land "<<y<<endl;
					//ciptakan hewan
					nr = rand() % 12 + 1;
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
				}else if (cages[i].getTipeHabitat()=="water"){
					
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					while (!found){
						nr = rand() % cages[i].getNArea();
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					}
					// cout << pos << endl;
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" water "<<y<<endl;

					nr = rand() % 5 + 1;
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
				}else if (cages[i].getTipeHabitat()=="air"){
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					boolean found = false;
					Cell pos;
					while (!found){
						nr = rand() % cages[i].getNArea();
						pos = cages[i].getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i].isPositionEmpty(pos);
					}
					
					int x = pos.getX();
					int y = pos.getY();
					// cout <<x<<" air "<<y<<endl;

					nr = rand() % 7 + 1;
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
		listVisited = new Cell*[nRoad];
		nVisited = 0;
		currentVisited = -1;
	}

		
		public void addZooToMaps() {
			for(int i=0; i<matriksCell.getNBrs(); i++){
			for(int j=0; j<matriksCell.getNKol(); j++){
				maps.setVal(i,j,matriksCell.getCell(i,j).render());
			}
		}
		}
		
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

		public void addAnimalToMaps() {
		int x,y,z;
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

		public void addVisitorToMaps() {
		int x = person.getX();
		int y = person.getY();
		int z = person.getSimbol();
		maps.setVal(x,y,z);
	}


		public boolean isInRage(int kiri,int atas,int kanan,int bawah) {
		int xMax = matriksCell.getNBrs();
		int yMax = matriksCell.getNKol();
		if (atas>=0 && kiri>=0 && bawah<=xMax && kanan<=yMax) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isInRage(int x, int y) {
		int xMax = matriksCell.getNBrs();
		int yMax = matriksCell.getNKol();
		if (x>=0 && y>=0 && x<xMax && y<yMax) {
			return true;
		} else {
			return false;
		}
	}

	public void printVirtualZoo() {
		addZooToMaps();
		addCagetoMaps();
		addAnimalToMaps();
		addVisitorToMaps();
		maps.printView();
	}
	public void printVirtualZoo(int kiri,int atas,int kanan,int bawah) {
		addZooToMaps();
		addCagetoMaps();
		addAnimalToMaps();
		addVisitorToMaps();
		maps.printView(kiri,atas,kanan,bawah);
	}

	public void moveAnimal() {
		for(int i = 0; i < nCage; i++) {
			for(int j = 0; j < cages[i].getNAnimal(); j++) {
				//random posisi
				int nr;
				boolean found = false;
				Cell pos;
				while (!found){
					nr = rand() % cages[i].getNArea();
					pos = cages[i].getCagePosition(nr);

					//cek apa ada hewan yang udah di posisi itu
					found = cages[i].isPositionEmpty(pos);
				}

				int x = pos.getX();
				int y = pos.getY();

				cages[i].getAnimal(j).setX(x);
				cages[i].getAnimal(j).setY(y);
			}
		}
	}

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

	public void printInteraction(int x, int y) {
		int i = 0;
		boolean found = false;
		while (i < nCage && !found) {
			if (cages[i].isPositionInCage(x, y)) {
				found = true;

				for(int j=0; j<cages[i].getNAnimal(); j++) {
					System.out.print(cages[i].getAnimal(j).interact() + " ");
				}
				System.out.println;
			}
			i++;
		}

	}

	public int getTotalMakanan() {
		int totalMakanan;
		for(int i = 0; i < nCage; i++) {
			
			totalMakanan = totalMakanan + cages[i].getTotalMakanan();
			
		}

		return totalMakanan;
	}

	public Cell[] getEntrance() {
		int rn = rand() % nEntrance;
		return listEntrance[rn];
	}

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
			int rn = rand() % nAvailable;
			int xNext = cellAvailable[rn].getX();
			int yNext = cellAvailable[rn].getY();
			listVisited[nVisited] = cellAvailable[rn];
			nVisited++;
			currentVisited++;
			person.setPosition(xNext, yNext);
		}


	}

	public boolean isVisited(Cell* cel) {
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

	public boolean isEndOfTour() {
		int x = person.getX();
		int y = person.getY();
		boolean endOfTour = false;
		if (matriksCell.getCell(x,y).getTipe() == "exit") {
			endOfTour = true;
		}
		return endOfTour;
	}

	public void tour() {
		system("clear");
		PrintVirtualZoo();
		do {
			sleep(1);
			system("clear");
			moveAnimal();
			moveVisitor();
			printVirtualZoo();
			interact();
		}while (!isEndOfTour());
	}


}
