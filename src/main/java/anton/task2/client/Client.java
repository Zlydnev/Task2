package anton.task2.client;

import anton.task2.card.type.TypeOfCard;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Client implements Comparable<Integer>{
    private final int id;
    private String FIO;
    private TypeOfCard typeOfCard;
    private boolean signOfPensioner;
    private static int i = 0;

    public Client(String FIO, boolean signOfPensioner) {
        id = i+1;
        i++;
        this.FIO = FIO;
        this.signOfPensioner = signOfPensioner;
    }

    public int getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public TypeOfCard getTypeOfCart() {
        return typeOfCard;
    }

    public void setTypeOfCart(TypeOfCard typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public boolean isSignOfPensioner() {
        return signOfPensioner;
    }

    public void setSignOfPensioner(boolean signOfPensioner) {
        this.signOfPensioner = signOfPensioner;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", typeOfCart=" + typeOfCard +
                ", signOfPensioner=" + signOfPensioner +
                '}';
    }

    @Override
    public int compareTo(Integer o) {
        return this.id - o;
    }
}
