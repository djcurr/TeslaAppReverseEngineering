package mp;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f38672m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f38673n = null;

    /* renamed from: k  reason: collision with root package name */
    private int f38674k;

    /* renamed from: l  reason: collision with root package name */
    private int f38675l;

    static {
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("AbstractFullBox.java", c.class);
        f38672m = bVar.f("method-execution", bVar.e("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        f38673n = bVar.f("method-execution", bVar.e("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    public int o() {
        if (!this.f38663c) {
            l();
        }
        return this.f38675l;
    }

    public int p() {
        if (!this.f38663c) {
            l();
        }
        return this.f38674k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long q(ByteBuffer byteBuffer) {
        this.f38674k = hb.d.l(byteBuffer);
        this.f38675l = hb.d.i(byteBuffer);
        return 4L;
    }

    public void r(int i11) {
        f.b().c(d40.b.c(f38673n, this, this, c40.a.d(i11)));
        this.f38675l = i11;
    }

    public void s(int i11) {
        f.b().c(d40.b.c(f38672m, this, this, c40.a.d(i11)));
        this.f38674k = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(ByteBuffer byteBuffer) {
        hb.e.i(byteBuffer, this.f38674k);
        hb.e.f(byteBuffer, this.f38675l);
    }
}