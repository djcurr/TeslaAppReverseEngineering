package qf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    protected final r<Bitmap> f48092a = new d();

    /* renamed from: b  reason: collision with root package name */
    private final int f48093b;

    /* renamed from: c  reason: collision with root package name */
    private int f48094c;

    /* renamed from: d  reason: collision with root package name */
    private final v f48095d;

    /* renamed from: e  reason: collision with root package name */
    private int f48096e;

    public l(int i11, int i12, v vVar, pd.c cVar) {
        this.f48093b = i11;
        this.f48094c = i12;
        this.f48095d = vVar;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    private Bitmap h(int i11) {
        this.f48095d.d(i11);
        return Bitmap.createBitmap(1, i11, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i11) {
        Bitmap pop;
        while (this.f48096e > i11 && (pop = this.f48092a.pop()) != null) {
            int a11 = this.f48092a.a(pop);
            this.f48096e -= a11;
            this.f48095d.b(a11);
        }
    }

    @Override // pd.e
    /* renamed from: i */
    public synchronized Bitmap get(int i11) {
        int i12 = this.f48096e;
        int i13 = this.f48093b;
        if (i12 > i13) {
            k(i13);
        }
        Bitmap bitmap = this.f48092a.get(i11);
        if (bitmap != null) {
            int a11 = this.f48092a.a(bitmap);
            this.f48096e -= a11;
            this.f48095d.e(a11);
            return bitmap;
        }
        return h(i11);
    }

    @Override // pd.e, qd.h
    /* renamed from: j */
    public void a(Bitmap bitmap) {
        int a11 = this.f48092a.a(bitmap);
        if (a11 <= this.f48094c) {
            this.f48095d.c(a11);
            this.f48092a.e(bitmap);
            synchronized (this) {
                this.f48096e += a11;
            }
        }
    }
}