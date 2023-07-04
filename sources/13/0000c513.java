package zp;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes2.dex */
public abstract class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private com.nimbusds.jose.c f60593a = null;

    /* renamed from: b  reason: collision with root package name */
    private nq.c[] f60594b = null;

    public static nq.c[] e(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf != -1) {
            int i11 = indexOf + 1;
            int indexOf2 = trim.indexOf(".", i11);
            if (indexOf2 != -1) {
                int i12 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(".", i12);
                if (indexOf3 == -1) {
                    return new nq.c[]{new nq.c(trim.substring(0, indexOf)), new nq.c(trim.substring(i11, indexOf2)), new nq.c(trim.substring(i12))};
                }
                int i13 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(".", i13);
                if (indexOf4 != -1) {
                    if (indexOf4 == -1 || trim.indexOf(".", indexOf4 + 1) == -1) {
                        return new nq.c[]{new nq.c(trim.substring(0, indexOf)), new nq.c(trim.substring(i11, indexOf2)), new nq.c(trim.substring(i12, indexOf3)), new nq.c(trim.substring(i13, indexOf4)), new nq.c(trim.substring(indexOf4 + 1))};
                    }
                    throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
                }
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
    }

    public String a() {
        nq.c[] cVarArr;
        if (this.f60594b == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (nq.c cVar : this.f60594b) {
            if (sb2.length() > 0) {
                sb2.append(CoreConstants.DOT);
            }
            if (cVar != null) {
                sb2.append(cVar);
            }
        }
        return sb2.toString();
    }

    public com.nimbusds.jose.c b() {
        return this.f60593a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(nq.c... cVarArr) {
        this.f60594b = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(com.nimbusds.jose.c cVar) {
        this.f60593a = cVar;
    }
}