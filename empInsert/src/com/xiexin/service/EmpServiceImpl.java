package com.xiexin.service;

import com.xiexin.bean.Emp;
import com.xiexin.bean.EmpExample;
import com.xiexin.dao.EmpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired(required = false)
	private EmpDAO empDAO;
	public long countByExample(EmpExample example){
    	return empDAO.countByExample(example);
    }

	public int deleteByExample(EmpExample example){
    	return empDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return empDAO.deleteByPrimaryKey(id);
    }

	public int insert(Emp record){
    	return empDAO.insert(record);
    }

	public int insertSelective(Emp record){
    	return empDAO.insertSelective(record);
    }

	public List<Emp> selectByExample(EmpExample example){
    	return empDAO.selectByExample(example);
    }

	public Emp selectByPrimaryKey(Integer id){
    	return empDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Emp record, EmpExample example){
    	return empDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Emp record, EmpExample example){
    	return empDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Emp record){
    	return empDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Emp record){
    	return empDAO.updateByPrimaryKey(record);
    }


}
