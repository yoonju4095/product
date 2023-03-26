package com.kh.product.dao;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
  // 등록
  Long save(Product product);
  // 조회
  Optional<Product> findById(Long pid);
  // 수정
  int update(Long pid, Product product);
  // 삭제
  int delete(Long pid);

  //목록
  List<Product> findAll();

}
