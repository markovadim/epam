package by.markov.strings.regex.first;

public class Main {
    public static void main(String[] args) {
        String line = "\tLondon is the capital and largest city of England and the United Kingdom. It stands on the River Thames in south-east England at the head of a 50-mile (80 km) estuary down to the North Sea, and has been a major settlement for two millennia.[9]" +
                "\n\tThe City of London, its ancient core and financial centre, was founded by the Romans as Londinium and retains boundaries close to its medieval ones.[note 1][10]" +
                "\n\tSince the 19th century,[11] \"London\" has also referred to the metropolis around this core, historically split between the counties of Middlesex, Essex, Surrey, Kent, and Hertfordshire.[12]" +
                "\n\tSince 1965, London has comprised the 32 London boroughs together with the City of London. This combined area corresponds to the administrative area of Greater London,[13] governed by the Greater London Authority, as well as to the London region of England." +
                "The City of Westminster, to the west of the City of London, has for centuries held the national government and parliament.";
        ServiceOfText serviceOfText = new ServiceOfText();
        serviceOfText.getService(line);
    }
}
