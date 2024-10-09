package vn.titv.webbansach_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDanhGia extends JpaRepository<SuDanhGia, Long> {
}
