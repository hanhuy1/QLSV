package QLSV;

import java.util.Scanner;

public class Main {
		public static void main (String[] agrs) {
//			ListNV ls= new ListNV();
//			ls.inputs();
//			ls.outputs();
			menu();
		}
		
		public static void menu() {
			
			Scanner sc = new Scanner(System.in);
			ListNV ls= new ListNV();
			int choice= 0 ;
			
			
			while (true) {
				System.out.println("-------------menu-------------");
				System.out.println("0. Data");
				System.out.println("1. Nhập danh sách nhân viên.(Lưu vào và đọc file)");
				System.out.println("2. Xuất danh sách nhân viên.");
				System.out.println("3. Tìm và hiển thị nhân viên theo mã.");
				System.out.println("4. Xóa nhân viên theo mã.");
				System.out.println("5. Cập nhật thông tin nhân viên theo mã.");
				System.out.println("6. Tìm các nhân viên theo khoảng lương.");
				System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
				System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
				System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
				System.out.println("---------------------------");
				System.out.print("Bạn chọn:");
				choice=sc.nextInt();
			switch (choice){
					
					case 0:
						ls.Data();
						break;
					
					case 1: 
						ls.inputs();
						break;
					
					case 2: 
						ls.outputs();
						break;
						
					case 3: 
						System.out.print("Nhập mã nhân viên cần tìm: ");
						String FindMaNV = sc.next();
						int pos = ls.FindbyID(FindMaNV);
						if(pos < 0 ) {
							System.out.println("Không tìm thấy nhân viên");
						}
						break;
						
					case 4:
						System.out.print("Nhập mã nhân viên cần xoá: ");
						String delMaNV = sc.next();
						ls.delById(delMaNV);
						break;
						
					case 5:
						System.out.println("Nhập mã nhân viên cần update: ");
						String upMaNV = sc.next();
						ls.update(upMaNV);
						break;
						
					case 6:
						System.out.print("Nhập khoảng lương từ: ");
						Double minSalary = sc.nextDouble();
						System.out.print("Nhập khoảng lương đến: ");
						Double maxSalary = sc.nextDouble();
						ls.getLuong(minSalary, maxSalary);
						break;
						
					case 7:
						ls.getName();
						ls.outputs();
						break;
						
					case 8:
						ls.getThuNhap();
						ls.outputs();
						break;
						
					case 9:
						ls.getTop5TN();
						
						break;
						
						
				}
				
			}
		}
}
