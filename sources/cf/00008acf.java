package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.t;
import net.time4j.format.v;
import net.time4j.g0;

/* loaded from: classes5.dex */
public enum k implements net.time4j.engine.i {
    DANGI;
    
    private final transient net.time4j.engine.p<k> eraElement = new b();
    private final transient net.time4j.engine.p<Integer> yearOfEraElement = new e();

    /* loaded from: classes5.dex */
    private static class b extends net.time4j.format.d<k> implements t<k> {
        private static final long serialVersionUID = -5179188137244162427L;

        private Object readResolve() {
            return k.DANGI.era();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <T extends net.time4j.engine.q<T>> y<T, k> f(w<T> wVar) {
            if (wVar.v(g0.f41293o)) {
                return new c();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.p
        public Class<k> getType() {
            return k.class;
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

        @Override // net.time4j.engine.p
        /* renamed from: o */
        public k getDefaultMaximum() {
            return k.DANGI;
        }

        @Override // net.time4j.engine.p
        /* renamed from: p */
        public k getDefaultMinimum() {
            return k.DANGI;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
            appendable.append(k.DANGI.getDisplayName((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), (v) dVar.b(net.time4j.format.a.f40999g, v.WIDE)));
        }

        @Override // net.time4j.format.t
        /* renamed from: q */
        public k parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
            boolean booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f41002j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            k kVar = k.DANGI;
            String displayName = kVar.getDisplayName(locale, (v) dVar.b(net.time4j.format.a.f40999g, v.WIDE));
            int max = Math.max(Math.min(displayName.length() + index, charSequence.length()), index);
            if (max > index) {
                String charSequence2 = charSequence.subSequence(index, max).toString();
                if (booleanValue) {
                    displayName = displayName.toLowerCase(locale);
                    charSequence2 = charSequence2.toLowerCase(locale);
                }
                if (displayName.equals(charSequence2) || (booleanValue2 && displayName.startsWith(charSequence2))) {
                    parsePosition.setIndex(max);
                    return kVar;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        private b() {
            super("ERA");
        }
    }

    /* loaded from: classes5.dex */
    private static class c implements y<net.time4j.engine.q<?>, k> {
        private c() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public k getMaximum(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public k getMinimum(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public k getValue(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(net.time4j.engine.q<?> qVar, k kVar) {
            return kVar == k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, k kVar, boolean z11) {
            if (isValid(qVar, kVar)) {
                return qVar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + kVar);
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements y<net.time4j.engine.q<?>, Integer> {
        private d() {
        }

        private int e(net.time4j.engine.q<?> qVar) {
            return ((g0) qVar.l(g0.f41293o)).getYear() + 2333;
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Integer getMaximum(net.time4j.engine.q<?> qVar) {
            return 1000002332;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMinimum(net.time4j.engine.q<?> qVar) {
            return -999997666;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getValue(net.time4j.engine.q<?> qVar) {
            return Integer.valueOf(e(qVar));
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(net.time4j.engine.q<?> qVar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= getMinimum(qVar).intValue() && num.intValue() <= getMaximum(qVar).intValue();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
        @Override // net.time4j.engine.y
        /* renamed from: j */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, Integer num, boolean z11) {
            if (num != null) {
                if (isValid(qVar, num)) {
                    int e11 = e(qVar);
                    net.time4j.e eVar = g0.f41293o;
                    return qVar.z(eVar, (g0) ((g0) qVar.l(eVar)).G(num.intValue() - e11, net.time4j.f.YEARS));
                }
                throw new IllegalArgumentException("Invalid year of era: " + num);
            }
            throw new IllegalArgumentException("Missing year of era.");
        }
    }

    /* loaded from: classes5.dex */
    private static class e extends net.time4j.format.d<Integer> {
        private static final long serialVersionUID = -7864513245908399367L;

        private Object readResolve() {
            return k.DANGI.yearOfEra();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <T extends net.time4j.engine.q<T>> y<T, Integer> f(w<T> wVar) {
            if (wVar.v(g0.f41293o)) {
                return new d();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'y';
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
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

        @Override // net.time4j.engine.p
        /* renamed from: o */
        public Integer getDefaultMaximum() {
            return 5332;
        }

        @Override // net.time4j.engine.p
        /* renamed from: p */
        public Integer getDefaultMinimum() {
            return 3978;
        }

        private e() {
            super("YEAR_OF_ERA");
        }
    }

    k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.engine.p<k> era() {
        return this.eraElement;
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, v.WIDE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.engine.p<Integer> yearOfEra() {
        return this.yearOfEraElement;
    }

    public String getDisplayName(Locale locale, v vVar) {
        return net.time4j.format.b.c("dangi", locale).b(vVar).g(this);
    }
}