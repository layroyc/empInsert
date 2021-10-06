package com.xiexin.service;

import com.xiexin.bean.Dept;
import com.xiexin.bean.DeptExample;
import com.xiexin.dao.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService{
	@Autowired(required = false)
	private DeptDAO deptDAO;
	public long countByExample(DeptExample example){
    	return deptDAO.countByExample(example);
    }

	public int deleteByExample(DeptExample example){
    	return deptDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return deptDAO.deleteByPrimaryKey(id);
    }

	public int insert(Dept record){
    	return deptDAO.insert(record);
    }

	public int insertSelective(Dept record){
    	return deptDAO.insertSelective(record);
    }

	public List<Dept> selectByExample(DeptExample example){
    	return deptDAO.selectByExample(example);
    }

	public Dept selectByPrimaryKey(Integer id){
    	return deptDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Dept record, DeptExample example){
    	return deptDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Dept record, DeptExample example){
    	return deptDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Dept record){
    	return deptDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Dept record){
    	return deptDAO.updateByPrimaryKey(record);
    }


}
