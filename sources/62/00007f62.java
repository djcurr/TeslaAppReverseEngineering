package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class i implements Serializable {

    /* renamed from: b */
    public static final a f35209b = new a(null);

    /* renamed from: a */
    private final Pattern f35210a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int b(int i11) {
            return (i11 & 2) != 0 ? i11 | 64 : i11;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<g> {

        /* renamed from: b */
        final /* synthetic */ CharSequence f35212b;

        /* renamed from: c */
        final /* synthetic */ int f35213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i11) {
            super(0);
            i.this = r1;
            this.f35212b = charSequence;
            this.f35213c = i11;
        }

        @Override // h00.a
        /* renamed from: a */
        public final g invoke() {
            return i.this.b(this.f35212b, this.f35213c);
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.p implements h00.l<g, g> {

        /* renamed from: a */
        public static final c f35214a = new c();

        c() {
            super(1, g.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // h00.l
        /* renamed from: d */
        public final g invoke(g p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return p02.next();
        }
    }

    public i(Pattern nativePattern) {
        kotlin.jvm.internal.s.g(nativePattern, "nativePattern");
        this.f35210a = nativePattern;
    }

    public static /* synthetic */ g c(i iVar, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return iVar.b(charSequence, i11);
    }

    public static /* synthetic */ u20.h e(i iVar, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return iVar.d(charSequence, i11);
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.s.g(input, "input");
        return this.f35210a.matcher(input).find();
    }

    public final g b(CharSequence input, int i11) {
        g e11;
        kotlin.jvm.internal.s.g(input, "input");
        Matcher matcher = this.f35210a.matcher(input);
        kotlin.jvm.internal.s.f(matcher, "nativePattern.matcher(input)");
        e11 = j.e(matcher, i11, input);
        return e11;
    }

    public final u20.h<g> d(CharSequence input, int i11) {
        kotlin.jvm.internal.s.g(input, "input");
        if (i11 >= 0 && i11 <= input.length()) {
            return u20.k.j(new b(input, i11), c.f35214a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i11 + ", input length: " + input.length());
    }

    public final g f(CharSequence input) {
        g f11;
        kotlin.jvm.internal.s.g(input, "input");
        Matcher matcher = this.f35210a.matcher(input);
        kotlin.jvm.internal.s.f(matcher, "nativePattern.matcher(input)");
        f11 = j.f(matcher, input);
        return f11;
    }

    public final boolean g(CharSequence input) {
        kotlin.jvm.internal.s.g(input, "input");
        return this.f35210a.matcher(input).matches();
    }

    public final String h(CharSequence input, h00.l<? super g, ? extends CharSequence> transform) {
        kotlin.jvm.internal.s.g(input, "input");
        kotlin.jvm.internal.s.g(transform, "transform");
        int i11 = 0;
        g c11 = c(this, input, 0, 2, null);
        if (c11 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i11, c11.c().m().intValue());
            sb2.append(transform.invoke(c11));
            i11 = c11.c().k().intValue() + 1;
            c11 = c11.next();
            if (i11 >= length) {
                break;
            }
        } while (c11 != null);
        if (i11 < length) {
            sb2.append(input, i11, length);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }

    public final String i(CharSequence input, String replacement) {
        kotlin.jvm.internal.s.g(input, "input");
        kotlin.jvm.internal.s.g(replacement, "replacement");
        String replaceAll = this.f35210a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.s.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> j(CharSequence input, int i11) {
        List<String> d11;
        kotlin.jvm.internal.s.g(input, "input");
        w.z0(i11);
        Matcher matcher = this.f35210a.matcher(input);
        if (i11 != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i11 > 0 ? m00.l.i(i11, 10) : 10);
            int i12 = 0;
            int i13 = i11 - 1;
            do {
                arrayList.add(input.subSequence(i12, matcher.start()).toString());
                i12 = matcher.end();
                if (i13 >= 0 && arrayList.size() == i13) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i12, input.length()).toString());
            return arrayList;
        }
        d11 = wz.v.d(input.toString());
        return d11;
    }

    public String toString() {
        String pattern = this.f35210a.toString();
        kotlin.jvm.internal.s.f(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.s.g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.s.f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.i.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.lang.String r2, kotlin.text.k r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.s.g(r3, r0)
            kotlin.text.i$a r0 = kotlin.text.i.f35209b
            int r3 = r3.getValue()
            int r3 = kotlin.text.i.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.s.f(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.i.<init>(java.lang.String, kotlin.text.k):void");
    }
}