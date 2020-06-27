package main.com.ssh.shop.dao;

import main.com.ssh.shop.entity.Provider;

import java.util.List;

public interface ProviderDao extends BaseDao<Provider> {

    //查询供应商名称
    public List<Provider> queryToProvider(String name, int page, int size);//实现分页

    //根据关键字查询总记录数
    public Long getCount(String pname);

    //删除供应商信息
    public void deleteProvider(int pno);

}
