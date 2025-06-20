
# MODELO UML #


Integrantes:
- Alonso Lagos
- Francisca Aguayo
- Benjamin Urrea



![image](https://github.com/user-attachments/assets/aaecc75f-7e7a-47d5-83ce-375cef7c7b82)

Se creo el modelo UML en plantuml con el siguiente código.

@startuml
package modelo {

    class Dado {
        - caraSuperior: int
        + lanzar(): void
        + getCaraSuperior(): int
    }

    class Calculadora {
        + sumar(a: int, b: int): int
    }

    class JuegoDados {
        - dado1: Dado
        - dado2: Dado
        - calculadora: Calculadora
        + jugar(): void
        + esGanador(): boolean
    }

    Dado --> Calculadora : usa (para sumar valores)
    JuegoDados --> Dado : contiene 2 instancias
    JuegoDados --> Calculadora : usa
}
@enduml
