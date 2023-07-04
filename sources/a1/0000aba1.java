package pv;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.camera.core.g0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import mo.e;
import pv.z;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f46929a;

    /* loaded from: classes2.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<mo.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46930a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final mo.d invoke() {
            mo.d a11 = mo.c.a(new e.a().b(0.2f).a());
            kotlin.jvm.internal.s.f(a11, "getClient(\n      FaceDet…f)\n        .build()\n    )");
            return a11;
        }
    }

    public a0() {
        vz.k a11;
        a11 = vz.m.a(a.f46930a);
        this.f46929a = a11;
    }

    private final mo.d b() {
        return (mo.d) this.f46929a.getValue();
    }

    private final boolean c(Rect rect, ko.a aVar, float f11) {
        int g11 = aVar.g() / 2;
        float min = (f11 * Math.min(aVar.k(), aVar.g())) / 2;
        float k11 = aVar.k() / 2;
        if (rect.left > k11 - min && rect.right < k11 + min) {
            float f12 = g11;
            if (rect.top > f12 - min && rect.bottom < f12 + min) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean d(a0 a0Var, Rect rect, ko.a aVar, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        return a0Var.c(rect, aVar, f11);
    }

    public final z a(g0 image) {
        ArrayList arrayList;
        kotlin.jvm.internal.s.g(image, "image");
        ko.a b11 = t.b(image);
        if (b11 == null) {
            return z.c.f47000b;
        }
        Task<List<mo.a>> c11 = b().c(b11);
        kotlin.jvm.internal.s.f(c11, "faceDetector.process(inputImage)");
        try {
            Tasks.await(c11);
            List<mo.a> result = c11.getResult();
            if (result == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : result) {
                    Rect a11 = ((mo.a) obj).a();
                    kotlin.jvm.internal.s.f(a11, "it.boundingBox");
                    if (d(this, a11, b11, BitmapDescriptorFactory.HUE_RED, 2, null)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                return z.c.f47000b;
            }
            if (arrayList.size() == 1) {
                float c12 = ((mo.a) arrayList.get(0)).c();
                Bitmap d11 = t.d(b11);
                if (d11 == null) {
                    return z.c.f47000b;
                }
                if (-10.0f >= c12 || c12 >= 10.0f) {
                    if (c12 < -15.0f) {
                        return new z.d(d11);
                    }
                    if (15.0f < c12) {
                        return new z.b(d11);
                    }
                    return z.c.f47000b;
                }
                return new z.a(d11);
            }
            return z.c.f47000b;
        } catch (ExecutionException unused) {
            return z.e.f47001b;
        }
    }
}