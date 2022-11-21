﻿create database QUANLYCUAHANG
USE QUANLYCUAHANG
GO
-- ChucVu
CREATE TABLE ChucVu(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL
)
GO
-- Luong
CREATE TABLE Luong(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
ThoiGianVao DATETIME DEFAULT NULL,
ThoiGianRa DATETIME DEFAULT NULL,
ThoiGianLam INT DEFAULT 0,
TongLuong DECIMAL Default 0,
)
GO
-- Kho
CREATE TABLE KhoHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
DiaChi NVARCHAR(50) DEFAULT NULL,
SoDienThoai NVARCHAR(50) DEFAULT NULL,
GhiChu NVARCHAR(50) DEFAULT NULL,
TrangThai INT DEFAULT 0
)
GO
-- Nhà Cung Cấp
CREATE TABLE NhaCungCap(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(50) DEFAULT NULL,
SoDienThoai VARCHAR(50) DEFAULT NULL,
FAX VARCHAR(50) DEFAULT NULL,
Email VARCHAR(50) DEFAULT NULL,
GhiChu NVARCHAR(50) DEFAULT NULL,
TrangThai INT DEFAULT 0
)
GO
-- PhieuNhap
CREATE TABLE PhieuNhap(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKho UNIQUEIDENTIFIER,
IdNCC UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL,
NgayNhap DATETIME DEFAULT NULL,
GhiChu NVARCHAR(50) DEFAULT NULL,
TrangThai INT DEFAULT 0
)
GO
-- CuaHang
CREATE TABLE CuaHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdChiTietSP UNIQUEIDENTIFIER,
IdKho UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
ThanhPho NVARCHAR(50) DEFAULT NULL,
QuocGia NVARCHAR(50) DEFAULT NULL,
GhiChu NVARCHAR(50) DEFAULT NULL,
TrangThai INT DEFAULT 1
)
GO
-- NhanVien
CREATE TABLE NhanVien(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdTK UNIQUEIDENTIFIER,
IdCV UNIQUEIDENTIFIER,
IdCH UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30) DEFAULT NULL,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
GioiTinh NVARCHAR(10) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL,
IdGuiBC UNIQUEIDENTIFIER,
TrangThai INT DEFAULT 0
)
GO
-- TaiKhoan
CREATE TABLE TaiKhoan(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma NVARCHAR(50) DEFAULT NULL,
Ten NVARCHAR(50) DEFAULT NULL,
Password NVARCHAR(50) DEFAULT NULL,
NgayTao DATE DEFAULT NULL,
VaiTro NVARCHAR(50)
)
GO
-- KhachHang
CREATE TABLE KhachHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdLoaiKH UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
ThanhPho NVARCHAR(50) DEFAULT NULL,
QuocGia NVARCHAR(50) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL
)
GO
--ThongKe
CREATE TABLE ThongKe(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdHoaDon UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
IdPhieuNhap UNIQUEIDENTIFIER,
SoLuongBan INT,
DoanhThu INT,
TongTien NVARCHAR(50),
TienKhachHang NVARCHAR(50),
TienThua NVARCHAR(50),
Ngay DATE DEFAULT NULL,
ThoiGian  DATETIME DEFAULT NULL
)
GO
-- LoaiKhachHang
CREATE TABLE LoaiKH(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
)
GO
--HoaDon
CREATE TABLE HoaDon(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH UNIQUEIDENTIFIER,
IdNV UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
NgayShip DATE DEFAULT NULL,
NgayNhan DATE DEFAULT NULL,
TinhTrang INT DEFAULT 0,
TenNguoiNhan NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
)
GO
--GioHang
CREATE TABLE GioHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH UNIQUEIDENTIFIER,
IdNV UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
TenNguoiNhan NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
TinhTrang INT DEFAULT 0
)
GO
-- SanPham
CREATE TABLE SanPham(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdLoaiSP UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- LoaiSanPham
CREATE TABLE LoaiSP(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- NSX
CREATE TABLE NSX(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- MauSac
CREATE TABLE MauSac(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- DongSP
CREATE TABLE DongSP(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- ChiTietSP
CREATE TABLE ChiTietSP(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdSP UNIQUEIDENTIFIER,
IdNsx UNIQUEIDENTIFIER,
IdMauSac UNIQUEIDENTIFIER,
IdDongSP UNIQUEIDENTIFIER,
NamBH INT DEFAULT NULL,
MoTa NVARCHAR(50) DEFAULT NULL,
SoLuongTon INT,
GiaNhap DECIMAL(20,0) DEFAULT 0,
GiaBan DECIMAL(20,0) DEFAULT 0,
)

GO
-- HoaDonChiTiet
CREATE TABLE HoaDonChiTiet(
IdHoaDon UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
SoLuong INT,
DonGia DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_HoaDonCT PRIMARY KEY (IdHoaDon,IdChiTietSP),
CONSTRAINT FK1_HoaDonChiTiet FOREIGN KEY(IdHoaDon) REFERENCES HoaDon(Id),
CONSTRAINT FK2_HoaDonChiTiet FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id),
)
GO
-- GioHangChiTiet
CREATE TABLE GioHangChiTiet(
IdGioHang UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
SoLuong INT,
DonGia DECIMAL(20,0) DEFAULT 0,
DonGiaKhiGiam DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_GioHangCT PRIMARY KEY (IdGioHang,IdChiTietSP),
CONSTRAINT FK1_GioHangChiTiet FOREIGN KEY(IdGioHang) REFERENCES GioHang(Id),
CONSTRAINT FK2_GioHangChiTiet FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id),
)
GO
--ChiTietLuong
CREATE TABLE ChiTietLuong(
IdCV UNIQUEIDENTIFIER,
IdLuong UNIQUEIDENTIFIER,
TongThoiGianLam DECIMAL DEFAULT 0,
ThuNhap DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_ChiTietLuong PRIMARY KEY (IdCV,IdLuong),
CONSTRAINT FK1_ChiTietLuong FOREIGN KEY(IdCV) REFERENCES ChucVu(Id),
CONSTRAINT FK2_ChiTietLuong FOREIGN KEY(IdLuong) REFERENCES Luong(Id),
)
GO
--TẠO QUAN HỆ GIỮA CÁC BẢNG
--NhanVien
ALTER TABLE NhanVien ADD FOREIGN KEY (IdCV) REFERENCES ChucVu(Id)
ALTER TABLE NhanVien ADD FOREIGN KEY (IdCH) REFERENCES CuaHang(Id)
ALTER TABLE NhanVien ADD FOREIGN KEY (IdGuiBC) REFERENCES NhanVien(Id)
ALTER TABLE NhanVien ADD FOREIGN KEY (IdTK) REFERENCES TaiKhoan(Id)
-- HoaDon
ALTER TABLE HoaDon ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(Id)
-- GioHang - KhachHang
ALTER TABLE GioHang ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(Id)
-- HoaDon
ALTER TABLE HoaDon ADD FOREIGN KEY (IdNV) REFERENCES NhanVien(Id)
-- ChiTietSP
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdSP) REFERENCES SanPham(Id)
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdNsx) REFERENCES Nsx(Id)
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdMauSac) REFERENCES MauSac(Id)
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdDongSP) REFERENCES DongSP(Id)
-- SanPham
ALTER TABLE SanPham ADD FOREIGN KEY(IdLoaiSP) REFERENCES LoaiSP(Id)
-- ThongKe
ALTER TABLE ThongKe ADD FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id)
ALTER TABLE ThongKe ADD FOREIGN KEY(IdHoaDon) REFERENCES HoaDon(Id)
-- KhachHang
ALTER TABLE KhachHang ADD FOREIGN KEY(IdLoaiKH) REFERENCES LoaiKH(Id)
-- CuaHang
ALTER TABLE CuaHang ADD FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id)
ALTER TABLE CuaHang ADD FOREIGN KEY(IdKho) REFERENCES KhoHang(Id)
-- PhieuNhap
ALTER TABLE PhieuNhap ADD FOREIGN KEY(IdNCC) REFERENCES NhaCungCap(Id)
ALTER TABLE PhieuNhap ADD FOREIGN KEY(IdKho) REFERENCES KhoHang(Id)
-- THÊM DỮ LIỆU CHO CÁC BẢNG 
----Chuc Vu
INSERT INTO [dbo].[ChucVu] ([Id],[Ma],[Ten])VALUES(NEWID(),'CV1',N'Nhân Viên')
INSERT INTO [dbo].[ChucVu] ([Id],[Ma],[Ten])VALUES(NEWID(),'CV2',N'Quản Lý')
--KhoHang
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH01',N'Hà Nội','012223344','Không',0)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH02',N'Kom Tom','018943343','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH03',N'Đắc Lắc','012223344','Không',0)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH04',N'Gia Lai','012223344','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH05',N'Hà Nội','012223344','Không',0)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH06',N'Hà Nội','012223344','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH07',N'Hải Dương','018943343','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH08',N'Hà Nội','012223344','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH09',N'Hà Nội','012223344','Không',1)
INSERT INTO [dbo].[KhoHang] ([Id],[Ma],[DiaChi],[SoDienThoai],[GhiChu],[TrangThai])VALUES(NewID(),'KH10',N'Hà Nội','012223344','Không',1)
--SanPham
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES(NewID(),null,'SP01',N'Bánh')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES(NewID(),null,'SP02',N'Xúc xich')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES(NewID(),null,'SP03',N'Nước')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES(NewID(),null,'SP04',N'Kem')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES(NewID(),null,'SP05',N'Kẹo')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES (NewID(),null,'SP06',N'Bánh chocobai')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES (NewID(),null,'SP07',N'Xúc xich VIệt Đức')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES (NewID(),null,'SP08',N'BIa 333')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES (NewID(),null,'SP09',N'Kem')
INSERT INTO [dbo].[SanPham]([Id],[IdLoaiSP],[Ma],[Ten]) VALUES (NewID(),null,'SP10',N'Kẹo')
select * from SanPham
--LoaiSP
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP01',N'Bánh Kẹo')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP02',N'Nước Ngọt')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP03',N'Đồ Ăn Vặt')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP04',N'Kem Tràng Tiền')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP05',N'Bánh C')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP06',N'Bánh Kẹo')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP07',N'Nước Ngọt')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP08',N'Đồ Ăn Vặt')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP09',N'Bia')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP10',N'Rượu')
INSERT INTO [dbo].[LoaiSP]([Id],[Ma],[Ten])VALUES(NewID(),'LSP11',N'Đồ Gia Dụng')
--DongSP
INSERT INTO [dbo].[DongSP]([Id],[Ma],[Ten])VALUES(NewID(),'DSP1',N'a')
INSERT INTO [dbo].[DongSP]([Id],[Ma],[Ten])VALUES(NewID(),'DSP2',N'b')
INSERT INTO [dbo].[DongSP]([Id],[Ma],[Ten])VALUES(NewID(),'DSP3',N'c')
INSERT INTO [dbo].[DongSP]([Id],[Ma],[Ten])VALUES(NewID(),'DSP4',N'd')
INSERT INTO [dbo].[DongSP]([Id],[Ma],[Ten])VALUES(NewID(),'DSP5',N'e')
--NSX
INSERT INTO [dbo].[NSX]([Id],[Ma],[Ten])VALUES(NewID(),'NSX1',N'a')
INSERT INTO [dbo].[NSX]([Id],[Ma],[Ten])VALUES(NewID(),'NSX2',N'b')
INSERT INTO [dbo].[NSX]([Id],[Ma],[Ten])VALUES(NewID(),'NSX3',N'c')
INSERT INTO [dbo].[NSX]([Id],[Ma],[Ten])VALUES(NewID(),'NSX4',N'd')
INSERT INTO [dbo].[NSX]([Id],[Ma],[Ten])VALUES(NewID(),'NSX5',N'e')
--MauSac
INSERT INTO [dbo].[MauSac]([Id],[Ma],[Ten])VALUES(NewID(),'MS1',N'xanh')
INSERT INTO [dbo].[MauSac]([Id],[Ma],[Ten])VALUES(NewID(),'MS2',N'đỏ')
INSERT INTO [dbo].[MauSac]([Id],[Ma],[Ten])VALUES(NewID(),'MS3',N'tím')
INSERT INTO [dbo].[MauSac]([Id],[Ma],[Ten])VALUES(NewID(),'MS4',N'vàng')
INSERT INTO [dbo].[MauSac]([Id],[Ma],[Ten])VALUES(NewID(),'MS5',N'hồng')
--TaiKhoan
INSERT INTO TaiKhoan VALUES (NEWID(),'TK01','luongpvph27222', '12345', '2022-10-20', 'NHANVIEN')
INSERT INTO TaiKhoan VALUES (NEWID(),'TK02','tiepnmph25816', '12345', '2022-11-21', 'QUANTRIVIEN')
INSERT INTO TaiKhoan VALUES (NEWID(), 'TK03','hungltph21667', '12345', '2021-12-20', 'NHANVIEN')
INSERT INTO TaiKhoan VALUES (NEWID(), 'TK04','thanhnvph25817', '12345', '2021-10-11', 'NHANVIEN')
INSERT INTO TaiKhoan VALUES (NEWID(),'TK05','hieuttph25785','12345', '2021-01-28', 'QUANTRIVIEN')
INSERT INTO TaiKhoan VALUES (NEWID(), 'TK06','haiptph25840','12345', '2022-11-21', 'NHANVIEN')

