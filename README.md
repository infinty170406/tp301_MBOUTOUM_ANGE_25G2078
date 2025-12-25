# TP : Principes SOLID - Architecture Logicielle

**Cours :** ICT 301 - Architecture logicielle et conception
**Nom :** MBOUTOUM YANNENG 
**Prénom :** AUSCARINE ANGE
**Matricule :** 25G2078

---

## Description du Dépôt
Ce dépôt contient les travaux pratiques relatifs aux principes SOLID. L'objectif est de démontrer la compréhension de ces cinq principes fondamentaux en proposant, pour chaque cas, une version "avant" (violant le principe) et une version "après" (respectant le principe), accompagnées de leurs diagrammes de classes.

## Compréhension des Principes SOLID

Voici une synthèse de ma compréhension des principes, basée sur le support de cours :
### 1. ISP - Interface Segregation Principle (Principe de Ségrégation des Interfaces)
**Définition :** Les clients ne doivent pas être forcés de dépendre de méthodes qu'ils n'utilisent pas. Plusieurs interfaces spécifiques valent mieux qu'une seule interface généraliste.
**Application :** L'interface `Worker` obligeait les robots à implémenter une méthode `eat()`. J'ai ségrégué l'interface en deux : `Workable` et `Eatable`. Ainsi, `RobotWorker` n'implémente que ce qui le concerne.

### 2. DIP - Dependency Inversion Principle (Principe d'Inversion de Dépendance)
**Définition :** Les modules de haut niveau ne doivent pas dépendre de modules de bas niveau. Les deux doivent dépendre d'abstractions. Les abstractions ne doivent pas dépendre des détails ; les détails doivent dépendre des abstractions.
**Application :** La classe `OrderProcessor` dépendait directement de `MySQLDatabase` (couplage fort). J'ai inversé la dépendance en introduisant l'interface `Database`. Désormais, `OrderProcessor` dépend de l'abstraction, permettant de changer de base de données (ex: MongoDB) sans modifier le code métier.

### 3. SRP - Single Responsibility Principle (Principe de Responsabilité Unique)
**Définition :** Une classe ne doit avoir qu'une seule et unique raison de changer.
**Application :** Dans l'exemple traité, la classe `Book` gérait à la fois les données, l'affichage et la persistance. J'ai refactorisé le code pour séparer ces responsabilités en classes distinctes (`BookPrinter`, `BookSaver`, etc.), assurant ainsi une meilleure cohésion et un couplage faible.

### 4. OCP - Open/Closed Principle (Principe Ouvert/Fermé)
**Définition :** Les entités logicielles (classes, modules, fonctions, etc.) doivent être ouvertes à l'extension, mais fermées à la modification.
**Application :** Plutôt que de modifier la classe `AreaCalculator` avec des `if/else` pour chaque nouvelle forme géométrique, j'ai introduit une interface `Shape`. Pour ajouter une forme, il suffit désormais de créer une nouvelle classe implémentant cette interface, sans toucher au code existant.

### 5. LSP - Liskov Substitution Principle (Principe de Substitution de Liskov)
**Définition :** Les sous-types doivent être substituables à leurs types de base. Si S est un sous-type de T, alors les objets de type T peuvent être remplacés par des objets de type S sans altérer les propriétés désirables du programme.
**Application :** L'héritage `Square extends Rectangle` violait ce principe car modifier la hauteur d'un carré changeait implicitement sa largeur, ce qui n'est pas vrai pour un rectangle générique. J'ai résolu cela en utilisant une interface commune `Shape` au lieu de forcer un héritage inadapté.
---
