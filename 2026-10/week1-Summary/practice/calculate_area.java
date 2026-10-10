import java.util.Scanner;

public class calculate_area {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double area=0.0;
        System.out.println("---------计算图形面积----------");
        System.out.print("1.矩形"+" ");
        System.out.print("2.正方形"+" ");
        System.out.print("3.圆形"+" ");
        System.out.println("4.三角形"+" ");
        System.out.print("请输入需要计算面积的图形：");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("请输入矩形的长：");
                double length=scanner.nextDouble();
                System.out.print("请输入矩形的宽：");
                double width=scanner.nextDouble();
                area=width*length;break;
            case 2:
                System.out.print("请输入正方形的边长：");
                double lenth1=scanner.nextDouble();
                area=lenth1*lenth1;break;
            case 3:
                System.out.print("请输入圆的直径：");
                double d=scanner.nextDouble();
                double r=d/2.0;
                area=Math.PI*r*r;break;
            case 4:
                System.out.print("请输入三角形的底：");
                double di=scanner.nextDouble();
                System.out.print("请输入三角形的高:");
                double gao=scanner.nextDouble();
                area=(di*gao)/2;break;
            default:
                System.out.println("输入无效，请输入1～4之间的数字！");return;
        }
        System.out.println("该图形的面积为："+area);
        scanner.close();
    }
}