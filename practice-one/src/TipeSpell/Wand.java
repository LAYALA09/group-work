package TipeSpell;

public class Wand { //revisado
    private int points;
    private String name;

    public Wand(int points, String name) {
        this.points = points;
        this.name = name;
    }
         public Wand() {
        }


        //getter & setter
        public int getPoints () {
            return points;
        }
        public void setPoints ( int points){
            this.points = points;
        }
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

        @Override
        public String toString () {
            return "Wand{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

