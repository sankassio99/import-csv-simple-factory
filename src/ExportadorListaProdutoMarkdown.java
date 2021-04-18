

class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto{

    public ExportadorListaProdutoMarkdown() {
        TITULOS_COLUNAS.add("id");
        TITULOS_COLUNAS.add("descrição");
        TITULOS_COLUNAS.add("marca");
        TITULOS_COLUNAS.add("modelo");
        TITULOS_COLUNAS.add("estoque");
    }

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "|";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abreLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "\n |---|---|---|---|---| \n";
    }

    @Override
    public String abrirColuna() {
        return "";
    }

    @Override
    public String fecharColuna() {
        return "|";
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
