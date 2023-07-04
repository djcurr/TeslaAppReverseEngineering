package s2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private String f50152a;

    /* renamed from: b  reason: collision with root package name */
    private j f50153b;

    /* renamed from: c  reason: collision with root package name */
    private int f50154c;

    /* renamed from: d  reason: collision with root package name */
    private int f50155d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public u(String text) {
        kotlin.jvm.internal.s.g(text, "text");
        this.f50152a = text;
        this.f50154c = -1;
        this.f50155d = -1;
    }

    public final char a(int i11) {
        j jVar = this.f50153b;
        if (jVar == null) {
            return this.f50152a.charAt(i11);
        }
        if (i11 < this.f50154c) {
            return this.f50152a.charAt(i11);
        }
        int e11 = jVar.e();
        int i12 = this.f50154c;
        if (i11 < e11 + i12) {
            return jVar.d(i11 - i12);
        }
        return this.f50152a.charAt(i11 - ((e11 - this.f50155d) + i12));
    }

    public final int b() {
        j jVar = this.f50153b;
        return jVar == null ? this.f50152a.length() : (this.f50152a.length() - (this.f50155d - this.f50154c)) + jVar.e();
    }

    public final void c(int i11, int i12, String text) {
        kotlin.jvm.internal.s.g(text, "text");
        j jVar = this.f50153b;
        if (jVar == null) {
            int max = Math.max(255, text.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i11, 64);
            int min2 = Math.min(this.f50152a.length() - i12, 64);
            int i13 = i11 - min;
            k.b(this.f50152a, cArr, 0, i13, i11);
            int i14 = max - min2;
            int i15 = i12 + min2;
            k.b(this.f50152a, cArr, i14, i12, i15);
            k.c(text, cArr, min, 0, 0, 12, null);
            this.f50153b = new j(cArr, min + text.length(), i14);
            this.f50154c = i13;
            this.f50155d = i15;
            return;
        }
        int i16 = this.f50154c;
        int i17 = i11 - i16;
        int i18 = i12 - i16;
        if (i17 >= 0 && i18 <= jVar.e()) {
            jVar.g(i17, i18, text);
            return;
        }
        this.f50152a = toString();
        this.f50153b = null;
        this.f50154c = -1;
        this.f50155d = -1;
        c(i11, i12, text);
    }

    public String toString() {
        j jVar = this.f50153b;
        if (jVar == null) {
            return this.f50152a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f50152a, 0, this.f50154c);
        jVar.a(sb2);
        String str = this.f50152a;
        sb2.append((CharSequence) str, this.f50155d, str.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }
}