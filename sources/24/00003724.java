package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.common.base.e f15939a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15940b;

    /* renamed from: c  reason: collision with root package name */
    private final f f15941c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15942d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.base.e f15943a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.base.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0290a extends e {
            C0290a(x xVar, CharSequence charSequence) {
                super(xVar, charSequence);
            }

            @Override // com.google.common.base.x.e
            int e(int i11) {
                return i11 + 1;
            }

            @Override // com.google.common.base.x.e
            int f(int i11) {
                return a.this.f15943a.d(this.f15951c, i11);
            }
        }

        a(com.google.common.base.e eVar) {
            this.f15943a = eVar;
        }

        @Override // com.google.common.base.x.f
        /* renamed from: b */
        public e a(x xVar, CharSequence charSequence) {
            return new C0290a(xVar, charSequence);
        }
    }

    /* loaded from: classes3.dex */
    class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15945a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends e {
            a(x xVar, CharSequence charSequence) {
                super(xVar, charSequence);
            }

            @Override // com.google.common.base.x.e
            public int e(int i11) {
                return i11 + b.this.f15945a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.x.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int f(int r6) {
                /*
                    r5 = this;
                    com.google.common.base.x$b r0 = com.google.common.base.x.b.this
                    java.lang.String r0 = r0.f15945a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f15951c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f15951c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.google.common.base.x$b r4 = com.google.common.base.x.b.this
                    java.lang.String r4 = r4.f15945a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.x.b.a.f(int):int");
            }
        }

        b(String str) {
            this.f15945a = str;
        }

        @Override // com.google.common.base.x.f
        /* renamed from: b */
        public e a(x xVar, CharSequence charSequence) {
            return new a(xVar, charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f15947a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends e {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f15948h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, x xVar, CharSequence charSequence, g gVar) {
                super(xVar, charSequence);
                this.f15948h = gVar;
            }

            @Override // com.google.common.base.x.e
            public int e(int i11) {
                return this.f15948h.a();
            }

            @Override // com.google.common.base.x.e
            public int f(int i11) {
                if (this.f15948h.b(i11)) {
                    return this.f15948h.d();
                }
                return -1;
            }
        }

        c(h hVar) {
            this.f15947a = hVar;
        }

        @Override // com.google.common.base.x.f
        /* renamed from: b */
        public e a(x xVar, CharSequence charSequence) {
            return new a(this, xVar, charSequence, this.f15947a.a(charSequence));
        }
    }

    /* loaded from: classes3.dex */
    class d implements Iterable<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f15949a;

        d(CharSequence charSequence) {
            this.f15949a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return x.this.l(this.f15949a);
        }

        public String toString() {
            n g11 = n.g(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder b11 = g11.b(sb2, this);
            b11.append(']');
            return b11.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class e extends com.google.common.base.b<String> {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f15951c;

        /* renamed from: d  reason: collision with root package name */
        final com.google.common.base.e f15952d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f15953e;

        /* renamed from: f  reason: collision with root package name */
        int f15954f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f15955g;

        protected e(x xVar, CharSequence charSequence) {
            this.f15952d = xVar.f15939a;
            this.f15953e = xVar.f15940b;
            this.f15955g = xVar.f15942d;
            this.f15951c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.b
        /* renamed from: d */
        public String a() {
            int f11;
            int i11 = this.f15954f;
            while (true) {
                int i12 = this.f15954f;
                if (i12 != -1) {
                    f11 = f(i12);
                    if (f11 == -1) {
                        f11 = this.f15951c.length();
                        this.f15954f = -1;
                    } else {
                        this.f15954f = e(f11);
                    }
                    int i13 = this.f15954f;
                    if (i13 == i11) {
                        int i14 = i13 + 1;
                        this.f15954f = i14;
                        if (i14 > this.f15951c.length()) {
                            this.f15954f = -1;
                        }
                    } else {
                        while (i11 < f11 && this.f15952d.f(this.f15951c.charAt(i11))) {
                            i11++;
                        }
                        while (f11 > i11 && this.f15952d.f(this.f15951c.charAt(f11 - 1))) {
                            f11--;
                        }
                        if (!this.f15953e || i11 != f11) {
                            break;
                        }
                        i11 = this.f15954f;
                    }
                } else {
                    return b();
                }
            }
            int i15 = this.f15955g;
            if (i15 == 1) {
                f11 = this.f15951c.length();
                this.f15954f = -1;
                while (f11 > i11 && this.f15952d.f(this.f15951c.charAt(f11 - 1))) {
                    f11--;
                }
            } else {
                this.f15955g = i15 - 1;
            }
            return this.f15951c.subSequence(i11, f11).toString();
        }

        abstract int e(int i11);

        abstract int f(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface f {
        Iterator<String> a(x xVar, CharSequence charSequence);
    }

    private x(f fVar) {
        this(fVar, false, com.google.common.base.e.g(), Integer.MAX_VALUE);
    }

    public static x e(char c11) {
        return f(com.google.common.base.e.e(c11));
    }

    public static x f(com.google.common.base.e eVar) {
        u.o(eVar);
        return new x(new a(eVar));
    }

    private static x g(h hVar) {
        u.k(!hVar.a("").c(), "The pattern may not match the empty string: %s", hVar);
        return new x(new c(hVar));
    }

    public static x h(String str) {
        u.e(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return e(str.charAt(0));
        }
        return new x(new b(str));
    }

    public static x i(String str) {
        return g(t.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> l(CharSequence charSequence) {
        return this.f15941c.a(this, charSequence);
    }

    public Iterable<String> j(CharSequence charSequence) {
        u.o(charSequence);
        return new d(charSequence);
    }

    public List<String> k(CharSequence charSequence) {
        u.o(charSequence);
        Iterator<String> l11 = l(charSequence);
        ArrayList arrayList = new ArrayList();
        while (l11.hasNext()) {
            arrayList.add(l11.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public x m() {
        return n(com.google.common.base.e.i());
    }

    public x n(com.google.common.base.e eVar) {
        u.o(eVar);
        return new x(this.f15941c, this.f15940b, eVar, this.f15942d);
    }

    private x(f fVar, boolean z11, com.google.common.base.e eVar, int i11) {
        this.f15941c = fVar;
        this.f15940b = z11;
        this.f15939a = eVar;
        this.f15942d = i11;
    }
}