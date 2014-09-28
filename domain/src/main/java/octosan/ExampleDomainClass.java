package octosan;

public class ExampleDomainClass {

    public String exampleDomainMethodTestedByIT(int intt, String string) {
        return string + intt + string;
    }
   
    public String methodTestedOnlyByJUnit(String string, int intt) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < intt*intt; i++) {
            result.append(i);
            result.append(" ");
            result.append(string);
        }
        return result.toString();
    }
 
    
    public String methodNotTestedAtAll(String string, int intt) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < intt * 5; i++) {
            result.append(i);
            result.append(string);
        }
        return result.toString();
    }
}
