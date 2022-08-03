package ex10_15;

public class Checker {
    public static void main(String[] args) {

    Checker checker = new Checker();

        System.out.println(checker.timeOfDay("33:33:33"));

    }

    //METODA SPRAWDZI czy wpisany text jest jednym z tych textow w nawiasie
    public  boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    //METODA KTORA SPRAWDZI CZY ZNAKI W STRINGU TO SAMOGLOSKI
    public boolean allVowels (String string){
        if (string.matches("[aeiou]*")){
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    //METODA SPRAWDZAJACA POPRAWNOSC WYSWIETLANEJ GODZINY 23:59:59
    public boolean timeOfDay (String string){
        //pierwsza cyfra przedzial od 0 do 1, druga cyfra to zakres 0 d0 9
        // znak lub pierwsza cyfra to 2 a druga nalezy do przedzialu 0-3
        // nastepnie dwukropek plus cyfra z przedzialu 0-5 i kolejna cyfra 0=9
        // po dwukropku ten sam skład
        if (string.matches("([0-1]\\d|2[0-3]):[0-5]\\d:[0-5]\\d")){
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }


}

//    String string = "trolololololo";
//
//if (string.matches("trolo(lo)*")) {
//        System.out.println("Correct form.");
//        } else {
//        System.out.println("Incorrect form.");
//        }
//----------------------------------------------
//@Test
//public void testPredefinedClases() {
//    Pattern pattern = Pattern.compile("\\d\\w\\d");
//    assertTrue(pattern.matcher("0_0").matches());
//    assertTrue(pattern.matcher("0X1").matches());
//    assertFalse(pattern.matcher("a0b").matches());
//    assertFalse(pattern.matcher("0 0").matches());
//}
