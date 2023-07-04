package net.time4j.format.expert;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public interface h<V> {
    net.time4j.engine.p<V> getElement();

    boolean isNumerical();

    void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11);

    int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11);

    h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11);

    h<V> withElement(net.time4j.engine.p<V> pVar);
}