package jin.service;


import jin.domain.Orders;
import jin.domain.Product;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(int page,int size);

    Orders findById(String ordersId);
}
