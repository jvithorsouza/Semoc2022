package br.jv.semoc2022;

public class Atividade {
    private String title;

    private String descricao;
    private boolean expanded;

    public Atividade(String title, String descricao) {
        this.title = title;

        this.descricao = descricao;
        this.expanded = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "title='" + title + '\'' +
                ", plot='" + descricao + '\'' +
                ", expanded=" + expanded +
                '}';
    }
}

