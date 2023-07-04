package uc;

import bc.l;
import cc.e;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import rc.g;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private String f53409c;

    public b(e eVar) {
        super(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public vb.a c(sc.a aVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (aVar.f50324b.equals(MessageExtension.FIELD_DATA) && this.f53409c != null) {
                g(bArr, lVar);
            } else {
                this.f53409c = new String(lVar.d(4));
            }
        } else if (d.f53411g.containsKey(aVar.f50324b)) {
            this.f53409c = aVar.f50324b;
        } else {
            this.f53409c = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public boolean e(sc.a aVar) {
        return aVar.f50324b.equals(MessageExtension.FIELD_DATA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public boolean f(sc.a aVar) {
        return d.f53411g.containsKey(aVar.f50324b) || aVar.f50324b.equals("ilst");
    }

    protected void g(byte[] bArr, l lVar) {
        lVar.t(8L);
        this.f54462b.R(d.f53411g.get(this.f53409c).intValue(), new String(lVar.d(bArr.length - 8)));
    }
}