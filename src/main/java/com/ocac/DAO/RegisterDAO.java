package com.ocac.DAO;

import java.util.List;

import com.ocac.model.Register;


public interface RegisterDAO {

	List<Register> getAll();
	
   public void insert(Register r);
	public void update(Register r);
    public	void delete(int id);
	
   public Register getId(int id);
	
	
}
