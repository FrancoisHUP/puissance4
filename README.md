# Projet individuel : Jeu du Puissance4
## Les objectifs du projet : 
1. Analyser un code légataire en vue de le faire évoluer;
2. Transformer ce code en véritable application orientée objet;
3. Faire évoluer un code objet en respectant dans la mesure du possible :
  * les principes S et O de SOLID;
  * les principes objet de faible couplage / forte cohésion.
4. Décrire une application orientée objet avec le langage UML (diagrammes d'objets, de séquences et de classes).
5. Les ateliers sont des temps où l'équipe enseignante est présente pour vous donner de la rétro-action sur votre projet. Il est vital de profiter de ce temps de travail prévu dans votre emploi du temps pour améliorer vos projets avant la remise finale.

## Consignes
1.  Votre projet doit être sur git à 23:55 (heure de Montréal) le jour de la date de remise.
2.  Le projet contient votre code et et un ficher PDF
3.  Le fichier PDF contient les réponses aux questions et vos trois modèles UML
4.  Vous devez répondre en français aux quatre (4) questions posées dans ce sujet.
5.  Le fichier porte comme nom votre code permanenté. 
6.  Votre code doit compiler et tester (sans échouer) en lançant la commande mvn clean package à la racine de votre projet.
7.  Votre code doit se lancer depuis la ligne de commande, toujours depuis la racine, par exemple :
  * mvn -q exec:java "
  * Toute remise ne respectant pas ces consignes ne sera pas évaluée et obtiendra la note de zéro (0).

## Spécification

### Puissance 4
Puissance 4 est un jeu de stratégie très connu qui convient à tout le monde.

Comment jouer : Déposez vos disques dans les colonnes de la grille du jeu en appuyant sur la colonne choisie. Faites une ligne d'au moins quatre jetons soit verticalement, horizontalement ou en diagonale avant votre adversaire.

## Le travail à réaliser

### Étape 1 :  Récupération du code légataire
* Récupérer le code sur ce lien : [https://github.com/INF5153-A21-40/puissance4.git](https://github.com/INF5153-A21-40/puissance4.git)
* Pour exécuter le code, exécuter les commandes suivantes : 
  * mvn package
  * mvn -q exec:java "
	

### Etape 2 : Analyser le code légataire
Le code source légataire fourni est stocké dans le repertoire src/main/java, en respect des conventions Maven. La classe com.inf5153.game contient l'implémentation de départ d'un programme répondant aux spécifications du jeu. La Main est une classe client qui utilise les méthodes publique de la classe ConnectFour  pour simuler le jeu.


####  Question 1 : Évolution du code légataire : 
Le client souhaite développer une librairie pour développer  des jeux tels que le jeu Puissance 4 et jeu de dames.
Est-que l’implémentation actuelle est évolutive pour supporter la spécification d’un jeu semblable ?	
Sans implémenter, expliquez comment le code devrait être modifié pour prendre en compte une telle évolution.

####  Question 2 : Analyse des défauts du code légataire : 
Analysez ce code en fonction de votre connaissance de la programmation objet et des principes de génie logiciels vu dans le cours, et dressez une liste des défauts qu'il contient, en donnant des exemples des situations qui sont problématique dans le code. Si un défaut est répété à plusieurs endroits dans le code, n'en donnez pas la liste exhaustive, ce n'est pas utile, un exemple suffit.

### Etape 3 : Ré-usinage en code objet 
En restant dans le paquetage uqam.inf5153.game, identifiez un ensemble de concepts (c.à.d des classes, des interfaces, des énumérations) qui permettront de travailler au bon niveau d'abstraction de la logique d'affaire du projet et en même temps obéir à la spécification du jeu. Par exemple, changer la représentation des cases d’une représentation basées sur les indices dans le tableau grille vers des classes cellules.
* Développez le code java (logique d'affaire + tests unitaires) mettant en œuvre votre système d'arbitrage.
Proposez une conception permettant de représenter le jeux Puissance 4 et des échelles sous la forme d’une application orientée objet. Vous représenterez cette conception sous la forme d’un diagramme de classe UML.
* Décrivez en utilisant un diagramme de séquence comment se déroule un tour de jeu depuis l'invocation de la classe Main par l'utilisateur jusqu'à l'annonce du gagnant
*Un diagramme d'objet montrant une instanciation possible de vos concepts lors du tour
Dans vos modèles, ne représentez que les éléments pertinents pour la compréhension de votre projet, les détails techniques (p.-ex- accesseurs et modificateurs dans le diagramme de classe, appels de fonctions interne helper dans le diagramme de séquence) sont à laisser dans le code.


### Étape 4 : Analyse du code objet

Maintenant que le code est réusiné et que l'évolution fonctionnelle à été mise en œuvre, il convient de prendre du recul sur le code développé pour être capable de l'analyser.
#### Question 3: Justification des choix de conceptions
Justifiez le choix des concepts que vous avez identifié dans votre modèle de conception, particulièrement en expliquant comment votre modèle respecte les propriétés architecturales demandées.
Expliquez comment votre conception actuelle du projet respecte les principes de responsabilité unique (S de SOLID) et d'Ouvert/fermé (O de SOLID).
Si vous pensez que votre conception souffre de certaines faiblesses, indiquez les, et expliquez pourquoi ce sont des faiblesses.
#### Question 4 : Évolution du code objet
Expliquez en quelques lignes comment il sera possible de réutiliser votre conception pour permettre de définir le jeu des dames à partir des abstractions identifiées dans puissance 4.

## Grille d’évaluation

| Élément   | Critère d’évaluation                       | Note (/100) |
|-----------|--------------------------------------------|-------------|
| Questions | (#1) Évolution du code légataire           | /5          |
|           | (#2) Analyse des défauts du code légataire | /10         |
|           | (#3) Justification des choix de conception | /15         |
|           | (#4) Évolution de code objet               | /5          |
| Modèles   | Justesse et pertinence de la conception    | /15         |
|           | Cohérence inter-modèles                    | /5          |
|           | Respect des principes de conception        | /15         |
| Code      | Qualité du code Java                       | /10         |
|           | Cohérence du code avec les modèles         | /10         |
|           | Qualité des tests                          | /10         |


## 📚  Resources 
* Jeu des dames [http://www.ffjd.fr/Web/index.php?page=reglesdujeu](http://www.ffjd.fr/Web/index.php?page=reglesdujeu
* Jeu de puissance 4 [https://fr.wikipedia.org/wiki/Puissance_4](https://fr.wikipedia.org/wiki/Puissance_4)

