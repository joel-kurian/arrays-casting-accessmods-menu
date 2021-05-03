public class HelloWorld{
    
    public static class node{
        int val;
        String name;
        public node() {
            this.val = 0;
            this.name = null;
        }
        
        public node(int val, String name) {
            this.val = val;
            this.name = name;
        }
        
        public void setName(String newName) { this.name = newName; }
        public String getName() { return this.name; }
        public void setVal(int newVal) { this.val = newVal; }
        public int getVal() { return this.val; }
        public String toString() { return this.val + "=" + this.name; }
    }

     public static void main(String []args){
        HelloWorld e = new HelloWorld();
        
        System.out.println(e.divNum(1,2));
        
        System.out.print(e.whatNum('a') + " ");
        System.out.print(e.whatNum('b') + " ");
        System.out.print(e.whatNum('c') + " ");
        System.out.print(e.whatNum('d') + " ");
        System.out.println(e.whatNum('e'));
        
        for (int val : e.fib(5)) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        node n1 = new node(1, "a");
        node n2 = new node(2, "b");
        System.out.println(n1 + " " + n2);
        n1.setName("aaa");
        n1.setVal(111);
        System.out.println(n1 + " " + n2);
     }
     
     private double divNum(int a, int b) {
         return (double) a / b;
     }
     
     private int whatNum(char c) {
         int ret = -1;
         
         if (c == 'a') {
             ret = 1;
         } else if (c == 'b') {
             ret = 2;
         } else {
             ret = 3;
         }
         
         switch(c) {
             case 'c':
                 ret = 3;
                 break;
             case 'd':
                 ret = 4;
                 break;
             default:
                 ret -= 1;
         }
         return ret;
     }
     
     private int[] fib(int n) {
         int[] ret;
         if (n < 0) {
             ret = new int[1];
             ret[0] = -1;
             return ret;
         } else if (n <= 1) {
             ret = new int[1];
             ret[0] = n;
             return ret;
         }
         ret = new int[n+1];
         ret[0] = 0;
         ret[1] = 1;
         for (int i = 2; i < ret.length; i++) {
             ret[i] = ret[i-1] + ret[i-2];
         }
         return ret;
     }
}