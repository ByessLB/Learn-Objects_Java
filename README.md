# Les Objets

## Introduction

### Qu'est ce qu'un objet ?

Un objet en Java est une instance d'une classe. Il représente une lentité avec des attributs (variables) et des comportements (méthodes). Les objets permettent de modéliser des concepts du monde réel dans un programme.

### Pourquoi utiliser des objets ?

Les objets permettent de structurer le code de manière modulaire et réutilisable. Ils facilitent la maintenance et la comprégension du code en encapsulant les données et les comportements associés.

## Création d'une Classe

### Définition d'une Classe

Une classe est un modèle ou un pllan qui définit les attributs et les comportements d'un objet. En Java, une classe est définie à l'aide de mot-clé `class`.

```java
public class Player {

    private String name;
    private double health;
    private double attack;

    // Constructor
    public Player(String name, double health, double attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    // Méthodes
    public void damage(double damage) {
        this.health -= damage;
        System.out.println(name + " viens de subir des dégats de : " + damage + " d'attaque." );
    }

    public void heal(double heal) {
        this.health += heal;
        System.out.println(name + " a été soigné de : " + heal + " grâce à une potion de soin.");
    }
}
```

### Atributs

Les attributs sont des variables qui définissent l'état d'un objet. Ils sont déclarés à l'intérieur de la classe en dehors de toute méthode.

### Méthodes

Les méthodes sont des fonctions qui définissent les comportements d'un objet. Elles sont déclarées à l'intérieur de la classe.

## création d'un Objet

### Instanciation d'un Objet

Pour créer unn objet, il faut instancier une classe en utilisant le mot-clé `new`.

```java
public class Play {
    public static void main(String[] args) {
        Player player1 = new Player("Link", 300.00, 15.00);
        player1.damage(30.00);
        player1.heal(5.00);
    }
}
```

### Utilisation des Méthodes

Les méthodes d'un objet sont appelées en utilisant la notation point(`.`).

## Encapsulation

### Définition

L'encapsulation est un principe de la programmation orientée objet qui consiste à cacher les détails internes d'un objet et à ne rendre accessibles que les informations nécessaires.

### Modificateurs d'Accès

Les modificateurs d'accès permettent de contrôler la visibilité des attributs et des méthodes. Les principaux modificateurs sont :

- `public` : accessible de partout.
- `private` : accessible uniquement dans la classe.
- `protected` : accessible dans la classe et dans les classes héritières.
- `default` : accessible dans la classe et dans les classes dans le même package.

### Getters et Setters

Les getters et setters sont des méthodes qui permettent d'accéder et de modifier les attributs privés d'une classe.

```java
public class Player {
    private String name;
    private double health;
    private double attack;

    // Constructor
    public Player(String name, double health, double attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
}
```

## Conclusion

Les objets en Java sont des entités fondamentales qui permettent de structurer et de modéliser des concepts du mond réel. En utilisant des classes, des attributs, des méthodes, l'encapsulation et l'héritage, vous pouvez créer des programmes modulaires, réutilisables et faciles à maintenir.
