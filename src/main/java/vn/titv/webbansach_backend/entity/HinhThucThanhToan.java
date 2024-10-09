package vn.titv.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "Hinh_thuc_thanh_toan")
public class HinhThucThanhToan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_thanh_toan")
    private int maHinhThucThanhToan;

    @Column(name = "ten_hinh_thuc_thanh_toan")
    private String tenHinhThucThanhToan;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "chi_phi_thanh_toan")
    private double chiPhiThanhToan;

    @OneToMany(mappedBy = "hinhThucThanhToan",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH
    })
    private List<DonHang> danhSachDonHang;
}