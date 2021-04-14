package hexadecimal;
public class Hexadecimal {
    
     Hexadecimal(String cetvel){
       this.hexanumeric = cetvel;
       this.hexToDecimal = longDeger();
          
    }
     
    public String hexanumeric;
    public Long hexToDecimal;
    public Long decimalnumeric;
    
    public Long longDeger() {
        decimalnumeric = 0L;
        for (int i = 0; i < hexanumeric.length(); i++) {
            decimalnumeric = decimalnumeric * 16 + hexChar(hexanumeric.charAt(i));
        }
        return decimalnumeric;
    }

    private int hexChar(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
    
    Long topla(Hexadecimal hexa1) {
    
       return hexToDecimal + hexa1.hexToDecimal ;
    }
    Long topla(long hexa1) {
       hexanumeric = Long.toHexString(hexa1);
       return hexToDecimal + longDeger();
    }

    Long cikar(Hexadecimal hexa1) {
        
        return hexToDecimal - hexa1.hexToDecimal ;
    }
    
    
    Long cikar(long hexa1) {
       hexanumeric = Long.toHexString(hexa1);
       
       return hexToDecimal - longDeger();
       
    }
         


