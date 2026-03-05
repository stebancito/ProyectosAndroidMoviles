# Aplicación de Demostración de Elementos de Interfaz Android

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)

## Descripción de la App

 Aplicación diseñada para demostrar los diferentes elementos de interfaz de usuario disponibles en Android. La app está estructurada en una sola actividad principal que contiene 5 fragments, cada uno dedicado a explicar y mostrar ejemplos interactivos de distintos componentes de UI.

### Elementos demostrados:

| Fragment | Componentes incluidos |
|----------|----------------------|
| **TextFields** | TextView, EditText (varios tipos: texto, contraseña, email, teléfono, número, fecha, hora, multilínea), AutoCompleteTextView, MultiAutoCompleteTextView, CheckedTextView, TextInputLayout |
| **Botones** | Button, ImageButton, FloatingActionButton |
| **Selección** | Chip, CheckBox, RadioButton, ToggleButton, Switch, RatingBar, SeekBar |
| **Listas** | ListView, Spinner, RecyclerView, ExpandableListView |
| **Información** | TextView, ImageView, ProgressBar (circular y horizontal) |

Esta aplicación fue desarrollada como parte de una tarea de desarrollo móvil para demostrar:
- El uso de Activities y Fragments en Android
- La implementación de diferentes elementos de UI
- La navegación entre fragments usando BottomNavigationView
- La interactividad básica con los componentes de interfaz

## Instalación y Ejecución

### Opción 1: Clonar y ejecutar desde Android Studio

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/ui-explorer.git
2. **Abre el proyecto en Android Studio**
   - Inicia Android Studio
   - Selecciona "Open an existing project"
   - Navega hasta la carpeta donde clonaste el repositorio y selecciona la carpeta del proyecto

3. **Espera a que Gradle sincronice**
   - Android Studio descargará automáticamente las dependencias necesarias
   - Si hay errores, ve a `File > Sync Project with Gradle Files`

4. **Configura un emulador o conecta un dispositivo físico**
   - **Emulador**: 
     - Tools > Device Manager > Create device
     - Selecciona un dispositivo (ej: Pixel 4)
     - Descarga una imagen del sistema (ej: API 30 Android 11)
     - Finaliza la configuración
   - **Dispositivo físico**: 
     - Habilita "Opciones de desarrollador" (toca 7 veces en "Número de compilación")
     - Activa "Depuración USB"
     - Conecta tu dispositivo por USB

5. **Ejecuta la aplicación**
   - Haz clic en el botón verde "Run" (▶) en la barra de herramientas
   - Selecciona tu dispositivo/emulador
   - ¡La aplicación se instalará y ejecutará automáticamente!
