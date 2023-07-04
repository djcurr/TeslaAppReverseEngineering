package com.google.mlkit.vision.face.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.vision.face.internal.f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class g extends com.google.mlkit.common.sdkinternal.f {

    /* renamed from: j  reason: collision with root package name */
    static final AtomicBoolean f17360j = new AtomicBoolean(true);

    /* renamed from: k  reason: collision with root package name */
    private static final lo.d f17361k = lo.d.b();

    /* renamed from: d  reason: collision with root package name */
    private final mo.e f17362d;

    /* renamed from: e  reason: collision with root package name */
    private final zzoc f17363e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoe f17364f;

    /* renamed from: g  reason: collision with root package name */
    private final b f17365g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17366h;

    /* renamed from: i  reason: collision with root package name */
    private final lo.a f17367i = new lo.a();

    public g(zzoc zzocVar, mo.e eVar, b bVar) {
        Preconditions.checkNotNull(eVar, "FaceDetectorOptions can not be null");
        this.f17362d = eVar;
        this.f17363e = zzocVar;
        this.f17365g = bVar;
        this.f17364f = zzoe.zza(com.google.mlkit.common.sdkinternal.i.c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((mo.a) it2.next()).g(-1);
        }
    }

    private final synchronized void n(final zzks zzksVar, long j11, final ko.a aVar, final int i11, final int i12) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f17363e.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.e
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                return g.this.j(elapsedRealtime, zzksVar, i11, i12, aVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f17360j.get()));
        zzdlVar.zza(Integer.valueOf(i11));
        zzdlVar.zze(Integer.valueOf(i12));
        zzdlVar.zzb(h.a(this.f17362d));
        final zzdn zzf = zzdlVar.zzf();
        final f fVar = new f(this);
        final zzoc zzocVar = this.f17363e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable(zzktVar, zzf, elapsedRealtime, fVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ f zze;

            @Override // java.lang.Runnable
            public final void run() {
                zzoc.this.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f17364f.zzc(true != this.f17366h ? 24303 : 24304, zzksVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f17366h = this.f17365g.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        this.f17365g.zzb();
        f17360j.set(true);
        zzoc zzocVar = this.f17363e;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f17366h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznr j(long j11, zzks zzksVar, int i11, int i12, ko.a aVar) {
        zzkf zzkfVar;
        zzlj zzljVar = new zzlj();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j11));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(f17360j.get()));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzljVar.zzg(zzkjVar.zzf());
        zzljVar.zze(h.a(this.f17362d));
        zzljVar.zzd(Integer.valueOf(i11));
        zzljVar.zzh(Integer.valueOf(i12));
        lo.d dVar = f17361k;
        int c11 = dVar.c(aVar);
        int d11 = dVar.d(aVar);
        zzke zzkeVar = new zzke();
        if (c11 == -1) {
            zzkfVar = zzkf.BITMAP;
        } else if (c11 == 35) {
            zzkfVar = zzkf.YUV_420_888;
        } else if (c11 == 842094169) {
            zzkfVar = zzkf.YV12;
        } else if (c11 == 16) {
            zzkfVar = zzkf.NV16;
        } else if (c11 != 17) {
            zzkfVar = zzkf.UNKNOWN_FORMAT;
        } else {
            zzkfVar = zzkf.NV21;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(d11));
        zzljVar.zzf(zzkeVar.zzd());
        zzll zzi = zzljVar.zzi();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f17366h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzkuVar.zzg(zzi);
        return zzof.zzf(zzkuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznr k(zzdn zzdnVar, int i11, zzjv zzjvVar) {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f17366h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i11));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        r2 = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // com.google.mlkit.common.sdkinternal.f
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List i(ko.a r21) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.g.i(ko.a):java.util.List");
    }
}