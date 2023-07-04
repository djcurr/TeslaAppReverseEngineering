package rf;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import gd.d;
import gd.i;
import md.k;

/* loaded from: classes3.dex */
public class a extends sf.a {

    /* renamed from: c  reason: collision with root package name */
    private final int f49561c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49562d;

    /* renamed from: e  reason: collision with root package name */
    private d f49563e;

    public a(int i11, int i12) {
        k.b(Boolean.valueOf(i11 > 0));
        k.b(Boolean.valueOf(i12 > 0));
        this.f49561c = i11;
        this.f49562d = i12;
    }

    @Override // sf.a, sf.b
    public d a() {
        if (this.f49563e == null) {
            this.f49563e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f49561c), Integer.valueOf(this.f49562d)));
        }
        return this.f49563e;
    }

    @Override // sf.a
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f49561c, this.f49562d);
    }
}