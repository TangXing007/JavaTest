public class Main extends D {
    public static void main(String[] args){
        Super sup = new Sub();
        System.out.println("sup.filte = " + sup.filte + "sup.getFlite = " + sup.getFilte());
        Sub sub = new Sub();
        System.out.println("sub.filte = " + sub.filte + "sub.getFilte = " + sub.getFilte() + "sub.getSuperFilte = "
                + sub.getSuperFilte());
        x();
    }
}
class Super{
    public int filte = 0;
    public int getFilte(){
        return filte;
    }
}
class Sub extends Super{
    public int filte = 1;
    public int getFilte(){
        return filte;
    }
    public int getSuperFilte(){
        return super.filte;
    }
}