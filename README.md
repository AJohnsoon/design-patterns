# Design-Patterns


## Padrão Criacional


##### *<a href="./src/criacional/factory">Factory Method</a>* 

    Padrão que fornece uma 'interface' para criar objetos em uma
    superclasse, mas permite que as subclasses alterem o tipo de objeto que
    serão criados.

---

##### *<a href="./src/criacional/abstractFactory">Abstract Factory</a>*
    Padrão que permite que você produza famílias de objetos relacionados sem 
    ter que especificar suas classes concretas.

---

##### *<a href="./src/criacional/singleton">Singleton</a>*
    Padrão que permite você garantir que uma classe tenha apeans uma instância,
    enquanto você provê um ponto de acesso 'global' para essa instância.

---

##### *<a href="./src/criacional/monostate">Monostate</a>*
    Padrão com os mesmos critérios do Singleton, porém, trabalha com algo 
    mutável e de forma implícita, podendo trazer alguns problemas para 
    aplicações principalmente se seu time for “novo” e nunca tiver visto o 
    código, podendo achar que está trabalhando com instancias diferentes do
    objeto, mas está trabalhando com a mesma instância.

---

##### *<a href="./src/criacional/builder">Builder</a>*
    Padrão que separa a construção de um objeto complexo de sua representação
    para que o mesmo processo de construção possa criar representações
    diferentes.

---

#### *<a href="./src/criacional/prototype">Prototype</a>*
    Padrão que tem como objetivo criar um objeto a partir de um protótipo.
    Um objeto existente que já tenha um conjunto de atributos definidos, para
    a partir dessa premissa poder começar a evoluir o objeto.

---
<br>
<br>


## Padrão Estrutural

##### *<a href="./src/criacional/adapter">Adapter</a>*

    Padrão que tem como objetivo converter a interface de uma classe em outra interface
    esperada pelo cliente. O Adapter permite a comunicação entre classes que não poderiam
    trabalhar juntas devido à incompatibilidade de suas interfaces.

---

##### *<a href="./src/criacional/bridge">Bridge</a>*

    Padrão que tem como objetivo desacoplar uma abstração de sua implementação
    para que os dois possam variar independentemente.

---

##### *<a href="./src/criacional/composite">Composite</a>*

    Padrão que tem como objetivo compor objetos em estruturas de árvore para
    representar hierarquias (todo-parte). O composite permite que clientes 
    tratem seus objetos indiviais e composições de objetos de maneira uniforme.
---