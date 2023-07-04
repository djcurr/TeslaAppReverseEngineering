package ta;

import android.graphics.Bitmap;
import fa.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0513a {

    /* renamed from: a  reason: collision with root package name */
    private final ka.e f51817a;

    /* renamed from: b  reason: collision with root package name */
    private final ka.b f51818b;

    public b(ka.e eVar, ka.b bVar) {
        this.f51817a = eVar;
        this.f51818b = bVar;
    }

    @Override // fa.a.InterfaceC0513a
    public void a(Bitmap bitmap) {
        this.f51817a.b(bitmap);
    }

    @Override // fa.a.InterfaceC0513a
    public byte[] b(int i11) {
        ka.b bVar = this.f51818b;
        if (bVar == null) {
            return new byte[i11];
        }
        return (byte[]) bVar.f(i11, byte[].class);
    }

    @Override // fa.a.InterfaceC0513a
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        return this.f51817a.e(i11, i12, config);
    }

    @Override // fa.a.InterfaceC0513a
    public int[] d(int i11) {
        ka.b bVar = this.f51818b;
        if (bVar == null) {
            return new int[i11];
        }
        return (int[]) bVar.f(i11, int[].class);
    }

    @Override // fa.a.InterfaceC0513a
    public void e(byte[] bArr) {
        ka.b bVar = this.f51818b;
        if (bVar == null) {
            return;
        }
        bVar.e(bArr);
    }

    @Override // fa.a.InterfaceC0513a
    public void f(int[] iArr) {
        ka.b bVar = this.f51818b;
        if (bVar == null) {
            return;
        }
        bVar.e(iArr);
    }
}