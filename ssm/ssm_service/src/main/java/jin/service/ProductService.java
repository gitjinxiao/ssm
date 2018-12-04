package jin.service;

import jin.domain.Product;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有
     */
    public List<Product> findAll(int page,int size) throws Exception;


    void save(Product product);
}
