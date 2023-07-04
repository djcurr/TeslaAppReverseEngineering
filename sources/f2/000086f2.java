package mo;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f38632a;

    /* renamed from: b  reason: collision with root package name */
    private int f38633b;

    /* renamed from: c  reason: collision with root package name */
    private final float f38634c;

    /* renamed from: d  reason: collision with root package name */
    private final float f38635d;

    /* renamed from: e  reason: collision with root package name */
    private final float f38636e;

    /* renamed from: f  reason: collision with root package name */
    private final float f38637f;

    /* renamed from: g  reason: collision with root package name */
    private final float f38638g;

    /* renamed from: h  reason: collision with root package name */
    private final float f38639h;

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray f38640i = new SparseArray();

    /* renamed from: j  reason: collision with root package name */
    private final SparseArray f38641j = new SparseArray();

    public a(zzf zzfVar, Matrix matrix) {
        zzn[] zznVarArr;
        zzd[] zzdVarArr;
        int length;
        float f11 = zzfVar.zzc;
        float f12 = zzfVar.zze / 2.0f;
        float f13 = zzfVar.zzd;
        float f14 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f11 - f12), (int) (f13 - f14), (int) (f11 + f12), (int) (f13 + f14));
        this.f38632a = rect;
        if (matrix != null) {
            lo.b.e(rect, matrix);
        }
        this.f38633b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (i(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    lo.b.c(pointF, matrix);
                }
                SparseArray sparseArray = this.f38640i;
                int i11 = zznVar.zzd;
                sparseArray.put(i11, new f(i11, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i12 = zzdVar.zzb;
            if (h(i12)) {
                PointF[] pointFArr = zzdVar.zza;
                Objects.requireNonNull(pointFArr);
                long length2 = pointFArr.length + 5 + (length / 10);
                ArrayList arrayList = new ArrayList(length2 > 2147483647L ? Integer.MAX_VALUE : (int) length2);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    lo.b.d(arrayList, matrix);
                }
                this.f38641j.put(i12, new b(i12, arrayList));
            }
        }
        this.f38637f = zzfVar.zzi;
        this.f38638g = zzfVar.zzg;
        this.f38639h = zzfVar.zzh;
        this.f38636e = zzfVar.zzm;
        this.f38635d = zzfVar.zzk;
        this.f38634c = zzfVar.zzl;
    }

    private static boolean h(int i11) {
        return i11 <= 15 && i11 > 0;
    }

    private static boolean i(int i11) {
        return i11 == 0 || i11 == 1 || i11 == 7 || i11 == 3 || i11 == 9 || i11 == 4 || i11 == 10 || i11 == 5 || i11 == 11 || i11 == 6;
    }

    public Rect a() {
        return this.f38632a;
    }

    public b b(int i11) {
        return (b) this.f38641j.get(i11);
    }

    public float c() {
        return this.f38638g;
    }

    public f d(int i11) {
        return (f) this.f38640i.get(i11);
    }

    public final SparseArray e() {
        return this.f38641j;
    }

    public final void f(SparseArray sparseArray) {
        this.f38641j.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f38641j.put(sparseArray.keyAt(i11), (b) sparseArray.valueAt(i11));
        }
    }

    public final void g(int i11) {
        this.f38633b = -1;
    }

    public String toString() {
        zzv zza = zzw.zza("Face");
        zza.zzc("boundingBox", this.f38632a);
        zza.zzb("trackingId", this.f38633b);
        zza.zza("rightEyeOpenProbability", this.f38634c);
        zza.zza("leftEyeOpenProbability", this.f38635d);
        zza.zza("smileProbability", this.f38636e);
        zza.zza("eulerX", this.f38637f);
        zza.zza("eulerY", this.f38638g);
        zza.zza("eulerZ", this.f38639h);
        zzv zza2 = zzw.zza("Landmarks");
        for (int i11 = 0; i11 <= 11; i11++) {
            if (i(i11)) {
                zza2.zzc("landmark_" + i11, d(i11));
            }
        }
        zza.zzc("landmarks", zza2.toString());
        zzv zza3 = zzw.zza("Contours");
        for (int i12 = 1; i12 <= 15; i12++) {
            zza3.zzc("Contour_" + i12, b(i12));
        }
        zza.zzc("contours", zza3.toString());
        return zza.toString();
    }

    public a(zzow zzowVar, Matrix matrix) {
        Rect zzh = zzowVar.zzh();
        this.f38632a = zzh;
        if (matrix != null) {
            lo.b.e(zzh, matrix);
        }
        this.f38633b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (i(zzpcVar.zza())) {
                PointF zzb = zzpcVar.zzb();
                if (matrix != null) {
                    lo.b.c(zzb, matrix);
                }
                this.f38640i.put(zzpcVar.zza(), new f(zzpcVar.zza(), zzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int zza = zzosVar.zza();
            if (h(zza)) {
                List zzb2 = zzosVar.zzb();
                Objects.requireNonNull(zzb2);
                ArrayList arrayList = new ArrayList(zzb2);
                if (matrix != null) {
                    lo.b.d(arrayList, matrix);
                }
                this.f38641j.put(zza, new b(zza, arrayList));
            }
        }
        this.f38637f = zzowVar.zzf();
        this.f38638g = zzowVar.zzb();
        this.f38639h = -zzowVar.zzd();
        this.f38636e = zzowVar.zze();
        this.f38635d = zzowVar.zza();
        this.f38634c = zzowVar.zzc();
    }
}