SHELL := /bin/bash

# Gradle
GRADLE_FLAGS = --quiet
G = ./gradlew $(GRADLE_FLAGS)

# Scribble
RESOURCES = src/main/resources
SJ_TAG = 0.5.0
SJ_CLONE = sj
SJ_TARGET = scribble-dist
TwoBuyerRoles = Seller A B
AdderRoles = Client Server

.PHONY: scribble
scribble:
	@for r in $(AdderRoles); do \
		./$(SJ_TARGET)/scribblec.sh $(RESOURCES)/Adder.scr -api Adder $$r -d src/main/java; \
	done
	@for r in $(TwoBuyerRoles); do \
		./$(SJ_TARGET)/scribblec.sh $(RESOURCES)/TwoBuyer.scr -api TwoBuyer $$r -d src/main/java; \
	done

$(SJ_TARGET):
	git clone --depth 1 --branch $(SJ_TAG) -c advice.detachedHead=false https://github.com/scribble/scribble-java.git $(SJ_CLONE)
	@cd $(SJ_CLONE) && mvn install --quiet
	@unzip $(SJ_CLONE)/$(SJ_TARGET)/target/scribble-dist-$(SJ_TAG)-SNAPSHOT.zip -d $(SJ_TARGET)
	@chmod +x $(SJ_TARGET)/scribblec.sh
	@rm $(SJ_CLONE) -rf

.PHONY: build
build: scribble
	@$(G) build

.PHONY: bench
bench: build
	@$(G) jmh


.PHONY: test
test:
	@./gradlew test --rerun-tasks
