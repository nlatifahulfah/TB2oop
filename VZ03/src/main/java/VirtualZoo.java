public class VirtualZoo {
	private MatrixCell* matriks_cell;
		
	private int n_entrance;
	private Cell[] list_entrance;
	private int n_exit;
	private Cell[] list_exit;

	private int n_cage;
	private Cage[] cages;
	private View maps;	

	private Visitor person;

	private int n_road; //termasuk entrance n exit
	private Cell[] list_visited;
	private int current_visited;
	private int n_visited;
	
	public VirtualZoo(string input_file) {
		FileReader data(input_file);
		
		data.Read();	

		// 1. Inisialisasi Virtual Zoo
		matriks_cell = new MatrixCell(data.GetNBrs(), data.GetNKol());
		// cout << matriks_cell->getNBRS() << " ";
		// cout << matriks_cell->getNKOL() << endl;
		
		int max = (matriks_cell->getNBRS() + matriks_cell->getNKOL())*2;
		list_entrance = new Cell*[max];
		n_entrance = 0;
		list_exit = new Cell*[max];
		n_exit = 0;
		n_road;
		
		char c;
		for(int i=0; i<matriks_cell->getNBRS(); i++){
			for(int j=0; j<matriks_cell->getNKOL(); j++){
				c = data.GetMaps(i,j);
				//cari index jenis Cell
				int k=0;
				bool found = false;
				while (k<data.GetNCellType() && !found) {
					if (c == data.GetCellSimbol(k)) {
						found = true;
					}else
						k++;
				}


				//inisialisasi
				if (data.GetCellType(k)=="airhabitat"){
					matriks_cell->setCell(new AirHabitat(i,j, c), i, j);
				}else if (data.GetCellType(k)=="waterhabitat"){
					matriks_cell->setCell(new WaterHabitat(i,j, c), i, j);
				}else if (data.GetCellType(k)=="landhabitat"){
					matriks_cell->setCell(new LandHabitat(i,j, c), i, j);
				}else if (data.GetCellType(k)=="road"){
					matriks_cell->setCell(new Road(i,j, c), i, j);
					n_road++;
				}else if(data.GetCellType(k)=="park"){
					matriks_cell->setCell(new Park(i,j, c), i, j);
				}else if(data.GetCellType(k)=="restourant"){
					matriks_cell->setCell(new Restourant(i,j, c), i, j);
				}else if(data.GetCellType(k)=="entrance"){
					matriks_cell->setCell(new Entrance(i,j, c), i, j);
					list_entrance[n_entrance] = new Entrance(i,j, c);
					n_entrance++;
					n_road++;
				}else if(data.GetCellType(k)=="exit"){
					matriks_cell->setCell(new Exit(i,j, c), i, j);
					list_exit[n_exit] = new Exit(i,j, c);
					n_exit++;
					n_road++;
				}
				
				// cout << matriks_cell->getCell(i,j)->render();
			}
			// cout <<endl;
		}


		// 2. Inisialisasi objek Cage
		n_cage = data.GetNCage();
		// cout << n_cage << endl;
		cages = new Cage*[n_cage];

		int n = 0, m =0;
		for(int i=0; i<n_cage; i++){
			cages[i]= new Cage(data.GetCageSimbol(i), data.GetCageType(i));
			// cout << cages[i]->render() <<" "<<cages[i]->getTipeHabitat()<<endl;

			int x,y;  
			n = n + data.GetNCageArea(i);
			for(int j=m; j<n; j++){
				//posisi pada zoo
				x = data.GetPosX(j);
				y = data.GetPosY(j);
				// cout << x <<" "<< y <<endl;
				//cek apakah cell memiliki tipe yang sesuai
				// cout<<matriks_cell->getCell(x,y)->getTipe() <<" ";
				// cout<< cages[i]->getTipeHabitat()<<endl;
				if(matriks_cell->getCell(x,y)->getTipe() == cages[i]->getTipeHabitat()){
					cages[i]->addCagePosition(matriks_cell->getCell(x,y));
					// cout << cages[i]->getCagePosition(cages[i]->getNArea()-1)->getX()<<" ";
					// cout << cages[i]->getCagePosition(cages[i]->getNArea()-1)->getY()<<endl;
				}
			}
			// cout << endl;
			m = m + data.GetNCageArea(i);
		}

		//3. Inisialisasi objek2 binatang dan meletakkannya di Cage yang sesuai
		int jumlah_animal;
		for(int i=0; i< n_cage; i++){

			// cout << "max animal:" <<cages[i]->getMaxAnimal() <<endl;
			jumlah_animal = data.GetNAnimal(i);
			if (jumlah_animal > cages[i]->getMaxAnimal()) {
				jumlah_animal = cages[i]->getMaxAnimal();
			}
			// cout << "n animal:" << jumlah_animal <<endl;
			for(int j=0; j<jumlah_animal; j++){
				// cout <<"yang udah ada:"<< cages[i]->getNAnimal() <<endl;
				if (cages[i]->getTipeHabitat()=="land"){
					//random posisi awal, pastikan masih kosong 
					//random dari listOfPosisiCage
					int nr;
					bool found = false;
					Cell * pos;
					while (!found){
						nr = rand() % cages[i]->getNArea();
						pos = cages[i]->getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i]->isPositionEmpty(pos);
					}
					
					int x = pos->getX();
					int y = pos->getY();
					// cout <<x<<" land "<<y<<endl;
					//ciptakan hewan
					nr = rand() % 12 + 1;
					switch(nr){
						case 1: cages[i]->addAnimal(new Cat(x,y));break;
						case 2: cages[i]->addAnimal(new Dog(x,y));break;
						case 3: cages[i]->addAnimal(new Lion(x,y));break;
						case 4: cages[i]->addAnimal(new Snake(x,y));break;
						case 5: cages[i]->addAnimal(new Goat(x,y));break;
						case 6: cages[i]->addAnimal(new Chicken(x,y));break;
						case 7: cages[i]->addAnimal(new Elephant(x,y));break;
						case 8: cages[i]->addAnimal(new Cow(x,y));break;
						case 9: cages[i]->addAnimal(new Hedgehog(x,y));break;
						case 10: cages[i]->addAnimal(new Rhino(x,y));break;
						case 11: cages[i]->addAnimal(new Frog(x,y));break;
						case 12: cages[i]->addAnimal(new Beetle(x,y));break;
					}
					// int d =cages[i]->getNAnimal()-1; 
					// cout << d<< " ";
					// cout <<cages[i]->getAnimal(d)->getX()<<" land ";
					// cout <<cages[i]->getAnimal(d)->getY()<<endl;
				}else if (cages[i]->getTipeHabitat()=="water"){
					
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					bool found = false;
					Cell * pos;
					while (!found){
						nr = rand() % cages[i]->getNArea();
						pos = cages[i]->getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i]->isPositionEmpty(pos);
					}
					// cout << pos << endl;
					int x = pos->getX();
					int y = pos->getY();
					// cout <<x<<" water "<<y<<endl;

					nr = rand() % 5 + 1;
					// cout <<"nr = "<<nr<<endl;
					switch(nr){
						case 1: cages[i]->addAnimal(new Fish(x,y));break;
						case 2: cages[i]->addAnimal(new Crocodile(x,y));break;
						case 3: cages[i]->addAnimal(new Frog(x,y));break;
						case 4: cages[i]->addAnimal(new Duck(x,y));break;
						case 5: cages[i]->addAnimal(new Flyingfish(x,y));break;
					}
					// int d =cages[i]->getNAnimal()-1; 
					// // cout << d<< " ";
					// cout <<cages[i]->getAnimal(d)->getX()<<" water ";
					// cout <<cages[i]->getAnimal(d)->getY()<<endl;
				}else if (cages[i]->getTipeHabitat()=="air"){
					//random posisi awal, pastikan masih kosong
					//random dari listOfPosisiCage
					int nr;
					bool found = false;
					Cell * pos;
					while (!found){
						nr = rand() % cages[i]->getNArea();
						pos = cages[i]->getCagePosition(nr);

						//cek apa ada hewan yang udah di posisi itu
						found = cages[i]->isPositionEmpty(pos);
					}
					
					int x = pos->getX();
					int y = pos->getY();
					// cout <<x<<" air "<<y<<endl;

					nr = rand() % 7 + 1;
					switch(nr){
						case 1: cages[i]->addAnimal(new Beetle(x,y));break;
						case 2: cages[i]->addAnimal(new Bee(x,y));break;
						case 3: cages[i]->addAnimal(new Owl(x,y));break;
						case 4: cages[i]->addAnimal(new Eagle(x,y));break;
						case 5: cages[i]->addAnimal(new Butterfly(x,y));break;
						case 6: cages[i]->addAnimal(new Bird(x,y));break;
						case 7: cages[i]->addAnimal(new Flyingfish(x,y));break;
					}
					// int d =cages[i]->getNAnimal()-1; 
					// // cout << d<< " ";
					// cout <<cages[i]->getAnimal(d)->getX()<<" air ";
					// cout <<cages[i]->getAnimal(d)->getY()<<endl;				
				}
			}
		}


		maps = new View(matriks_cell->getNBRS(),matriks_cell->getNKOL());
		Cell* entrance = GetEntrance();
		int x = entrance->getX();
		int y = entrance->getY();

		person = new Visitor(x,y);
		list_visited = new Cell*[n_road];
		n_visited = 0;
		current_visited = -1;
	}

	
	public void addZooToMaps() {
		for(int i=0; i<matriks_cell->getNBRS(); i++){
			for(int j=0; j<matriks_cell->getNKOL(); j++){
				maps->setVal(i,j,matriks_cell->getCell(i,j)->render());
			}
		}
	}

	public void addCageToMaps() {
		int x,y;
		for(int i=0; i<n_cage; i++) {
			for(int j=0; j<cages[i]->getNArea(); j++) {
				// cout << cages[i]->getCagePosition(j) << endl;
				x = cages[i]->getCagePosition(j)->getX();
				y = cages[i]->getCagePosition(j)->getY();
				maps->setVal(x,y,cages[i]->render());
			}
		}
	}

	public void addAnimalToMaps() {
		int x,y,z;
		for(int i=0; i<n_cage; i++) {
			for(int j=0; j<cages[i]->getNAnimal(); j++) {
				x = cages[i]->getAnimal(j)->getX();
				y = cages[i]->getAnimal(j)->getY();
				z = cages[i]->getAnimal(j)->getSimbol();
				maps->setVal(x,y,z);
			}
		}
	}

	public void addVisitorToMaps() {
		int x = person->getX();
		int y = person->getY();
		int z = person->getSimbol();
		maps->setVal(x,y,z);
	}

	public bool isInRage(int kiri,int atas,int kanan,int bawah) {
		int x_max = matriks_cell->getNBRS();
		int y_max = matriks_cell->getNKOL();
		if (atas>=0 && kiri>=0 && bawah<=x_max && kanan<=y_max) {
			return true;
		} else {
			return false;
		}
	}

	public bool isInRage(int x, int y) {
		int x_max = matriks_cell->getNBRS();
		int y_max = matriks_cell->getNKOL();
		if (x>=0 && y>=0 && x<x_max && y<y_max) {
			return true;
		} else {
			return false;
		}
	}

	public void printVirtualZoo() {
		AddZooToMaps();
		AddCageToMaps();
		AddAnimalToMaps();
		AddVisitorToMaps();
		maps->printView();
	}
	
	public void printVirtualZoo(int kiri,int atas,int kanan,int bawah) {
		AddZooToMaps();
		AddCageToMaps();
		AddAnimalToMaps();
		AddVisitorToMaps();
		maps->printView(kiri,atas,kanan,bawah);
	}

	public void moveAnimal() {
		for(int i = 0; i < n_cage; i++) {
			for(int j = 0; j < cages[i]->getNAnimal(); j++) {
				//random posisi
				int nr;
				bool found = false;
				Cell * pos;
				while (!found){
					nr = rand() % cages[i]->getNArea();
					pos = cages[i]->getCagePosition(nr);

					//cek apa ada hewan yang udah di posisi itu
					found = cages[i]->isPositionEmpty(pos);
				}

				int x = pos->getX();
				int y = pos->getY();

				cages[i]->getAnimal(j)->setX(x);
				cages[i]->getAnimal(j)->setY(y);
			}
		}
	}

	public void interact() {
		int x_now = person->getX();
		int y_now = person->getY();

		int x_max = matriks_cell->getNBRS()-1;
		int y_max = matriks_cell->getNKOL()-1;

		Cell** cell_available = new Cell*[4];
		int n_available = 0;

		int x,y;

		//kanan
		x = x_now + 1;
		y = y_now;
		if (IsInRage(x,y)) {
			PrintInteraction(x,y);
		}
		
		//atas
		x = x_now;
		y = y_now + 1;
		if (IsInRage(x,y)) {
			PrintInteraction(x,y);
		}

		//kiri
		x = x_now - 1;
		y = y_now;
		if (IsInRage(x,y)) {
			PrintInteraction(x,y);
		}
		
		//bawah
		x = x_now;
		y = y_now - 1;
		if (IsInRage(x,y)) {
			PrintInteraction(x,y);
		}
		
	}

	public void printInteraction(int x, int y) {
		int i = 0;
		bool found = false;
		while (i < n_cage && !found) {
			if (cages[i]->isPositionInCage(x, y)) {
				found = true;

				for(int j=0; j<cages[i]->getNAnimal(); j++) {
					cout << cages[i]->getAnimal(j)->interact() << " ";
				}
				cout <<endl;
			}
			i++;
		}

	}

	public int getTotalMakanan() {
		int total_makanan;
		for(int i = 0; i < n_cage; i++) {
			
			total_makanan = total_makanan + cages[i]->getTotalMakanan();
			
		}

		return total_makanan;
	}

	public Cell[] getEntrance() {
		int rn = rand() % n_entrance;
		return list_entrance[rn];
	}

	public void moveVisitor() {
		int x_now = person->getX();
		int y_now = person->getY();

		int x_max = matriks_cell->getNBRS()-1;
		int y_max = matriks_cell->getNKOL()-1;

		Cell** cell_available = new Cell*[4];
		int n_available = 0;

		int x,y;

		//kanan
		x = x_now + 1;
		y = y_now;

		if (x>=0 && y>=0 && x<=x_max && y<=y_max) {
			if (matriks_cell->getCell(x,y)->getTipe() == "road") {
				if (!IsVisited(matriks_cell->getCell(x,y))) {
					cell_available[n_available] = matriks_cell->getCell(x,y);
					n_available++;
				}
			}
		}

		//atas
		x = x_now;
		y = y_now + 1;

		if (x>=0 && y>=0 && x<=x_max && y<=y_max) {
			if (matriks_cell->getCell(x,y)->getTipe() == "road" || matriks_cell->getCell(x,y)->getTipe() == "exit" ) {
				if (!IsVisited(matriks_cell->getCell(x,y))) {
					cell_available[n_available] = matriks_cell->getCell(x,y);
					n_available++;
				}
			}
		}

		//kiri
		x = x_now - 1;
		y = y_now;

		if (x>=0 && y>=0 && x<=x_max && y<=y_max) {
			if (matriks_cell->getCell(x,y)->getTipe() == "road"  || matriks_cell->getCell(x,y)->getTipe() == "exit" ) {
				if (!IsVisited(matriks_cell->getCell(x,y))) {
					cell_available[n_available] = matriks_cell->getCell(x,y);
					n_available++;
				}
			}
		}

		//bawah
		x = x_now;
		y = y_now - 1;

		if (x>=0 && y>=0 && x<=x_max && y<=y_max) {
			if (matriks_cell->getCell(x,y)->getTipe() == "road"  || matriks_cell->getCell(x,y)->getTipe() == "exit" ) {
				if (!isVisited(matriks_cell->getCell(x,y))) {
					cell_available[n_available] = matriks_cell->getCell(x,y);
					n_available++;
				}
			}
		}


		if (n_available == 0) {
			current_visited--;
			int x_next = list_visited[current_visited]->getX();
			int y_next = list_visited[current_visited]->getY();
			person->setPosition(x_next, y_next);
		} else {
			int rn = rand() % n_available;
			int x_next = cell_available[rn]->getX();
			int y_next = cell_available[rn]->getY();
			list_visited[n_visited] = cell_available[rn];
			n_visited++;
			current_visited++;
			person->setPosition(x_next, y_next);
		}


	}

	public bool isVisited(Cell* cel) {
		bool visited = false;
		int i =0;
		while (i < n_visited && !visited) {
			if (list_visited[i]->getX() == cel->getX() && list_visited[i]->getY() == cel->getY()) {
				visited = true;
			}
			i++;
		}

		return visited;
	}

	public bool isEndOfTour() {
		int x = person->getX();
		int y = person->getY();
		bool end_of_tour = false;
		if (matriks_cell->getCell(x,y)->getTipe() == "exit") {
			end_of_tour = true;
		}
		return end_of_tour;
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
