# Design-Patterns


## Padrão Criacional

<br>

##### *Factory Method*
    Padrão que fornece uma 'interface' para criar objetos em uma
    superclasse, mas permite que as subclasses alterem o tipo de objeto que
    serão criados.

---

##### *Abstract Factory*
    Padrão que permite que você produza famílias de objetos relacionados sem 
    ter que especificar suas classes concretas.

---

##### *Singleton*
    Padrão que permite você garantir que uma classe tenha apeans uma instância,
    enquanto você provê um ponto de acesso 'global' para essa instância.

---

##### *Monostate*
    Padrão com os mesmos critérios do Singleton, porém, trabalha com algo 
    mutável e de forma implícita, podendo trazer alguns problemas para 
    aplicações principalmente se seu time for “novo” e nunca tiver visto o 
    código, podendo achar que está trabalhando com instancias diferentes do
    objeto, mas está trabalhando com a mesma instância.

---

##### *Builder*
    Padrão que separa a construção de um objeto complexo de sua representação
    para que o mesmo processo de construção possa criar representações
    diferentes.

---

#### *Prototype*
    Padrão que tem como objetivo criar um objeto a partir de um protótipo.
    Um objeto existente que já tenha um conjunto de atributos definidos, para
    a partir dessa premissa poder começar a evoluir o objeto.

---


## Padrão Estrutural

<br>

##### *Adapter*
    Padrão que tem como objetivo converter a interface de uma classe em outra interface
    esperada pelo cliente. O Adapter permite a comunicação entre classes que não poderiam
    trabalhar juntas devido à incompatibilidade de suas interfaces.

---

#### *Bridge*
    Padrão que tem como objetivo desacoção uma abstração de sua implementação
    para que os dois possam variar independentemente.
---