-- NhaCungCap
INSERT INTO [dbo].[NhaCungCap]([Id],[Ma],[Ten],[DiaChi],[SoDienThoai],[FAX],[Email],[GhiChu],[TrangThai])VALUES(NewID(),'NCC1','a',N'Hà Nội',08378744673,N'FAX-233', 'a@gmail.com',NULL,0)
INSERT INTO [dbo].[NhaCungCap]([Id],[Ma],[Ten],[DiaChi],[SoDienThoai],[FAX],[Email],[GhiChu],[TrangThai])VALUES(NewID(),'NCC2','b',N'Thái Bình',08378744673,N'FAX-233', 'b@gmail.com',NULL,0)
INSERT INTO [dbo].[NhaCungCap]([Id],[Ma],[Ten],[DiaChi],[SoDienThoai],[FAX],[Email],[GhiChu],[TrangThai])VALUES(NewID(),'NCC3','c',N'Thanh Hóa',08378744673,N'FAX-233', 'c@gmail.com',NULL,0)
INSERT INTO [dbo].[NhaCungCap]([Id],[Ma],[Ten],[DiaChi],[SoDienThoai],[FAX],[Email],[GhiChu],[TrangThai])VALUES(NewID(),'NCC4','d',N'Bình Định',08378744673,N'FAX-233', 'd@gmail.com',NULL,0)
INSERT INTO [dbo].[NhaCungCap]([Id],[Ma],[Ten],[DiaChi],[SoDienThoai],[FAX],[Email],[GhiChu],[TrangThai])VALUES(NewID(),'NCC5','e',N'Thái Nguyên',08378744673,N'FAX-233', 'e@gmail.com',NULL,0)

