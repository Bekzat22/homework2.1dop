public final  class Leo extends Animal{
    private String type;
    private int speed;
    private Partner partner;


    public Leo(String name,String type,int speed,Partner partner) {
        super(name);
        this.type=type;
        this.speed=speed;
        this.partner=partner;
    }


    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public Partner getPartner() {
        return partner;
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+getType()+" "+getPartner().getPrint()+" "+getSpeed());
    }
}
