

class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto {

    public ExportadorListaProdutoHtml() {
        TITULOS_COLUNAS.add("id");
        TITULOS_COLUNAS.add("descrição");
        TITULOS_COLUNAS.add("marca");
        TITULOS_COLUNAS.add("modelo");
        TITULOS_COLUNAS.add("estoque");

    }

    @Override
    public String abrirTabela() {
        return "<table border=1>";
    }

    @Override
    public String fecharTabela() {
        return "</table>";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</tr>";
    }

    @Override
    public String abreLinhaTitulos() {
        return "<th>";
    }

    @Override
    public String abrirColuna() {
        return "<td>";
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }

    @Override
    public ExportadorListaProduto newInstance() {
        return null;
    }

    @Override
    public ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
        return null;
    }

}
