package eo;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;
import com.google.mlkit.common.sdkinternal.l;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Map f25216e;

    /* renamed from: a  reason: collision with root package name */
    private final String f25217a;

    /* renamed from: b  reason: collision with root package name */
    private final fo.a f25218b;

    /* renamed from: c  reason: collision with root package name */
    private final l f25219c;

    /* renamed from: d  reason: collision with root package name */
    private String f25220d;

    static {
        new EnumMap(fo.a.class);
        f25216e = new EnumMap(fo.a.class);
    }

    @KeepForSdk
    public String a() {
        return this.f25220d;
    }

    @KeepForSdk
    public String b() {
        String str = this.f25217a;
        return str != null ? str : (String) f25216e.get(this.f25218b);
    }

    @KeepForSdk
    public l c() {
        return this.f25219c;
    }

    @KeepForSdk
    public String d() {
        String str = this.f25217a;
        return str != null ? str : "COM.GOOGLE.BASE_".concat(String.valueOf((String) f25216e.get(this.f25218b)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Objects.equal(this.f25217a, bVar.f25217a) && Objects.equal(this.f25218b, bVar.f25218b) && Objects.equal(this.f25219c, bVar.f25219c);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f25217a, this.f25218b, this.f25219c);
    }

    public String toString() {
        zzw zzb = zzx.zzb("RemoteModel");
        zzb.zza("modelName", this.f25217a);
        zzb.zza("baseModel", this.f25218b);
        zzb.zza("modelType", this.f25219c);
        return zzb.toString();
    }
}