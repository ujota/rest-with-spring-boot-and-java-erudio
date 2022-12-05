package br.com.erudio;

public class Greeting {

    private final long id;
    private  final String contente;

    public Greeting(long id, String content) {
        this.id = id;
        this.contente = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return contente;
    }
}
