import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RegisterScreen(navController: NavController) {
	val name = remember { mutableStateOf("") }
	val phone = remember { mutableStateOf("") }
	var isLoading by remember { mutableStateOf(false) }
	var errorMessage by remember { mutableStateOf<String?>(null) }

	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(16.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		Text(text = "Registro", style = MaterialTheme.typography.h4)

		OutlinedTextField(
			value = name.value,
			onValueChange = { name.value = it },
			label = { Text("Nombre") },
			modifier = Modifier.fillMaxWidth()
		)

		Spacer(modifier = Modifier.height(16.dp))

		OutlinedTextField(
			value = phone.value,
			onValueChange = { phone.value = it },
			label = { Text("Teléfono") },
			keyboardType = KeyboardType.Phone,
			modifier = Modifier.fillMaxWidth()
		)

		Spacer(modifier = Modifier.height(16.dp))

		Button(onClick = {
			// Implementar lógica de registro aquí
			// Asegúrate de establecer isLoading y errorMessage apropiadamente
			// Por ejemplo:
			// isLoading = true
			// try {
			//     register(name.value, phone.value) // Tu función de registro aquí
			//     navController.navigate("home") // Navegar a la pantalla de inicio después de un registro exitoso
			// } catch (e: Exception) {
			//     errorMessage = "Error de registro: ${e.message}"
			// } finally {
			//     isLoading = false
			// }
		}, enabled = !isLoading) {
			Text("Registrarse")
		}

		if (isLoading) {
			CircularProgressIndicator()
		}

		if (errorMessage != null) {
			Text(text = errorMessage!!, color = MaterialTheme.colors.error)
		}

		Spacer(modifier = Modifier.height(16.dp))

		TextButton(onClick = {
			// Navegar a la pantalla de inicio de sesión
			navController.navigate("login")
		}) {
			Text("¿Ya tienes una cuenta? Iniciar sesión")
		}
	}
}
