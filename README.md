# Calorie-Tracker-Program-
🚶‍♂️This program allows you to calculate the amount of calories burned while walking different routes.
The program is written in Java and consists of two files, 'clase1.java' and 'Main_T.java'. The former contains all the methods defined, while the latter is the main test file for the program.

## 😒Requirements

-   Java Development Kit (JDK)

## 😊Usage

1.  Clone or download the repository to your local machine.
2.  Open the terminal or command prompt and navigate to the directory where the files were downloaded.
3.  Compile the program by running the following command:
    
    Copy code
    
    `javac Main_T.java` 
    
4.  Run the program by executing the following command:
    
    Copy code
    
    `java Main_T` 
    
5.  Follow the on-screen instructions to input the required data and calculate the amount of calories burned.

## 😜Features

-   Calculate the average number of steps taken per minute on a given route.
-   Determine if two routes are the same or different.
-   Calculate the pace of a route.
-   Copy an object to a new object.
-   Calculate the total number of steps taken on a route.
-   Calculate the number of calories burned on a route based on the user's weight.
-   Determine the route with the highest altitude.
-   Allow the user to modify the threshold and calculate if the pace of the route is satisfactory.
The class "clase1" is a Java class that includes various methods for performing calculations on data related to a route. It includes a constructor that initializes the data members of the class, and various methods for performing calculations and returning values based on the data members.

The class contains the following data members:

-   ruta (String): stores the name of the route
-   distancia (float): stores the distance of the route in kilometers
-   duracion (int): stores the time taken to complete the route in minutes
-   maxAlt (int): stores the maximum altitude of the route
-   minAlt (int): stores the minimum altitude of the route
-   umbral (int): stores a threshold value
-   cadena (String): stores a message indicating that the value is outside the threshold range
-   cadenabien (String): stores a message indicating that the threshold has been fixed
-   entrada (Scanner): an object of the Scanner class used for input.

The class contains the following methods:

-   clase1(): constructor method that initializes the data members of the class
-   cal_media(): method that calculates the average speed of the route
-   copy(): method that creates a copy of the class and returns a new object
-   get_distancia(): method that returns the distance of the route
-   get_alt_max(): method that returns the maximum altitude of the route
-   get_alt_min(): method that returns the minimum altitude of the route
-   get_temps(): method that returns the time taken to complete the route
-   get_nom_ruta(): method that returns the name of the route
-   set_nom_ruta(): method that sets the name of the route
-   num_pasos(): method that calculates the average number of steps taken per minute
-   dif_alt(): method that calculates the difference between the maximum and minimum altitudes of the route
-   iguales(): method that compares the altitude difference and distance of two routes and returns a boolean indicating if they are equal
-   mayor_alt(): method that compares the altitude difference of two routes and returns the name of the one with the higher altitude
-   cal_quemadas(): method that calculates the calories burned during the route based on the average speed and weight of the person
-   ritCarr(): method that calculates the pace at which the route is completed based on the distance and time taken to complete it.
