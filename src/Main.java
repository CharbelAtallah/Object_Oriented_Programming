public class Main {

    public static void main(String[] args) {
        Bil bil = new Bil(); //Skapar ett objekt med nyckelnamnet new
        Bil bil1 = new Bil();
        Bil bil2 = new Bil();

        System.out.println("Bil nummer 1: ");
        System.out.println("Antalet hästkrafter: " + bil.motoreffekt);
        System.out.println("Slags märke: " + bil.märke);
        System.out.println("Registreringsnummer: " + bil.regNr);
        System.out.println("Bilens tjänstevikt: " + bil.tjänstevikt);
        System.out.println("Bilens årsmodell: " + bil.årsmodell);
        System.out.println("------------------------------------------");

        System.out.println("Bil nummer 2: ");
        System.out.println("Slags märke: " + bil1.märke);
        System.out.println("Registreringsnummer: " + bil1.regNr);
        System.out.println("Bilens årsmodell: " + bil1.årsmodell);
        System.out.println("Antalet hästkrafter: " + bil1.motoreffekt);
        System.out.println("Bilens tjänstevikt: " + bil1.tjänstevikt);
        System.out.println("------------------------------------------");

        System.out.println("Bil nummer 3: ");
        System.out.println("Slags märke: " + bil2.märke);
        System.out.println("Registreringsnummer: " + bil2.regNr);
        System.out.println("Bilens årsmodell: " + bil2.årsmodell);
        System.out.println("Antalet hästkrafter: " + bil2.motoreffekt);
        System.out.println("Bilens tjänstevikt: " + bil2.tjänstevikt);

    }
}
