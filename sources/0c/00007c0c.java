package jo;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;

/* loaded from: classes2.dex */
public final class c implements io.a {

    /* renamed from: a  reason: collision with root package name */
    private final zzq f33895a;

    public c(zzq zzqVar) {
        this.f33895a = zzqVar;
    }

    @Override // io.a
    public final String a() {
        return this.f33895a.zzb;
    }

    @Override // io.a
    public final int b() {
        return this.f33895a.zzd;
    }

    @Override // io.a
    public final Rect getBoundingBox() {
        zzq zzqVar = this.f33895a;
        if (zzqVar.zze == null) {
            return null;
        }
        int i11 = 0;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzqVar.zze;
            if (i11 < pointArr.length) {
                Point point = pointArr[i11];
                i13 = Math.min(i13, point.x);
                i12 = Math.max(i12, point.x);
                i14 = Math.min(i14, point.y);
                i15 = Math.max(i15, point.y);
                i11++;
            } else {
                return new Rect(i13, i14, i12, i15);
            }
        }
    }

    @Override // io.a
    public final Point[] getCornerPoints() {
        return this.f33895a.zze;
    }

    @Override // io.a
    public final int getFormat() {
        return this.f33895a.zza;
    }
}