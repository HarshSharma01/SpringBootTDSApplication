/**Service Layer Implementation*/

package com.cg.tds.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.tds.dao.TDSDao;
import com.cg.tds.model.TDSMaster;

@Component("tdsService")
@Service //To let Spring know that this is the Service Layer
@Transactional
public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao tdsDao;
	
	@Override
	public TDSMaster getById(int id) {
		return tdsDao.getById(id);
	}
}
