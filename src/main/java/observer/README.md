# task-java-patterns

**Descripció**: Implementar els principis SOLID mitjançant l’ús de patrons de disseny

## 📌 Patró Observer
Patró Observer
Què es?

El patró Observer és un patró de disseny comportamental que defineix una relació de dependència un-a-molts entre objectes, de manera que quan un objecte canvia d’estat, tots els seus dependents són notificats automàticament.

En altres paraules, permet definir un mecanisme de subscripció per notificar diversos objectes sobre qualsevol esdeveniment que li succeeixi a l'objecte que estan observant.
Utilitat

El patró Observer és útil quan:

    🔔 Necessitem notificar automàticament diversos components quan es produeix un canvi d’estat.
    🔃 Els canvis en l’estat d’un objecte poden afectar a altres, però no sabem quins ni quants objectes en el moment de la codificació.
    🔬 Necessitem que altres objectes s’afegeixin o eliminin dinàmicament com a observadors, segons el context.
    ✉️ Volem implementar sistemes tipus pub-sub (publicador / subscriptor).

Propòsit

    📢 Permetre que tots els observadors siguin notificats automàticament quan l’Observable canvia d’estat.
    🧩 Pots introduir noves classes subscriptores sense haver de modificar el codi de la classe notificadora (i viceversa si hi ha una interfície notificadora).
    🕒 Establir relacions entre objectes durant el temps d’execució, afegint o eliminant observadors segons sigui necessari.
    🗄️ Permetre mantenir els components desacoblats, ja que l’Observable no ha de conèixer la lògica interna dels seus observadors.

Exercici:

    Implementació del patró Observer en un sistema de notificació de canvis de la Borsa

Objectiu

Construir un sistema en què un Agent de Borsa (Observable) notifiqui automàticament a diverses agències de Borsa (Observers) cada vegada que es produeix un canvi de l’estat de la Borsa (pujada o baixada).
Descripció

    Dissenya una classe StockAgent que:
        Permeti als observadors subscriure’s i cancel·lar la subscripció.
        Tingui mètodes per simular quan la borsa puja o baixa el valor de les accions.
        Quan la borsa puja o baixa, notifiqui automàticament a tots els observadors amb un missatge que indiqui el canvi i el nou valor de les accions.
    Dissenya també diverses classes concretes d’observadors que:
        S’inscriguin al StockAgent.
        Quan siguin notificats, mostrin per pantalla el missatge de la notificació indicant si la borsa ha pujat o baixat i el valor actual.

Requisits

    L’objecte Observable ha de mantenir referències als seus observadors.
    Ha de ser possible afegir i eliminar observadors dinàmicament.
    Quan l’AgentBorsa canviï d’estat (puja o baixa), ha de cridar a notifyObservers().
    Cada observador ha de mostrar el missatge rebut.
    El programa s’ha de provar mitjançant tests unitaris la:
        subscripció de diversos observadors a l’agent de borsa.
        simulació de pujades i baixades de la borsa.
        serificació que els observadors reben i mostren correctament els missatges esperats.


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

