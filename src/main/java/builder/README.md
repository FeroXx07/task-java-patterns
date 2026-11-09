# task-java-patterns

**Descripció**: Implementar els principis SOLID mitjançant l’ús de patrons de disseny

## 📌 Patró Builder
Patró Builder
Què és?

El patró de disseny Builder és un patró creacional que ens ajuda a construir objectes complexos pas a pas, separant la construcció de l’objecte de la seva representació. En altres paraules, facilita la creació d’objectes que tenen molts paràmetres, alguns d’ells opcionals o amb valors per defecte, sense que el codi del client quedi ple de constructors llargs o configuracions enrevessades.
Utilitat

El patró Builder és útil quan:

    🧱 L’objecte a construir té molts atributs opcionals o configuracions possibles.
    🧩 Cal mantenir la construcció clara, llegible i extensible.
    🚫 Es vol evitar constructores massa llargues o difícils de llegir.

Propòsit

    🏚️ Fa que el procés de creació sigui més llegible i mantenible.
    ⛓️ Evita l’antipatró del constructor telescòpic (aquells constructors amb 5, 6, 7 paràmetres que ningú entén).
    🌊 Ajuda a tenir un codi més clar i expressiu, sobretot quan es combina amb l’enfocament Fluent.

    Hi ha diferents formes d’implementar el Builder. En aquest exercici, utilitzaràs el Fluent Builder, que permet enllaçar les crides de manera fluida. Exemple:

Exemple:

Car car = new CarBuilder()
.withModel("Sedan Premium")
.withEngine("Hybrid", 180)
.withColor("Metallic Black")
.withInterior("Leather")
.withNavigationSystem()
.withDriverAssistance()
.withSportPackage()
.build();

Exercici:

    Implementació del patró Builder al menú d'un restaurant.

Objectiu

Dissenyar i implementar un sistema per construir diferents tipus de menús de restaurant aplicant el patró de disseny Builder amb estil Fluent Builder, i seguint els principis SOLID. A més, s’utilitzarà el concepte de progressive interface, que consisteix a limitar progressivament les opcions disponibles a l’usuari durant la construcció de l’objecte, assegurant així que el procés es realitzi en l’ordre correcte i es compleixin les dependències entre passos. Per exemple, no es podrà afegir postres abans d’afegir el plat principal, ni tampoc es podrà cridar el mètode d’afegir postres més d’una vegada.
Descripció

Als menús poden estar compostos per:

    Entrants
    Plat Principal
    Postres
    Beguda

Aquests poden tenir característiques específiques:

    Qualsevol plat pot ser: Vegà y/o Apropiat per a celíacs.
    El plat principal pot tenir un suplement (per exemple: guarnició extra).
    A més, el client pot demanar només el mig menú, que inclou únicament el plat principal i la beguda.
    El menú infantil inclou no mes plat principal, beguda y postre.
    Els menus poden ser sense beguda.
    Les postres són opcionals a tots els menus i poden ser postres o cafè.

Requisits:

    Modelar un sistema flexible per construir menús pas a pas, sense dependències de classes concretes, que garanteixi l’ordre correcte i obligatori en la construcció del menú. Per exemple, no es podrà afegir postres abans d’afegir el plat principal.
    Implementar una restricció per la qual, si es tria postres, no es podrà afegir cafè, i viceversa. Aquesta regla s’ha de garantir gràcies al disseny d’interfícies.
    Permetre configurar les propietats dels plats (vegà, apta per celíacs, suplement) amb mètodes fluents i expressius, evitant paràmetres booleanos.
    Implementa tests unitaris on es mostri la creació diversos menús:

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

