import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.combodevil.app.data.model.User

@Dao
interface UserDao {
	@Insert
	fun insert(user: User)

	@Update
	fun update(user: User)

	@Delete
	fun delete(user: User)

	@Query("SELECT * FROM users")
	fun getAllUsers(): LiveData<List<User>>

	@Query("SELECT * FROM users WHERE email = :email")
	fun getUserByEmail(email: String): LiveData<User>
}
