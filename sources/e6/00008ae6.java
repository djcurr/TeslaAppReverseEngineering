package net.time4j.calendar.service;

import java.io.InvalidObjectException;
import java.lang.Comparable;
import net.time4j.calendar.p;
import net.time4j.engine.q;
import net.time4j.engine.w;

/* loaded from: classes5.dex */
public abstract class d<V extends Comparable<V>, T extends q<T>> extends net.time4j.format.d<V> implements p<V, T> {

    /* renamed from: b  reason: collision with root package name */
    private final transient char f40935b;
    private final Class<T> chrono;

    public d(String str, Class<T> cls, char c11, boolean z11) {
        super(str);
        this.chrono = cls;
        this.f40935b = c11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.e
    public boolean g(net.time4j.engine.e<?> eVar) {
        return this.chrono == ((d) eVar).chrono;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f40935b;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Class<T> o() {
        return this.chrono;
    }

    protected Object readResolve() {
        String name = name();
        for (net.time4j.engine.p<?> pVar : w.x(this.chrono).t()) {
            if (pVar.name().equals(name)) {
                return pVar;
            }
        }
        throw new InvalidObjectException(name);
    }
}