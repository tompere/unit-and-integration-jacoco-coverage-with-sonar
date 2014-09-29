package octosan;

public class ExampleApiOneClass {

    public String exampleApiMethodTestedByIT(int intt, String string) {
        StringBuffer result = new StringBuffer(); 
        for (int i = 0; i < intt; i++) {
            result.append(string);
        }
        return result.toString();
    }
    
    public String methodNotTestedAtAll(String string, int intt) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < intt * 15; i++) {
            result.append(i);
            result.append(string);
        }
        return result.toString();
    }
}
