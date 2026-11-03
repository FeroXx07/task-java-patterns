# task-java-patterns

**Descripció**: Els patrons de disseny són solucions típiques a problemes que apareixen sovint en el desenvolupament de programari. Funcionen com a plànols predefinits que es poden adaptar per resoldre un problema de disseny recurrent en el teu codi.

No es tracta simplement de copiar i enganxar codi, com faríem amb una funció o una llibreria. Un patró és un concepte general, no una implementació específica. Et proporciona una guia per construir una solució que s’ajusti a les necessitats del teu projecte.

A més, els patrons de disseny són una manera pràctica d’aplicar els principis SOLID, ja que ens ajuden a estructurar el codi de manera clara, mantenible i escalable. En aquesta tasca, aprendrem a implementar patrons que reforcin aquests principis i ens ajudin a millorar l’arquitectura del nostre programari.
Per què hauria d'aprendre patrons de disseny?

És cert que pots treballar com a programador durant anys sense conèixer cap patró de disseny formal. De fet, molta gent ho fa. Tot i això, sovint apliques patrons sense saber-ho. Llavors, per què val la pena aprendre’ls?

- Són una caixa d'eines amb solucions provades. Et permeten resoldre problemes de disseny de manera eficient i elegant.
- T’ajuden a pensar millor el disseny del teu programari, aplicant principis sòlids de la programació orientada a objectes.
- Faciliten la comunicació amb altres desenvolupadors. Si tothom coneix els patrons, pots dir “això ho podríem fer amb un Singleton” i s’entén de seguida sense necessitat d’explicar-ho des de zero. 
- Milloren la qualitat del teu codi, fent-lo més mantenible, escalable i flexible davant de canvis futurs.

Aprendre patrons no només et prepara per a problemes concrets, sinó que també t’ensenya a pensar de forma més estructurada i a reutilitzar bones pràctiques que la comunitat ha validat amb el temps.
En resum, per què són importants?

- Fomenten la reutilització de codi.
- Milloren la llegibilitat i mantenibilitat del codi.
- Afavoreixen la col·laboració entre desenvolupadors.
- Ajuden a seguir bones pràctiques de disseny orientat a objectes.
- Faciliten la presa de decisions arquitectòniques.

Classificació dels Patrons de Disseny
Classificació per Intenció

Els patrons es poden agrupar segons la seva intenció o propòsit principal. Les tres grans categories són:

- __Patrons Creacionals:__
    S'encarreguen de la creació d'objectes de manera flexible i controlada.
    Exemples: Singleton, Factory Method, Abstract Factory.
- __Patrons Estructurals:__
    Descriuen com agrupar classes i objectes per formar estructures més grans, mantenint-les eficients i flexibles.
    Exemples: Adapter, Composite, Decorator.
- __Patrons de Comportament:__
    S’ocupen de la comunicació i la col·laboració entre objectes, així com del repartiment de responsabilitats.
    Exemples: Observer, Strategy, Command.

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


