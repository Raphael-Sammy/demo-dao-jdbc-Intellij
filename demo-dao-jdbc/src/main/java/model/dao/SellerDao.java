package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Seller id);
    List<Seller> findAll();
}
