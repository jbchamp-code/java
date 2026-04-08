package CIICC.task;

public class task3 {
    public void changevariables(){
        String a = "Wow";
        String b = a;
        String d = "Wow!";
        String c = d;
        
        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);
        System.out.println(a == b);
        System.out.println(d.equals(b + "!"));
        System.out.println(!c.equals(a));
        if(b1 && b2 && b3)
            System.out.println("success");
        
    }
}
