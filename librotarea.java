# Tareas
Garcia Santiago Emiliano POO 2208 FESA

public class librotarea{

    public static void main(String[] args){
        String s = "Hola";
        int x=s.length();
        System.out.println(x);
        
        String s1 = "hola";
        boolean b1 = s1.isEmpty();
        
        String s2 = "";
        boolean b2 = s2.isEmpty();
        
        System.out.println(b1);
        System.out.println(b2);
        
        String t = "hola";
        for (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            System.out.println(c);
        } 
        
        String x2 ="hola";
        String y= "hola";
        
        if (x2.equals(y)){
            System.out.println("SI pasa por aqui");
        }
        
        String ss ="Hola, como estas?";
        int p1 =ss.indexOf('a');
        int p2 =ss.lastIndexOf('a');
        
        System.out.println(p1);
        System.out.println(p2);
        
        String sss = "Hola, como estas? Estas como querias?";
        int pp1=sss.indexOf("como");
        int pp2=sss.indexOf("estas");
        int pp3=sss.lastIndexOf("como");
        
        System.out.println(pp1);
        System.out.println(pp2);
        System.out.println(pp3); 
        
        String s4="hola, como estas?";
        String may =s4.toUpperCase();
        String min= s4.toLowerCase();
        
        System.out.println(may);
        System.out.println(min);
        
        String sx = "hola, como estas?";
        
        String sx1 =sx.substring(0,4);
        String sx2 =sx.substring(6,10);
        String sx3 =sx.substring(11);
        
         System.out.println(sx1);
         System.out.println(sx2);
         System.out.println(sx3);
         
         String sy = "1234";
         int i2 = Integer.parseInt(sy);
         String ty = Integer.toString(i2);
         
         String sz = "1234.56";
         double d = Double.parseDouble(sz);
         String tz = Double.toString(d);
         
         String sw = "hola, ";
         String sw2= "como estas";
         
         String u = sw + sw2;
         
         System.out.println(u);
         
         String q = "hola";
         q = "chao";
         System.out.println(q);
         
         String q1 = "hola, ";
        q1+= "chao";
        System.out.println(q1);
        
        StringBuilder sb = new StringBulder();
        sd.apped("hola, ");
        sd.apped("chao");
        System.out.println(sb);
        
        StringBuilder sb1 = new StringBuilder ("hola");
        sb1.setCharAt (2, 'x');
        System.out.println(sb1);
         }
}
