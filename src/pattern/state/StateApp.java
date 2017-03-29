package pattern.state;

/**
 * Created by alex on 29.03.2017.
 */
public class StateApp {
    public static void main(){

        Radio radio = new Radio();
        radio.setStation(new Radio7());

        for(int i=0; i<10; i++){
            radio.play();
            radio.nextStation();
        }
    }
}
interface Station{
    void play();
}
class Radio7 implements Station{
    public void play(){System.out.println("Radio7...");}
}
class RadioDFM implements Station{
    public void play(){System.out.println("RadioDFM...");}
}
class RadioV implements Station{
    public void play(){System.out.println("RadioV...");}
}
class Radio{
    Station station;
    public void setStation(Station station){this.station = station;}
    public void nextStation(){
        if(station instanceof Radio7){
            setStation(new RadioDFM());
        }
        else if(station instanceof RadioDFM){
            setStation(new RadioV());
        }
        else if(station instanceof RadioV){
            setStation(new Radio7());
        }
    }
    public void play(){station.play();}
}