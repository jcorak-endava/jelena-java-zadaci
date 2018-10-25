Java zadaci - Jelena

~ * ~

ZADATAK2: Napisati program za pogađanje slučajno generisanog broja u opsegu od 1 do 50.
Program treba da radi na sledeći način: Korisnik preko standardnog ulaza unosi jedan ceo broj. 
Broj koji treba pogoditi generisati “random” u opsegu od 1 do 50.
Vrteti se u petlji dok ne pogodimo broj, ili budemo barem blizu (ako je razlika između brojeva 5 ili manja).
Taj deo sa proverom pogotka izdvojiti u zasebnu metodu, kojoj se kao argument prosleđuje broj koji tipujemo, 
a povratna vrednost metode je 0 – ako smo pogodili, 1 – ako smo bili blizu, 2 – ako smo promašili.
U zavisnosti od rezultata pogađanja ispisati i odgovarajuću poruku. 
Nakon odigrane partije proveriti da li korisnik zeli da prekine ili da nastavi igru. 

~ * ~

ZADATAK5: Kreirati projekat Geometrijske slike na sledeći način:
•        Apstraktna klasa Geometrijska Slika
•        Tri osnovne klase Krug, Kvadrat, Trougao
•        Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao 
•        Klase imaju preklopnjenu metodu toString() u kojoj se ispisuju obim i povrsina
•        Svaka klasa treba da sadrži po 3 konstruktora
•        Klasa Trougao definiše jednakostranični Trougao
•        Obim elipse se racuna aπ(9-√35)/2 , a povrsina abπ
Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti objekte svih osnovnih i 
izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekata – toString()

~ * ~

ZADATAK7: Napisati program koji omogućava unos imena i prezimena studenata i broj poena osvojenih na testu preko 
standardnog ulaza (sve dok se ne unese odredjeni znak/komanda za prekid unosa podataka npr. “stampaj”).
Broj poena sme da bude od 0 do 100.
Kao rezultat programa, očekuje se izlazni fajl “ocene.txt” u kojem će se nalaziti lista svih studenata, sortirana 
po poenima, od najviše ka najmanje, i gde će se osim imena studenta i broja poena nalaziti i ocena koju je dobio na ispitu.
Ocena 10 ako je imao više od 90 poena, 9 ako je imao između 81 i 90... Sve do 5 ako je imao manje od 51 poen.
 
~ * ~ 

ZADATAK8: Napisati program koji opisuje sledeći scenario:
Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledećim kategorijama proizvoda:
•             Mlečni proizvodi
•             Kafe, Sokovi
•             Meso
O svim proizvodima čuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
Kod mlečnih proizvoda čuvamo i poreklo mleka.
Kod kafe da li je u zrnu ili je samlevena.
O Sokovima čuvamo od čega je sok.
Kod mesa čuvamo od koje životinje je meso.
Kod cene mlečnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%
Firma ima polje kapital, listu proizvoda i metodu porudzbina() koja izračuna, proverava da li ima dovoljno sredstava 
za porudzbinu na osnovu liste proizvoda. Nakon uspešne porudžbine lista ostaje prazna.
