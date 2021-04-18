import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Produto(1,"TV","LG","1234-a",1200);
        Produto produto2 = new Produto(2,"Celular","Apple","iPhone 7",200);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Importar em MarkDown=1 ou HTML=2");
        int choice = new Scanner(System.in).nextInt();

        ExportadorListaProduto exportadorListaProduto = null ;

        if(choice==1){
            exportadorListaProduto = new ExportadorListaProdutoMarkdown();
        }else if(choice==2){
            exportadorListaProduto = new ExportadorListaProdutoHtml();
        }

        String resultado = exportadorListaProduto.exportar(produtos);

        System.out.println(resultado);

    }

}
