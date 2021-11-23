package lambda;

public class Main {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        motify(x,y);
        //System.out.println(x+" "+y);
        Exam exam = new Exam(5);
        System.out.println(motify2(exam));
    }
    public static void motify(int x,int y){
        x=5;
        y=10;
    }
    public static Exam motify2(Exam exam){
       return exam = new Exam(10);

    }
    static class Exam {
        private int num;

        public Exam(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Exam{" +
                    "num=" + num +
                    '}';
        }
    }
}
