import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {

    List<String> TITULOS_COLUNAS = new ArrayList<>();

    public String exportar(List<Produto> listaProdutos){
        String produto = "";
        produto += createTable();
        for (int i=0; i<listaProdutos.size(); i++){
            produto += abrirLinha();

            produto += geraColuna(String.valueOf(listaProdutos.get(i).getId()));
            produto += geraColuna(listaProdutos.get(i).getDescricao());
            produto += geraColuna(listaProdutos.get(i).getMarca());
            produto += geraColuna(listaProdutos.get(i).getModelo());
            produto += geraColuna(String.valueOf(listaProdutos.get(i).getEstoque()));
            produto += fecharLinha();
        }

        produto += fecharTabela();

        return produto;
    }

    public String createTable(){
        String produtoFormatado ="";

        produtoFormatado += abrirTabela();

        produtoFormatado += abrirLinha();
        for (int i=0; i<TITULOS_COLUNAS.size(); i++){
            produtoFormatado += geraColuna(String.valueOf(TITULOS_COLUNAS.get(i)));
        }
        produtoFormatado += fecharLinhaTitulos();

        return  produtoFormatado ;
    }

    public String geraColuna(String dados){
        String colunaLinha ="" ;

        colunaLinha += abrirColuna();
        colunaLinha += dados;
        colunaLinha +=fecharColuna();

//        System.out.println(colunaLinha);
        return colunaLinha;
    }

}
