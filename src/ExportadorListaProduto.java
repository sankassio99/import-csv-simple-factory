import java.util.List;

public interface ExportadorListaProduto {

    public String abrirTabela();
    public String fecharTabela();

    public String abrirLinha();
    public String fecharLinha();
    public String abreLinhaTitulos();
    public String fecharLinhaTitulos();
    public String abrirColuna();
    public String fecharColuna();
    public String exportar(List<Produto> listaProdutos);
    public ExportadorListaProduto newInstance();
    public ExportadorListaProduto newInstance(String extensaoArquivoExportacao);

}
