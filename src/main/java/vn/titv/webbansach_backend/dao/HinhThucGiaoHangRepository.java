package vn.titv.webbansach_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_backend.entity.HinhThucGiaoHang;

@Repository
public interface HinhThucGiaoHangRepository extends JpaRepository<HinhThucGiaoHang, Integer> {
}
