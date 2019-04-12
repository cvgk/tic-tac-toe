
package calismalar;

import java.util.*;
//tic tac toe game is written by me.
public class Test {
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
      char[] array[] = new char[][]{{'1','2','3'},{'4','5','6'},
          {'7','8','9'}};
      Random random = new Random();
      printf(array);
      boolean situation = true;
      int count = 0;
      while(situation){
          System.out.print("enter number: ");
          int number = scanner.nextInt();
          count++;
          changeIt(number,array,"x".charAt(0));
          if(xwin(array)){
              System.out.println("you win.");
              printf(array);
              return;
          }
          if(count==9){
              System.out.println("draw");
              printf(array);
              break;
          }
          int no = 1+random.nextInt(9);
          boolean marked;
          marked = marked(no,array);
          while(marked){
              no = 1+random.nextInt(9);
              marked = marked(no,array);
          }
          changeIt(no,array,"o".charAt(0));
          count++;
          printf(array);
          if(owin(array)){
              System.out.println("you lost");
              printf(array);
              return;
          }
      }
      
    }
     static boolean owin(char[][] array)
    {
        if(array[0][0]=='o'&&array[0][1]=='o'&&array[0][2]=='o')
        {
            return true;
        }
        if(array[1][0]=='o'&&array[1][1]=='o'&&array[1][2]=='o')
        {
            return true;
        }
        if(array[2][0]=='o'&&array[2][1]=='o'&&array[2][2]=='o')
        {
            return true;
        }
        if(array[0][0]=='o'&&array[1][0]=='o'&&array[2][0]=='o')
        {
            return true;
        }
        if(array[0][1]=='o'&&array[1][1]=='o'&&array[2][1]=='o')
        {
            return true;
        }
        if(array[0][2]=='o'&&array[1][2]=='o'&&array[2][2]=='o')
        {
            return true;
        }
        if(array[0][0]=='o'&&array[1][1]=='o'&&array[2][2]=='o')
        {
            return true;
        }
        if(array[2][0]=='o'&&array[1][1]=='o'&&array[0][2]=='o')
        {
            return true;
        }
        return false;
    }
    static boolean xwin(char[][] array)
    {
        if(array[0][0]=='x'&&array[0][1]=='x'&&array[0][2]=='x')
        {
            return true;
        }
        if(array[1][0]=='x'&&array[1][1]=='x'&&array[1][2]=='x')
        {
            return true;
        }
        if(array[2][0]=='x'&&array[2][1]=='x'&&array[2][2]=='x')
        {
            return true;
        }
        if(array[0][0]=='x'&&array[1][0]=='x'&&array[2][0]=='x')
        {
            return true;
        }
        if(array[0][1]=='x'&&array[1][1]=='x'&&array[2][1]=='x')
        {
            return true;
        }
        if(array[0][2]=='x'&&array[1][2]=='x'&&array[2][2]=='x')
        {
            return true;
        }
        if(array[0][0]=='x'&&array[1][1]=='x'&&array[2][2]=='x')
        {
            return true;
        }
        if(array[2][0]=='x'&&array[1][1]=='x'&&array[0][2]=='x')
        {
            return true;
        }
        return false;
    }
    static boolean marked(int no,char[][] array)
    {
        if(no==1)
        {
            if((array[0][0]=='x'||array[0][0]=='o'))
            {
                return true;
            }
        }
        if(no==2)
        {
            if((array[0][1]=='x'||array[0][1]=='o'))
            {
                return true;
            }
        }
        if(no==3)
        {
            if((array[0][2]=='x'||array[0][2]=='o'))
            {
                return true;
            }
        }
        if(no==4)
        {
            if((array[1][0]=='x'||array[1][0]=='o'))
            {
                return true;
            }
        }
        if(no==5)
        {
            if((array[1][1]=='x'||array[1][1]=='o'))
            {
                return true;
            }
        }
        if(no==6)
        {
            if((array[1][2]=='x'||array[1][2]=='o'))
            {
                return true;
            }
        }
        if(no==7)
        {
            if((array[2][0]=='x'||array[2][0]=='o'))
            {
                return true;
            }
        }
        if(no==8)
        {
            if((array[2][1]=='x'||array[2][1]=='o'))
            {
                return true;
            }
        }
        if(no==9)
        {
            if((array[2][2]=='x'||array[2][2]=='o'))
            {
                return true;
            }
        }
        return false;
    }
    static void  changeIt(int number,char[][] array,char c)
    {
        switch(number)
        {
            case 1: array[0][0] = c; break;
            case 2: array[0][1] = c; break;
            case 3: array[0][2] = c; break;
            case 4: array[1][0] = c; break;
            case 5: array[1][1] = c; break;
            case 6: array[1][2] = c; break;
            case 7: array[2][0] = c; break;
            case 8: array[2][1] = c; break;
            case 9: array[2][2] = c; break;
            default: throw new IllegalArgumentException();
        }
       
    }
    static void printf(char[][] array)
    {
        for(char[] a:array)
        {
            for(char c:a)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}




    
  
 
  