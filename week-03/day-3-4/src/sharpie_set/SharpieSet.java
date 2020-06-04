package sharpie_set;

import sharpie.Sharpie;

import java.util.ArrayList;

public class SharpieSet {
//    Reuse your Sharpie class
//    Create SharpieSet class
//    it contains a list of Sharpie
//                    countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies

    public ArrayList<Sharpie> listSharpie;

    public SharpieSet(){
        this.listSharpie = new ArrayList<>();
        this.listSharpie.add(new Sharpie("red", 10));
        this.listSharpie.add(new Sharpie("green", 10));
        this.listSharpie.add(new Sharpie("blue", 10));
    }

    public boolean countUsable(){
        if (Sharpie.inkAmount > 0){
           return true;
        } else{
            return false;
        }

    }

    public void removeTrash(){
        for (int i = 0; i < listSharpie.size(); i++) {
            if (!countUsable()){
                listSharpie.remove(i);
            }
        }
    }
}
