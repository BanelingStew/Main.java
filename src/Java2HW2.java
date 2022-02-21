public class Java2HW2 {

        static String[][] arrayNotInteger = {{"7", "3", "One", "1"}, {"1", "2", "3", "45"}, {"9", "5", "2", "1"}, {"5", "5", "6", "1"}};

        static String[][] arraySizeException = {{"1", "2","4"}, {"1", "2","4",}, {"1", "2","4"}, {"1", "2","4"}};

        static String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "6", "7", "8"}, {"5", "6", "7", "8"}};

        static int sizeA = 4;
        static int sizeB = 4;

        public static void main(String[] args) {

            try {
                System.out.println("Array Sum: " + getSum(arrayWithNoError));
            } catch (MyArraySizeException | MyArrayDataException ex){
                System.out.println(ex.getMessage());
            }

            try {
                System.out.println("Сумма массива: " + getSum(arraySizeException));
            } catch (MyArraySizeException | MyArrayDataException ex){
                System.out.println(ex.getMessage());
            }

            try {
                System.out.println("Сумма массива: " + getSum(arrayNotInteger));
            } catch (MyArraySizeException | MyArrayDataException ex){
                System.out.println(ex.getMessage());
            }
        }

        static void checkValue(String[][] array) throws MyArraySizeException{
            if(array.length!=sizeA || array[0].length!=sizeB) throw new MyArraySizeException();
        }

        static Integer getSum(String[][] array) throws MyArrayDataException,MyArraySizeException{
            checkValue(array);
            Integer result = 0;
            int i =0;
            int j =0;
            try {
                for (; i < array.length; i++) {
                    j =0;
                    for (; j < array.length; j++) {
                        result = result + Integer.parseInt(array[i][j]);
                    }
                }
            } catch (NumberFormatException ex){
                throw new  MyArrayDataException("Error in Cell #: " + i+","+j);
            }

            return result;
        }

        public static class MyArraySizeException extends Exception {
            public MyArraySizeException(){
                super("Incorrect Array Size");
            }
        }

        public static class MyArrayDataException extends Exception {
            public MyArrayDataException(String message){
                super(message);
            }
        }

    }

