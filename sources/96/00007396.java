package ho;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import lo.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final io.a f29351a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f29352b;

    @KeepForSdk
    public a(io.a aVar, Matrix matrix) {
        this.f29351a = (io.a) Preconditions.checkNotNull(aVar);
        Rect boundingBox = aVar.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            b.e(boundingBox, matrix);
        }
        this.f29352b = boundingBox;
        Point[] cornerPoints = aVar.getCornerPoints();
        if (cornerPoints == null || matrix == null) {
            return;
        }
        b.b(cornerPoints, matrix);
    }

    public Rect a() {
        return this.f29352b;
    }

    public int b() {
        int format = this.f29351a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public String c() {
        return this.f29351a.a();
    }

    public int d() {
        return this.f29351a.b();
    }
}