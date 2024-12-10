package com.quest.geneics;

public class QuestList<T> {
    private T t;

    public QuestList(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
