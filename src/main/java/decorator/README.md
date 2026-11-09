# task-java-patterns

**Descripció**: Implementar els principis SOLID mitjançant l’ús de patrons de disseny

## 📌 Patró Decorator
Patró Decorator
Què és?

El patró Decorator és un patró de disseny estructural que permet afegir funcionalitats addicionals a un objecte de manera flexible i dinàmica, sense modificar-ne la classe original.

En lloc de crear subclasses per cada combinació de funcionalitats, el patró Decorator utilitza una jerarquia d'objectes que embolcallen (decoren) l’objecte original per afegir comportament nou.
Utilitat

El patró Decorator és útil quan:

    🧩 Volem afegir funcionalitats de manera flexible, sense inflar la jerarquia de classes.
    👽 Resulti estrany o no sigui possible estendre el comportament d’un objecte utilitzant l'herència.
    🕸️ Tenim moltes opcions de personalització o combinació de característiques i volem evitar una quantitat excessiva de subclasses.

S’empra freqüentment en frameworks d’interfície d’usuari, sistemes d’entrada/sortida de fitxers, frameworks de registre i per a la personalització de productes.
Propòsit

El propòsit principal del patró Decorator és:

    🧱 Afegir funcionalitats a objectes de manera dinàmica.
    ❌ Evitar la creació de múltiples subclasses per cada combinació de comportaments.

Exercici:

    Implementació del patró Decorator per a una aplicació de Bubble Tea

Objectiu

Implementar un disseny de classes que simuli la personalització d’un Bubble Tea, utilitzant el patró de disseny Decorator per afegir ingredients com perles, gel, sucre, etc.
Descripció:

Es vol construir una aplicació que permeti crear Bubble Teas:

Pots començar amb una base com:

    🥛 Latte → 3.50 €
    🍵 Matcha → 3.20 €
    🌿 Tea → 3.00 €

i cal afegir diferents decoracions com:

    🧊 Gel (Ice) → +0.25 €
    🍬 Sucre (Sugar) → +0.30 €
    🥥 Tapioca (Tapioca) → +0.50 €
    🍓 Sabors afegits (Flavor) → +0.60 € per cada sabor afegit.

    ℹ️ Si s’afegeixen dos sabors, el cost total augmenta en +1.20€.

Cada afegit modifica el cost i la descripció de la beguda. L’objectiu és fer servir el patró Decorator per poder composar les begudes dinàmicament, sense haver de crear subclasses per cada combinació possible.
Requisits:

    Crea una interfície BubbleTea amb els mètodes:
        String getDescription();
        double getCost();
    Implementa les classes base (LatteBase, MatchaBase, TeaBase) que implementin BubbleTea. Cada base ha de tenir un cost inicial diferent i una descripció pròpia.
    Crea decoradors concrets (ex: Ice, Sugar, Tapioca, Flavor) que heretin de BubbleTeaDecorator.
    Cada decorador ha d'afegir al cost i a la descripció del Bubble Tea.
    Implementa tests unitaris on es mostri la creació d’un Bubble Tea amb diverses combinacions.

## 🛠 Tecnologies
- Backend: Java, Junit

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone https://github.com/FeroXx07/task-java-patterns.git`
2. Execució:
    1. Proves: ``mvn test``
    2. Demo del ReportApp:
        1. ``mvn clean compile``
        2. ``mvn exec:java -Dexec.mainClass="strategy.ReportApp"``
        3. Comprovar ``output/reports`` directory pels different reports
    3. Manualment des del IDE.

