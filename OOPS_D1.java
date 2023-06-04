public class OOPS_D1 {
    public static void main(String[] args) {

    }
}

//to create secure communication betn user and systems
abstract class class_of_abstract{
    String S_name;
    int s_Id;
   abstract void method1();//abstract method which does not have body

    void feature_method(){//concrete methods with body //whihc can be accessed by super key word
        String s_feature1;
        int s_Feature_id;
    }
        }
        class mac extends class_of_abstract{

            @Override
            void method1() {

                System.out.println("features of mac");
            }

            @Override
            void feature_method() {
                super.feature_method();
            }
        }

