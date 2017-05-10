
public class Director {
    BuilderInterface builder;
    public Director(BuilderInterface builder){
        this.builder=builder;
    }
    public void build(String s,int w){
        System.out.println("Inside Director build()");
        builder.settingColors(s);
        builder.settingWheels(w);
    }
}
