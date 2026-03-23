# Modular Pen Design System
This is a modular pen system designed for total flexibility. It allows you to build a pen with custom writing styles (Gel, Ball, or Ink), interchangeable covers (Cap or Click-action), and specific refill methods (Cartridge or Plastic Pipe).

---

## 🖋️ What is this project about?
The core goal of this project is to create a flexible Pen system where the internal logic is not hard-coded. By using the Strategy Pattern (via interfaces), a Pen can be any combination of components. For example, you can have a "Click-style Gel Pen with a Plastic Pipe Refill" or a "Cap-style Ballpoint with a Cartridge."

---

## Key Features:
- ### 1. Decoupled Logic: 
The Pen class doesn't care how a nib writes or how a cap opens; it simply calls the interface methods.

- ### 2. Extensibility:
 Adding a new type of cover (e.g., a "TwistCover") only requires implementing the Cover interface without changing existing code.

- ### 3. Centralized Creation: 
A PenFactory simplifies object instantiation, allowing you to create complex Pen objects using simple string identifiers.

---

## ⚙️ How It Works

**Component Interfaces:**
 - ### Writable:
  Defines the writing style (Ink, Gel, Ball).

- ### Cover: 
Defines how the pen opens/closes (Cap, Click).

- ### Refill: 
Defines how the ink is replenished (Cartridge, Plastic Pipe).

- ### The Pen Class: 
Acts as the orchestrator. It maintains a state (isOpen) and delegates actions to its injected components.

- ### The Factory: 
The PenFactory takes four string parameters, maps them to the correct concrete implementations, and returns a fully constructed Pen object.

- ### State Management: 
The Pen includes basic validation logic for instance, it will prevent you from writing if the pen has not been "started" (opened).

---

## 📊 UML Diagram

![Pen UML Diagram](https://lh3.googleusercontent.com/d/1Vk29kTEBp5Pfkqx7JNpwlE1s_JvXOm52)

---

## 📂 File Structure
The project is organized into a clean, flat package structure for easy navigation:

```
src/main/java/com/pen
├── Main.java                        # Entry point & Demonstration
├── cover/                           # Covering mechanism package
│   ├── Cover.java                   # Interface
│   ├── CapCover.java                # Implementation
│   └── ClickCover.java              # Implementation
├── factory/                         # Object creation package
│   └── PenFactory.java              # Centralized Pen creation logic
├── model/                           # Domain objects
│   └── Pen.java                     # The core Pen orchestrator
├── refill/                          # Ink replenishment package
│   ├── Refill.java                  # Interface
│   ├── CartridgeRefill.java         # Implementation
│   └── PlasticPipeRefill.java       # Implementation
└── writable/                        # Writing mechanism package
    ├── Writable.java                # Interface
    ├── BallWritable.java            # Implementation
    ├── GelWritable.java             # Implementation
    └── InkWritable.java             # Implementation
```

--- 

## 🚀 Getting Started


### **1. Compile**
```bash
javac -d out --source-path src/main/java src/main/java/com/pen/Main.java
```

### **2. Run**
```bash
java -cp out com.pen.Main
```

> **Note:**  
> The `-d out` flag keeps compiled `.class` files separate from source code.

