package d50;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.k;

/* loaded from: classes5.dex */
public abstract class a implements c50.e {
    private int e(e40.b bVar) {
        return d.d(bVar).hashCode();
    }

    public static Hashtable f(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean h(boolean z11, c50.b bVar, c50.b[] bVarArr) {
        if (z11) {
            for (int length = bVarArr.length - 1; length >= 0; length--) {
                if (bVarArr[length] != null && i(bVar, bVarArr[length])) {
                    bVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i11 = 0; i11 != bVarArr.length; i11++) {
                if (bVarArr[i11] != null && i(bVar, bVarArr[i11])) {
                    bVarArr[i11] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c50.e
    public boolean a(c50.c cVar, c50.c cVar2) {
        c50.b[] i11 = cVar.i();
        c50.b[] i12 = cVar2.i();
        if (i11.length != i12.length) {
            return false;
        }
        boolean z11 = (i11[0].f() == null || i12[0].f() == null) ? false : !i11[0].f().f().j(i12[0].f().f());
        for (int i13 = 0; i13 != i11.length; i13++) {
            if (!h(z11, i11[i13], i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // c50.e
    public e40.b b(k kVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return g(kVar, str);
        }
        try {
            return d.p(str, 1);
        } catch (IOException unused) {
            throw new ASN1ParsingException("can't recode value for oid " + kVar.t());
        }
    }

    @Override // c50.e
    public int d(c50.c cVar) {
        c50.b[] i11 = cVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 != i11.length; i13++) {
            if (i11[i13].j()) {
                c50.a[] i14 = i11[i13].i();
                for (int i15 = 0; i15 != i14.length; i15++) {
                    i12 = (i12 ^ i14[i15].f().hashCode()) ^ e(i14[i15].h());
                }
            } else {
                i12 = (i12 ^ i11[i13].f().f().hashCode()) ^ e(i11[i13].f().h());
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e40.b g(k kVar, String str) {
        return new a1(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean i(c50.b bVar, c50.b bVar2) {
        return d.j(bVar, bVar2);
    }
}