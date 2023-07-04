package na;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<i>> f40715b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Map<String, String> f40716c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f40717d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, List<i>> f40718e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f40719a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, List<i>> f40720b = f40718e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f40721c = true;

        static {
            String g11 = g();
            f40717d = g11;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g11)) {
                hashMap.put(NetworkConstantsKt.HEADER_USER_AGENT, Collections.singletonList(new b(g11)));
            }
            f40718e = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<i>> d() {
            HashMap hashMap = new HashMap(this.f40720b.size());
            for (Map.Entry<String, List<i>> entry : this.f40720b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f40719a) {
                this.f40719a = false;
                this.f40720b = d();
            }
        }

        private List<i> f(String str) {
            List<i> list = this.f40720b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f40720b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = property.charAt(i11);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, String str2) {
            return b(str, new b(str2));
        }

        public a b(String str, i iVar) {
            if (this.f40721c && NetworkConstantsKt.HEADER_USER_AGENT.equalsIgnoreCase(str)) {
                return h(str, iVar);
            }
            e();
            f(str).add(iVar);
            return this;
        }

        public j c() {
            this.f40719a = true;
            return new j(this.f40720b);
        }

        public a h(String str, i iVar) {
            e();
            if (iVar == null) {
                this.f40720b.remove(str);
            } else {
                List<i> f11 = f(str);
                f11.clear();
                f11.add(iVar);
            }
            if (this.f40721c && NetworkConstantsKt.HEADER_USER_AGENT.equalsIgnoreCase(str)) {
                this.f40721c = false;
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f40722a;

        b(String str) {
            this.f40722a = str;
        }

        @Override // na.i
        public String a() {
            return this.f40722a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f40722a.equals(((b) obj).f40722a);
            }
            return false;
        }

        public int hashCode() {
            return this.f40722a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f40722a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    j(Map<String, List<i>> map) {
        this.f40715b = Collections.unmodifiableMap(map);
    }

    private String b(List<i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            String a11 = list.get(i11).a();
            if (!TextUtils.isEmpty(a11)) {
                sb2.append(a11);
                if (i11 != list.size() - 1) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f40715b.entrySet()) {
            String b11 = b(entry.getValue());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put(entry.getKey(), b11);
            }
        }
        return hashMap;
    }

    @Override // na.h
    public Map<String, String> a() {
        if (this.f40716c == null) {
            synchronized (this) {
                if (this.f40716c == null) {
                    this.f40716c = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f40716c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f40715b.equals(((j) obj).f40715b);
        }
        return false;
    }

    public int hashCode() {
        return this.f40715b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f40715b + CoreConstants.CURLY_RIGHT;
    }
}