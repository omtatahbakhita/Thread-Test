/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author Bakhita
 */
public class ThreadTest {
public static int age, yrs;
    public static int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        t1.start();
                try{
                t1.join();
                } catch (Exception ie){
                System.out.println(ie.getMessage());
        }
        
        t2.start();
                try {
                t2.join();
                } catch (Exception ie){
                System.out.println(ie.getMessage());
        }
        t3.start();
        
        
    }
    
    static Thread t1 = new Thread(new Runnable()
    {
        @Override
        public void run(){
        for (int i = 0; i < ages.length; i++) {
            age = ages[i];
            yrs = age - 18;
            System.out.print("It has been " + yrs + " years since "
                    + "you were able to vote\n");
            } 
        }
    });    
    
    static Thread t2 = new Thread(new Runnable()
    {
        @Override
        public void run(){
        for (int i = 0; i < ages.length; i++) {
            age = ages[i];
            System.out.print("You are " + age + " years old\n");
            }
        }
    });
    static Thread t3 = new Thread(new Runnable()
    {
        @Override
        public void run(){
        for (int i = 0; i < ages.length; i++  ) {
            age = ages[i];
            yrs = age - 18;
            int voted = (yrs / 5) + 1;
            System.out.print("You have voted " + voted + " times\n");
            }
        }
    });
}

