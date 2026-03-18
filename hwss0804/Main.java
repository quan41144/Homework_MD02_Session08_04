package hwss0804;
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println("Rectangle 1: "+ r1.toString());
        System.out.println("Rectangle 2: "+ r2.toString());
        System.out.println("Rectangle 3: "+ r3.toString());
        double[] arr = {r1.getArea(), r2.getArea(), r3.getArea()};
        double[] arrWidth = {r1.getWidth(), r2.getWidth(), r3.getWidth()};
        double[] arrHeight = {r1.getHeight(), r2.getHeight(), r3.getHeight()};
        int idx = 0;
        double maxArea = 0;
        double maxWidth = 0;
        double maxHeight = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > maxArea) {
                maxArea = arr[i];
                idx = i;
                maxWidth = arrWidth[i];
                maxHeight = arrHeight[i];
            }
        }
        System.out.println("Largest area = " + maxArea + " (Rectangle " + (idx+1) + ": " + "width="+maxWidth +", height="+maxHeight+")");
    }
}
