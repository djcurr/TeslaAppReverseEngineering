package mo;

import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f38642a;

    /* renamed from: b  reason: collision with root package name */
    private final List f38643b;

    public b(int i11, List list) {
        this.f38642a = i11;
        this.f38643b = list;
    }

    public String toString() {
        zzv zza = zzw.zza("FaceContour");
        zza.zzb("type", this.f38642a);
        zza.zzc("points", this.f38643b.toArray());
        return zza.toString();
    }
}