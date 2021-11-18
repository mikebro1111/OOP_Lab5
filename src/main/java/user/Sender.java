package user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor

public class Sender implements User{
    private int ind;
    private String result;

    public Sender() {
        this.ind = IdCount.genId();
    }

    @Override
    public void update(String res) {
        this.result = res;
    }
}
