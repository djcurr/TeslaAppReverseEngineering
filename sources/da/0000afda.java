package r10;

import kotlin.reflect.jvm.internal.impl.protobuf.i;
import p10.c;
import p10.k;
import p10.x;

/* loaded from: classes5.dex */
public class b {
    public static final C1069b A;
    public static final C1069b B;
    public static final C1069b C;
    public static final C1069b D;
    public static final C1069b E;
    public static final C1069b F;
    public static final C1069b G;
    public static final C1069b H;
    public static final C1069b I;
    public static final C1069b J;
    public static final C1069b K;
    public static final C1069b L;
    public static final C1069b M;
    public static final C1069b N;

    /* renamed from: a  reason: collision with root package name */
    public static final C1069b f49030a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1069b f49031b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1069b f49032c;

    /* renamed from: d  reason: collision with root package name */
    public static final d<x> f49033d;

    /* renamed from: e  reason: collision with root package name */
    public static final d<k> f49034e;

    /* renamed from: f  reason: collision with root package name */
    public static final d<c.EnumC0974c> f49035f;

    /* renamed from: g  reason: collision with root package name */
    public static final C1069b f49036g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1069b f49037h;

    /* renamed from: i  reason: collision with root package name */
    public static final C1069b f49038i;

    /* renamed from: j  reason: collision with root package name */
    public static final C1069b f49039j;

    /* renamed from: k  reason: collision with root package name */
    public static final C1069b f49040k;

    /* renamed from: l  reason: collision with root package name */
    public static final C1069b f49041l;

    /* renamed from: m  reason: collision with root package name */
    public static final C1069b f49042m;

    /* renamed from: n  reason: collision with root package name */
    public static final C1069b f49043n;

    /* renamed from: o  reason: collision with root package name */
    public static final d<p10.j> f49044o;

    /* renamed from: p  reason: collision with root package name */
    public static final C1069b f49045p;

    /* renamed from: q  reason: collision with root package name */
    public static final C1069b f49046q;

    /* renamed from: r  reason: collision with root package name */
    public static final C1069b f49047r;

    /* renamed from: s  reason: collision with root package name */
    public static final C1069b f49048s;

    /* renamed from: t  reason: collision with root package name */
    public static final C1069b f49049t;

    /* renamed from: u  reason: collision with root package name */
    public static final C1069b f49050u;

    /* renamed from: v  reason: collision with root package name */
    public static final C1069b f49051v;

    /* renamed from: w  reason: collision with root package name */
    public static final C1069b f49052w;

    /* renamed from: x  reason: collision with root package name */
    public static final C1069b f49053x;

    /* renamed from: y  reason: collision with root package name */
    public static final C1069b f49054y;

    /* renamed from: z  reason: collision with root package name */
    public static final C1069b f49055z;

    /* renamed from: r10.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1069b extends d<Boolean> {
        public C1069b(int i11) {
            super(i11, 1);
        }

        private static /* synthetic */ void f(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // r10.b.d
        /* renamed from: g */
        public Boolean d(int i11) {
            Boolean valueOf = Boolean.valueOf((i11 & (1 << this.f49057a)) != 0);
            if (valueOf == null) {
                f(0);
            }
            return valueOf;
        }

        @Override // r10.b.d
        /* renamed from: h */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f49057a;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c<E extends i.a> extends d<E> {

        /* renamed from: c  reason: collision with root package name */
        private final E[] f49056c;

        public c(int i11, E[] eArr) {
            super(i11, g(eArr));
            this.f49056c = eArr;
        }

        private static /* synthetic */ void f(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i11 = 31; i11 >= 0; i11--) {
                if (((1 << i11) & length) != 0) {
                    return i11 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // r10.b.d
        /* renamed from: h */
        public E d(int i11) {
            E[] eArr;
            int i12 = this.f49057a;
            int i13 = (i11 & (((1 << this.f49058b) - 1) << i12)) >> i12;
            for (E e11 : this.f49056c) {
                if (e11.getNumber() == i13) {
                    return e11;
                }
            }
            return null;
        }

        @Override // r10.b.d
        /* renamed from: i */
        public int e(E e11) {
            return e11.getNumber() << this.f49057a;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class d<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f49057a;

        /* renamed from: b  reason: collision with root package name */
        public final int f49058b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lr10/b$d<*>;[TE;)Lr10/b$d<TE;>; */
        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.f49057a + dVar.f49058b, aVarArr);
        }

        public static C1069b b(d<?> dVar) {
            return new C1069b(dVar.f49057a + dVar.f49058b);
        }

        public static C1069b c() {
            return new C1069b(0);
        }

        public abstract E d(int i11);

        public abstract int e(E e11);

        private d(int i11, int i12) {
            this.f49057a = i11;
            this.f49058b = i12;
        }
    }

    static {
        C1069b c11 = d.c();
        f49030a = c11;
        f49031b = d.b(c11);
        C1069b c12 = d.c();
        f49032c = c12;
        d<x> a11 = d.a(c12, x.values());
        f49033d = a11;
        d<k> a12 = d.a(a11, k.values());
        f49034e = a12;
        d<c.EnumC0974c> a13 = d.a(a12, c.EnumC0974c.values());
        f49035f = a13;
        C1069b b11 = d.b(a13);
        f49036g = b11;
        C1069b b12 = d.b(b11);
        f49037h = b12;
        C1069b b13 = d.b(b12);
        f49038i = b13;
        C1069b b14 = d.b(b13);
        f49039j = b14;
        C1069b b15 = d.b(b14);
        f49040k = b15;
        f49041l = d.b(b15);
        C1069b b16 = d.b(a11);
        f49042m = b16;
        f49043n = d.b(b16);
        d<p10.j> a14 = d.a(a12, p10.j.values());
        f49044o = a14;
        C1069b b17 = d.b(a14);
        f49045p = b17;
        C1069b b18 = d.b(b17);
        f49046q = b18;
        C1069b b19 = d.b(b18);
        f49047r = b19;
        C1069b b21 = d.b(b19);
        f49048s = b21;
        C1069b b22 = d.b(b21);
        f49049t = b22;
        C1069b b23 = d.b(b22);
        f49050u = b23;
        C1069b b24 = d.b(b23);
        f49051v = b24;
        f49052w = d.b(b24);
        C1069b b25 = d.b(a14);
        f49053x = b25;
        C1069b b26 = d.b(b25);
        f49054y = b26;
        C1069b b27 = d.b(b26);
        f49055z = b27;
        C1069b b28 = d.b(b27);
        A = b28;
        C1069b b29 = d.b(b28);
        B = b29;
        C1069b b31 = d.b(b29);
        C = b31;
        C1069b b32 = d.b(b31);
        D = b32;
        C1069b b33 = d.b(b32);
        E = b33;
        F = d.b(b33);
        C1069b b34 = d.b(c12);
        G = b34;
        C1069b b35 = d.b(b34);
        H = b35;
        I = d.b(b35);
        C1069b b36 = d.b(a12);
        J = b36;
        C1069b b37 = d.b(b36);
        K = b37;
        L = d.b(b37);
        C1069b c13 = d.c();
        M = c13;
        d.b(c13);
        N = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.b.a(int):void");
    }

    public static int b(boolean z11, x xVar, k kVar, boolean z12, boolean z13, boolean z14) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f49032c.e(Boolean.valueOf(z11)) | f49034e.e(kVar) | f49033d.e(xVar) | J.e(Boolean.valueOf(z12)) | K.e(Boolean.valueOf(z13)) | L.e(Boolean.valueOf(z14));
    }
}