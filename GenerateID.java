import java.util.*;
public class GenerateID{
public static void main(String[] args) {
    Random random= new Random();
    String ID="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    StringBuilder sb= new StringBuilder();
    StringBuilder st= new StringBuilder();
    StringBuilder sm= new StringBuilder();
    for(int i=1;i<=8;i++){
        sb.append(ID.charAt(random.nextInt(ID.length())));
        st.append(ID.charAt(random.nextInt(ID.length())));
        sm.append(ID.charAt(random.nextInt(ID.length())));
    }
    System.out.println(sb.toString()+"-"+st.toString()+"-"+sm.toString());
}
}