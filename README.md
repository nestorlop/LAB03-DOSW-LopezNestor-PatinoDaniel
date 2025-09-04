# 🧩 LAB03-DOSW-LopezNestor-PatinoDaniel
# 📘 Laboratorio - CVDS DOSW 01  

## 👥 Integrantes  
- **Daniel Patiño Mejía**  
- **Néstor David López Castañeda**  

---

## 🏷️ Grupo  
**DOSW-01**  

---

## 📂 Evidencias  

**Primera entrega: Maven compilando correctamente con la configuracion solicitada**
- **Imagen:**  
  ![Caso de prueba](docs/images/capturaInicial.png)


  ## 📂 Reto 1

  •	Identifiquen reglas de negocio:

    - Gestiorar cuentas bancarias.
    - Gestionar Servicios financieros basicos.
    

  •	Funcionalidades principales:

    - Crear y validar cuentas de los clientes.
    - Realizar consulta de saldos.
    - Hacer depositos.

  •	Escriban los actores principales.
    - Cliente.
    - Banco  Davivienda
    -Bancolombia


  •	Documenten las precondiciones necesarias para el sistema.
    - La cuenta debe tener exactamente 10 digitos
    - Los dos primeros digitos de la cuenta deben corresponder a un banco registrado
    - El numero de cuenta no debe tener letras ni caracteres especiales.  
 
 ## 📂 Reto 2

Para el reto 2 tuvimos que realizar la **diagramación** basándonos en el **Reto 1**.

---

### 🟢 1. Diagrama de Contexto
Primero, creamos el **diagrama de contexto**, el cual resume el punto 1 de forma general y muestra cómo interactúan las entidades principales.

![Diagrama de Contexto](docs/uml/Diagramadecontexto.png)

Al momento de crearlo, teníamos **dos opciones**:
- Separar cada banco como entidades independientes.
- Mantenerlos como **una sola entidad bancaria**.

Finalmente, decidimos dejarlos como **una sola entidad**, ya que así será más sencillo, en un futuro, permitir la **expansión hacia otros bancos**.

---

### 🟢 2. Diagrama de Casos de Uso
Después, realizamos el **diagrama de casos de uso**. Aquí tuvimos un problema:  
no sabíamos si incluir a los **bancos** como agentes o no.  
Al final, decidimos **no incluirlos** y dejar únicamente a los **clientes**, planteando sus respectivas necesidades.

![Diagrama de Casos de Uso](docs/uml/Casos%20de%20uso.png)

---

### 🟢 3. Descripción de Casos de Uso
Además, debíamos crear un **Excel** donde describimos cada caso de uso, detallando su **tipo** y su función dentro del sistema.

![Descripción de Casos de Uso](docs/uml/EXCEL.png)

---

### 🟢 4. Diagrama de Clases
Finalmente, elaboramos el **diagrama de clases**, donde mostramos cómo creemos que será la estructura más adecuada para implementar la solución de **Bankify**.  
Aquí plasmamos cómo imaginamos que se organizará el código para que sea **más claro, simple y eficiente**.

![Diagrama de Clases](docs/uml/Diagrama%20de%20clases%20(2).png)
