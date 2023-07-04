package net.time4j.calendar;

import java.io.Serializable;
import java.util.Locale;
import net.time4j.c0;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;

/* loaded from: classes5.dex */
class g implements t<h>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final g f40895a = new g();
    private static final long serialVersionUID = -5874268477318061153L;

    g() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((h) oVar.l(this)).compareTo((h) oVar2.l(this));
    }

    @Override // net.time4j.engine.p
    /* renamed from: b */
    public h getDefaultMaximum() {
        return h.d(12);
    }

    @Override // net.time4j.engine.p
    /* renamed from: c */
    public h getDefaultMinimum() {
        return h.d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    @Override // net.time4j.format.t
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public net.time4j.calendar.h parse(java.lang.CharSequence r19, java.text.ParsePosition r20, net.time4j.engine.d r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.g.parse(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d):net.time4j.calendar.h");
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return 'M';
    }

    @Override // net.time4j.engine.p
    public Class<h> getType() {
        return h.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "MONTH_OF_YEAR";
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        s l11;
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
        h hVar = (h) oVar.l(this);
        if (dVar.c(k30.a.f34354c1)) {
            appendable.append(hVar.b(locale, (net.time4j.format.j) dVar.b(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC), dVar));
            return;
        }
        v vVar = (v) dVar.b(net.time4j.format.a.f40999g, v.WIDE);
        net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT);
        if (hVar.c()) {
            l11 = net.time4j.format.b.c("chinese", locale).g(vVar, mVar);
        } else {
            l11 = net.time4j.format.b.c("chinese", locale).l(vVar, mVar);
        }
        appendable.append(l11.g(c0.valueOf(hVar.getNumber())));
    }

    protected Object readResolve() {
        return f40895a;
    }
}