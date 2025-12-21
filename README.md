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

---
