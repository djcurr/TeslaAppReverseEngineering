package p4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p4.n;
import wz.s0;

/* loaded from: classes.dex */
public class p {

    /* renamed from: j */
    public static final a f46114j = new a(null);

    /* renamed from: a */
    private final String f46115a;

    /* renamed from: b */
    private r f46116b;

    /* renamed from: c */
    private String f46117c;

    /* renamed from: d */
    private CharSequence f46118d;

    /* renamed from: e */
    private final List<n> f46119e;

    /* renamed from: f */
    private final androidx.collection.h<f> f46120f;

    /* renamed from: g */
    private Map<String, g> f46121g;

    /* renamed from: h */
    private int f46122h;

    /* renamed from: i */
    private String f46123i;

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p4.p$a$a */
        /* loaded from: classes.dex */
        public static final class C0983a extends kotlin.jvm.internal.u implements h00.l<p, p> {

            /* renamed from: a */
            public static final C0983a f46124a = new C0983a();

            C0983a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final p invoke(p it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                return it2.o();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            return str != null ? kotlin.jvm.internal.s.p("android-app://androidx.navigation/", str) : "";
        }

        public final String b(Context context, int i11) {
            String valueOf;
            kotlin.jvm.internal.s.g(context, "context");
            if (i11 <= 16777215) {
                return String.valueOf(i11);
            }
            try {
                valueOf = context.getResources().getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i11);
            }
            kotlin.jvm.internal.s.f(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        public final u20.h<p> c(p pVar) {
            u20.h<p> k11;
            kotlin.jvm.internal.s.g(pVar, "<this>");
            k11 = u20.n.k(pVar, C0983a.f46124a);
            return k11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        private final p f46125a;

        /* renamed from: b */
        private final Bundle f46126b;

        /* renamed from: c */
        private final boolean f46127c;

        /* renamed from: d */
        private final boolean f46128d;

        /* renamed from: e */
        private final int f46129e;

        public b(p destination, Bundle bundle, boolean z11, boolean z12, int i11) {
            kotlin.jvm.internal.s.g(destination, "destination");
            this.f46125a = destination;
            this.f46126b = bundle;
            this.f46127c = z11;
            this.f46128d = z12;
            this.f46129e = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b other) {
            kotlin.jvm.internal.s.g(other, "other");
            boolean z11 = this.f46127c;
            if (!z11 || other.f46127c) {
                if (z11 || !other.f46127c) {
                    Bundle bundle = this.f46126b;
                    if (bundle == null || other.f46126b != null) {
                        if (bundle != null || other.f46126b == null) {
                            if (bundle != null) {
                                int size = bundle.size();
                                Bundle bundle2 = other.f46126b;
                                kotlin.jvm.internal.s.e(bundle2);
                                int size2 = size - bundle2.size();
                                if (size2 > 0) {
                                    return 1;
                                }
                                if (size2 < 0) {
                                    return -1;
                                }
                            }
                            boolean z12 = this.f46128d;
                            if (!z12 || other.f46128d) {
                                if (z12 || !other.f46128d) {
                                    return this.f46129e - other.f46129e;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }

        public final p b() {
            return this.f46125a;
        }

        public final Bundle c() {
            return this.f46126b;
        }
    }

    static {
        new LinkedHashMap();
    }

    public p(String navigatorName) {
        kotlin.jvm.internal.s.g(navigatorName, "navigatorName");
        this.f46115a = navigatorName;
        this.f46119e = new ArrayList();
        this.f46120f = new androidx.collection.h<>();
        this.f46121g = new LinkedHashMap();
    }

    public static /* synthetic */ int[] i(p pVar, p pVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                pVar2 = null;
            }
            return pVar.h(pVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final void b(String argumentName, g argument) {
        kotlin.jvm.internal.s.g(argumentName, "argumentName");
        kotlin.jvm.internal.s.g(argument, "argument");
        this.f46121g.put(argumentName, argument);
    }

    public final void c(String uriPattern) {
        kotlin.jvm.internal.s.g(uriPattern, "uriPattern");
        e(new n.a().b(uriPattern).a());
    }

    public final void e(n navDeepLink) {
        kotlin.jvm.internal.s.g(navDeepLink, "navDeepLink");
        Map<String, g> j11 = j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, g>> it2 = j11.entrySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, g> next = it2.next();
            g value = next.getValue();
            if ((value.c() || value.b()) ? false : false) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!navDeepLink.e().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f46119e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + ((Object) navDeepLink.k()) + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.p.equals(java.lang.Object):boolean");
    }

    public final Bundle f(Bundle bundle) {
        if (bundle == null) {
            Map<String, g> map = this.f46121g;
            if (map == null || map.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, g> entry : this.f46121g.entrySet()) {
            entry.getValue().d(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, g> entry2 : this.f46121g.entrySet()) {
                String key = entry2.getKey();
                g value = entry2.getValue();
                if (!value.e(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final int[] h(p pVar) {
        List<p> O0;
        int t11;
        int[] N0;
        wz.k kVar = new wz.k();
        r rVar = this;
        while (true) {
            kotlin.jvm.internal.s.e(rVar);
            r rVar2 = rVar.f46116b;
            if ((pVar == null ? null : pVar.f46116b) != null) {
                r rVar3 = pVar.f46116b;
                kotlin.jvm.internal.s.e(rVar3);
                if (rVar3.z(rVar.f46122h) == rVar) {
                    kVar.addFirst(rVar);
                    break;
                }
            }
            if (rVar2 == null || rVar2.F() != rVar.f46122h) {
                kVar.addFirst(rVar);
            }
            if (kotlin.jvm.internal.s.c(rVar2, pVar) || rVar2 == null) {
                break;
            }
            rVar = rVar2;
        }
        O0 = wz.e0.O0(kVar);
        t11 = wz.x.t(O0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p pVar2 : O0) {
            arrayList.add(Integer.valueOf(pVar2.m()));
        }
        N0 = wz.e0.N0(arrayList);
        return N0;
    }

    public int hashCode() {
        Set<String> keySet;
        int i11 = this.f46122h * 31;
        String str = this.f46123i;
        int hashCode = i11 + (str == null ? 0 : str.hashCode());
        for (n nVar : this.f46119e) {
            int i12 = hashCode * 31;
            String k11 = nVar.k();
            int hashCode2 = (i12 + (k11 == null ? 0 : k11.hashCode())) * 31;
            String d11 = nVar.d();
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            String g11 = nVar.g();
            hashCode = hashCode3 + (g11 == null ? 0 : g11.hashCode());
        }
        Iterator a11 = androidx.collection.i.a(this.f46120f);
        while (a11.hasNext()) {
            f fVar = (f) a11.next();
            int b11 = ((hashCode * 31) + fVar.b()) * 31;
            w c11 = fVar.c();
            hashCode = b11 + (c11 == null ? 0 : c11.hashCode());
            Bundle a12 = fVar.a();
            if (a12 != null && (keySet = a12.keySet()) != null) {
                for (String str2 : keySet) {
                    int i13 = hashCode * 31;
                    Bundle a13 = fVar.a();
                    kotlin.jvm.internal.s.e(a13);
                    Object obj = a13.get(str2);
                    hashCode = i13 + (obj == null ? 0 : obj.hashCode());
                }
            }
        }
        for (String str3 : j().keySet()) {
            int hashCode4 = ((hashCode * 31) + str3.hashCode()) * 31;
            g gVar = j().get(str3);
            hashCode = hashCode4 + (gVar == null ? 0 : gVar.hashCode());
        }
        return hashCode;
    }

    public final Map<String, g> j() {
        Map<String, g> v11;
        v11 = s0.v(this.f46121g);
        return v11;
    }

    public String k() {
        String str = this.f46117c;
        return str == null ? String.valueOf(this.f46122h) : str;
    }

    public final int m() {
        return this.f46122h;
    }

    public final String n() {
        return this.f46115a;
    }

    public final r o() {
        return this.f46116b;
    }

    public final String p() {
        return this.f46123i;
    }

    public b q(o navDeepLinkRequest) {
        kotlin.jvm.internal.s.g(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f46119e.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (n nVar : this.f46119e) {
            Uri c11 = navDeepLinkRequest.c();
            Bundle f11 = c11 != null ? nVar.f(c11, j()) : null;
            String a11 = navDeepLinkRequest.a();
            boolean z11 = a11 != null && kotlin.jvm.internal.s.c(a11, nVar.d());
            String b11 = navDeepLinkRequest.b();
            int h11 = b11 != null ? nVar.h(b11) : -1;
            if (f11 != null || z11 || h11 > -1) {
                b bVar2 = new b(this, f11, nVar.l(), z11, h11);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public final void r(int i11, f action) {
        kotlin.jvm.internal.s.g(action, "action");
        if (w()) {
            if (i11 != 0) {
                this.f46120f.l(i11, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i11 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void s(int i11) {
        this.f46122h = i11;
        this.f46117c = null;
    }

    public final void t(CharSequence charSequence) {
        this.f46118d = charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.f46117c
            if (r1 != 0) goto L28
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r2.f46122h
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            goto L2b
        L28:
            r0.append(r1)
        L2b:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r2.f46123i
            if (r1 == 0) goto L3d
            boolean r1 = kotlin.text.m.w(r1)
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r1 = 0
            goto L3e
        L3d:
            r1 = 1
        L3e:
            if (r1 != 0) goto L4a
            java.lang.String r1 = " route="
            r0.append(r1)
            java.lang.String r1 = r2.f46123i
            r0.append(r1)
        L4a:
            java.lang.CharSequence r1 = r2.f46118d
            if (r1 == 0) goto L58
            java.lang.String r1 = " label="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f46118d
            r0.append(r1)
        L58:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.s.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.p.toString():java.lang.String");
    }

    public final void u(r rVar) {
        this.f46116b = rVar;
    }

    public final void v(String str) {
        boolean w11;
        Object obj;
        if (str == null) {
            s(0);
        } else {
            w11 = kotlin.text.v.w(str);
            if (!w11) {
                String a11 = f46114j.a(str);
                s(a11.hashCode());
                c(a11);
            } else {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
        }
        List<n> list = this.f46119e;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.s.c(((n) obj).k(), f46114j.a(this.f46123i))) {
                break;
            }
        }
        list.remove(obj);
        this.f46123i = str;
    }

    public boolean w() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(b0<? extends p> navigator) {
        this(c0.f45979b.a(navigator.getClass()));
        kotlin.jvm.internal.s.g(navigator, "navigator");
    }
}