    //1
    public class MainClassZagornov {

        //2
        public static void main(String[] args) {
            byte byteVal = 10;
            short shortVal = 100;
            int intVal = 1000;
            long longVal = 10000000000L;
            float floatVal = 100.7f;
            double doubleVal = 157.157;
            char charVal = '\uffff';
            boolean booleanVal = false;
        }

        //3
        public static int calculate(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        //4
        public static boolean task10and20(int x1, int x2) {
            int sum = x1 + x2;
            return sum > 9 && sum < 21;
        }

        //5
        static void positOrNegatNum(int num) {
            if (num < 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

            //6
            public static boolean isNegative(int num, Object name) {
                if (num < 0) {
                    return true;
                } else {
                    return false;
                }
            }
                //7
                static void sayHalloName (String name) {
                    System.out.printf("Привет, %s", name);
            }
        }









