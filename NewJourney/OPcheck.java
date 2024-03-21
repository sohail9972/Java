package NewJourney;

public class OPcheck {
    class parent {
        String name ="xyz";

    }
    class child extends parent{
        String classu ="abc";

        public void main(String[] args) {

            child one= new child();
            System.out.println(one.classu);
            System.out.println(one.name);
        }
    }

}
