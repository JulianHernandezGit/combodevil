import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.combodevil.app.data.UserRepository.kt
import com.combodevil.app.data.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(private val repository: com.combodevil.app.data.UserRepository.kt) : ViewModel(){

	val allUsers = repository.getAllUsers()

	fun insert(user: User) {
		viewModelScope.launch(Dispatchers.IO) {
			repository.insert(user)
		}
	}

	fun getUserById(id: Int) = repository.getUserById(id)

	fun getUserByEmail(email: String) = repository.getUserByEmail(email)
}
