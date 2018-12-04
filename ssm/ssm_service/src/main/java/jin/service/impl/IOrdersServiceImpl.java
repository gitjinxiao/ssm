package jin.service.impl;

import com.github.pagehelper.PageHelper;
import jin.dao.IOrdersDao;
import jin.domain.Orders;
import jin.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;


    @Override
    public List<Orders> findAll(int page, int size) {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) {

        return ordersDao.findById(ordersId);
    }
}
