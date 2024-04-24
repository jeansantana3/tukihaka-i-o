public class Deportes {
    public static void main(String[] args) {
        Basketball Lebron = new Basketball("Lebron James", "23");
        Football Cristiano = new Football("Cristiano Ronaldo", "10");

        Lebron.Score();
        Cristiano.Score();
    }

    abstract static class Deporte {
        public abstract void Score();

        public static void Play() {
            System.out.println("Let's play sports!");
        }
    }

    static class Basketball extends Deporte {
        private String name;
        private String number;

        public Basketball(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public void Score() {
            System.out.println(name + " scored a basket!");
        }
    }

    static class Football extends Deporte {
        private String name;
        private String number;

        public Football(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public void Score() {
            System.out.println(name + " scored a goal!");
        }
    }
}
