package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class Converter<E> {
    Converter<E> next;

    public abstract String convert(E e11);

    public final Converter<E> getNext() {
        return this.next;
    }

    public final void setNext(Converter<E> converter) {
        if (this.next != null) {
            throw new IllegalStateException("Next converter has been already set");
        }
        this.next = converter;
    }

    public void write(StringBuilder sb2, E e11) {
        sb2.append(convert(e11));
    }
}