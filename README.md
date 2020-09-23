# cadastro-mais
![Arquitetura Macro](https://github.com/pi-fatec-bd/cadastro-mais/blob/master/Arquitetura%20Macro.png)
## 1. Front-end

### 1.1. View
Camada única do front-end com nenhuma regra de negócio.
    
## 2. Back-end

### 2.1. REST Controller
Camada dos controllers seguindo o padrão REST
    
### 2.2. Model
Camada do Model concentrando as regras de negócio, DTOs, serviços e entidades.
    
### 2.2.1. DTO
Camada para transformação das entidades em modelos adaptados para o front-end.
    
### 2.2.2. Service
Camada de regra de negócio que envolve duas ou mais entidades.
    
### 2.2.3. Entity
Camada refletindo as entidades do banco de dados, concentrando as regras de negócios referente as entidades e conexões com o banco de dados
    
## 3. DB
Banco de dados
