package net.time4j;

import java.io.InvalidObjectException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q<V extends Enum<V>> extends a<V> implements d0<V>, net.time4j.format.l<V>, k30.e<V> {
    private static final long serialVersionUID = 2055272540517425102L;

    /* renamed from: b  reason: collision with root package name */
    private final transient Class<V> f41493b;

    /* renamed from: c  reason: collision with root package name */
    private final transient V f41494c;

    /* renamed from: d  reason: collision with root package name */
    private final transient V f41495d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f41496e;

    /* renamed from: f  reason: collision with root package name */
    private final transient char f41497f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, Class<V> cls, V v11, V v12, int i11, char c11) {
        super(str);
        this.f41493b = cls;
        this.f41494c = v11;
        this.f41495d = v12;
        this.f41496e = i11;
        this.f41497f = c11;
    }

    private net.time4j.format.s p(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        switch (this.f41496e) {
            case 101:
                return net.time4j.format.b.d(locale).l(vVar, mVar);
            case 102:
                return net.time4j.format.b.d(locale).p(vVar, mVar);
            case 103:
                return net.time4j.format.b.d(locale).k(vVar, mVar);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    private Object readResolve() {
        Object L0 = g0.L0(name());
        if (L0 != null) {
            return L0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f41497f;
    }

    @Override // net.time4j.engine.p
    public Class<V> getType() {
        return this.f41493b;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.format.l
    public boolean n(net.time4j.engine.q<?> qVar, int i11) {
        V[] enumConstants;
        for (V v11 : getType().getEnumConstants()) {
            if (t(v11) == i11) {
                qVar.z(this, v11);
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(p((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), (net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT)).g((Enum) oVar.l(this)));
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public V getDefaultMaximum() {
        return this.f41495d;
    }

    @Override // net.time4j.engine.p
    /* renamed from: r */
    public V getDefaultMinimum() {
        return this.f41494c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f41496e;
    }

    public int t(V v11) {
        return v11.ordinal() + 1;
    }

    @Override // k30.e
    /* renamed from: u */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        int index = parsePosition.getIndex();
        V v11 = (V) p(locale, vVar, mVar).e(charSequence, parsePosition, getType(), gVar);
        if (v11 != null || gVar.isStrict()) {
            return v11;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        net.time4j.format.m mVar2 = net.time4j.format.m.FORMAT;
        if (mVar == mVar2) {
            mVar2 = net.time4j.format.m.STANDALONE;
        }
        return (V) p(locale, vVar, mVar2).e(charSequence, parsePosition, getType(), gVar);
    }

    @Override // net.time4j.format.t
    /* renamed from: v */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
        net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
        net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f41000h;
        net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
        net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
        V v11 = (V) p(locale, vVar, mVar2).d(charSequence, parsePosition, getType(), dVar);
        if (v11 == null && ((Boolean) dVar.b(net.time4j.format.a.f41003k, Boolean.TRUE)).booleanValue()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return (V) p(locale, vVar, mVar).d(charSequence, parsePosition, getType(), dVar);
        }
        return v11;
    }

    @Override // net.time4j.format.l
    /* renamed from: w */
    public int d(V v11, net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        return v11.ordinal() + 1;
    }

    @Override // k30.e
    public void print(net.time4j.engine.o oVar, Appendable appendable, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        appendable.append(p(locale, vVar, mVar).g((Enum) oVar.l(this)));
    }
}