# PadroesProjetoSingleton
Studying Singleton (powered by Copilot)
Language: Portuguese
Singleton. Padrão de Projeto CRIACIONAL. garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. Exemplos.
1. Gerenciador de Configurações;
2. Logger;
3. Conexão com Banco de Dados;
4. Fábrica de Threads.

E.G.:
![image](https://github.com/user-attachments/assets/382c3f99-cbd8-4590-a0c6-bfa3ef703aaa)

public final class A {
    private static final A INSTANCE = new A();
    private A() {}
    public static A getInstance() {
        return INSTANCE;
    }
}

Passo a Passo (Debug):
1. Carregamento da Classe A:

  O interpretador Java encontra a definição da classe A. A classe A é marcada como public e final, o que significa que ela pode ser acessada de qualquer outro pacote e não pode ser estendida.

2. Declaração do Campo INSTANCE:

    private static final A INSTANCE = new A();
    
    private: Indica que INSTANCE é acessível apenas dentro da classe A.
    
    static: Indica que INSTANCE pertence à classe A em si, não a uma instância específica.
    
    final: Garante que INSTANCE não pode ser reassinalado após sua inicialização.
    
    new A(): Cria uma nova instância da classe A e a atribui ao campo INSTANCE.

Na Inicialização da Classe:

    Quando a classe A é carregada, a linha private static final A INSTANCE = new A(); é executada, criando a única instância da classe A.

3. Declaração do Construtor Privado:

    private A() {}
    
    Este construtor privado impede a criação de novas instâncias da classe A fora dela. Somente métodos dentro da classe A podem chamar este construtor.
4. Declaração do Método getInstance():

    public static A getInstance() { return INSTANCE; }
    
    public: O método pode ser acessado por qualquer código.
    
    static: O método pertence à classe A e pode ser chamado sem criar uma instância da classe.
    
    A getInstance(): Define que o método retorna um objeto do tipo A.
    
    return INSTANCE;: Retorna a instância única da classe A.

5. Exemplo de Uso:
   ![image](https://github.com/user-attachments/assets/18a6b30e-007b-413f-8c35-ea4d936d815b)
https://github.com/ODAGAMMXIX/PadroesProjetoSingleton/blob/main/image.png
public class Main {
    public static void main(String[] args) {
        // Primeira chamada ao método getInstance()
        A instance1 = A.getInstance();
        
        // Segunda chamada ao método getInstance()
        A instance2 = A.getInstance();
        
        // Verificando se ambas as referências apontam para a mesma instância
        System.out.println(instance1 == instance2); // Output: true
    }
}
