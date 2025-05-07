# 📄 Description - Exercise Statement

This exercise extends Level 1 - Exercise 3 by **parameterizing all the methods using a configuration file**.

You may use a standard Java `Properties` file or the Apache Commons Configuration library if preferred.

The following elements from the previous exercise must be parameterized:

- The directory to scan.
- The name and location of the resulting `.txt` output file.

---

# 💻 Technologies Used

- Java (JDK 8+)
- IntelliJ IDEA or Eclipse (IDE)
- Java Properties file for configuration
- Standard Java I/O libraries

---

# 📋 Requirements

- Java Development Kit (JDK) 8 or later
- Command line terminal (e.g., CMD on Windows)
- No external dependencies (unless using Apache Commons Configuration optionally)

---

# 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S1.05_JavaUtils_LV2.git
   ```

2. Navigate to the project directory:
   ```bash
   cd S1.05_JavaUtils_LV2
   ```

3. Create a directory for compiled classes:
   ```bash
   mkdir out
   ```

---

# ▶️ Execution

### 1. Compile

```bash
javac -d out src/main/java/org/example/Main.java
```

### 2. Prepare Configuration File

Create a file named `config.properties` in the **root of the project**, with the following content:

```properties
input.directory=src
output.file=output.txt
```

### 3. Run the Program

```bash
java -cp out org.example.Main
```

### 4. Output

The program will generate a file called `output.txt` containing a recursively listed directory structure, starting from the configured path.

---

# 🌐 Deployment

This project is not designed for deployment in a production server. It is intended for local command-line execution as a learning exercise.

However, it can be packaged into a `.jar` file for distribution if desired.

---

# 🤝 Contributions

Contributions are welcome. Please follow these guidelines:

- Fork the repository.
- Create a new branch for your feature or fix.
- Follow Java best practices (see Sprint 0 guidelines).
- Use English in all code and documentation.
- Submit a Pull Request with a clear description of your changes.

---
