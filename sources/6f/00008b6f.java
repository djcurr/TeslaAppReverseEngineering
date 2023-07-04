package net.time4j.format.expert;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y implements h<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final int f41245a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.n<Character> f41246b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(net.time4j.engine.n<Character> nVar, int i11) {
        Objects.requireNonNull(nVar, "Missing condition for unparseable chars.");
        if (i11 >= 1) {
            this.f41246b = nVar;
            this.f41245a = i11;
            return;
        }
        throw new IllegalArgumentException("Must be positive: " + i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f41245a == yVar.f41245a) {
                net.time4j.engine.n<Character> nVar = this.f41246b;
                net.time4j.engine.n<Character> nVar2 = yVar.f41246b;
                if (nVar == null) {
                    if (nVar2 == null) {
                        return true;
                    }
                } else if (nVar.equals(nVar2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Void> getElement() {
        return null;
    }

    public int hashCode() {
        net.time4j.engine.n<Character> nVar = this.f41246b;
        if (nVar == null) {
            return this.f41245a;
        }
        return nVar.hashCode() ^ (~this.f41245a);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int i11;
        int i12;
        int f11 = sVar.f();
        int length = charSequence.length();
        if (this.f41246b == null) {
            i11 = length - this.f41245a;
        } else {
            int i13 = f11;
            for (int i14 = 0; i14 < this.f41245a && (i12 = i14 + f11) < length && this.f41246b.test(Character.valueOf(charSequence.charAt(i12))); i14++) {
                i13++;
            }
            i11 = i13;
        }
        int min = Math.min(Math.max(i11, 0), length);
        if (min > f11) {
            sVar.l(min);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        return 0;
    }

    @Override // net.time4j.format.expert.h
    public h<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(y.class.getName());
        if (this.f41246b == null) {
            sb2.append("[keepRemainingChars=");
            sb2.append(this.f41245a);
        } else {
            sb2.append("[condition=");
            sb2.append(this.f41246b);
            sb2.append(", maxIterations=");
            sb2.append(this.f41245a);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> withElement(net.time4j.engine.p<Void> pVar) {
        return this;
    }
}