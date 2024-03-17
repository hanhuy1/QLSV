package QLSV;

import java.util.Scanner;

public class NhanVien {
		private String MaNV;
		private String HoTen;
		private double luong;
		
		public NhanVien() {
		}
		
		public NhanVien(String MaNV, String HoTen, double luong) {
			this.MaNV = MaNV;
			this.HoTen = HoTen;
			this.luong= luong;
			
		}
		
		public String getMaNv() {
			return MaNV;
		}
			
		
		public void setMaNV ( String MaNV) {
			this.MaNV = MaNV;
		}
		
		public String getHoten() {
			return HoTen;
		}
		
		public void setHoten(String HoTen) {
			this.HoTen = HoTen;
		}
		
		public double getluong() {
			return luong;
		}
		
		public void setluong(double luong) {
			this.luong = luong;
		}
		
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("MaNV: ");
			setMaNV(sc.next());
			System.out.println("Ho Ten: ");
			sc = new Scanner(System.in);
			setHoten(sc.nextLine());
			System.out.println("Luong: ");
			sc = new Scanner(System.in);
			setluong(sc.nextDouble());
			
		}
		
		 public void output() {
			 System.out.println("=>"+getMaNv()+"-"+getHoten()
			 +"-"+getluong()+"-"+getThuNhap(getluong()) );
			 
		 }
		 
		 public double  getThuNhap(double salary) {
			return salary;
		}
		 
		public static void main(String[] agrs) {
			NhanVien nv=new NhanVien();
			nv.input();
			nv.output();
		}
		
}
