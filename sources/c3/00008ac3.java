package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.t;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
class e implements t<c>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final e f40882a = new e();
    private static final long serialVersionUID = -4211396220263977858L;

    e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((c) oVar.l(this)).compareTo((n) oVar2.l(this));
    }

    @Override // net.time4j.engine.p
    /* renamed from: b */
    public c getDefaultMaximum() {
        return c.q(60);
    }

    @Override // net.time4j.engine.p
    /* renamed from: c */
    public c getDefaultMinimum() {
        return c.q(1);
    }

    @Override // net.time4j.format.t
    /* renamed from: f */
    public c parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return c.r(charSequence, parsePosition, (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), !((net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART)).isStrict());
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return Matrix.MATRIX_TYPE_RANDOM_UT;
    }

    @Override // net.time4j.engine.p
    public Class<c> getType() {
        return c.class;
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
        return "CYCLIC_YEAR";
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(((c) oVar.l(this)).g((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT)));
    }

    protected Object readResolve() {
        return f40882a;
    }
}