public class cat extends Animal implements Printable {
    private String breed;
    private int speed;

    public cat(String name,String breed,int speed) {
        super(name);
        this.breed=breed;
        this.speed=speed;
    }
    public String makeVoice(String voice){
        voice="meow";
        return voice;
    }
    public final String makeVoice(String voice,int volume){
        return voice+""+volume;
    }


    public String getBreed() {
        return breed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+getBreed()+" "+getSpeed()+ " "+makeVoice(" "));

    }
}
