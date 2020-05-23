import java.util.Scanner;

public class Diem {
private int x;
private int y;
public Diem() {
	x=0; this.x=0;
	y=0; this.y=0;
}
public Diem(int x, int y) {
	this.x=x;
	this.y=y;
}
public void nhapDiem() {
	Scanner nhap = new Scanner(System.in);
	System.out.println("Nhap x");
	x = nhap.nextInt();
	System.out.println("Nhap y");
	y = nhap.nextInt();
}
public void hienThi() {
	System.out.print("("+x+","+y+")");	
}
public void doiDiem(int dx, int dy) {
	x = x + dx;
	y = y + dy;
}
	public float tinhKhoangCach() {
		return x;
	}
}
