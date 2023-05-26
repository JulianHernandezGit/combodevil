package com.combodevil.app.data

import androidx.lifecycle.LiveData
import com.combodevil.app.data.model.User

class UserRepository(private val userDao: UserDao) {

	val allUsers: LiveData<List<User>> = userDao.getAllUsers()

	suspend fun insert(user: User) {
		userDao.insert(user)
	}

	suspend fun update(user: User) {
		userDao.update(user)
	}

	suspend fun delete(user: User) {
		userDao.delete(user)
	}

	fun getUserById(id: Int): LiveData<User> {
		return userDao.getUserById(id)
	}

	fun getUserByEmail(email: String): LiveData<User> {
		return userDao.getUserByEmail(email)
	}
}
