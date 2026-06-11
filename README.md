🐧 Linux Distro Identifier (Java)
Este projeto contém um controlador em Java projetado para identificar se o sistema operacional atual é Linux e, caso seja, extrair e exibir o nome e a versão da distribuição instalada.

⚙️ Como Funciona
A classe DistroController realiza a verificação em duas etapas principais:

Identificação do S.O.: Utiliza a propriedade de sistema System.getProperty("os.name") para verificar se o ambiente de execução é Linux.

Leitura da Distribuição: Caso seja Linux, o código executa o comando de terminal cat /etc/os-release via Runtime.getRuntime().exec(). Ele lê a saída do terminal linha por linha para capturar os campos NAME e VERSION, limpando as aspas extras antes de exibir o resultado.

🚀 Estrutura do Código
O controlador possui dois métodos principais:

private String os(): Retorna o nome do sistema operacional atual em letras minúsculas.

public void exibeDistro(): Método principal que valida o sistema, executa o comando nativo e formata a saída no console.

🛠️ Requisitos e Tecnologias
Linguagem: Java (JDK 8 ou superior)

API Utilizada: java.io e java.lang.Process (nativas do Java, sem dependências externas).

Sistema Operacional Requerido para a leitura: Linux (com suporte ao arquivo /etc/os-release).
