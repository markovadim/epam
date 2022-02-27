package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Box;
import by.markov.basicsofoop.presents.Present;
import by.markov.basicsofoop.presents.Sweetness;

import java.util.ArrayList;

public interface PresentBuilder {
    PresentBuilder setBox (Box box);
    PresentBuilder setSweetness (ArrayList<Sweetness> sweetness);
    PresentBuilder setPresentPrice ();
    Present build();
}