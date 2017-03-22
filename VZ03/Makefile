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

Animal: Renderable
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Animal.java -d bin

FlyingAnimal: 
	$(MKBIN)
	$(JAVAC) $(CP) $(MAINSRC)FlyingAnimal.java -d bin

Flyingfish: Animal FlyingAnimal WaterAnimal
	$(MKBIN)
	$(JAVAC) $(CP) $(MAINSRC)Flyingfish.java -d bin

Karnivora: 
	$(MKBIN)
	$(JAVAC) $(CP) $(MAINSRC)Karnivora.java -d bin

Renderable: 
	$(MKBIN)
	$(JAVAC) $(CP) $(MAINSRC)Renderable.java -d bin

WaterAnimal: 
	$(MKBIN)
	$(JAVAC) $(CP) $(MAINSRC)WaterAnimal.java -d bin

test:
	$(JAVAC) $(FLAGS) $(CP) $(TESTSRC)*

clean:
	rm -rf $(TARGET)

run:
	$(JVM) $(CP) $(TARGET) $(MAIN)

run_test: 
	$(JVM) $(CP) $(TARGET) $(MAINTEST)

testFF:
	$(JVM) $(CP) org.junit.runner.JUnitCore FlyingfishTest

.PHONY: all test clean run run_test
