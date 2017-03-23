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
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Animal.java

FlyingAnimal: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)FlyingAnimal.java 

Flyingfish: Animal FlyingAnimal WaterAnimal
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Flyingfish.java

Karnivora: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Karnivora.java

Renderable: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)Renderable.java

WaterAnimal: 
	$(MKBIN)
	$(JAVAC) $(FLAGS) $(CP) $(MAINSRC)WaterAnimal.java

test:
	$(JAVAC) $(FLAGS) $(CP) $(TESTSRC)/FlyingfishTest.java 

clean:
	rm -rf $(TARGET)

run:
	$(JVM) $(CP) $(MAIN)

run_test: 
	$(JVM) $(CP) $(MAINTEST)

testFF:
	$(JVM) $(CP) org.junit.runner.JUnitCore FlyingfishTest

.PHONY: all test clean run run_test
