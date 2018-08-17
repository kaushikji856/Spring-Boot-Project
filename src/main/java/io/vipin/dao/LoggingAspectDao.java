/**
 * 
 */
package io.vipin.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.model.LoginInfo;

/**
 * @author VI852115
 *
 */
//@Aspect
@Repository("loggingAspectDao")
@Transactional
public class LoggingAspectDao extends AbstractDao{
	
	//@Before("execution(* io.vipin.service*.*(..))")
	public  void logBefore(String userName, Long userId){
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setUserName(userName);
		loginInfo.setUserId(userId);
		loginInfo.setLoginTime(new Date());
		getSession().save(loginInfo);
	}
	
	//@Before("execution(* io.vipin.service*.*(..))")
		public  void logoutUser(String userName){
			LoginInfo loginInfo = getLoginInfoByUserName(userName);
			loginInfo.setLogoutTime(new Date());
			getSession().update(loginInfo);
		}
		
		private LoginInfo getLoginInfoByUserName(String userName) {
			Criteria criteria = getSession().createCriteria(LoginInfo.class)
					.add(Restrictions.eq("userName", userName))
					.addOrder(Order.desc("loginTime"))
					.setMaxResults(1);
					
			return (LoginInfo) criteria.uniqueResult();
			
		}
		
		@SuppressWarnings("unchecked")
		public List<LoginInfo> getOnlineFriends(Long userId) {
			Criteria criteria = getSession().createCriteria(LoginInfo.class)
					 .add(Restrictions.ne("userId", userId))
					 .setProjection(Projections.distinct(Projections.projectionList()
							    .add(Projections.property("userName"))))
					.add(Restrictions.isNull("logoutTime"));
			return criteria.list();
			
		}

}
