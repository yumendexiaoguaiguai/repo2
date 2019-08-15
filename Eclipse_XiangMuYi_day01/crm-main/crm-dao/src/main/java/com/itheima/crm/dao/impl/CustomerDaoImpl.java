package com.itheima.crm.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.itheima.crm.dao.CustomerDao;
import com.itheima.crm.domain.Customer;

@Repository
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	/**
	 * @Autowired的用法 1）用在私有成员。在Spring容器中查找SessionFactory类对象，然后给sessionFactory直接赋值
	 * @Autowired private SessionFactory sessionFactory;
	 *            2)用在setter方法上面。在Spring容器查找参数（SessionFactory）类型的对象，找到后然后执行setter方法。
	 * @Autowired public void setMySessionFactory(SessionFactory sessionFactory){
	 * 
	 *            }
	 * @param sessionFactory
	 */
	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void save(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

}
