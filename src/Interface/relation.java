package Interface;

public interface relation {
    public boolean isgreat(Object a, Object b);
    public boolean isless(Object a, Object b);
    public boolean isequal(Object a, Object b);
}

class  Line implements relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line(double x1,double x2, double y1,double y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double getLenght(){
        double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return length;
    }

    @Override
    public boolean isgreat(Object a, Object b) {
        double aLen=((Line)a).getLenght();
        double bLen=((Line)b).getLenght();
        return (aLen>bLen);
    }

    @Override
    public boolean isless(Object a, Object b) {
        double aLen=((Line)a).getLenght();
        double bLen=((Line)b).getLenght();
        return (aLen<bLen);
    }
    public boolean isequal(Object a, Object b) {
        double aLen=((Line)a).getLenght();
        double bLen=((Line)b).getLenght();
        return (aLen==bLen);
    }
}