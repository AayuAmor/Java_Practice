public class ForArray {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        int[] marks = {43, 58, 98};
        
        /*
        marks[0] = 43;
        marks[1] = 58;
        marks[2] = 98;
        */
        /* //Using index one by one
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        */
        //Using Loop
        for (int i = 0;i<3; i++ ){
            System.out.println(marks[i]);
        }
    }
}
