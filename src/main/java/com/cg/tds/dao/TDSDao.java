/**DAO Layer Interface*/

package com.cg.tds.dao;

import com.cg.tds.model.TDSMaster;

public interface TDSDao {
	
	TDSMaster getById(int pId);
}
