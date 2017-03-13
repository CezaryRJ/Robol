Programmet kjores ved å kompilere alt med javac *.java , saa kjore main med 1,2,3 eller 4 som argument for kjoring av onsket programm


Alle objekter i programmet implementerer interfaced robol og har derfor metoden Interpret() i seg,
denne har ingen returverdi i statments, og returnerer int i expressions
Alle statmnets har også en peker til en robot i seg.
Booleanexp returnerer 1 hvis sant, 0 hvis usant(samme som C)
boolean og arithmetic exp, tar inn to expression og en operator, returnerer tilsvarende int verdi etter ett kall paa Interpret
Assignment tar inn en identifier og en expression og setter identifier-ens sin var_decl lik expression-et den fikk inn

Stop tar inn en robot, printer ut robotens posisjon og avslutter programmet 

var_decl har en expression og en identifier 
identifier har en peker til sin var_decl
identifiers ligger i en hashmap under sin tilsvarende nokkel
altså f.esk vi kan hente identifieren med nokkel "i" , som kommer til aa gi oss en identifer, som forer til en var_decl som har ett expression som vi er interresert i


Program har en grid og og robot 
Robot har en liste av statments,og var_decl-s, og en hash tabell av identifiers for enkelthetens skyld
While har en liste av statments og en boolen-exp som bestemmer om loopen er ferdig 

move evaluerer gitte expressions og forandrer paa posisjonen til roboten tilsvarende, hvis destinasjonen er 
utenfor grid sine dimensjoner, printer den ut en feil og avslutter programmet.
move thar ogsaa kunn en av 4 forhaandsdefinerte retninger : south,east,nort,west
