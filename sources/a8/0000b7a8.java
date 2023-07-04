package uc;

import bc.l;
import cc.e;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import rc.g;

/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private int f53407c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f53408d;

    public a(e eVar) {
        super(eVar);
        this.f53407c = 0;
        this.f53408d = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public vb.a c(sc.a aVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (aVar.f50324b.equals("keys")) {
                h(lVar);
            } else if (aVar.f50324b.equals(MessageExtension.FIELD_DATA)) {
                g(bArr, lVar);
            }
        } else {
            int a11 = bc.d.a(aVar.f50324b.getBytes(), 0, true);
            if (a11 > 0 && a11 < this.f53408d.size() + 1) {
                this.f53407c = a11 - 1;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public boolean e(sc.a aVar) {
        return aVar.f50324b.equals("hdlr") || aVar.f50324b.equals("keys") || aVar.f50324b.equals(MessageExtension.FIELD_DATA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vb.a
    public boolean f(sc.a aVar) {
        return aVar.f50324b.equals("ilst") || bc.d.a(aVar.f50324b.getBytes(), 0, true) <= this.f53408d.size();
    }

    protected void g(byte[] bArr, l lVar) {
        lVar.t(8L);
        this.f54462b.R(d.f53411g.get(this.f53408d.get(this.f53407c)).intValue(), new String(lVar.d(bArr.length - 8)));
    }

    protected void h(l lVar) {
        lVar.t(4L);
        int f11 = lVar.f();
        for (int i11 = 0; i11 < f11; i11++) {
            int f12 = lVar.f();
            lVar.t(4L);
            this.f53408d.add(new String(lVar.d(f12 - 8)));
        }
    }
}