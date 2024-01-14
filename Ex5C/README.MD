
## Patterns - Exercice 5B

### Pattern n°1 : Composite
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------|  
IComposite                 | Partie  
Composite  | Groupe
Leaf | Valeur

Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|  
operation() | demande() 

### Pattern n°2 : Visitor
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------| 
Client | Main
Visitor | Traitement
ConcreteVisitor | Listeur, ListeurNom
Element | Partie
ConcreteElement | Groupe, Valeur

Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|
accept() | demande()  
visit() | traiteGroupe(), traiteValeur()

### Pattern n°3 : Builder
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------| 
Director | Lecteur
ConcreteBuilder | Fabriquant
Product | Partie
Builder | Fabriquant

Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|
construct() | construire()  
buildPart() | construirePartie(), construireGroupe()
getResult() | getResultat()

### Pattern n°4 : ???
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------| 


Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|

### Pattern n°5 : ???
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------| 


Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|
