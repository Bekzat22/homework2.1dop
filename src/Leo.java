public final  class Leo extends cat {
    private String type;

    public Partner getPartner() {
        return partner;
    }

    private Partner partner;
    public Leo(String name, String breed, int speed,String type,Partner partner) {
        super(name, breed, speed);
        this.type=type;
        this.partner=partner;
    }
    public String makeVoice(String voice){
        voice="roar";
        return voice;
    }


    public String getType() {
        return type;
    }
}
