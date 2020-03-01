# Builds the tictactoe game for educational purposes

DRIVER :=Learn
FILES  :=*.java
CLASSES:= $(FILES:%.java=%.class)

.PHONY: run clean

run: $(CLASSES)
	@java $(DRIVER)

%.class: %.java
	@javac $<

clean:
	-rm *.class
