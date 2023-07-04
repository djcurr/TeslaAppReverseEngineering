package net.time4j.calendar.service;

import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.o;
import net.time4j.engine.q;
import net.time4j.format.l;
import net.time4j.format.m;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;

/* loaded from: classes5.dex */
public class e<V extends Enum<V>, T extends q<T>> extends d<V, T> implements l<V>, t<V> {
    private static final long serialVersionUID = -2452569351302286113L;

    /* renamed from: c  reason: collision with root package name */
    private final transient Class<V> f40936c;

    /* renamed from: d  reason: collision with root package name */
    private final transient String f40937d;

    public e(String str, Class<T> cls, Class<V> cls2, char c11) {
        super(str, cls, c11, y(c11));
        this.f40936c = cls2;
        this.f40937d = q(cls);
    }

    private static String q(Class<?> cls) {
        net.time4j.format.c cVar = (net.time4j.format.c) cls.getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    private static boolean y(char c11) {
        return c11 == 'E';
    }

    @Override // net.time4j.format.t
    /* renamed from: A */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        net.time4j.engine.c<m> cVar = net.time4j.format.a.f41000h;
        m mVar = m.FORMAT;
        m mVar2 = (m) dVar.b(cVar, mVar);
        V v11 = (V) p(dVar, mVar2, false).d(charSequence, parsePosition, getType(), dVar);
        if (v11 == null && w()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            v11 = (V) p(dVar, mVar2, true).d(charSequence, parsePosition, getType(), dVar);
        }
        if (v11 == null && ((Boolean) dVar.b(net.time4j.format.a.f41003k, Boolean.TRUE)).booleanValue()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = m.STANDALONE;
            }
            V v12 = (V) p(dVar, mVar, false).d(charSequence, parsePosition, getType(), dVar);
            if (v12 == null && w()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                return (V) p(dVar, mVar, true).d(charSequence, parsePosition, getType(), dVar);
            }
            return v12;
        }
        return v11;
    }

    @Override // net.time4j.format.l
    /* renamed from: B */
    public int d(V v11, o oVar, net.time4j.engine.d dVar) {
        return z(v11);
    }

    @Override // net.time4j.engine.p
    public Class<V> getType() {
        return this.f40936c;
    }

    @Override // net.time4j.format.l
    public boolean n(q<?> qVar, int i11) {
        V[] enumConstants;
        for (V v11 : getType().getEnumConstants()) {
            if (z(v11) == i11) {
                qVar.z(this, v11);
                return true;
            }
        }
        return false;
    }

    protected s p(net.time4j.engine.d dVar, m mVar, boolean z11) {
        v vVar = (v) dVar.b(net.time4j.format.a.f40999g, v.WIDE);
        net.time4j.format.b c11 = net.time4j.format.b.c(r(dVar), (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT));
        if (w()) {
            if (z11) {
                return c11.g(vVar, mVar);
            }
            return c11.l(vVar, mVar);
        } else if (x()) {
            return c11.p(vVar, mVar);
        } else {
            if (v()) {
                return c11.b(vVar);
            }
            return c11.n(name(), this.f40936c, new String[0]);
        }
    }

    @Override // net.time4j.format.t
    public void print(o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(p(dVar, (m) dVar.b(net.time4j.format.a.f41000h, m.FORMAT), u(oVar)).g((Enum) oVar.l(this)));
    }

    protected String r(net.time4j.engine.d dVar) {
        if (w() || v()) {
            return (String) dVar.b(net.time4j.format.a.f40994b, this.f40937d);
        }
        return x() ? "iso8601" : this.f40937d;
    }

    @Override // net.time4j.engine.p
    /* renamed from: s */
    public V getDefaultMaximum() {
        V[] enumConstants = this.f40936c.getEnumConstants();
        return enumConstants[enumConstants.length - 1];
    }

    @Override // net.time4j.engine.p
    /* renamed from: t */
    public V getDefaultMinimum() {
        return this.f40936c.getEnumConstants()[0];
    }

    protected boolean u(o oVar) {
        return false;
    }

    protected boolean v() {
        return getSymbol() == 'G';
    }

    protected boolean w() {
        return getSymbol() == 'M';
    }

    protected boolean x() {
        return y(getSymbol());
    }

    public int z(V v11) {
        return v11.ordinal() + 1;
    }
}