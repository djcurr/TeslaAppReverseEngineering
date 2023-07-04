package mo;

import android.graphics.PointF;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f38658a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f38659b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i11, PointF pointF) {
        this.f38658a = i11;
        this.f38659b = pointF;
    }

    public String toString() {
        zzv zza = zzw.zza("FaceLandmark");
        zza.zzb("type", this.f38658a);
        zza.zzc("position", this.f38659b);
        return zza.toString();
    }
}