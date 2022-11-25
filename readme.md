<h1 align="center">Ciclo de Vida de um Software</h1>
"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google


Ciclo de vida do software é usado para definir a sequência de etapas desde a concepção do sistema até a desativação do sistema pelo desenvolvedor. Ele ajuda a orientar as equipes de desenvolvimento e alocar recursos de maneira direcionada.
<h1></h1>

Exemplo: Controle de Pessoas e Residencias de uma Cidade

<h2>Requisitos Funcionais</h2>
<ul>
  <li>Operador pode cadastrar pessoas, juntamente com nome, cpf e sexo.</li>
  <li>Operador pode atribuir uma residencia a uma pessoa cadastrada.</li>
  <li>Operador pode filtrar pessoas por endereco.</li>
  <li>Operador pode filtrar pessoas por CPF.</li>
</ul>

<h2>Requisitos Não Funcionais</h2>
<ul>
  <li>Eficiencia: Bom tempo de resposta do sistema.</li>
  <li>Confiabiliade: Sistema toletante a erros.</li>
</ul>
    
<h2>Diagrama de Caso de Uso</h2>
<img src="https://github.com/fsbispo/bertoti/blob/main/Case-diagram/case-diagram.png">

<h2>Diagrama de Classe</h2>
<img src="https://github.com/fsbispo/bertoti/blob/main/class-diagram/class-diagram.png">
