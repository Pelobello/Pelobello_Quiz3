/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_quiz3;

import java.util.Scanner;


public class Pelobello_Quiz3 {
    static int MAX = 11;
    private int []data =new int[MAX];
    private int front ;
    private int rear ;
    
    
    private void insertBiggining(int value) throws Exception {
        // Overflow
        if ((front == 0 && rear == MAX - 1) || (rear + 1 == front)) {
            throw new Exception("Full tank!");
        }

        if (rear == MAX - 1) {
            rear = 0;
        } else {
            data[rear++] = value;
        }
    }
       private void insertEnding(int value) throws Exception {
        // Overflow
        if ((front == 0 && rear == MAX - 1)) {
            throw new Exception("Full tank!");
        }

        if (front == -1) {
            front = rear ;
        } else if (rear == MAX ) {
            rear = rear %MAX;
        }
          
          data[++rear] = value;
          
          
       
    }
    private void insert (int index)throws Exception{
        //overflow
        if ( (front == 0 && rear ==MAX-1) ||
                (rear +1 == front)){
            throw new Exception("Full tank!");
        }
        
        if (rear ==MAX -1){
            rear = 0;
        }else if (front == 1){
            front = 0;
        }else {
            data[rear++]=index;
        }
    }
    private void display()throws Exception{
        //overlow
        if (front ==-1) {
            throw new Exception("Empty");
            
        }
        if (rear < front) {
            for (int i = 0; i <= MAX-1; i++) {
                System.out.println(data[i]+" ");
            }
            for (int i = 0; i < rear; i++) {
                System.out.println(data[i]+"");
            }
            
        }else{
            for (int i = front; i < rear; i++) {
                System.out.println(data[i]+" ");
            }
        }
        System.out.println("NULL");
    }
    private int deletion()throws Exception{
        if (front ==-1) {
            throw  new Exception("Empty");
        }
        int temp = data[front];
        if (front == rear) {
            front = rear = -1;
        }else if ( front == MAX-1){
            front = 0;
        }else {
            front++;
        }
        return temp;
    } 
      public int deleteBeginning() throws Exception{
        if (front == -1) {
            throw new Exception("Empty");
        }
            int temporary = data[front];
            
            if (front == rear) {
                front = rear= -1;
            }else{
                front++;
            }
         return temporary;  
    }
    public int deleteEnding() throws Exception{
          if (front == -1) {
            throw new Exception("Empty");
        }
          
          int temporary = data[rear];
          if (front == rear) {
            front =rear = -1;
        }else {
              rear--;
          }
          return temporary;
    }
 
    public static void main(String[] args) throws Exception {
      
         Scanner scan = new Scanner(System.in);
        
       Pelobello_Quiz3 q = new Pelobello_Quiz3();
       Pelobello_Quiz3 p = new Pelobello_Quiz3();
       
   
          boolean menu = true;
          
          while (menu) {            
              System.out.println("1 linear queu containing nine elements");
              System.out.println("2 inserting an elemnt in circular queue that allows insertion and deletion at both ends");
              System.out.print("Enter your choice: ");
              int input = scan.nextInt();
              switch (input) {
                  case 1:
                      q.insert(1);
                      q.insert(2);
                      q.insert(3);
                      q.insert(4);
                      q.insert(5);
                      q.insert(6);
                      q.insert(7);
                      q.insert(8);
                      q.insert(9);
                     
                      q.display();
                      break;
                      
                  case 2: 
                        p.insertBiggining(1);
                        p.insertBiggining(2);
                        p.insertBiggining(3);
                        p.insertBiggining(4);
                        p.insertBiggining(5);
                        p.insertBiggining(6);
                        p.insertBiggining(7);
                        p.insertBiggining(8);
                        p.insertEnding(9);
                       
                        
                        p.deleteBeginning();
                        p.deleteEnding();
                      
                        p.display();
                      break;
                  default:
                      System.out.println("bye!");
                      menu=false;
                      scan.close();
              }
        }
        
        
    }
    
}
