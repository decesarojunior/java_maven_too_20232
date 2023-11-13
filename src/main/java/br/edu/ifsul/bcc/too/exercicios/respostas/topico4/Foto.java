
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

/**
 *
 * @author telmo
 */
public class Foto {
    
    private Integer codigo;
    private String filename;
    private String path;
    private Byte[] file;
    //private String base64;
    private Produto produto;

    public Foto() {
    }

    public Foto(Integer codigo, String filename, String path, Byte[] file, Produto produto) {
        this.codigo = codigo;
        this.filename = filename;
        this.path = path;
        this.file = file;
        this.produto = produto;
    }



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Byte[] getFile() {
        return file;
    }

    public void setFile(Byte[] file) {
        this.file = file;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
