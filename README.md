# java-computer-practice-problem
In this project I will be doing a few practice
problems whose subject is mainly computers.
The description will be found only here in the
README so as the problems demand change to previously
defined classes I shall change them. The problems
will be in Bosnian, translation can be done via
Google Translate for who needs it.

1. Napravite klasu Computer, te Desktop i Laptop koje nasljeduju Computer.
   Klasa Computer sadrzi atribute model, manufacturer i operatingSystem(svi String),
   Desktop dodatno sadrzi atribut caseHeight(double), dok Laptop sadrzi atribute
   batteryCapacity(int) i weight(double). Napisite konstruktore za sve atribute,
   get i set metode, te metodu toString u sve tri klase. Napisite metodu main u kojoj
   cete stvoriti po jedan objekt svake klase i ispisati njihove podatke.<br><br>

2. Prepraviti kod iz 1. zadatka tako da nije moguce stvoriti objekt tipa Computer.
   Takoder, dodajte apstraktnu metodu getComputerType u klasu Computer (metoda ne prima
   argumente, a vraca String "desktop", "computer" ili "laptop computer", ovisno o kojoj
   vrsti objekta je rijec). Napisite i metodu calculatePortabilityScore (nema argumenata,
   a vraca int), koja ce vratiti kategoriju prenosivosti nekog uredaja, i to na sljedeci
   nacin: za laptope se vrati tezina uredaja zaokruzena na cijeli broj, a za desktop
   racunala formula je: 5 + caseHeight / 30. Osigurajte da svako racunalo mora implementirati
   metodu calculatePortabilityScore.<br><br>

3. Napravite klasu Netbook koja nasljeduje Laptop. Metoda calculatePortabilityScore u ovoj
   klasu uvijek vraca score 1, a metoda getComputerType vraca "netbook laptop computer".
   Dodatno, onemugucite daljnje nasljedivanje klase Netbook.<br><br>

    Za isjecak koda:<br><br>
    
    Computer n = new Netbook("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
    
    System.out.println(n);<br>
    System.out.println(n.getComputerType());<br>
    System.out.println(n.calculatePortabilityScore());<br>
    
    Laptop l = (Laptop) n;<br>
    System.out.println(l.calculatePortabilityScore());<br><br>
    
    Ocekuje se ovakav ispis:<br>
    Ideapad S12, manufacturer=Lenovo, operatingSystem=Windows, batteryCapacity=50, weight=1.55
    netbook laptop computer<br>
    1<br>
    1<br><br>

4. Napravite klase Device koja opisuje neki genericki uredaj. Neka Computer nasljeduje Device.
   Kakva zbog toga mora biti klasa Device? Ima li smisla neke atribute iz Computer preseliti u
   Device? Takoder, dodajte i klasu Mp3Player koja nasljeduje Device, a ima atribute batteryCapacity(int)
   i memorySize(int). Uocite da su neki od uredaja prenosivi, npr. Mp3Player, Laptop i NetBook. Osigurajte
   da svi prenosivi uredaji implementiraju metode getModel() i getBatteryCapacity().

