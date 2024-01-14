
## Patterns - Exercice 5B

### Pattern n°1 : Template Method
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------|  
Abstract Class                 | DwarvenMineWorker  
Concrete Class  | DwarvenGoldDigger, DwarvenCartOperator, DwarvenTunnelDigger  
###  
Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|  
Template Method |
PrimitiveOperation() | work(), goToSleep(), wakeUp(), goHome(), goToMine() 

### Pattern n°2 : Facade
Participants théoriques |Noms utilisés dans le code|  
-------------------------------|-----------------------------| 
Facade | DwarvenGoldmine  
ComplicatedClassA,B,C.. | DwarvenGoldDigger, DwarvenCartOperator, DwarvenTunnelDigger  
###  
Nom théorique des méthodes |Noms utilisés dans le code|  
-------------------------------|-----------------------------|
do() | makeActions()  
doA,B,C..() | action()
