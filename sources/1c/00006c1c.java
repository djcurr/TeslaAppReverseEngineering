package ezvcard.parameter;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.util.GeoUri;
import ezvcard.util.g;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class VCardParameters extends g<String, String> {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Set<VCardVersion>> f25405b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends d<ezvcard.parameter.c> {
        a(VCardParameters vCardParameters, String str) {
            super(str);
        }

        @Override // ezvcard.parameter.VCardParameters.d
        protected IllegalStateException _exception(String str, Exception exc) {
            return new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(15, "PID"), exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.parameter.VCardParameters.d
        /* renamed from: b */
        public ezvcard.parameter.c _asObject(String str) {
            return ezvcard.parameter.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.parameter.VCardParameters.d
        /* renamed from: c */
        public String _asString(ezvcard.parameter.c cVar) {
            return cVar.toString();
        }
    }

    /* loaded from: classes5.dex */
    public abstract class b<T extends VCardParameter> extends d<T> {
        public b(String str) {
            super(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ezvcard.parameter.VCardParameters.d
        protected /* bridge */ /* synthetic */ String _asString(Object obj) {
            return _asString((b<T>) ((VCardParameter) obj));
        }

        protected String _asString(T t11) {
            return t11.b();
        }
    }

    /* loaded from: classes5.dex */
    public abstract class c<T extends VCardParameter> extends b<T> {
        public c() {
            super("TYPE");
        }
    }

    /* loaded from: classes5.dex */
    public abstract class d<T> extends AbstractList<T> {
        protected final String parameterName;
        protected final List<String> parameterValues;

        public d(String str) {
            this.parameterName = str;
            this.parameterValues = VCardParameters.this.e(str);
        }

        private T asObject(String str) {
            try {
                return _asObject(str);
            } catch (Exception e11) {
                throw _exception(str, e11);
            }
        }

        protected abstract T _asObject(String str);

        protected abstract String _asString(T t11);

        protected IllegalStateException _exception(String str, Exception exc) {
            return new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(26, this.parameterName), exc);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i11, T t11) {
            this.parameterValues.add(i11, _asString(t11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i11) {
            return asObject(this.parameterValues.get(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i11) {
            return asObject(this.parameterValues.remove(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i11, T t11) {
            return asObject(this.parameterValues.set(i11, _asString(t11)));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parameterValues.size();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        VCardVersion vCardVersion = VCardVersion.V4_0;
        hashMap.put("ALTID", EnumSet.of(vCardVersion));
        hashMap.put("CALSCALE", EnumSet.of(vCardVersion));
        hashMap.put("CHARSET", EnumSet.of(VCardVersion.V2_1));
        hashMap.put("GEO", EnumSet.of(vCardVersion));
        hashMap.put("INDEX", EnumSet.of(vCardVersion));
        hashMap.put("LEVEL", EnumSet.of(vCardVersion));
        hashMap.put("MEDIATYPE", EnumSet.of(vCardVersion));
        hashMap.put("PID", EnumSet.of(vCardVersion));
        hashMap.put("SORT-AS", EnumSet.of(vCardVersion));
        hashMap.put("TZ", EnumSet.of(vCardVersion));
        f25405b = Collections.unmodifiableMap(hashMap);
    }

    public VCardParameters() {
    }

    private static boolean E(String str) {
        boolean z11 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '.') {
                if (i11 == 0 || i11 == str.length() - 1 || z11) {
                    return false;
                }
                z11 = true;
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public String A() {
        return d("TZ");
    }

    public String B() {
        return d("TYPE");
    }

    public List<String> C() {
        return e("TYPE");
    }

    public VCardDataType D() {
        String d11 = d("VALUE");
        if (d11 == null) {
            return null;
        }
        return VCardDataType.d(d11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.g
    /* renamed from: F */
    public String k(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public void G(String str) {
        j("ALTID", str);
    }

    public void H(Calscale calscale) {
        j("CALSCALE", calscale == null ? null : calscale.b());
    }

    public void I(GeoUri geoUri) {
        j("GEO", geoUri == null ? null : geoUri.toString());
    }

    public void K(Integer num) {
        j("INDEX", num == null ? null : num.toString());
    }

    public void L(String str) {
        j("LABEL", str);
    }

    public void M(String str) {
        j("LANGUAGE", str);
    }

    public void N(String str) {
        j("LEVEL", str);
    }

    public void O(String str) {
        j("MEDIATYPE", str);
    }

    public void P(Integer num) {
        j("PREF", num == null ? null : num.toString());
    }

    public void Q(String... strArr) {
        i("SORT-AS");
        h("SORT-AS", Arrays.asList(strArr));
    }

    public void R(String str) {
        j("TZ", str);
    }

    public void S(String str) {
        j("TYPE", str);
    }

    public void T(VCardDataType vCardDataType) {
        j("VALUE", vCardDataType == null ? null : vCardDataType.e());
    }

    public List<vw.c> U(VCardVersion vCardVersion) {
        ArrayList arrayList = new ArrayList(0);
        gh.a syntaxStyle = vCardVersion.getSyntaxStyle();
        Iterator<Map.Entry<String, List<String>>> it2 = iterator();
        while (it2.hasNext()) {
            Map.Entry<String, List<String>> next = it2.next();
            String key = next.getKey();
            if (vCardVersion == VCardVersion.V4_0 || !"LABEL".equalsIgnoreCase(key)) {
                if (!jh.b.d(key, syntaxStyle, true)) {
                    if (syntaxStyle == gh.a.OLD) {
                        arrayList.add(new vw.c(30, key, jh.b.b(syntaxStyle, true).d().e(true)));
                    } else {
                        arrayList.add(new vw.c(26, key));
                    }
                }
                Iterator<String> it3 = next.getValue().iterator();
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    if ("LABEL".equalsIgnoreCase(key)) {
                        next2 = next2.replaceAll("\r\n|\r|\n", "");
                    }
                    if (!jh.b.e(next2, syntaxStyle, false, true)) {
                        arrayList.add(new vw.c(syntaxStyle == gh.a.OLD ? 31 : 25, key, next2, jh.b.c(syntaxStyle, false, true).d().e(true)));
                    }
                }
            }
        }
        String d11 = d("CALSCALE");
        if (d11 != null && Calscale.e(d11) == null) {
            arrayList.add(new vw.c(3, "CALSCALE", d11, Calscale.d()));
        }
        String d12 = d("ENCODING");
        if (d12 != null) {
            ezvcard.parameter.a e11 = ezvcard.parameter.a.e(d12);
            if (e11 == null) {
                arrayList.add(new vw.c(3, "ENCODING", d12, ezvcard.parameter.a.d()));
            } else if (!e11.c(vCardVersion)) {
                arrayList.add(new vw.c(4, "ENCODING", d12));
            }
        }
        String d13 = d("VALUE");
        if (d13 != null) {
            VCardDataType c11 = VCardDataType.c(d13);
            if (c11 == null) {
                arrayList.add(new vw.c(3, "VALUE", d13, VCardDataType.b()));
            } else if (!c11.g(vCardVersion)) {
                arrayList.add(new vw.c(4, "VALUE", d13));
            }
        }
        try {
            r();
        } catch (IllegalStateException unused) {
            arrayList.add(new vw.c(5, "GEO", d("GEO")));
        }
        try {
            Integer s11 = s();
            if (s11 != null && s11.intValue() <= 0) {
                arrayList.add(new vw.c(28, s11));
            }
        } catch (IllegalStateException unused2) {
            arrayList.add(new vw.c(5, "INDEX", d("INDEX")));
        }
        for (String str : e("PID")) {
            if (!E(str)) {
                arrayList.add(new vw.c(27, str));
            }
        }
        try {
            Integer y11 = y();
            if (y11 != null && (y11.intValue() < 1 || y11.intValue() > 100)) {
                arrayList.add(new vw.c(29, y11));
            }
        } catch (IllegalStateException unused3) {
            arrayList.add(new vw.c(5, "PREF", d("PREF")));
        }
        for (Map.Entry<String, Set<VCardVersion>> entry : f25405b.entrySet()) {
            String key2 = entry.getKey();
            if (d(key2) != null && !entry.getValue().contains(vCardVersion)) {
                arrayList.add(new vw.c(6, key2));
            }
        }
        String p11 = p();
        if (p11 != null) {
            try {
                Charset.forName(p11);
            } catch (IllegalCharsetNameException unused4) {
                arrayList.add(new vw.c(22, p11));
            } catch (UnsupportedCharsetException unused5) {
                arrayList.add(new vw.c(22, p11));
            }
        }
        return arrayList;
    }

    @Override // ezvcard.util.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VCardParameters vCardParameters = (VCardParameters) obj;
            if (size() != vCardParameters.size()) {
                return false;
            }
            Iterator<Map.Entry<String, List<String>>> it2 = iterator();
            while (it2.hasNext()) {
                Map.Entry<String, List<String>> next = it2.next();
                List<String> value = next.getValue();
                List<String> e11 = vCardParameters.e(next.getKey());
                if (value.size() != e11.size()) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(value.size());
                for (String str : value) {
                    arrayList.add(str.toLowerCase());
                }
                Collections.sort(arrayList);
                ArrayList arrayList2 = new ArrayList(e11.size());
                for (String str2 : e11) {
                    arrayList2.add(str2.toLowerCase());
                }
                Collections.sort(arrayList2);
                if (!arrayList.equals(arrayList2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // ezvcard.util.g
    public int hashCode() {
        Iterator<Map.Entry<String, List<String>>> it2 = iterator();
        int i11 = 1;
        while (it2.hasNext()) {
            Map.Entry<String, List<String>> next = it2.next();
            String key = next.getKey();
            int i12 = 1;
            for (String str : next.getValue()) {
                i12 += str.toLowerCase().hashCode();
            }
            int hashCode = 31 + (key == null ? 0 : key.toLowerCase().hashCode()) + 1;
            i11 += hashCode + (hashCode * 31) + i12;
        }
        return i11;
    }

    public String n() {
        return d("ALTID");
    }

    public Calscale o() {
        String d11 = d("CALSCALE");
        if (d11 == null) {
            return null;
        }
        return Calscale.f(d11);
    }

    public String p() {
        return d("CHARSET");
    }

    public ezvcard.parameter.a q() {
        String d11 = d("ENCODING");
        if (d11 == null) {
            return null;
        }
        return ezvcard.parameter.a.f(d11);
    }

    public GeoUri r() {
        String d11 = d("GEO");
        if (d11 == null) {
            return null;
        }
        try {
            return GeoUri.n(d11);
        } catch (IllegalArgumentException e11) {
            throw new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(15, "GEO"), e11);
        }
    }

    public Integer s() {
        String d11 = d("INDEX");
        if (d11 == null) {
            return null;
        }
        try {
            return Integer.valueOf(d11);
        } catch (NumberFormatException e11) {
            throw new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(15, "INDEX"), e11);
        }
    }

    public String t() {
        return d("LABEL");
    }

    public String u() {
        return d("LANGUAGE");
    }

    public String v() {
        return d("LEVEL");
    }

    public String w() {
        return d("MEDIATYPE");
    }

    public List<ezvcard.parameter.c> x() {
        return new a(this, "PID");
    }

    public Integer y() {
        String d11 = d("PREF");
        if (d11 == null) {
            return null;
        }
        try {
            return Integer.valueOf(d11);
        } catch (NumberFormatException e11) {
            throw new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(15, "PREF"), e11);
        }
    }

    public List<String> z() {
        return e("SORT-AS");
    }

    public VCardParameters(VCardParameters vCardParameters) {
        super(vCardParameters);
    }

    public VCardParameters(Map<String, List<String>> map) {
        super(map);
    }
}