--PhieuNhap
INSERT INTO [dbo].[PhieuNhap]([Id],[IdKho],[IdNCC],[Ma],[Ten],[NgayNhap],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'PN1', N'Phiếu nhập kho theo thông tư 107','2022-01-01',NULL,0)
INSERT INTO [dbo].[PhieuNhap]([Id],[IdKho],[IdNCC],[Ma],[Ten],[NgayNhap],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'PN2', N'Phiếu nhập kho theo thông tư 111','2022-01-05',NULL,0)
INSERT INTO [dbo].[PhieuNhap]([Id],[IdKho],[IdNCC],[Ma],[Ten],[NgayNhap],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'PN3', N'Phiếu nhập kho theo thông tư 100','2022-01-15',NULL,0)
INSERT INTO [dbo].[PhieuNhap]([Id],[IdKho],[IdNCC],[Ma],[Ten],[NgayNhap],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'PN4', N'Phiếu nhập kho theo thông tư 108','2022-01-20',NULL,0)
INSERT INTO [dbo].[PhieuNhap]([Id],[IdKho],[IdNCC],[Ma],[Ten],[NgayNhap],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'PN5', N'Phiếu nhập kho theo thông tư 116','2022-01-25',NULL,0)


--CuaHang
INSERT INTO [dbo].[CuaHang]([Id],[IdChiTietSP],[IdKho],[Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'CH1', N'Cửa hàng Cơ Sở 1',N'Nguyên Xá 1',N'Hà Nội ',N'Việt Nam',NULL,0)
INSERT INTO [dbo].[CuaHang]([Id],[IdChiTietSP],[IdKho],[Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'CH2', N'Cửa hàng Cơ Sở 2',N'Nguyên Xá 2',N'Kom Tom',N'Việt Nam',NULL,0)
INSERT INTO [dbo].[CuaHang]([Id],[IdChiTietSP],[IdKho],[Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'CH3', N'Cửa hàng  Cơ Sở 3',N'Nguyên Xá 3',N'Tây Nguyên',N'Việt Nam',NULL,0)
INSERT INTO [dbo].[CuaHang]([Id],[IdChiTietSP],[IdKho],[Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'CH4', N'Cửa hàng  Cơ Sở 4',N'Nguyên Xá 4',N'Tuyên Quang',N'Việt Nam',NULL,0)
INSERT INTO [dbo].[CuaHang]([Id],[IdChiTietSP],[IdKho],[Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia],[GhiChu],[TrangThai])VALUES(NewID(),NULL,NULL,'CH5', N'Cửa hàng  Cơ Sở 5',N'Nguyên Xá 5',N'Hà Nội',N'Việt Nam',NULL,0)


--KhachHang
INSERT INTO KhachHang VALUES(NewID(),null,'KH1','a',N'Văn',N'Nguyễn','1991-01-01',093738737,N'Cao Mỗ 1',N'Hà Nội',N'Việt Nam','12345')
INSERT INTO KhachHang VALUES(NewID(),null,'KH2','b',N'Văn',N'Nguyễn','1992-02-15',093738737,N'Cao Mỗ 2',N'Hà Nội',N'Việt Nam','12345')
INSERT INTO KhachHang VALUES(NewID(),null,'KH3','x',N'Văn',N'Nguyễn','1999-01-21',093738737,N'Cao Mỗ 3',N'Hà Nội',N'Việt Nam','12345')
INSERT INTO KhachHang VALUES(NewID(),null,'KH4','c',N'Văn',N'Nguyễn','1990-11-01',093738737,N'Cao Mỗ 4',N'Hà Nội',N'Việt Nam','12345')
INSERT INTO KhachHang VALUES(NewID(),null,'KH5','r',N'Văn',N'Nguyễn','2000-01-03',093738737,N'Cao Mỗ 5',N'Hà Nội',N'Việt Nam','12345')
INSERT INTO KhachHang VALUES(NewID(),null,'KH6','g',N'Văn',N'Nguyễn','1995-12-01',093738737,N'Cao Mỗ 6',N'Hà Nội',N'Việt Nam','12345')

--HoaDon
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD01','2022-01-01','2022-01-03','2022-01-05','2022-01-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD02','2022-02-01','2022-02-03','2022-02-05','2022-02-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD04','2022-03-01','2022-03-03','2022-03-05','2022-03-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD05','2022-04-01','2022-04-03','2022-04-05','2022-04-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD03','2022-05-01','2022-05-03','2022-05-05','2022-05-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD08','2022-06-01','2022-06-03','2022-06-05','2022-06-07',0,'a',N'Hà Nội',0437836467)
INSERT INTO HoaDon VALUES(NewID(),null,null,'HD09','2022-07-01','2022-07-03','2022-07-05','2022-07-07',0,'a',N'Hà Nội',0437836467)

--NhanVien
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV01',N'Hiếu',N'Trung',N'Trần','Nam','2003-02-10','Hoai Duc','0918312409','abc',null,1)
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV02',N'Tiệp',N'Mạnh',N'Nguyễn','Nam','2003-10-20','Ha Noi','0918312409','abc',null,1)
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV03',N'Thành',N'Viết',N'Ninh','Nam','2003-11-01','Thanh Hoa','0918312409','abc',null,1)
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV04',N'Lương',N'Văn',N'Phạm','Nam','2003-12-15','Thái Bình','0918312409','abc',null,1)
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV05',N'Hưng',N'Tiến',N'Nguyễn','Nam','2003-06-6','Ninh Bình','0918312409','abc',null,1)
INSERT INTO NhanVien VALUES (NEWID(),NULL,NULL,NULL,'NV06',N'Hải',N'Thanh',N'Phạm','Nam','2003-06-25','Thái Bình','0918312409','abc',null,1)

-- Giỏ Hàng
INSERT INTO GioHang VALUES(NewID(),null,null,'GH1','2022-01-01','2022-01-03','a',N'Hà Nội',0437836467,0)
INSERT INTO GioHang VALUES(NewID(),null,null,'GH2','2022-02-02','2022-01-10','b',N'Hà Nội',0437836467,0)
INSERT INTO GioHang VALUES(NewID(),null,null,'GH3','2022-03-03','2022-01-05','x',N'Hà Nội',0437836467,0)
INSERT INTO GioHang VALUES(NewID(),null,null,'GH4','2022-04-01','2022-01-04','d',N'Hà Nội',0437836467,0)
INSERT INTO GioHang VALUES(NewID(),null,null,'GH5','2022-05-11','2022-01-15','b',N'Hà Nội',0437836467,0)
INSERT INTO GioHang VALUES(NewID(),null,null,'GH6','2022-06-10','2022-01-20','h',N'Hà Nội',0437836467,0)


--Luong 
INSERT INTO Luong VALUES (NEWID(),'L1',6,18,12,NULL)
INSERT INTO Luong VALUES (NEWID(),'L3',12,18,6,NULL)
INSERT INTO Luong VALUES (NEWID(),'L2',18,23,5,NULL)
INSERT INTO Luong VALUES (NEWID(),'L5',6,18,12,NULL)
INSERT INTO Luong VALUES (NEWID(),'L7',10,18,8,NULL)


--ChiTietSP
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,10,N'Sản Phẩm Tốt',10,10000,15000)
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,7,N'Sản Phẩm Tốt',30,12000,15000)
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,5,N'Sản Phẩm Tốt',10,10000,15000)
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,3,N'Sản Phẩm Tốt',5,15000,20000)
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,5,N'Sản Phẩm Tốt',20,10000,15000)
INSERT INTO ChiTietSP VALUES(NewID(),NULL,NULL,NULL,NULL,2,N'Sản Phẩm Tốt',10,10000,15000)

