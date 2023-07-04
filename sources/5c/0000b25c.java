package se;

import android.graphics.Bitmap;
import android.graphics.Rect;
import df.d;
import pe.c;

/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f50394e = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final pe.b f50395a;

    /* renamed from: b  reason: collision with root package name */
    private bf.a f50396b;

    /* renamed from: c  reason: collision with root package name */
    private d f50397c;

    /* renamed from: d  reason: collision with root package name */
    private final d.b f50398d;

    /* loaded from: classes3.dex */
    class a implements d.b {
        a() {
        }

        @Override // df.d.b
        public void a(int i11, Bitmap bitmap) {
        }

        @Override // df.d.b
        public qd.a<Bitmap> b(int i11) {
            return b.this.f50395a.d(i11);
        }
    }

    public b(pe.b bVar, bf.a aVar) {
        a aVar2 = new a();
        this.f50398d = aVar2;
        this.f50395a = bVar;
        this.f50396b = aVar;
        this.f50397c = new d(aVar, aVar2);
    }

    @Override // pe.c
    public boolean a(int i11, Bitmap bitmap) {
        try {
            this.f50397c.g(i11, bitmap);
            return true;
        } catch (IllegalStateException e11) {
            nd.a.i(f50394e, e11, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i11));
            return false;
        }
    }

    @Override // pe.c
    public int c() {
        return this.f50396b.getHeight();
    }

    @Override // pe.c
    public void d(Rect rect) {
        bf.a e11 = this.f50396b.e(rect);
        if (e11 != this.f50396b) {
            this.f50396b = e11;
            this.f50397c = new d(e11, this.f50398d);
        }
    }

    @Override // pe.c
    public int e() {
        return this.f50396b.getWidth();
    }
}