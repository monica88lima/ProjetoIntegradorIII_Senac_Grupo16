 <h1 align="center">:pushpin: #Grupo16_ProjetoIntegrador :memo: </h1> 

 ## Descrição do Projeto
<p align="center">Implementação das interfaces do sistema para: 
Cadastro de Pessoa Física ​/ Cadastro de Pessoa Jurídica ​/ Cadastro de Professores ​/ Cadastro de Fornecedores ​/Cadastro de Alunos</p>
<h1 align="center">
    <a href="[https://pt-br.reactjs.org/](https://www.sp.senac.br/graduacao/tecnologia-em-analise-e-desenvolvimento-de-sistemas)">🔗 Senac</a>
</h1>

:computer:-[Tecnologia](#tecnologia)

 - Java
 - Html
 - Css
 - JavaScript
 - Postgresql
 
-[Recursos](#recursos)

- Figma : Para criaçao do prototipos das Interfaces- <a href="https://www.figma.com/file/EhMbLV4CByms0ZpSe4zpAO/Projeto---Senac?type=design&node-id=0%3A1&mode=design&t=VPjN8xtn9xy28rfG-1">Projeto no Figma</a>
<p align="center">🚀 lib para construir interfaces do usuário </p>

* [Sobre](#Sobre)
   
   * [Instalação](#instalacao)
   - Após instalar do gerenciador de banco de dados, execute o comando abaixo para criar o database;
   ```bash
    CREATE DATABASE "gestaoacademica-api"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
   ```
   
   - No Intellij acesse a pasta **resources**, abra o arquivo **application.properties** e valide as configurações de acesso ao banco de dados;
   
  ```bash
     spring.datasource.url=jdbc:postgresql://localhost:5432/gestaoacademica-api
     spring.datasource.username=postgres
     spring.datasource.password= ******
     spring.jpa.hibernate.ddl-auto=update

     spring.jpa.properties.hibernate.jdbc.lob.non_context_create=true
   ```

  - Posteriormente ainda no Intellij acesse a pasta do **com.example.projetosenac** e selecione a opção **RUN**
    Nesta etapa o Hibernate fará toda a criação das tabelas no banco de dados;

   > API subirá localmente.
     
   * [Como usar](#como-usar)
   * :triangular_flag_on_post: Clique na imagem
  
   * [![Alt text](https://img.youtube.com/vi/dh9WAxW_mC8/0.jpg)](https://www.youtube.com/watch?v=dh9WAxW_mC8)
 
     
   * [Pre Requisitos](#pre-requisitos)
     
    - Banco de Dados Postgresql instalado - (https://www.postgresql.org/download/)
      
    - Visual Studio Code - (https://code.visualstudio.com/download)
      
    - IntelliJ IDEA Community Edition (https://www.jetbrains.com/edu-products/download/other-IIE.html)
     
  * [Pacotes e Bibliotecas](#Pacotes-e-Bibliotecas)
      :bulb:* 
    - springframework
    ![springframework](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/springboot.png)

### Features

- [ ] Cadastro de Colaborador
- [x] Cadastro de Aluno
- [ ] Cadastro de Professor
- [ ] Cadastro de Filial
- [ ] Lançar Notas
- [ ] Emitir Documentos
- [ ] Aualização Cadastral Fornecedores


##Páginas Implemntadas

![Página Inicial](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/Home.JPG)

![Pagina de Login](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/Login.JPG)

![Cadastro Aluno](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/CadastroAluno.JPG)

![Menu](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/Menu.png)

![Pesquisa](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/Pesquisa.png)

![Cadastro Professor](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/CadastroProfessor.JPG)

![Atualização Cadastral Fornecedor](https://github.com/monica88lima/ProjetoIntegradorIII_Senac_Grupo16/blob/monica/pagina_login/PaginasDesenvolvidas_IMG/Atualiza%C3%A7%C3%A3oCadastralFornecedor.JPG)













