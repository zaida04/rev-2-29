public class RecursiveClass {
    public int num;

    public RecursiveClass(int num) {
        this.num = num;
    }

    public void recursion() {
        if(num != 0) {
            System.out.println("Value of num is " + this.num);
            this.num = this.num - 1;
            this.recursion();
        } else {
            System.out.println("Num is now 0");
        }
    }

}
