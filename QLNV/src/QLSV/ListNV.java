package QLSV;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ListNV {
	static ArrayList<NhanVien> listNV=new ArrayList<>();
	public void inputs () {
		Scanner sc = new Scanner(System.in);
		String choice="yes";
		do {
			NhanVien nv = new NhanVien();
			nv.input();
			listNV.add(nv);
			System.out.println("Bạn muốn tiếp tục? (yes/no)");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
	}
	public void  outputs (){
		for(NhanVien nhanVien: listNV) {
			nhanVien.output();
		}
		
	}
		
	public int FindbyID(String MaNV) {
		for (int i = 0; i < listNV.size(); i++) {
			NhanVien nv=listNV.get(i);
			if (nv.getMaNv().equalsIgnoreCase(MaNV)) {
				System.out.println("Đã tìm thấy tại vị trí: "+i);
				nv.output();
				return i;
			}
			
		}
		return -1;
	}
	
	public void delById(String MaNV) {
		int position = FindbyID(MaNV);
		if(position < 0) {
			System.out.println("Không tìm thấy nhân viên để xoá");
		}else {
			listNV.remove(position);
			System.out.print("Đã xoá nhân viên tại vị trí: "+position);
		}
		
	}
	public void Data() {
		listNV.add(new NhanVien("01", "Nguyễn Văn Nam", 1000));
		listNV.add(new NhanVien("02", "v2", 11000));
		listNV.add(new NhanVien("03", "c3", 12000));
		listNV.add(new NhanVien("04", "s4", 10300));
		listNV.add(new NhanVien("05", "f5", 10040));
		listNV.add(new NhanVien("06", "g6", 10005));
		listNV.add(new NhanVien("07", "h7", 100056));
		listNV.add(new NhanVien("08", "r8", 100066));
		listNV.add(new NhanVien("09", "t9", 100077));
		listNV.add(new NhanVien("10", "y10", 1007770));
		listNV.add(new NhanVien("11", "p11", 100077));
		
	}
	
	public void update(String MaNV) {
		int pos = FindbyID(MaNV);
		if (pos < 0) {
			System.out.println("Không tìm thấy nhân viên: "+MaNV);
			
		}else {
			NhanVien nvNew=new NhanVien();
			nvNew.input();
			listNV.set(pos, nvNew);
			System.out.println("Cập nhật thành công!");
		}
	}
	
	public void getLuong(double min, double max) {
		for (NhanVien nv : listNV) {
			if (nv.getluong() >= min && nv.getluong() <= max) {
				nv.output();
			}
		}
	}
	
	public void getName() {
		for (int i = 0; i < listNV.size() -1; i++) {
			for (int j = i+1; j < listNV.size(); j++) {
				if (ListName(listNV.get(i).getHoten())
						.compareTo(ListName(listNV.get(j).getHoten()))>0){
					Collections.swap(listNV,i,j);
				}
			}
		}
	}
	
	public  String ListName (String FullName) {
		String name=FullName.substring(FullName.lastIndexOf(" ")+1);
		return name;
	}
	
	
	
	public void getThuNhap() {
		for (int i = 0; i < listNV.size()-1; i++) {
			for (int j = i+1; j < listNV.size(); j++) {
				NhanVien NVi= listNV.get(i);
				NhanVien NVj= listNV.get(j);
				if (NVi.getThuNhap(NVi.getluong()) < 
						NVj.getThuNhap(NVj.getluong())) {
					Collections.swap(listNV, i, j);
				}
			}
		}
	}
	
	
	public void getTop5TN() {
		getThuNhap();
		int top = 5;
		if(listNV.size() < 5) {
			top = listNV.size();
		}
		for (int i = 0; i < top; i++) {
			NhanVien nv = listNV.get(i);
			nv.output();
		}
	}
	
	

	public static void name (String[] agrs) {
//		System.out.println("=>"+ ListName("Nguyễn Văn Nam"));
	}
	
	
	
}








