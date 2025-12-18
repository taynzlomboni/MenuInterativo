# Menu Interativo

Um aplicativo Java com menu interativo que oferece três funcionalidades principais para fins educacionais.

## 📋 Descrição

Este projeto é um programa simples em Java que implementa um menu interativo com as seguintes operações:
- Verificar elegibilidade para votação
- Executar uma contagem regressiva
- Identificar dias da semana

## 🚀 Funcionalidades

### 1. **Verificar se pode votar**
- Solicita a idade do usuário
- Verifica se o usuário tem 16 anos ou mais
- Retorna se o usuário pode ou não votar

### 2. **Fazer a contagem regressiva**
- Exibe uma contagem regressiva de 5 até 1
- Ótimo exemplo de uso de loops

### 3. **Mostrar dia da semana**
- Solicita um número de 1 a 7
- Retorna o dia da semana correspondente
- Começa no domingo (1) e termina no sábado (7)

## 💻 Como usar

### Pré-requisitos
- Java 8 ou superior instalado
- Um terminal ou prompt de comando

### Execução

1. Compile o arquivo Java:
```bash
javac MenuInterativo.java
```

2. Execute o programa:
```bash
java MenuInterativo
```

3. Siga as instruções exibidas no menu

## 📖 Exemplo de Uso

```
Menu Interativo:
1 - Verificar se pode votar
2 - Fazer a contagem regressiva
3 - Mostrar dia da semana
0 - Sair
Escolha uma opção: 1
Digite sua idade: 18
Você PODE votar.

Menu Interativo:
...
Escolha uma opção: 3
Digite um número de 1 a 7: 5
Quinta-feira

Escolha uma opção: 0
Saindo do menu...
```

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **API:** `java.util.Scanner` (entrada de dados)

## 📚 Estrutura do Código

- **main()**: Gerencia o loop principal e o menu
- **verificarVoto()**: Valida se a idade permite votação
- **contagemRegressiva()**: Executa contagem de 5 a 1
- **mostrarDiaDaSemana()**: Mapeia números para dias da semana

## 📝 Autor

Desenvolvido para fins educacionais.

## 📄 Licença

Este projeto está disponível livremente para uso educacional.
