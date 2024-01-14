## Patterns - Exercice 5B

Participants théoriques |Noms utilisés dans le code|
-------------------------------|-----------------------------|
Template Method					 	| 
Abstract Class					 	| DwarvenMineWorker
Concrete Class 	| DwarvenGoldDigger, DwarvenCartOperator, DwarvenTunnelDigger
Facade |
Facade | DwarvenGoldmine
ComplicatedClassA,B.. | DwarvenGoldDigger, DwarvenCartOperator, DwarvenTunnelDigger

###
Nom théorique des méthodes |Noms utilisés dans le code|
-------------------------------|-----------------------------|
Template Method |
PrimitiveOperation1() | work()
PrimitiveOperation2() | goToSleep()
PrimitiveOperation3() | wakeUp()
PrimitiveOperation4() | goHome()
PrimitiveOperation5() | goToMine()
Facade |
do() | makeActions()
doA() | action()
do() | goToSleep()

