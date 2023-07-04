package net.time4j.engine;

import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes5.dex */
public abstract class e<V extends Comparable<V>> implements p<V>, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(String str) {
        if (!str.trim().isEmpty()) {
            this.name = str;
            int hashCode = str.hashCode();
            this.hash = hashCode;
            if (!m()) {
                hashCode = -1;
            } else if (hashCode == -1) {
                hashCode = ~hashCode;
            }
            this.identity = hashCode;
            return;
        }
        throw new IllegalArgumentException("Element name is empty or contains only white space.");
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(o oVar, o oVar2) {
        return ((Comparable) oVar.l(this)).compareTo(oVar2.l(this));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e<?> eVar = (e) obj;
            int i11 = this.identity;
            if (i11 == eVar.identity) {
                if (i11 != -1) {
                    return true;
                }
                if (name().equals(eVar.name()) && g(eVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends q<T>> y<T, V> f(w<T> wVar) {
        return null;
    }

    protected boolean g(e<?> eVar) {
        return true;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    public final int hashCode() {
        return this.hash;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p<?> i() {
        return null;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j(w<?> wVar) {
        if (l() && net.time4j.base.f.class.isAssignableFrom(wVar.p())) {
            return "Accessing the local element [" + this.name + "] from a global type requires a timezone.\n- Try to apply a zonal query like \"" + this.name + ".atUTC()\".\n- Or try to first convert the global type to a zonal timestamp: \"moment.toZonalTimestamp(...)\".\n- If used in formatting then consider \"ChronoFormatter.withTimezone(TZID)\".";
        }
        return null;
    }

    public boolean l() {
        return true;
    }

    protected boolean m() {
        return false;
    }

    @Override // net.time4j.engine.p
    public final String name() {
        return this.name;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 32);
        sb2.append(name);
        sb2.append('@');
        sb2.append(this.name);
        return sb2.toString();
    }
}