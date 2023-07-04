package nq;

import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class m {
    public static List<X509Certificate> a(List<a> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11) != null) {
                X509Certificate a11 = n.a(list.get(i11).a());
                if (a11 != null) {
                    linkedList.add(a11);
                } else {
                    throw new ParseException("Invalid X.509 certificate at position " + i11, 0);
                }
            }
        }
        return linkedList;
    }

    public static List<a> b(List<Object> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (obj != null) {
                if (obj instanceof String) {
                    linkedList.add(new a((String) obj));
                } else {
                    throw new ParseException("The X.509 certificate at position " + i11 + " must be encoded as a Base64 string", 0);
                }
            } else {
                throw new ParseException("The X.509 certificate at position " + i11 + " must not be null", 0);
            }
        }
        return linkedList;
    }
}