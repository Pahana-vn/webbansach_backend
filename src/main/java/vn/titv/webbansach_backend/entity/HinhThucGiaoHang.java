package vn.titv.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "hinh_thuc_giao_hang")
public class HinhThucGiaoHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_giao_hang")
    private int maHinhThucGiaoToan;

    @Column(name = "te_hinh_thuc_giao_hang")
    private String tenHinhThucGiaoToan;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoToan;

    @OneToMany(mappedBy = "hinhThucGiaoHang",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH
    })
    private List<DonHang> danhSachDonHang;
}
