package com.powerlift.appaid.id.io.morphia.dao;

import com.powerlift.appaid.id.io.morphia.entity.UserEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

public interface UserDao extends DAO<UserEntity, ObjectId> {


}
