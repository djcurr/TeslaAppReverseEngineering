package s3;

import android.util.Base64;
import java.util.List;
import v3.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f50200a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50201b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50202c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f50203d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50204e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f50205f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f50200a = (String) h.f(str);
        this.f50201b = (String) h.f(str2);
        this.f50202c = (String) h.f(str3);
        this.f50203d = (List) h.f(list);
        this.f50205f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f50203d;
    }

    public int c() {
        return this.f50204e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f50205f;
    }

    public String e() {
        return this.f50200a;
    }

    public String f() {
        return this.f50201b;
    }

    public String g() {
        return this.f50202c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f50200a + ", mProviderPackage: " + this.f50201b + ", mQuery: " + this.f50202c + ", mCertificates:");
        for (int i11 = 0; i11 < this.f50203d.size(); i11++) {
            sb2.append(" [");
            List<byte[]> list = this.f50203d.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f50204e);
        return sb2.toString();
    }
}