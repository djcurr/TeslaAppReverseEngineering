package net.time4j.engine;

import java.util.Comparator;

/* loaded from: classes5.dex */
public interface p<V> extends Comparator<o> {
    V getDefaultMaximum();

    V getDefaultMinimum();

    char getSymbol();

    Class<V> getType();

    boolean isDateElement();

    boolean isLenient();

    boolean isTimeElement();

    String name();
}