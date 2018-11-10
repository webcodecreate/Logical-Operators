package test2;

public class Test2 {
    
    public static char toOneTwo(final Boolean b) {
        return b == null ? '?' : b ? '1' : '0';
    }

    public static void main(String[] args) {
        boolean p, q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = true; q = true;        
        System.out.println(toOneTwo(p) + "\t" + toOneTwo(q) + "\t" + toOneTwo(p&q) + "\t"
                + toOneTwo(p|q) + "\t" + toOneTwo(p^q) + "\t" + toOneTwo(!p));
        
        p = false; q = false;        
        System.out.println(toOneTwo(p) + "\t" + toOneTwo(q) + "\t" + toOneTwo(p&q) + "\t"
                + toOneTwo(p|q) + "\t" + toOneTwo(p^q) + "\t" + toOneTwo(!p));
        
        p = true; q = false;
        System.out.println(toOneTwo(p) + "\t" + toOneTwo(q) + "\t" + toOneTwo(p&q) + "\t"
                + toOneTwo(p|q) + "\t" + toOneTwo(p^q) + "\t" + toOneTwo(!p));
        
        p = false; q = true;
        System.out.println(toOneTwo(p) + "\t" + toOneTwo(q) + "\t" + toOneTwo(p&q) + "\t"
                + toOneTwo(p|q) + "\t" + toOneTwo(p^q) + "\t" + toOneTwo(!p));
        
    }
    
}