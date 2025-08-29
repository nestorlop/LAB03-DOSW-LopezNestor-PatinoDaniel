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

  ## Preguntas iniciales
  
**¿Cuál es la diferencia principal entre una prueba unitaria y una prueba de integración E2E?**

La principal diferencia que vamos a encontrar es que las pruebas unitarias sirven para verificar que el codigo funcione bien pero por partes individuales como lo son
funciones o clases mientras que las pruebas de integracion tienen como objetivo validar el flujo completo de una funcionalidad a traves de las multiples capas del sistema. Busca replicar el comportamiento real de un usuario final.

**En Scrum ¿Cuál es el propósito de la Sprint Retrospective y porque es crucial para la mejora continua del equipo?**

El principal propocito de la sprint retrospective es realizar una retroalimentacion oportuna en la que se van a tratar puntos  importantes como lo es que salio bien, que salio mal y que cosas hicieron falta. Es crucial por que ayuda a que el equipo tenga una mejor organizacion, permitiendo detectar problemas,ineficiencias y fomenta las dinamicas de cooperacion est va a hacer que el equipo evolucione constantemente.

**Explique la diferencia entre una Épica, una Feature y una historia de Usuario. Proporcione un ejemplo de cada una si tenemos un sistema de streaming de video como lo es Netflix.**

La principal diferencia que podemos encontrar es que la Epica se encarga de agrupar multipes features y requiere de releases extendidos mientras que la feature es especifica y puede entregarse en varios sprints y la historia de usuario es una necesidad concreta expresada desde la perspectiva del usuario.
-Un ejemplo de una Epica en Netflix puede ser implementar la reproduccion simultanea en multiples dispositivos, esta epica va a tener multiples features como numero de pantallas, dispositvos conectados simultaneamente, entre otros.
-Un ejemplo de un feature en Netflix es permitir que dos usuarios puedan disfrutar del contenido al mismo tiempo. Esto es una funcion mas especifica
-Un ejemplo de una historia de usuario en Netflix: Un usuario quiere que dos personas puedan ver la misma serie en simultaneo para poder ver una serie con su pareja de manera remota
como programador de Netflix quiero que sea posible ver una serie en simultaneo desde diferentes dispositivos para poder satisfacer las necesidades de muchos clientes.
**¿Qué es una cobertura de Código (code coverage) y porque una cobertura del 100% no garantiza necesariamente que el software esté libre de errores?**

La cobertura de codigo tiene como objetivo verificar que las pruebas que se realicen cubran la mayoria de las funcionalidades del codigo aunque este no garantiza que este libre de errores ya que no mira errores logicos o si tenemos un caso borde que no tengamos contemplado. Algunas pruebas pueden pasar incluso si el resultado es erróneo si las validaciones son insuficientes o incorrectas.

**Describa que es un Diagrama de Casos de Uso y que elementos lo componen. ¿Para qué sirve en la fase de análisis de requerimientos?**

El diagrama de Casos de uso es una representacion visual de lo que buscan nuestras funciones desde la perspectiva del usuario. Enfocandose en que hacen las funciones mas no como.
Esta compuesto por el Actor, el caso de uso y las relaciones. Esto sirve para indetificar y hacer mas claras las funcionalidades tambien da un enfoque a los usuarios ya ademas gracias a este vamos a diseñar las pruebas, verificando que estas cumplan lo que el caso de uso pide.

****¿Cuál es la diferencia entre el uso de Junit y Jacoco en un proyecto, y como complementa SonarQube este proceso en términos de calidad de software?**

JUnit es un framework para crear y ejecutar pruebas unitarias que validan el comportamiento específico del código, JaCoCo complementa midiendo el porcentaje de código ejecutado por esas pruebas (cobertura), mientras que SonarQube integra y amplía este proceso analizando no solo la cobertura sino también la calidad del código mediante reglas de deuda técnica, vulnerabilidades, código duplicado y complejidad, proporcionando una visión holística de la salud del software y garantizando que el código no solo funcione sino que también esté bien estructurado, mantenible y seguro.

**¿Qué ventajas tiene el uso de Planning Poker frente a otros métodos de estimación tradicional y como ayuda a mejorar la transparencia y compromiso del equipo?**

El uso del Planning poker resulta beneficioso para un equipo ya que busca promover la colaboracion y el mutuo entendimiento promoviendo discuciones tecnicas tranparentes en donde cualquier miembro puede participar, esto hace que se genere un compromiso colectivo a diferencia de metodos tradicionales donde solo hay un lider y este  asigna las tareas de manera unilateral. Esta técnica democratiza la planificación, revela suposiciones ocultas y asegura que las estimaciones reflejen tanto la complejidad real del trabajo como el consenso del equipo, mejorando así la precisión y la adherencia a los compromisos adquiridos.

**Menciona los valores de Scrum y explica cual consideras más difícil de aplicar en un equipo.**

Los valores de Scrum son compromiso,coraje,foco,apertura y respeto, para nosotros el mas complicado de aplicar es el coraje ya que hay momentos en los que quizas a algun miembro se le puede llegar a complicar una tarea y quizas pueda llegar a rendirse haciendo que el equipo falle. A pesar de esto con la mutua colaboracion y entendimiento se intentara de evitar esto y lograr un trabajo oportuno.
