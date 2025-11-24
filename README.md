## 📜 README: Princípios de Orientação a Objetos (POO) em Java Puro ☕

Este documento descreve os conceitos fundamentais de Orientação a Objetos (POO) aplicados em Java, focando na **abstração**, **encapsulamento**, **herança** e **polimorfismo**.

---

### 🧱 Conceitos de Abstração e Classes

#### 🧑‍💻 Classe Abstrata (`abstract class`)

Uma classe abstrata serve como um **modelo** ou **contrato** parcial, não podendo ser instanciada diretamente.

* **Construtor:** **Pode ter construtor**, usado para inicializar atributos da classe base (e chamado por subclasses).
* **Instanciação:** **Não pode ser instanciada** (ex: `new ClasseAbstrata()` é inválido).
* **Métodos Abstratos:** Define **contratos** (métodos sem corpo/implementação) que **devem** ser implementados por subclasses concretas. Declarados com a palavra-chave `abstract`.
* **Métodos Concretos:** Pode ter métodos com implementação completa.

#### 🏭 Classe Concreta

São as **classes de trabalho** que podemos instanciar e usar no dia a dia.

* **Implementação:** **Deve implementar** todos os métodos abstratos (contratos) herdados de uma classe abstrata ou interface.

#### 🌐 Interface (`interface`)

É o **nível mais alto de abstração**, definindo um contrato puro de comportamento.

* **Pré-Java 8:** Continha **somente constantes estáticas (`public static final`)** e **métodos abstratos (`public abstract`)**.
* **Pós-Java 8:** Permite **`default methods`** (métodos com implementação padrão) e **métodos estáticos**. Também suporta **expressões Lambda**.

---

### 🔒 Encapsulamento

Controla o acesso aos membros (atributos e métodos) de uma classe, protegendo o estado interno.

| Modificador | Nível de Acesso | Descrição |
| :--- | :--- | :--- |
| `private` | **Apenas dentro da própria classe.** | Máxima restrição. |
| `protected` | **Dentro da própria classe, subclasses (herança) e classes no mesmo pacote.** | Permissivo para a hierarquia. |
| `public` | **Qualquer lugar.** | O mais permissivo de todos. |
| **`default`** (package-private) | **Apenas dentro do mesmo pacote.** | Se nenhum modificador for especificado. |

---

### 🧬 Herança (`extends`)

Permite que uma classe (subclasse/filha) herde atributos e métodos de outra classe (superclasse/pai).

* **Herança Simples:** Em Java, uma classe filha **só pode herdar de uma única classe pai** (`class Filho extends Pai`).

---

### ♻️ Polimorfismo (Sobrescrita e Sobrecarga)

Polimorfismo significa "muitas formas" e se manifesta em Java de duas maneiras principais:

#### 1. Sobrecarga (`Overload`)

Define **múltiplos métodos na mesma classe com o mesmo nome**, mas com **assinaturas diferentes** (diferentes tipos ou número de parâmetros).

**Exemplo:**
```java
public Cliente(String nome) {
   this.nome = nome;
}

public Cliente(String nome, String telefone) { 
  this.nome = nome;
  this.telefone = telefone;
}