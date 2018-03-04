#------------------------------------------------------------------------------
# Make file for sheep.jar
#------------------------------------------------------------------------------
Sheep.jar: Main.class  #name of jar : ALL classes
	echo Main-class: Main > Manifest #main class only
	jar cvfm Sheep.jar Manifest Main.class #put ALL classes after the manifest. Can name jar anything
	rm Manifest

Main.class : Sheep.java  #include ALL classes and its respective java files
	javac -Xlint *.java

clean:
	rm *.class
	rm *.jar
