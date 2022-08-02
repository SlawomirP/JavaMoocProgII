package ex10_15;

public class Checker {
    public static void main(String[] args) {

    Checker checker = new Checker();

        System.out.println(checker.isDayOfWeek("abc"));

    }

    //METODA SPRAWDZI
    public  boolean isDayOfWeek(String string){
        if (string.matches("mon | tue | wed | thu | fri | sat | sun")){
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
