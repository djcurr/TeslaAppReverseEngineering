package p4;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n {
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f46086l;

    /* renamed from: a  reason: collision with root package name */
    private final String f46087a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46088b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46089c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f46090d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, d> f46091e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private String f46092f;

    /* renamed from: g  reason: collision with root package name */
    private final vz.k f46093g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46094h;

    /* renamed from: i  reason: collision with root package name */
    private String f46095i;

    /* renamed from: j  reason: collision with root package name */
    private final vz.k f46096j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46097k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f46098a;

        /* renamed from: b  reason: collision with root package name */
        private String f46099b;

        /* renamed from: c  reason: collision with root package name */
        private String f46100c;

        /* renamed from: p4.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0981a {
            private C0981a() {
            }

            public /* synthetic */ C0981a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0981a(null);
        }

        public final n a() {
            return new n(this.f46098a, this.f46099b, this.f46100c);
        }

        public final a b(String uriPattern) {
            kotlin.jvm.internal.s.g(uriPattern, "uriPattern");
            this.f46098a = uriPattern;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        private String f46101a;

        /* renamed from: b  reason: collision with root package name */
        private String f46102b;

        public c(String mimeType) {
            List i11;
            boolean z11;
            kotlin.jvm.internal.s.g(mimeType, "mimeType");
            List<String> j11 = new kotlin.text.i("/").j(mimeType, 0);
            if (!j11.isEmpty()) {
                ListIterator<String> listIterator = j11.listIterator(j11.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (!z11) {
                        i11 = wz.e0.H0(j11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i11 = wz.w.i();
            this.f46101a = (String) i11.get(0);
            this.f46102b = (String) i11.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c other) {
            kotlin.jvm.internal.s.g(other, "other");
            int i11 = kotlin.jvm.internal.s.c(this.f46101a, other.f46101a) ? 2 : 0;
            return kotlin.jvm.internal.s.c(this.f46102b, other.f46102b) ? i11 + 1 : i11;
        }

        public final String b() {
            return this.f46102b;
        }

        public final String c() {
            return this.f46101a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f46103a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f46104b = new ArrayList();

        public final void a(String name) {
            kotlin.jvm.internal.s.g(name, "name");
            this.f46104b.add(name);
        }

        public final String b(int i11) {
            return this.f46104b.get(i11);
        }

        public final List<String> c() {
            return this.f46104b;
        }

        public final String d() {
            return this.f46103a;
        }

        public final void e(String str) {
            this.f46103a = str;
        }

        public final int f() {
            return this.f46104b.size();
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<Pattern> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Pattern invoke() {
            String str = n.this.f46095i;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str);
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.a<Pattern> {
        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Pattern invoke() {
            String str = n.this.f46092f;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str, 2);
        }
    }

    static {
        new b(null);
        f46086l = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    }

    public n(String str, String str2, String str3) {
        vz.k a11;
        vz.k a12;
        String D;
        String D2;
        String D3;
        this.f46087a = str;
        this.f46088b = str2;
        this.f46089c = str3;
        a11 = vz.m.a(new f());
        this.f46093g = a11;
        a12 = vz.m.a(new e());
        this.f46096j = a12;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f46094h = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f46086l.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.f46094h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    kotlin.jvm.internal.s.f(fillInPattern, "fillInPattern");
                    this.f46097k = c(substring, sb2, fillInPattern);
                }
                for (String paramName : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(paramName);
                    Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type kotlin.String");
                    Matcher matcher2 = fillInPattern.matcher(queryParameter);
                    d dVar = new d();
                    int i11 = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        Objects.requireNonNull(group, "null cannot be cast to non-null type kotlin.String");
                        dVar.a(group);
                        String substring2 = queryParameter.substring(i11, matcher2.start());
                        kotlin.jvm.internal.s.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(Pattern.quote(substring2));
                        sb3.append("(.+?)?");
                        i11 = matcher2.end();
                    }
                    if (i11 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i11);
                        kotlin.jvm.internal.s.f(substring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(substring3));
                    }
                    String sb4 = sb3.toString();
                    kotlin.jvm.internal.s.f(sb4, "argRegex.toString()");
                    D3 = kotlin.text.v.D(sb4, ".*", "\\E.*\\Q", false, 4, null);
                    dVar.e(D3);
                    Map<String, d> map = this.f46091e;
                    kotlin.jvm.internal.s.f(paramName, "paramName");
                    map.put(paramName, dVar);
                }
            } else {
                kotlin.jvm.internal.s.f(fillInPattern, "fillInPattern");
                this.f46097k = c(str, sb2, fillInPattern);
            }
            String sb5 = sb2.toString();
            kotlin.jvm.internal.s.f(sb5, "uriRegex.toString()");
            D2 = kotlin.text.v.D(sb5, ".*", "\\E.*\\Q", false, 4, null);
            this.f46092f = D2;
        }
        if (this.f46089c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f46089c).matches()) {
                c cVar = new c(this.f46089c);
                D = kotlin.text.v.D("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
                this.f46095i = D;
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + ((Object) g()) + " does not match to required \"type/subtype\" format").toString());
        }
    }

    private final boolean c(String str, StringBuilder sb2, Pattern pattern) {
        boolean M;
        Matcher matcher = pattern.matcher(str);
        M = kotlin.text.w.M(str, ".*", false, 2, null);
        boolean z11 = !M;
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group, "null cannot be cast to non-null type kotlin.String");
            this.f46090d.add(group);
            String substring = str.substring(i11, matcher.start());
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(Pattern.quote(substring));
            sb2.append("([^/]+?)");
            i11 = matcher.end();
            z11 = false;
        }
        if (i11 < str.length()) {
            String substring2 = str.substring(i11);
            kotlin.jvm.internal.s.f(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z11;
    }

    private final Pattern i() {
        return (Pattern) this.f46096j.getValue();
    }

    private final Pattern j() {
        return (Pattern) this.f46093g.getValue();
    }

    private final boolean m(Bundle bundle, String str, String str2, g gVar) {
        if (gVar != null) {
            gVar.a().d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public final String d() {
        return this.f46088b;
    }

    public final List<String> e() {
        List<String> y02;
        List<String> list = this.f46090d;
        Collection<d> values = this.f46091e.values();
        ArrayList arrayList = new ArrayList();
        for (d dVar : values) {
            wz.b0.z(arrayList, dVar.c());
        }
        y02 = wz.e0.y0(list, arrayList);
        return y02;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.s.c(this.f46087a, nVar.f46087a) && kotlin.jvm.internal.s.c(this.f46088b, nVar.f46088b) && kotlin.jvm.internal.s.c(this.f46089c, nVar.f46089c);
    }

    public final Bundle f(Uri deepLink, Map<String, g> arguments) {
        Matcher matcher;
        String str;
        kotlin.jvm.internal.s.g(deepLink, "deepLink");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        Pattern j11 = j();
        Matcher matcher2 = j11 == null ? null : j11.matcher(deepLink.toString());
        if (matcher2 != null && matcher2.matches()) {
            Bundle bundle = new Bundle();
            int size = this.f46090d.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String str2 = this.f46090d.get(i11);
                String value = Uri.decode(matcher2.group(i12));
                g gVar = arguments.get(str2);
                try {
                    kotlin.jvm.internal.s.f(value, "value");
                    if (m(bundle, str2, value, gVar)) {
                        return null;
                    }
                    i11 = i12;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            if (this.f46094h) {
                for (String str3 : this.f46091e.keySet()) {
                    d dVar = this.f46091e.get(str3);
                    String queryParameter = deepLink.getQueryParameter(str3);
                    if (queryParameter != null) {
                        kotlin.jvm.internal.s.e(dVar);
                        matcher = Pattern.compile(dVar.d(), 32).matcher(queryParameter);
                        if (!matcher.matches()) {
                            return null;
                        }
                    } else {
                        matcher = null;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        kotlin.jvm.internal.s.e(dVar);
                        int f11 = dVar.f();
                        int i13 = 0;
                        while (i13 < f11) {
                            int i14 = i13 + 1;
                            if (matcher != null) {
                                str = matcher.group(i14);
                                if (str == null) {
                                    str = "";
                                }
                            } else {
                                str = null;
                            }
                            String b11 = dVar.b(i13);
                            g gVar2 = arguments.get(b11);
                            if (str != null) {
                                if (!kotlin.jvm.internal.s.c(str, CoreConstants.CURLY_LEFT + b11 + CoreConstants.CURLY_RIGHT) && m(bundle2, b11, str, gVar2)) {
                                    return null;
                                }
                            }
                            i13 = i14;
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            for (Map.Entry<String, g> entry : arguments.entrySet()) {
                String key = entry.getKey();
                g value2 = entry.getValue();
                if (((value2 == null || value2.c() || value2.b()) ? false : true) && !bundle.containsKey(key)) {
                    return null;
                }
            }
            return bundle;
        }
        return null;
    }

    public final String g() {
        return this.f46089c;
    }

    public final int h(String mimeType) {
        kotlin.jvm.internal.s.g(mimeType, "mimeType");
        if (this.f46089c != null) {
            Pattern i11 = i();
            kotlin.jvm.internal.s.e(i11);
            if (i11.matcher(mimeType).matches()) {
                return new c(this.f46089c).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    public int hashCode() {
        String str = this.f46087a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 0) * 31;
        String str2 = this.f46088b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46089c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String k() {
        return this.f46087a;
    }

    public final boolean l() {
        return this.f46097k;
    }
}