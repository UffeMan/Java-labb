# Java-labb


1. Beskriv (kortfattat och översiktligt) vad Streams är för något och vad det kan vara bra för.

En stream är en sekvens av objekt som stöder olika metoder som kan pipelinas? för att producera det önskade resultatet.
Den tar input från samlingar, arrayer eller I/O-kanaler.


2. Skriv koden till ett eget funktionellt interface samt ge ett exempel på en
implementation av ditt interface på lambda-form.

public interface Cat {
    public String getNoice();
}

public class Ragdoll extends Cat{
    public String getNoice() return "mjau...";
}

Cat c = new Ragdoll();
System.out.println(()->getNoice);



3. Beskriv kortfattat och översiktligt varför programmerar använder design patterns?

För att inte återuppfinna hjulet om och om igen.
Mina kollegor kan lätt se vad jag har gjort.





4. Nämn två olika design pattern och förklara hur ett av dessa fungerar samt vad det kan vara bra för.

Singel pattern när man vill ha ett globalt object. Som t.ex. en logg som loggar allt som händer i hela systemet.





5. Beskriv (kortfattat och översiktligt) vad reguljära uttryck / regex är för något?

Det är ett esoteriskt språk som används inom de flesta programmeringsspråk.
Det används för att hitta träffar i strängar och returnerar falskt eller sant. 







6. Ge exempel på ett reguljärt uttryck och beskriv vad ditt uttryck matchar på.

RegEx "smart" 
"Uffe är inte så smart. Hans kompis är mycket mer smart."
Mitt uttryck letar efter ordet smart, och i detta exemplet finns det två träffar.
Så det finns en träff, alltså sant.