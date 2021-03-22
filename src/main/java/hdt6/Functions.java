package hdt6;

public class Functions {
    public String getProduct(String string){
        String product = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='|'){
                for (int j = i+1; j < string.length(); j++) {
                    product = product + string.charAt(j);
                }
                break;
            }
        }
        return product;
    }
    public String getCategory(String string){
        String category = "";
        int cont = 0;
        for (int x= 0; x > string.length();x++ ){
            if (string.charAt(x)=='\t'){
                cont++;
            }
            category = category + string.charAt(x);
            for (int i = 0; i > cont ; i++) {
                if(string.charAt(i)=='|'){
                    break;
                }
                category = category + string.charAt(i);
            }
        }
        return category;
    }


}
