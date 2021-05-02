# Project Name
met-cs665-4-JoeyParshley
# Your Information
Joey Parshley
joeyparshley@gmail.com

# Project Information
This project builds the beginning of a Sport Team Manager. Ther basic concept is an application that Coach 
of any Sport (currently [Baseball, BasketBall, Football, Hockey]) and mangage there team. Currently the coach can
enter the player information and build a team. The can add the Sport type to the players and use that to calculate that
players Combined Statistic which is there offensive and defensive statics combined. 

I used an Abstract Factory to create a Factory for creating SportFactories. This gives us the flexibility
of adding future sports to the application. Each factory would be responsible for its own sport rules and algortithms
to calculate the Offensive and Defensive statistics for that particular sport. These stats would have their own 
Offensive and Defensive Statistics. The player is responsible for its statistics.

I also intruduce the Iterator Pattern to allow the Sport manager to iterate through the players on its teams and 
get the Combined stats. This pattern allows us to wrap the iterator behavior for each team.

## Tasks
### Design Goals
The design goals for this project was to create a Generic Management Application that would:
* create a generic sport interface that would contain all the common behavior between the different sports
* Then sport specific factories can be created and given the responsibility of managing the specific sport rules
* The Teams would be aggregation of players (currently as an array but they could be any collection).
* Each player would be responsible for maintaining their offensive and defensive statistics
* The players statistics would be dependent on which sport the player is playing

### Flexibility
The flexibility of this implementation is present in the how the Iteration complexity has been isolated to the 
created Iterators. This allows for teams (collections) to be of any type of collection. The createIterator method for that sport
would just need to be update with teh collection specific iterator processes. But the rest of the application
would be untouched.
In addition the use of the Abstract Factory for creating the various sports allows the ability to add new SPorts down 
the road with their own rules and own type of statistics.

Grouping the Sports code in its own package allows for a better understandability that this code is related.

## Implementation details
The UML can be found in the root folder `Assignment4-UML.pdf`

![Project-UML](Project-UML.pdf)

#### Describe what pattern you used and why?


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
