package n2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    private final String f40245a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b<s>> f40246b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b<n>> f40247c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b<? extends Object>> f40248d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(String text, List<b<s>> spanStyles, List<b<n>> paragraphStyles, List<? extends b<? extends Object>> annotations) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(paragraphStyles, "paragraphStyles");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        this.f40245a = text;
        this.f40246b = spanStyles;
        this.f40247c = paragraphStyles;
        this.f40248d = annotations;
        int size = paragraphStyles.size();
        int i11 = -1;
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            b<n> bVar = paragraphStyles.get(i12);
            if (bVar.f() >= i11) {
                if (bVar.d() <= g().length()) {
                    i11 = bVar.d();
                    i12 = i13;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public char a(int i11) {
        return this.f40245a.charAt(i11);
    }

    public final List<b<? extends Object>> b() {
        return this.f40248d;
    }

    public int c() {
        return this.f40245a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return a(i11);
    }

    public final List<b<n>> d() {
        return this.f40247c;
    }

    public final List<b<s>> e() {
        return this.f40246b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f40245a, aVar.f40245a) && kotlin.jvm.internal.s.c(this.f40246b, aVar.f40246b) && kotlin.jvm.internal.s.c(this.f40247c, aVar.f40247c) && kotlin.jvm.internal.s.c(this.f40248d, aVar.f40248d);
        }
        return false;
    }

    public final List<b<String>> f(String tag, int i11, int i12) {
        kotlin.jvm.internal.s.g(tag, "tag");
        List<b<? extends Object>> list = this.f40248d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            b<? extends Object> bVar = list.get(i13);
            b<? extends Object> bVar2 = bVar;
            if ((bVar2.e() instanceof String) && kotlin.jvm.internal.s.c(tag, bVar2.g()) && n2.b.g(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
            i13 = i14;
        }
        return arrayList;
    }

    public final String g() {
        return this.f40245a;
    }

    public final List<b<c0>> h(int i11, int i12) {
        List<b<? extends Object>> list = this.f40248d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            b<? extends Object> bVar = list.get(i13);
            b<? extends Object> bVar2 = bVar;
            if ((bVar2.e() instanceof c0) && n2.b.g(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
            i13 = i14;
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.f40245a.hashCode() * 31) + this.f40246b.hashCode()) * 31) + this.f40247c.hashCode()) * 31) + this.f40248d.hashCode();
    }

    public final a i(a other) {
        kotlin.jvm.internal.s.g(other, "other");
        C0787a c0787a = new C0787a(this);
        c0787a.e(other);
        return c0787a.h();
    }

    @Override // java.lang.CharSequence
    /* renamed from: j */
    public a subSequence(int i11, int i12) {
        if (i11 <= i12) {
            if (i11 == 0 && i12 == this.f40245a.length()) {
                return this;
            }
            String substring = this.f40245a.substring(i11, i12);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new a(substring, n2.b.a(this.f40246b, i11, i12), n2.b.a(this.f40247c, i11, i12), n2.b.a(this.f40248d, i11, i12));
        }
        throw new IllegalArgumentException(("start (" + i11 + ") should be less or equal to end (" + i12 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final a k(long j11) {
        return subSequence(y.l(j11), y.k(j11));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f40245a;
    }

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f40258a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40259b;

        /* renamed from: c  reason: collision with root package name */
        private final int f40260c;

        /* renamed from: d  reason: collision with root package name */
        private final String f40261d;

        public b(T t11, int i11, int i12, String tag) {
            kotlin.jvm.internal.s.g(tag, "tag");
            this.f40258a = t11;
            this.f40259b = i11;
            this.f40260c = i12;
            this.f40261d = tag;
            if (!(i11 <= i12)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.f40258a;
        }

        public final int b() {
            return this.f40259b;
        }

        public final int c() {
            return this.f40260c;
        }

        public final int d() {
            return this.f40260c;
        }

        public final T e() {
            return this.f40258a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f40258a, bVar.f40258a) && this.f40259b == bVar.f40259b && this.f40260c == bVar.f40260c && kotlin.jvm.internal.s.c(this.f40261d, bVar.f40261d);
            }
            return false;
        }

        public final int f() {
            return this.f40259b;
        }

        public final String g() {
            return this.f40261d;
        }

        public int hashCode() {
            T t11 = this.f40258a;
            return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.f40259b)) * 31) + Integer.hashCode(this.f40260c)) * 31) + this.f40261d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f40258a + ", start=" + this.f40259b + ", end=" + this.f40260c + ", tag=" + this.f40261d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public b(T t11, int i11, int i12) {
            this(t11, i11, i12, "");
        }
    }

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0787a {

        /* renamed from: a  reason: collision with root package name */
        private final StringBuilder f40249a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0788a<s>> f40250b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C0788a<n>> f40251c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C0788a<? extends Object>> f40252d;

        /* renamed from: e  reason: collision with root package name */
        private final List<C0788a<? extends Object>> f40253e;

        public C0787a(int i11) {
            this.f40249a = new StringBuilder(i11);
            this.f40250b = new ArrayList();
            this.f40251c = new ArrayList();
            this.f40252d = new ArrayList();
            this.f40253e = new ArrayList();
        }

        public final void a(String tag, String annotation, int i11, int i12) {
            kotlin.jvm.internal.s.g(tag, "tag");
            kotlin.jvm.internal.s.g(annotation, "annotation");
            this.f40252d.add(new C0788a<>(annotation, i11, i12, tag));
        }

        public final void b(n style, int i11, int i12) {
            kotlin.jvm.internal.s.g(style, "style");
            this.f40251c.add(new C0788a<>(style, i11, i12, null, 8, null));
        }

        public final void c(s style, int i11, int i12) {
            kotlin.jvm.internal.s.g(style, "style");
            this.f40250b.add(new C0788a<>(style, i11, i12, null, 8, null));
        }

        public final void d(String text) {
            kotlin.jvm.internal.s.g(text, "text");
            this.f40249a.append(text);
        }

        public final void e(a text) {
            kotlin.jvm.internal.s.g(text, "text");
            int length = this.f40249a.length();
            this.f40249a.append(text.g());
            List<b<s>> e11 = text.e();
            int size = e11.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                b<s> bVar = e11.get(i12);
                c(bVar.e(), bVar.f() + length, bVar.d() + length);
                i12 = i13;
            }
            List<b<n>> d11 = text.d();
            int size2 = d11.size();
            int i14 = 0;
            while (i14 < size2) {
                int i15 = i14 + 1;
                b<n> bVar2 = d11.get(i14);
                b(bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                i14 = i15;
            }
            List<b<? extends Object>> b11 = text.b();
            int size3 = b11.size();
            while (i11 < size3) {
                int i16 = i11 + 1;
                b<? extends Object> bVar3 = b11.get(i11);
                this.f40252d.add(new C0788a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                i11 = i16;
            }
        }

        public final void f() {
            if (!this.f40253e.isEmpty()) {
                List<C0788a<? extends Object>> list = this.f40253e;
                list.remove(list.size() - 1).a(this.f40249a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final int g(String tag, String annotation) {
            kotlin.jvm.internal.s.g(tag, "tag");
            kotlin.jvm.internal.s.g(annotation, "annotation");
            C0788a<? extends Object> c0788a = new C0788a<>(annotation, this.f40249a.length(), 0, tag, 4, null);
            this.f40253e.add(c0788a);
            this.f40252d.add(c0788a);
            return this.f40253e.size() - 1;
        }

        public final a h() {
            String sb2 = this.f40249a.toString();
            kotlin.jvm.internal.s.f(sb2, "text.toString()");
            List<C0788a<s>> list = this.f40250b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).b(this.f40249a.length()));
            }
            List<C0788a<n>> list2 = this.f40251c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(list2.get(i12).b(this.f40249a.length()));
            }
            List<C0788a<? extends Object>> list3 = this.f40252d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).b(this.f40249a.length()));
            }
            return new a(sb2, arrayList, arrayList2, arrayList3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n2.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0788a<T> {

            /* renamed from: a  reason: collision with root package name */
            private final T f40254a;

            /* renamed from: b  reason: collision with root package name */
            private final int f40255b;

            /* renamed from: c  reason: collision with root package name */
            private int f40256c;

            /* renamed from: d  reason: collision with root package name */
            private final String f40257d;

            public C0788a(T t11, int i11, int i12, String tag) {
                kotlin.jvm.internal.s.g(tag, "tag");
                this.f40254a = t11;
                this.f40255b = i11;
                this.f40256c = i12;
                this.f40257d = tag;
            }

            public final void a(int i11) {
                this.f40256c = i11;
            }

            public final b<T> b(int i11) {
                int i12 = this.f40256c;
                if (i12 != Integer.MIN_VALUE) {
                    i11 = i12;
                }
                if (i11 != Integer.MIN_VALUE) {
                    return new b<>(this.f40254a, this.f40255b, i11, this.f40257d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0788a) {
                    C0788a c0788a = (C0788a) obj;
                    return kotlin.jvm.internal.s.c(this.f40254a, c0788a.f40254a) && this.f40255b == c0788a.f40255b && this.f40256c == c0788a.f40256c && kotlin.jvm.internal.s.c(this.f40257d, c0788a.f40257d);
                }
                return false;
            }

            public int hashCode() {
                T t11 = this.f40254a;
                return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.f40255b)) * 31) + Integer.hashCode(this.f40256c)) * 31) + this.f40257d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f40254a + ", start=" + this.f40255b + ", end=" + this.f40256c + ", tag=" + this.f40257d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ C0788a(Object obj, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, (i13 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C0787a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 16 : i11);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0787a(a text) {
            this(0, 1, null);
            kotlin.jvm.internal.s.g(text, "text");
            e(text);
        }
    }

    public /* synthetic */ a(String str, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? wz.w.i() : list, (i11 & 4) != 0 ? wz.w.i() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r2, java.util.List<n2.a.b<n2.s>> r3, java.util.List<n2.a.b<n2.n>> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.s.g(r4, r0)
            java.util.List r0 = wz.u.i()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}