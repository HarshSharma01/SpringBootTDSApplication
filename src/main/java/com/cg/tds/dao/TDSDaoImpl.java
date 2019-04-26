/**DAO Layer Implementation*/
package com.cg.tds.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.tds.model.TDSMaster;

//Component
@Component("tdsDao")
@Repository
@ComponentScan("com.cg")
public class TDSDaoImpl implements TDSDao {

	//Entity Manager acts as a transaction and session manager thereby reducing creation
	//manual session creation.
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public TDSMaster getById(int id) {
		TDSMaster master = entityManager.find(TDSMaster.class, id);
		return master;
	}
}