--ThongKe
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 15, '10000000', '200000000',NULL,NULL,'2022-01-01','2022-01-02 18:01:04')
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 10, '10000000', '200000000',NULL,NULL,'2022-01-01','2022-01-02 18:01:04')
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 6, '10000000', '200000000',NULL,NULL,'2022-01-01','2022-01-02 18:01:04')
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 15, '10000000', '200000000',NULL,NULL,'2022-01-01','2022-01-02 18:01:04')
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 9, '10000000', '200000000',NULL,NULL,'2022-01-01','2022-01-02 18:01:04')
INSERT INTO ThongKe VALUES(NewID(), NULL, NULL, NULL, 20, '10000000', '200000000','10','10','2022-01-01','2022-01-02 18:01:04')

--LuongChiTiet
-- Mọi Người Thêm IDCV, IDLuong rồi hãng chạy insert nhé
INSERT INTO ChiTietLuong VALUES (NULL,NULL,9,25);
INSERT INTO ChiTietLuong VALUES (NULL,NULL,5,25);
INSERT INTO ChiTietLuong VALUES (NULL,NULL,4,25);
INSERT INTO ChiTietLuong VALUES (NULL,NULL,10,25);
INSERT INTO ChiTietLuong VALUES (NULL,NULL,12,25);
INSERT INTO ChiTietLuong VALUES (NULL,NULL,6,25);


--HOaDonChiTiet
-- Moi Người Thêm IDHoaDon, IDChiTietSP rồi hãng chạy insert nhé

INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,2,1000);
INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,22,1000);
INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,5,1000);
INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,9,1000);
INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,4,1000);
INSERT INTO HoaDonChiTiet VALUES (NULL,NULL,10,1000);

--GioHangChiTiet
-- Moi Người Thêm IDGioHang, IDChiTietSP rồi hãng chạy insert nhé

INSERT INTO GioHangChiTiet VALUES (NULL,NULL,2,10000,5000);
INSERT INTO GioHangChiTiet VALUES (NULL,NULL,22,20000,1000);
INSERT INTO GioHangChiTiet VALUES (NULL,NULL,4,10000,NULL);
INSERT INTO GioHangChiTiet VALUES (NULL,NULL,10,9000,2000);
INSERT INTO GioHangChiTiet VALUES (NULL,NULL,3,2000,NULL);













