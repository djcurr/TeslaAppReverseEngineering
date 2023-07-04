package gh;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c implements Iterable<Map.Entry<String, List<String>>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<String>> f27974a = new LinkedHashMap();

    private List<String> b(String str) {
        return this.f27974a.get(str);
    }

    private void c(String str, String str2) {
        List<String> b11 = b(str);
        if (b11 == null) {
            b11 = new ArrayList<>();
            this.f27974a.put(str, b11);
        }
        b11.add(str2);
    }

    private String k(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public String d(String str) {
        List<String> e11 = e(str);
        if (e11 == null || e11.isEmpty()) {
            return null;
        }
        return e11.get(0);
    }

    public List<String> e(String str) {
        return b(k(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f27974a.equals(((c) obj).f27974a);
        }
        return false;
    }

    public Charset f() {
        String d11 = d("CHARSET");
        if (d11 == null) {
            return null;
        }
        return Charset.forName(d11);
    }

    public Map<String, List<String>> h() {
        return this.f27974a;
    }

    public int hashCode() {
        return this.f27974a.hashCode();
    }

    public boolean i() {
        String[] strArr = {"ENCODING", null};
        for (int i11 = 0; i11 < 2; i11++) {
            List<String> b11 = b(strArr[i11]);
            if (b11 != null) {
                for (String str : b11) {
                    if ("QUOTED-PRINTABLE".equalsIgnoreCase(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, List<String>>> iterator() {
        return this.f27974a.entrySet().iterator();
    }

    public void j(String str, String str2) {
        c(k(str), str2);
    }

    public String toString() {
        return this.f27974a.toString();
    }
}