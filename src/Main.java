public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }
    static void task1(){
        int [] oneTwoThree = new int[3];
        for (int i = 0; i < 3; i++) {
            oneTwoThree[i]=i+1;
        }

        double [] random = {1.57, 7.654, 9.986};

        char [] abc = new char[3];
        abc[0]='a';
        abc[1]='b';
        abc[2]='c';
    }
    static void task2() {
        int[] oneTwoThree = new int[3];
        for (int i = 0; i < oneTwoThree.length-1; i++) {
            oneTwoThree[i] = i + 1;
            System.out.print(oneTwoThree[i] + ", ");
        }
        oneTwoThree[oneTwoThree.length-1] = oneTwoThree.length;
        System.out.println(oneTwoThree[oneTwoThree.length-1]);

        double[] random = {1.57, 7.654, 9.986};
        for (int i = 0; i < random.length-1; i++) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[random.length-1]);

        char[] abc = new char[3];
        abc[0] = 'a';
        abc[1] = 'b';
        abc[2] = 'c';
        for (int i = 0; i < abc.length-1; i++) {
            System.out.print(abc[i] + ", ");
        }
        System.out.println(abc[abc.length-1]+"\n");
    }
    static void task3(){
        int[] oneTwoThree = new int[3];
        for (int i = oneTwoThree.length-1; i > 0; i--) {
            oneTwoThree[i] = i + 1;
            System.out.print(oneTwoThree[i] + ", ");
        }
        oneTwoThree[0] = oneTwoThree.length-2;
        System.out.println(oneTwoThree[0]);

        double[] random = {1.57, 7.654, 9.986};
        for (int i = random.length-1; i > 0; i--) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[0]);

        char[] abc = new char[3];
        abc[0] = 'a';
        abc[1] = 'b';
        abc[2] = 'c';
        for (int i = abc.length-1; i >0  ; i--) {
            System.out.print(abc[i] + ", ");
        }
        System.out.println(abc[0]+"\n");
    }
    static void task4(){
        int[] oneTwoThree = new int[16];
        for (int i = 0; i < oneTwoThree.length; i++) {
            oneTwoThree[i] = i + 1;
            if(oneTwoThree[i]%2!=0){
                oneTwoThree[i]+=1;
            }
            System.out.print(oneTwoThree[i] + ", ");
        }

    }
    static void task5(){

        int [][]matrix = new int[3][3];
        int diagonal = 4;
        for(int rowIndex=0;rowIndex<matrix.length;rowIndex++){
            for (int columnIndex=0;columnIndex<matrix.length;columnIndex++){
                if (rowIndex%2==0 && columnIndex%2==0 || rowIndex%2!=0 && columnIndex%2!=0){
                    matrix[rowIndex][columnIndex]=diagonal;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        }




    }
