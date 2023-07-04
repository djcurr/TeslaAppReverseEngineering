package net.time4j.format;

import java.text.ParsePosition;

/* loaded from: classes5.dex */
public interface t<V> extends net.time4j.engine.p<V> {
    V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar);

    void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar);
}