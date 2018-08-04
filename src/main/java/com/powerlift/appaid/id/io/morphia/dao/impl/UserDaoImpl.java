package com.powerlift.appaid.id.io.morphia.dao.impl;

import com.powerlift.appaid.id.io.morphia.dao.UserDao;
import com.powerlift.appaid.id.io.morphia.entity.UserEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BasicDAO<UserEntity, ObjectId> implements UserDao {

    @Autowired
    public UserDaoImpl(Datastore datastore){
        super(UserEntity.class, datastore);
    }
}
