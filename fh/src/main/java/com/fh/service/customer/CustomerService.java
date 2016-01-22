package com.fh.service.customer;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.entity.customer.Customer;
import com.fh.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by M on 2016/1/13.
 */
@Service("customerService")
public class CustomerService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    public List<PageData> customerlistPage(Page page)throws Exception{
        return (List<PageData>)dao.findForList("CustomerMapper.customerlistPage",page);
    }
}
