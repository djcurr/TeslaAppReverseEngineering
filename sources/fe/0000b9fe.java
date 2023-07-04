package vc;

import bc.l;
import bc.m;
import wc.g;
import wc.h;

/* loaded from: classes.dex */
public class a extends rb.a<d> {

    /* renamed from: c  reason: collision with root package name */
    private e f54463c;

    public a(cc.e eVar) {
        super(eVar);
        this.f54463c = new e(this);
    }

    private void g(m mVar, wc.b bVar) {
        new wc.c(mVar, bVar).a(this.f49333b);
    }

    private void h(m mVar, wc.b bVar) {
        new g(mVar, bVar);
    }

    private void i(m mVar, wc.b bVar) {
        new h(mVar, bVar).a(this.f49333b);
    }

    @Override // rb.a
    protected d b() {
        return new d();
    }

    @Override // rb.a
    public rb.a c(wc.b bVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (bVar.f55748b.equals("mvhd")) {
                i(lVar, bVar);
            } else if (bVar.f55748b.equals("ftyp")) {
                g(lVar, bVar);
            } else if (bVar.f55748b.equals("hdlr")) {
                return this.f54463c.a(new wc.e(lVar, bVar), this.f49332a);
            } else if (bVar.f55748b.equals("mdhd")) {
                h(lVar, bVar);
            }
        } else if (bVar.f55748b.equals("cmov")) {
            this.f49333b.a("Compressed MP4 movies not supported");
        }
        return this;
    }

    @Override // rb.a
    public boolean e(wc.b bVar) {
        return bVar.f55748b.equals("ftyp") || bVar.f55748b.equals("mvhd") || bVar.f55748b.equals("hdlr") || bVar.f55748b.equals("mdhd");
    }

    @Override // rb.a
    public boolean f(wc.b bVar) {
        return bVar.f55748b.equals("trak") || bVar.f55748b.equals("meta") || bVar.f55748b.equals("moov") || bVar.f55748b.equals("mdia");
    }
}