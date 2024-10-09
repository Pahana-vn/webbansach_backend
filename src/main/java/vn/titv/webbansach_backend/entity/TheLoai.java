package vn.titv.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "the_loai")
public class TheLoai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTheLoai;

    @Column(name = "ten_the_loai")
    private String tenTheLoai;


    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH
    })
    @JoinTable(name = "sach_theloai",
            joinColumns = @JoinColumn(name = "ma_the_loai"),
            inverseJoinColumns = @JoinColumn(name = "ma_sach"))
    private List<Sach> danhSachQuyenSach;
}
