public class Forxh {
    public static void main(String[] args) {
      /*  int z=5;
        for (int x = 0; x <=5; x++)
        {
            for (int y = 1; y <=z; y++)
            {
            System.out.print("*");
             }
            System.out.println();
            z--;
        }*/

       /* for (int x = 0; x <=5; x++)
        {
            for (int y = 1; y <=x; y++)
            {
                System.out.print(y);
            }
            System.out.println();

        }*/
       /*
       //九九乘法表
       for (int x=0;x<=9;x++){
           for(int y=1;y<=x;y++){
               System.out.print(""+y+"*"+x+"="+(x*y)+" ");
           }
           System.out.println();
       }*/
       for(int x=1;x<=5;x++){
           for(int y=1;y<x;y++){
               System.out.print(" ");
           }
           for(int z=x;z<=5;z++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
