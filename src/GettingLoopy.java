public class GettingLoopy {
    

    //count up by 1 from 0 to 30
    public static void main2(String[] args) throws Exception {
        //define logic for the loop 
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
    }        
    //count down by 1 from 30 to 0
    public static void main3(String[] args) throws Exception {
        //define logic for the loop 
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
    }    
    
    
    //count up by 3 from 0 to 18
    public static void main4(String[] args) throws Exception {
        //define logic for the loop 
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
    }
    
    //count down by 2 from 10 to 0 
    public static void main5(String[] args) throws Exception {
        //define logic for the loop 
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }   
    
    
        //part B #5 nested loop to create figure 
        public static void main6(String[] args) throws Exception {
            //define logic for the loop 
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }   
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        int height = 7;  // Height of the letter

        for (int i = 0; i < height; i++) {
            // Top and bottom arcs
            if (i == 0 || i == height - 1) {
                System.out.print("*");
                for (int j = 0; j < height; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Middle lines
            else {
                System.out.print("*");
                for (int j = 0; j < height; j++) {
                    if (j == height - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        }
    }
}
