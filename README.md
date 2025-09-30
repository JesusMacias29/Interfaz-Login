🖥️ Práctica: Interfaces de Login en Java (Swing)
📌 Descripción

En este proyecto desarrollé tres versiones de una interfaz de inicio de sesión usando Java Swing e IntelliJ GUI Designer.
El objetivo fue practicar la creación de interfaces gráficas, trabajar con distintos componentes y personalizar su apariencia, sin añadir todavía la lógica de los botones.

🎨 Versiones de la interfaz
1️⃣ Login Clásica

✅ Usuario, contraseña, botón de ingreso y checkbox de aceptación de términos.
🎨 Fondo negro, botón verde y texto blanco.

2️⃣ Login Extendida

✅ Incluye selección de idioma (JComboBox) y “Recordar usuario” (JRadioButton).
🎨 Mejor organización con GridBagLayout, fondo negro y botón azul.

3️⃣ Login Creativa

✅ Estilo moderno con mensaje de registro y colores personalizados.
🎨 Fuentes llamativas, alineación centrada y botón estilizado en azul.

🧩 Componentes utilizados

JLabel → títulos, etiquetas y mensajes

JTextField → campo de usuario

JPasswordField → campo de contraseña

JButton → botón de ingreso

JCheckBox → aceptar términos

JRadioButton → recordar usuario

JComboBox → selección de idioma

JPanel → organización de los elementos

⚙️ Propiedades aplicadas

Estilo de texto y colores: setFont, setForeground, setBackground

Apariencia y transparencia: setOpaque(false), setFocusPainted(false)

Alineación: setHorizontalAlignment()

Edición y ayuda: setEditable(), setToolTipText()

📄 Documento PDF

Puedes ver el informe completo con capturas y explicaciones aquí:
👉 Descargar PDF de la práctica -> https://github.com/JesusMacias29/Interfaz-Login/blob/main/Tarea%20de%20Dise%C3%B1o_%20Interfaz%20de%20Login%20en%20IntelliJ.pdf

✅ Conclusión

Haciendo estas interfaces aprendí a usar los componentes de Swing y a darles estilo.
La clásica es sencilla, la extendida agrega opciones útiles y la creativa tiene un diseño más moderno. Me di cuenta de que con solo cambiar colores, fuentes y la disposición de los elementos se pueden lograr diseños muy distintos sin necesidad de programar la lógica todavía.

📂 Estructura del proyecto
src/
 └── org.appjesus/
      ├── LoginClásica.java
      ├── LoginExtendido.java
      └── LoginCreativo.java

🛠️ Tecnologías utilizadas

☕ Java SE

🎨 Swing (JLabel, JButton, JTextField, JPasswordField, JCheckBox, JRadioButton, JComboBox, JPanel)

💻 IntelliJ IDEA GUI Designer
