
Download and install scribble-java 0.5.0:
```shell
make scribble-dist
```

Run the tests (prints the duration):
```shell
make test 
```

Run the benchmarks:
```shell
make bench
```

Files:

- Adder.scr: [src/main/resources/Adder.scr](src/main/resources/Adder.scr)  
  (Loops 1000 times before quitting)

- TwoBuyer.scr: [src/main/resources/TwoBuyer.scr](src/main/resources/TwoBuyer.scr)  
  (Outer recursion loops 1000 times before quitting; inner rec is never 'reject')

- APIs in [src/main/java](src/main/java)

- Protocols in [src/main/kotlin](src/main/kotlin)

- Benchmarks in [src/jmh/kotlin](src/jmh/kotlin)
