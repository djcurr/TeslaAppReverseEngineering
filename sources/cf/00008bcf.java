package net.time4j.history;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;
import net.time4j.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k extends net.time4j.format.d<j> implements t<j> {

    /* renamed from: b  reason: collision with root package name */
    private static final Locale f41405b = new Locale("la");
    private static final long serialVersionUID = 5200533417265981438L;
    private final d history;

    /* loaded from: classes5.dex */
    private static class a<C extends q<C>> implements y<C, j> {

        /* renamed from: a  reason: collision with root package name */
        private final d f41406a;

        a(d dVar) {
            this.f41406a = dVar;
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public j getMaximum(C c11) {
            j value = getValue(c11);
            return value == j.BC ? j.AD : value;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public j getMinimum(C c11) {
            j value = getValue(c11);
            return value == j.AD ? j.BC : value;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public j getValue(C c11) {
            try {
                return this.f41406a.e((g0) c11.l(g0.f41293o)).c();
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(C c11, j jVar) {
            if (jVar == null) {
                return false;
            }
            try {
                return this.f41406a.e((g0) c11.l(g0.f41293o)).c() == jVar;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public C withValue(C c11, j jVar, boolean z11) {
            if (jVar != null) {
                if (this.f41406a.e((g0) c11.l(g0.f41293o)).c() == jVar) {
                    return c11;
                }
                throw new IllegalArgumentException(jVar.name());
            }
            throw new IllegalArgumentException("Missing era value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(d dVar) {
        super("ERA");
        this.history = dVar;
    }

    private s o(net.time4j.engine.d dVar) {
        net.time4j.engine.c<v> cVar = net.time4j.format.a.f40999g;
        v vVar = v.WIDE;
        v vVar2 = (v) dVar.b(cVar, vVar);
        net.time4j.engine.c<Boolean> cVar2 = l30.a.f36569c;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) dVar.b(cVar2, bool)).booleanValue()) {
            net.time4j.format.b c11 = net.time4j.format.b.c("historic", f41405b);
            String[] strArr = new String[1];
            strArr[0] = vVar2 != vVar ? "a" : "w";
            return c11.o(this, strArr);
        }
        net.time4j.format.b d11 = net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT));
        if (((Boolean) dVar.b(l30.a.f36568b, bool)).booleanValue()) {
            String[] strArr2 = new String[2];
            strArr2[0] = vVar2 != vVar ? "a" : "w";
            strArr2[1] = "alt";
            return d11.o(this, strArr2);
        }
        return d11.b(vVar2);
    }

    private Object readResolve() {
        return this.history.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.e
    public <T extends q<T>> y<T, j> f(w<T> wVar) {
        if (wVar.v(g0.f41293o)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e
    protected boolean g(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((k) eVar).history);
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'G';
    }

    @Override // net.time4j.engine.p
    public Class<j> getType() {
        return j.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public j getDefaultMaximum() {
        return j.AD;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(o(dVar).g((Enum) oVar.l(this)));
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public j getDefaultMinimum() {
        return j.BC;
    }

    @Override // net.time4j.format.t
    /* renamed from: r */
    public j parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return (j) o(dVar).d(charSequence, parsePosition, getType(), dVar);
    }
}