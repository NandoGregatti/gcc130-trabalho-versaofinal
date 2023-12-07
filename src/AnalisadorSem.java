import java.io.IOException;
import java.net.http.WebSocket.Listener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AnalisadorSem {
    
    public static void main(String[] args) {
        String filename = "C:\\Users\\ferna\\Desktop\\Trabalho Compiladores\\Trabalho-Compiladores\\ExemploCodigo.txt";
        
        try {
            // Lexico
            CharStream input = CharStreams.fromFileName(filename);
                // Cria um objeto CharStram com arquivo especificado 
                // CharStream: interface no ANTLR que representa uma sequência de caracteres.
                // Encapsula a entrada de texto que será consumida pelos analisadores léxicos. 
            JavanesLexer lexer =  new JavanesLexer(input);
                // Cria um objeto JavanesLexer a partir de input. 
                // Classe gerada automaticamente. Representa o analisador léxico. 

            CommonTokenStream tokens = new CommonTokenStream(lexer);
                // Cria uma stream de tokens. Representa uma sequencia de tokens. 

            // Sintatico
            JavanesParser parser = new JavanesParser(tokens);
                // Cria um objeto JavanesParser (codigo gerado pelo ANTLR)
                // JavanesParser é uma classe gerada automaticamente pelo ANTLR. Representa o analisador sintatico. 
                // Utiliza o fluxo de tokens gerado acima para fazer a analise sintatica.
                
            ParseTree ast = parser.programa();
                // Inicia a análise sintática chamando a regra "programa" e gera a árvore

            System.out.println(ast.toStringTree()); // Converte a arvore para string e imprime 

            // Semantico
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}