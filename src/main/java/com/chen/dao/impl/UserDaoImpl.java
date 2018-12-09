package com.chen.dao.impl;

        import com.chen.dao.UserDao;
        import com.chen.model.User;
        import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
        import org.springframework.stereotype.Component;
        import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    //保存用户
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
