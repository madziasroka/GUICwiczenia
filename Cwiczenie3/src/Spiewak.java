public abstract class Spiewak {
    public static int startNumber;
    public int numer;
    public String name;

    public Spiewak(String name){
        this.name = name;
        numer = ++startNumber;
    }

    public String getName() {
        return name;
    }

    abstract String spiewaj();

    @Override
    public String toString() {
        return "(" + numer + ") "+ getName() + ": " + spiewaj();
    }


    public static Spiewak najglosniej(Spiewak[] spiewak){
        Spiewak najglosniejszySpiewak = null;
        int maxValue=0;

        for(Spiewak s : spiewak){
            String spiew = s.spiewaj();
            int value = 0;

           for (char c : spiew.toCharArray()) {
               if (Character.isDigit(c)) {
                   value += Character.getNumericValue(c);
               } else if (Character.isLetter(c)) {
                   value += Character.toLowerCase(c) - 'a' - 1;
               }
           }

               if(value>maxValue){
                   maxValue = value;
                   najglosniejszySpiewak = s;
               }


        }
        return najglosniejszySpiewak;
    }
}

