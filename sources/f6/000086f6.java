package mo;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f38644a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38645b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38646c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38647d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38648e;

    /* renamed from: f  reason: collision with root package name */
    private final float f38649f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f38650g;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f38651a = 1;

        /* renamed from: b  reason: collision with root package name */
        private int f38652b = 1;

        /* renamed from: c  reason: collision with root package name */
        private int f38653c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f38654d = 1;

        /* renamed from: e  reason: collision with root package name */
        private boolean f38655e = false;

        /* renamed from: f  reason: collision with root package name */
        private float f38656f = 0.1f;

        /* renamed from: g  reason: collision with root package name */
        private Executor f38657g;

        public e a() {
            return new e(this.f38651a, this.f38652b, this.f38653c, this.f38654d, this.f38655e, this.f38656f, this.f38657g, null);
        }

        public a b(float f11) {
            this.f38656f = f11;
            return this;
        }
    }

    /* synthetic */ e(int i11, int i12, int i13, int i14, boolean z11, float f11, Executor executor, g gVar) {
        this.f38644a = i11;
        this.f38645b = i12;
        this.f38646c = i13;
        this.f38647d = i14;
        this.f38648e = z11;
        this.f38649f = f11;
        this.f38650g = executor;
    }

    public final float a() {
        return this.f38649f;
    }

    public final int b() {
        return this.f38646c;
    }

    public final int c() {
        return this.f38645b;
    }

    public final int d() {
        return this.f38644a;
    }

    public final int e() {
        return this.f38647d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return Float.floatToIntBits(this.f38649f) == Float.floatToIntBits(eVar.f38649f) && Objects.equal(Integer.valueOf(this.f38644a), Integer.valueOf(eVar.f38644a)) && Objects.equal(Integer.valueOf(this.f38645b), Integer.valueOf(eVar.f38645b)) && Objects.equal(Integer.valueOf(this.f38647d), Integer.valueOf(eVar.f38647d)) && Objects.equal(Boolean.valueOf(this.f38648e), Boolean.valueOf(eVar.f38648e)) && Objects.equal(Integer.valueOf(this.f38646c), Integer.valueOf(eVar.f38646c)) && Objects.equal(this.f38650g, eVar.f38650g);
        }
        return false;
    }

    public final Executor f() {
        return this.f38650g;
    }

    public final boolean g() {
        return this.f38648e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f38649f)), Integer.valueOf(this.f38644a), Integer.valueOf(this.f38645b), Integer.valueOf(this.f38647d), Boolean.valueOf(this.f38648e), Integer.valueOf(this.f38646c), this.f38650g);
    }

    public String toString() {
        zzv zza = zzw.zza("FaceDetectorOptions");
        zza.zzb("landmarkMode", this.f38644a);
        zza.zzb("contourMode", this.f38645b);
        zza.zzb("classificationMode", this.f38646c);
        zza.zzb("performanceMode", this.f38647d);
        zza.zzd("trackingEnabled", this.f38648e);
        zza.zza("minFaceSize", this.f38649f);
        return zza.toString();
    }
}