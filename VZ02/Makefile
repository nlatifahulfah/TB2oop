JAVAC = javac
JVM = java
JAVADOC = javadoc
MKBIN = mkdir -p bin

FLAGS = -g -d bin/

CP = -cp bin:src/test/lib/*:src/main/java

MAINSRC = src/main/java/
TESTSRC = src/test/java/

TARGET = bin/

.SUFFIXES : .class .java

all: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Driver.java

Animal: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Animal.java

Cage: Animal
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Cage.java

Cell: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)FileReader.java

MatrixCell: Cell
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)MatrixCell.java

View: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)View.java

Visitor: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Visitor.java

VirtualZoo: MatrixCell View Visitor Cell Cage
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)VirtualZoo.java

AnimalTest: Animal
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(TESTSRC)AnimalTest.java

clean:
	rm -rf $(TARGET)

run:
	$(JVM) $(CP) $(MAIN)

run_test: 
	$(JVM) $(CP) Driver

testAnimal:
	$(JVM) $(CP) org.junit.runner.JUnitCore AnimalTest

.PHONY: all test clean run run_test
