package c50;

import java.util.Vector;
import org.bouncycastle.asn1.k;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private e f8887a;

    /* renamed from: b  reason: collision with root package name */
    private Vector f8888b = new Vector();

    public d(e eVar) {
        this.f8887a = eVar;
    }

    public d a(a[] aVarArr) {
        this.f8888b.addElement(new b(aVarArr));
        return this;
    }

    public d b(k[] kVarArr, e40.b[] bVarArr) {
        a[] aVarArr = new a[kVarArr.length];
        for (int i11 = 0; i11 != kVarArr.length; i11++) {
            aVarArr[i11] = new a(kVarArr[i11], bVarArr[i11]);
        }
        return a(aVarArr);
    }

    public d c(k[] kVarArr, String[] strArr) {
        int length = strArr.length;
        e40.b[] bVarArr = new e40.b[length];
        for (int i11 = 0; i11 != length; i11++) {
            bVarArr[i11] = this.f8887a.b(kVarArr[i11], strArr[i11]);
        }
        return b(kVarArr, bVarArr);
    }

    public d d(k kVar, e40.b bVar) {
        this.f8888b.addElement(new b(kVar, bVar));
        return this;
    }

    public d e(k kVar, String str) {
        d(kVar, this.f8887a.b(kVar, str));
        return this;
    }

    public c f() {
        int size = this.f8888b.size();
        b[] bVarArr = new b[size];
        for (int i11 = 0; i11 != size; i11++) {
            bVarArr[i11] = (b) this.f8888b.elementAt(i11);
        }
        return new c(this.f8887a, bVarArr);
    }
}