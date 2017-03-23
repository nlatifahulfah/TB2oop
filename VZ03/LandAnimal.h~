#ifndef LAND_ANIMAL_H
#define LAND_ANIMAL_H

#include "Animal.h"

class LandAnimal: public virtual Animal{
public:
	LandAnimal(int, int);
	LandAnimal(const LandAnimal&);
	virtual ~LandAnimal();
	
	//virtual void addBobot()=0;
	//virtual int getBobot()=0;
	//virtual char getSimbol()=0;
	
	virtual string interact()=0;
	virtual string getTipeHabitat();
	virtual string getTipeAnimal()=0;
	
protected:
	const string tipeHabitat = "land";
};
#endif
