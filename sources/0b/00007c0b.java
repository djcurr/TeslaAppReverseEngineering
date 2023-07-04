package jo;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpr;

/* loaded from: classes2.dex */
public final class b implements io.a {

    /* renamed from: a  reason: collision with root package name */
    private final zzpr f33894a;

    public b(zzpr zzprVar) {
        this.f33894a = zzprVar;
    }

    @Override // io.a
    public final String a() {
        return this.f33894a.zzm();
    }

    @Override // io.a
    public final int b() {
        return this.f33894a.zzb();
    }

    @Override // io.a
    public final Rect getBoundingBox() {
        Point[] zzo = this.f33894a.zzo();
        if (zzo == null) {
            return null;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
        }
        return new Rect(i12, i13, i11, i14);
    }

    @Override // io.a
    public final Point[] getCornerPoints() {
        return this.f33894a.zzo();
    }

    @Override // io.a
    public final int getFormat() {
        return this.f33894a.zza();
    }
}