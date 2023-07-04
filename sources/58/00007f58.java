package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e implements u20.h<m00.i> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f35190a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35191b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35192c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.p<CharSequence, Integer, vz.p<Integer, Integer>> f35193d;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<m00.i>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f35194a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f35195b;

        /* renamed from: c  reason: collision with root package name */
        private int f35196c;

        /* renamed from: d  reason: collision with root package name */
        private m00.i f35197d;

        /* renamed from: e  reason: collision with root package name */
        private int f35198e;

        a() {
            int m11;
            m11 = m00.l.m(e.this.f35191b, 0, e.this.f35190a.length());
            this.f35195b = m11;
            this.f35196c = m11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f35199f.f35192c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f35196c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f35194a = r1
                r0 = 0
                r6.f35197d = r0
                goto L9e
            Lc:
                kotlin.text.e r0 = kotlin.text.e.this
                int r0 = kotlin.text.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f35198e
                int r0 = r0 + r3
                r6.f35198e = r0
                kotlin.text.e r4 = kotlin.text.e.this
                int r4 = kotlin.text.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f35196c
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                m00.i r0 = new m00.i
                int r1 = r6.f35195b
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.c(r4)
                int r4 = kotlin.text.m.T(r4)
                r0.<init>(r1, r4)
                r6.f35197d = r0
                r6.f35196c = r2
                goto L9c
            L47:
                kotlin.text.e r0 = kotlin.text.e.this
                h00.p r0 = kotlin.text.e.b(r0)
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.c(r4)
                int r5 = r6.f35196c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                vz.p r0 = (vz.p) r0
                if (r0 != 0) goto L77
                m00.i r0 = new m00.i
                int r1 = r6.f35195b
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.c(r4)
                int r4 = kotlin.text.m.T(r4)
                r0.<init>(r1, r4)
                r6.f35197d = r0
                r6.f35196c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f35195b
                m00.i r4 = m00.j.r(r4, r2)
                r6.f35197d = r4
                int r2 = r2 + r0
                r6.f35195b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f35196c = r2
            L9c:
                r6.f35194a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public m00.i next() {
            if (this.f35194a == -1) {
                a();
            }
            if (this.f35194a != 0) {
                m00.i iVar = this.f35197d;
                Objects.requireNonNull(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f35197d = null;
                this.f35194a = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f35194a == -1) {
                a();
            }
            return this.f35194a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i11, int i12, h00.p<? super CharSequence, ? super Integer, vz.p<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.s.g(input, "input");
        kotlin.jvm.internal.s.g(getNextMatch, "getNextMatch");
        this.f35190a = input;
        this.f35191b = i11;
        this.f35192c = i12;
        this.f35193d = getNextMatch;
    }

    @Override // u20.h
    public Iterator<m00.i> iterator() {
        return new a();
    }
}