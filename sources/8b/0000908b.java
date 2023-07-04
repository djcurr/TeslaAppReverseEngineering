package oq;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nq.i;
import nq.j;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f42920b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f42921a;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Object> f42922a = new LinkedHashMap();

        public b a(String str) {
            if (str == null) {
                this.f42922a.put("aud", null);
            } else {
                this.f42922a.put("aud", Collections.singletonList(str));
            }
            return this;
        }

        public b b(List<String> list) {
            this.f42922a.put("aud", list);
            return this;
        }

        public a c() {
            return new a(this.f42922a);
        }

        public b d(String str, Object obj) {
            this.f42922a.put(str, obj);
            return this;
        }

        public b e(Date date) {
            this.f42922a.put("exp", date);
            return this;
        }

        public b f(Date date) {
            this.f42922a.put("iat", date);
            return this;
        }

        public b g(String str) {
            this.f42922a.put("iss", str);
            return this;
        }

        public b h(String str) {
            this.f42922a.put("jti", str);
            return this;
        }

        public b i(Date date) {
            this.f42922a.put("nbf", date);
            return this;
        }

        public b j(String str) {
            this.f42922a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f42920b = Collections.unmodifiableSet(hashSet);
    }

    public static a e(String str) {
        return f(j.m(str));
    }

    public static a f(Map<String, Object> map) {
        b bVar = new b();
        for (String str : map.keySet()) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case 96944:
                    if (str.equals("aud")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 100893:
                    if (str.equals("exp")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 104028:
                    if (str.equals("iat")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 104585:
                    if (str.equals("iss")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 105567:
                    if (str.equals("jti")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 108850:
                    if (str.equals("nbf")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 114240:
                    if (str.equals("sub")) {
                        c11 = 6;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    Object obj = map.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(j.h(map, "aud"));
                        bVar.b(arrayList);
                        break;
                    } else if (obj instanceof List) {
                        bVar.b(j.j(map, "aud"));
                        break;
                    } else if (obj == null) {
                        bVar.a(null);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    bVar.e(new Date(j.g(map, "exp") * 1000));
                    break;
                case 2:
                    bVar.f(new Date(j.g(map, "iat") * 1000));
                    break;
                case 3:
                    bVar.g(j.h(map, "iss"));
                    break;
                case 4:
                    bVar.h(j.h(map, "jti"));
                    break;
                case 5:
                    bVar.i(new Date(j.g(map, "nbf") * 1000));
                    break;
                case 6:
                    bVar.j(j.h(map, "sub"));
                    break;
                default:
                    bVar.d(str, map.get(str));
                    break;
            }
        }
        return bVar.c();
    }

    public List<String> a() {
        Object b11 = b("aud");
        if (b11 instanceof String) {
            return Collections.singletonList((String) b11);
        }
        try {
            List<String> d11 = d("aud");
            return d11 != null ? d11 : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Object b(String str) {
        return this.f42921a.get(str);
    }

    public String[] c(String str) {
        if (b(str) == null) {
            return null;
        }
        try {
            List list = (List) b(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    strArr[i11] = (String) list.get(i11);
                } catch (ClassCastException unused) {
                    throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public List<String> d(String str) {
        String[] c11 = c(str);
        if (c11 == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(c11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Objects.equals(this.f42921a, ((a) obj).f42921a);
        }
        return false;
    }

    public Map<String, Object> g() {
        return h(false);
    }

    public Map<String, Object> h(boolean z11) {
        Map<String, Object> l11 = j.l();
        for (Map.Entry<String, Object> entry : this.f42921a.entrySet()) {
            if (entry.getValue() instanceof Date) {
                l11.put(entry.getKey(), Long.valueOf(pq.a.a((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> a11 = a();
                if (a11 == null || a11.isEmpty()) {
                    if (z11) {
                        l11.put("aud", null);
                    }
                } else if (a11.size() == 1) {
                    l11.put("aud", a11.get(0));
                } else {
                    List<Object> a12 = i.a();
                    a12.addAll(a11);
                    l11.put("aud", a12);
                }
            } else if (entry.getValue() != null) {
                l11.put(entry.getKey(), entry.getValue());
            } else if (z11) {
                l11.put(entry.getKey(), null);
            }
        }
        return l11;
    }

    public int hashCode() {
        return Objects.hash(this.f42921a);
    }

    public String toString() {
        return j.o(g());
    }

    private a(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f42921a = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}