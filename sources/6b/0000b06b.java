package rc;

import bc.l;

/* loaded from: classes.dex */
public class a extends vb.a<d> {

    /* renamed from: c  reason: collision with root package name */
    private e f49334c;

    public a(cc.e eVar) {
        super(eVar);
        this.f49334c = new e(this);
    }

    @Override // vb.a
    protected d b() {
        return new d();
    }

    @Override // vb.a
    public vb.a c(sc.a aVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (aVar.f50324b.equals("mvhd")) {
                new sc.f(lVar, aVar).a(this.f54462b);
            } else if (aVar.f50324b.equals("ftyp")) {
                new sc.b(lVar, aVar).a(this.f54462b);
            } else if (aVar.f50324b.equals("hdlr")) {
                return this.f49334c.a(new sc.d(lVar, aVar).a(), this.f54461a);
            } else if (aVar.f50324b.equals("mdhd")) {
                new sc.e(lVar, aVar);
            }
        } else if (aVar.f50324b.equals("cmov")) {
            this.f54462b.a("Compressed QuickTime movies not supported");
        }
        return this;
    }

    @Override // vb.a
    public boolean e(sc.a aVar) {
        return aVar.f50324b.equals("ftyp") || aVar.f50324b.equals("mvhd") || aVar.f50324b.equals("hdlr") || aVar.f50324b.equals("mdhd");
    }

    @Override // vb.a
    public boolean f(sc.a aVar) {
        return aVar.f50324b.equals("trak") || aVar.f50324b.equals("udta") || aVar.f50324b.equals("meta") || aVar.f50324b.equals("moov") || aVar.f50324b.equals("mdia");
    }
}