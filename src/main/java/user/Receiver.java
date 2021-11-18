package user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Receiver implements User{
    private int ind;
    private String result;

    public Receiver(){
        this.ind = IdCount.genId();
    }
    @Override
    public void update(String res){
        this.result = res;
    }

}
