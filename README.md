# Sistema de Aluguel de Meios de Transporte

## Objetivo

O objetivo desta atividade foi implementar uma aplicação utilizando o padrão de projeto **Abstract Factory** para criar diferentes meios de transporte individuais, diferenciando-os pelo tipo de propulsão (movido a bateria ou esforço humano). A aplicação gerencia o aluguel de meios de transporte como bicicletas, patinetes, patins e skates.

## Descrição

Você é responsável por criar um sistema para gerenciar o aluguel de meios de transporte individuais, classificados em duas categorias:

1. **Movidos a Bateria**:
   - Patinete elétrico
   - Bicicleta elétrica

2. **Movidos pelo Esforço Humano**:
   - Bicicleta convencional
   - Patins
   - Skate

Através do uso do padrão **Abstract Factory**, a aplicação gerencia a criação desses objetos de transporte, garantindo que os meios de transporte sejam compatíveis com suas categorias.

## Especificações Técnicas

### 1. **Interfaces**
- **Transport**: Representa um meio de transporte genérico. 
    - **Método**: `void ride()` – Exibe uma mensagem informando o uso do transporte.

### 2. **Classes Concretas**
Classes para cada tipo de transporte:

- **Movidos a Bateria**:
  - `ElectricScooter` (Patinete elétrico)
  - `ElectricBike` (Bicicleta elétrica)

- **Movidos pelo Esforço Humano**:
  - `Bicycle` (Bicicleta convencional)
  - `RollerSkates` (Patins)
  - `Skateboard` (Skate)

### 3. **Abstract Factory**
A interface **TransportFactory** declara métodos para criar transportes:
- **Métodos**: `Transport createScooter()`, `Transport createBike()`, etc.

### 4. **Fábricas Concretas**
- **ElectricTransportFactory**: Fábrica responsável por criar meios de transporte movidos a bateria.
- **HumanPoweredTransportFactory**: Fábrica responsável por criar meios de transporte movidos pelo esforço humano.

### 5. **Ponto de Entrada (Main)**
A classe `Main` é o ponto de entrada do sistema. Aqui o sistema solicita meios de transporte de uma fábrica e exibe mensagens no console informando seu uso.

---

## Estrutura de Pastas

```plaintext
src/
└── com.example.transport
    ├── Transport.java            # Interface genérica de transporte
    ├── ElectricScooter.java      # Classe concreta para patinete elétrico
    ├── ElectricBike.java         # Classe concreta para bicicleta elétrica
    ├── Bicycle.java              # Classe concreta para bicicleta convencional
    ├── RollerSkates.java         # Classe concreta para patins
    ├── Skateboard.java           # Classe concreta para skate
    ├── TransportFactory.java     # Interface da fábrica abstrata
    ├── ElectricTransportFactory.java  # Fábrica concreta de transportes a bateria
    ├── HumanPoweredTransportFactory.java # Fábrica concreta de transportes por esforço humano
    └── Main.java                 # Classe principal para teste


