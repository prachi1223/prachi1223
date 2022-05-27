package flifkartrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flifkartbean .Product;

@Repository
public interface MyLocalRepository extends JpaRepository<Product, Long> {

}
