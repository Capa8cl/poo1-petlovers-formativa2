# Sistema de Registro: Clínica Veterinaria PetLovers 🐾🏥

* **Autor:** Fabrizio Fernandini
* **Ramo:** Fundamentos de Programación
* **Sección:** 005A
* **Versión:** 1.0

## 📝 Descripción

Este proyecto consiste en una aplicación de consola en Java diseñada para el modelamiento operativo y control de accesos
de la **Clínica Veterinaria PetLovers**, ubicada en Valdivia. La aplicación implementa principios avanzados de
Programación Orientada a Objetos (POO) mediante la **asociación y agregación de clases** (un objeto `Direccion` compone
a un `Duenio`, y este a su vez compone la ficha de una `Mascota`). Además, cuenta con un motor de validación estricta
para asegurar la integridad de la información antes de persistir o imprimir los estados en pantalla.

---

## 🚀 Características y Componentes Técnicos

* **Relación de Agregación de Objetos:** El sistema demuestra cómo interactúan múltiples entidades complejas en memoria,
  encapsulando objetos dentro de otros para estructurar fichas compuestas de manera limpia.
* **Módulo de Validación (`util.Validador`):** Clase de utilidad con métodos estáticos dedicados a auditar que las
  cadenas de texto no contengan datos nulos o vacíos (`.trim().isEmpty()`), además de verificar que el rango etario de
  los pacientes sea coherente (aceptando edad `0` para mascotas de meses).
* **Sobrescritura de Métodos Estándar:** Implementación de formatos personalizados mediante
  `@Override String toString()` requeridos por rúbrica para auditoría de datos, coexistiendo con métodos de salida
  comerciales como `.mostrarMascota()`.
* **Documentación Técnica Integrada (JavaDoc):** Estructura de código completamente comentada bajo estándares de
  ingeniería de software, preparada para la exportación automática de manuales técnicos en formato HTML.

---

## 📊 Arquitectura de Paquetes y Clases

El código está modularizado para separar las entidades de datos, los controladores de utilidad y la ejecución:

| Paquete | Clase       | Descripción / Responsabilidad                                                                                         |
|:--------|:------------|:----------------------------------------------------------------------------------------------------------------------|
| `app`   | `Main`      | Orquestador principal. Instancia los objetos, ejecuta el flujo de validaciones secuenciales y despliega los reportes. |
| `util`  | `Validador` | Capa lógica de control. Contiene las reglas estáticas para la aprobación o rechazo de entradas de datos.              |
| `model` | `Mascota`   | Entidad principal que almacena el nombre, especie, edad y asocia el objeto del propietario.                           |
| `model` | `Duenio`    | Entidad intermedia que resguarda datos de contacto y asocia la residencia del cliente.                                |
| `model` | `Direccion` | Unidad básica de datos geográficos (Calle, Número, Ciudad, Región).                                                   |

---

## 🛠️ Requisitos e Instalación

* Tener instalado el **Java Development Kit (JDK) versión 26** (Desarrollado y testeado bajo entornos de la versión de
  Java más reciente).

### 💻 Ejecución directa desde la Terminal

Ubicado dentro del directorio raíz de tus archivos fuentes (`src`), puedes inicializar todo el ecosistema de clases con
una sola instrucción:

```bash
java app/Main.java
```

📄 Generación de JavaDocs (HTML)
Para compilar y exportar toda la documentación técnica basada en las etiquetas implementadas en el código, ejecuta en tu
terminal:

```bash
javadoc -d ../doc app model util
```

📝 Simulación del Flujo del Sistema
Al iniciarse el programa, el sistema procesa una estructura de datos anidada en cascada. Si alguna de las capas falla en
sus validaciones de texto o rangos numéricos, el flujo se interrumpe informando el error. Al pasar exitosamente todos
los filtros, la consola imprime los siguientes bloques limpios:

```bash
La dirección es válida.
Los campos del dueño son válidos.
Los campos Nombre y Especie de la mascota son válidos.
La edad es válida.

---- Ficha Mascota ----
Nombre Mascota: Barto
Especie: Perro
Edad: 8 años

---- Datos Dueño ----
Nombre dueño: Luis Pérez
Telefono: +569 4321 5678
Direccion: Av. Pedro Montt, N° 2030, Valdivia, Los Ríos

**** Salida usando método toString() solicitado en la rúbrica ****
Mascota: Barto | Especie: Perro | Edad: 8
---- Datos Dueño (toString) ----
Nombre dueño: Luis Pérez
Telefono: +569 4321 5678
Direccion: Calle: Av. Pedro Montt, N°: 2030, Ciudad: Valdivia, Region: Los Ríos
```
