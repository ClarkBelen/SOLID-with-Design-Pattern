# SOLID-with-Design-Pattern
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.


## UML Class Diagram

![SOLIDwithDesignPattern](https://github.com/ClarkBelen/SOLID-with-Design-Pattern/assets/142368338/35cac345-ff85-44d1-bded-eb6da61c03fb)

## Output
![image](https://github.com/ClarkBelen/SOLID-with-Design-Pattern/assets/142368338/6bc0f89b-cb8e-4c93-a696-ae0fcf99d0bc)
