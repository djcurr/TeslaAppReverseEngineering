package net.time4j.format.expert;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class o<V> implements h<V> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<V> f41200a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<V, String> f41201b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41202c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f41203d;

    /* renamed from: e  reason: collision with root package name */
    private final Locale f41204e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(net.time4j.engine.p<V> pVar, Map<V, String> map) {
        Map hashMap;
        Class<V> type = pVar.getType();
        if (type.isEnum()) {
            if (map.size() >= type.getEnumConstants().length) {
                hashMap = a(type);
            } else {
                throw new IllegalArgumentException("Not enough text resources defined for enum: " + type.getName());
            }
        } else {
            hashMap = new HashMap(map.size());
        }
        hashMap.putAll(map);
        this.f41200a = pVar;
        this.f41201b = Collections.unmodifiableMap(hashMap);
        this.f41202c = 0;
        this.f41203d = true;
        this.f41204e = Locale.getDefault();
    }

    private static <V, K extends Enum<K>> Map<V, String> a(Class<V> cls) {
        return new EnumMap(cls);
    }

    private String b(V v11) {
        String str = this.f41201b.get(v11);
        return str == null ? v11.toString() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int c(net.time4j.engine.o oVar, Appendable appendable) {
        String b11 = b(oVar.l(this.f41200a));
        appendable.append(b11);
        return b11.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f41200a.equals(oVar.f41200a) && this.f41201b.equals(oVar.f41201b);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f41200a;
    }

    public int hashCode() {
        return (this.f41200a.hashCode() * 7) + (this.f41201b.hashCode() * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        boolean booleanValue;
        int f11 = sVar.f();
        int length = charSequence.length();
        int intValue = z11 ? this.f41202c : ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f11 >= length) {
            sVar.k(f11, "Missing chars for: " + this.f41200a.name());
            sVar.n();
            return;
        }
        if (z11) {
            booleanValue = this.f41203d;
        } else {
            booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue();
        }
        Locale locale = z11 ? this.f41204e : (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.getDefault());
        int i11 = length - f11;
        for (V v11 : this.f41201b.keySet()) {
            String b11 = b(v11);
            if (booleanValue) {
                String upperCase = b11.toUpperCase(locale);
                int length2 = b11.length();
                if (length2 <= i11) {
                    int i12 = length2 + f11;
                    if (upperCase.equals(charSequence.subSequence(f11, i12).toString().toUpperCase(locale))) {
                        tVar.E(this.f41200a, v11);
                        sVar.l(i12);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = b11.length();
                if (length3 <= i11) {
                    int i13 = length3 + f11;
                    if (b11.equals(charSequence.subSequence(f11, i13).toString())) {
                        tVar.E(this.f41200a, v11);
                        sVar.l(i13);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        sVar.k(f11, "Element value could not be parsed: " + this.f41200a.name());
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            int length = charSequence.length();
            int c11 = c(oVar, appendable);
            if (set != null) {
                set.add(new g(this.f41200a, length, charSequence.length()));
            }
            return c11;
        }
        return c(oVar, appendable);
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new o(this.f41200a, this.f41201b, ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue(), ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.getDefault()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(o.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41200a.name());
        sb2.append(", resources=");
        sb2.append(this.f41201b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return this.f41200a == pVar ? this : new o(pVar, this.f41201b);
    }

    private o(net.time4j.engine.p<V> pVar, Map<V, String> map, int i11, boolean z11, Locale locale) {
        this.f41200a = pVar;
        this.f41201b = map;
        this.f41202c = i11;
        this.f41203d = z11;
        this.f41204e = locale;
    }
}