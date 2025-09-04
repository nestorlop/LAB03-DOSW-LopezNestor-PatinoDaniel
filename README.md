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
    Para el reto 2 vamos a tener que realizar la diagramacion basandonos en el reto 1.

    -Primero vamos a tener que crear el diagrama de contexto, este diagrama va a resumir nuestro punto 1 de una manera general.

    ![alt text](docs/uml/Diagrama de contexto.png)


    Y teniamos dos opciones al momento de crearlo, la primera era  dejar la entidad bancaria separada, dicho de otro modo separarlo en los dos bancos pero al final nos dimos cuenta que si lo dejabamos como una sola entidad bancaria puede quedar mejor para en un futuro realizar una posible expansion hacia otros bancos.
    -Luego tenemos que hacer el diagrama de casos de uso. En este tambien se nos presento un problema ya que no sabiamos si poner a los bancos como agentes, al final decidimos que no y solo dejamos a los clientes. Planteando sus respectivas necesidades.
    ![alt text](docs/uml/Casos de uso.png)
