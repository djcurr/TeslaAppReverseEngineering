package net.time4j.format.expert;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class r<V> implements h<V> {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f41207o = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<V> f41208a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41209b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41210c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41211d;

    /* renamed from: e  reason: collision with root package name */
    private final x f41212e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f41213f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f41214g;

    /* renamed from: h  reason: collision with root package name */
    private final net.time4j.format.g f41215h;

    /* renamed from: i  reason: collision with root package name */
    private final int f41216i;

    /* renamed from: j  reason: collision with root package name */
    private final char f41217j;

    /* renamed from: k  reason: collision with root package name */
    private final net.time4j.format.j f41218k;

    /* renamed from: l  reason: collision with root package name */
    private final int f41219l;

    /* renamed from: m  reason: collision with root package name */
    private final int f41220m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f41221n;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41222a;

        static {
            int[] iArr = new int[x.values().length];
            f41222a = iArr;
            try {
                iArr[x.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41222a[x.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12) {
        this(pVar, z11, i11, i12, xVar, z12, 0, '0', net.time4j.format.j.ARABIC, net.time4j.format.g.SMART, 0, false);
    }

    private static void a(int i11, Appendable appendable, char c11) {
        int i12 = (i11 * 103) >>> 10;
        appendable.append((char) (i12 + c11));
        appendable.append((char) ((i11 - ((i12 << 3) + (i12 << 1))) + c11));
    }

    private int b(net.time4j.format.j jVar) {
        if (jVar.isDecimal()) {
            Class<V> type = this.f41208a.getType();
            if (type == Integer.class) {
                return 10;
            }
            return type == Long.class ? 18 : 9;
        }
        return 100;
    }

    private static int c(int i11) {
        int i12 = 0;
        while (i11 > f41207o[i12]) {
            i12++;
        }
        return i12 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f41208a.equals(rVar.f41208a) && this.f41209b == rVar.f41209b && this.f41210c == rVar.f41210c && this.f41211d == rVar.f41211d && this.f41212e == rVar.f41212e && this.f41213f == rVar.f41213f;
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f41208a;
    }

    public int hashCode() {
        return (this.f41208a.hashCode() * 7) + ((this.f41210c + (this.f41211d * 10)) * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036e  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r24, net.time4j.format.expert.s r25, net.time4j.engine.d r26, net.time4j.format.expert.t<?> r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.r.parse(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e7 A[ADDED_TO_REGION] */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int print(net.time4j.engine.o r23, java.lang.Appendable r24, net.time4j.engine.d r25, java.util.Set<net.time4j.format.expert.g> r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.r.print(net.time4j.engine.o, java.lang.Appendable, net.time4j.engine.d, java.util.Set, boolean):int");
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        char c11;
        char charAt;
        net.time4j.engine.c<net.time4j.format.j> cVar2 = net.time4j.format.a.f41004l;
        net.time4j.format.j jVar = net.time4j.format.j.ARABIC;
        net.time4j.format.j jVar2 = (net.time4j.format.j) dVar.b(cVar2, jVar);
        net.time4j.engine.c<Character> cVar3 = net.time4j.format.a.f41005m;
        if (dVar.c(cVar3)) {
            charAt = ((Character) dVar.a(cVar3)).charValue();
        } else if (!jVar2.isDecimal()) {
            c11 = '0';
            int intValue = ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue();
            return new r(this.f41208a, this.f41209b, this.f41210c, this.f41211d, this.f41212e, this.f41213f, i11, c11, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART), intValue, jVar2 != jVar && c11 == '0' && this.f41209b && intValue == 0 && this.f41208a.getType() == Integer.class && !this.f41214g);
        } else {
            charAt = jVar2.getDigits().charAt(0);
        }
        c11 = charAt;
        int intValue2 = ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue();
        return new r(this.f41208a, this.f41209b, this.f41210c, this.f41211d, this.f41212e, this.f41213f, i11, c11, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART), intValue2, jVar2 != jVar && c11 == '0' && this.f41209b && intValue2 == 0 && this.f41208a.getType() == Integer.class && !this.f41214g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(r.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41208a.name());
        sb2.append(", fixed-width-mode=");
        sb2.append(this.f41209b);
        sb2.append(", min-digits=");
        sb2.append(this.f41210c);
        sb2.append(", max-digits=");
        sb2.append(this.f41211d);
        sb2.append(", sign-policy=");
        sb2.append(this.f41212e);
        sb2.append(", protected-mode=");
        sb2.append(this.f41213f);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return (this.f41213f || this.f41208a == pVar) ? this : new r(pVar, this.f41209b, this.f41210c, this.f41211d, this.f41212e, false);
    }

    private r(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12, int i13, char c11, net.time4j.format.j jVar, net.time4j.format.g gVar, int i14, boolean z13) {
        this.f41208a = pVar;
        this.f41209b = z11;
        this.f41210c = i11;
        this.f41211d = i12;
        this.f41212e = xVar;
        this.f41213f = z12;
        this.f41221n = z13;
        Objects.requireNonNull(pVar, "Missing element.");
        Objects.requireNonNull(xVar, "Missing sign policy.");
        if (i11 < 1) {
            throw new IllegalArgumentException("Not positive: " + i11);
        } else if (i11 > i12) {
            throw new IllegalArgumentException("Max smaller than min: " + i12 + " < " + i11);
        } else if (z11 && i11 != i12) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i12 + " != " + i11);
        } else if (z11 && xVar != x.SHOW_NEVER) {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        } else {
            int b11 = b(jVar);
            if (jVar.isDecimal()) {
                if (i11 > b11) {
                    throw new IllegalArgumentException("Min digits out of range: " + i11);
                } else if (i12 > b11) {
                    throw new IllegalArgumentException("Max digits out of range: " + i12);
                }
            }
            this.f41214g = pVar.name().equals("YEAR_OF_ERA");
            this.f41216i = i13;
            this.f41217j = c11;
            this.f41218k = jVar;
            this.f41215h = gVar;
            this.f41219l = i14;
            this.f41220m = b11;
        }
    }
}