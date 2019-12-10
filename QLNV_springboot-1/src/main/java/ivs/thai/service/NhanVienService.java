package ivs.thai.service;

import java.util.Set;

import ivs.thai.model.Nhanvien;
import ivs.thai.model.ThanhtichKiluat;
import ivs.thai.model.User;

public interface NhanVienService {
	//Lay thanh tich cua 1 nhan vien
	ThanhtichKiluat getThanhTich(Nhanvien nv);
	Nhanvien getNhanVienByUser(User user);
	Nhanvien getNhanVienByMaNV(String manv);
	Set<Nhanvien> topTenNV();
}
