package com.combodevil.app.data.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update

@Entity(tableName = "users")
data class User(
	@PrimaryKey(autoGenerate = true) val id: Int,
	val name: String,
	val email: String,
	val password: String
)

@Dao
interface UserDao {
	@Insert
	fun insert(user: User)

	@Update
	fun update(user: User)

	@Delete
	fun delete(user: User)

	@Query("SELECT * FROM users")
	fun getAllUsers(): List<User>

	@Query("SELECT * FROM users WHERE id = :id")
	fun getUserById(id: Int): User

	@Query("SELECT * FROM users WHERE email = :email")
	fun getUserByEmail(email: String): User
}