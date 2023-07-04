package t;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.WindowManager;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.q1;

/* loaded from: classes.dex */
public final class r0 implements androidx.camera.core.impl.q1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Size f51154b = new Size(1920, 1080);

    /* renamed from: a  reason: collision with root package name */
    final WindowManager f51155a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f51156a;

        static {
            int[] iArr = new int[q1.a.values().length];
            f51156a = iArr;
            try {
                iArr[q1.a.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51156a[q1.a.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51156a[q1.a.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51156a[q1.a.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public r0(Context context) {
        this.f51155a = (WindowManager) context.getSystemService("window");
    }

    private Size b() {
        Size size;
        Point point = new Point();
        this.f51155a.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f51154b;
        return width > size2.getWidth() * size2.getHeight() ? size2 : size;
    }

    @Override // androidx.camera.core.impl.q1
    public androidx.camera.core.impl.d0 a(q1.a aVar) {
        androidx.camera.core.impl.x0 I = androidx.camera.core.impl.x0.I();
        g1.b bVar = new g1.b();
        bVar.q(1);
        q1.a aVar2 = q1.a.PREVIEW;
        if (aVar == aVar2) {
            x.e.a(bVar);
        }
        I.p(androidx.camera.core.impl.p1.f2354h, bVar.m());
        I.p(androidx.camera.core.impl.p1.f2356j, q0.f51149a);
        a0.a aVar3 = new a0.a();
        int i11 = a.f51156a[aVar.ordinal()];
        if (i11 == 1) {
            aVar3.n(2);
        } else if (i11 == 2 || i11 == 3 || i11 == 4) {
            aVar3.n(1);
        }
        I.p(androidx.camera.core.impl.p1.f2355i, aVar3.h());
        I.p(androidx.camera.core.impl.p1.f2357k, aVar == q1.a.IMAGE_CAPTURE ? q1.f51150c : m0.f51103a);
        if (aVar == aVar2) {
            I.p(androidx.camera.core.impl.p0.f2352f, b());
        }
        I.p(androidx.camera.core.impl.p0.f2349c, Integer.valueOf(this.f51155a.getDefaultDisplay().getRotation()));
        return androidx.camera.core.impl.b1.G(I);
    }
}