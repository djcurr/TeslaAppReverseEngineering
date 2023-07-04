package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.m;
import java.util.List;

/* loaded from: classes2.dex */
final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17370a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f17371b;

    /* renamed from: c  reason: collision with root package name */
    private final mo.e f17372c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17373d;

    /* renamed from: e  reason: collision with root package name */
    private final zzoc f17374e;

    /* renamed from: f  reason: collision with root package name */
    private zzj f17375f;

    /* renamed from: g  reason: collision with root package name */
    private zzj f17376g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, mo.e eVar, zzoc zzocVar) {
        this.f17371b = context;
        this.f17372c = eVar;
        this.f17373d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.f17374e = zzocVar;
    }

    static int b(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid classification type: " + i11);
        }
        return 0;
    }

    static int c(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid landmark type: " + i11);
        }
        return 0;
    }

    private static int d(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid mode type: " + i11);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5 A[LOOP:0: B:12:0x00a3->B:13:0x00a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List e(com.google.android.gms.internal.mlkit_vision_face.zzj r15, ko.a r16) {
        /*
            r14 = this;
            com.google.android.gms.internal.mlkit_vision_face.zzp r11 = new com.google.android.gms.internal.mlkit_vision_face.zzp     // Catch: android.os.RemoteException -> Lb9
            int r2 = r16.k()     // Catch: android.os.RemoteException -> Lb9
            int r3 = r16.g()     // Catch: android.os.RemoteException -> Lb9
            r4 = 0
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: android.os.RemoteException -> Lb9
            int r0 = r16.j()     // Catch: android.os.RemoteException -> Lb9
            int r7 = lo.b.a(r0)     // Catch: android.os.RemoteException -> Lb9
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.os.RemoteException -> Lb9
            int r0 = r16.f()     // Catch: android.os.RemoteException -> Lb9
            r1 = 35
            r12 = 0
            if (r0 != r1) goto L89
            r13 = r14
            int r0 = r13.f17373d     // Catch: android.os.RemoteException -> Lb7
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            if (r0 < r1) goto L8a
            android.media.Image$Plane[] r0 = r16.i()     // Catch: android.os.RemoteException -> Lb7
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: android.os.RemoteException -> Lb7
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0     // Catch: android.os.RemoteException -> Lb7
            r1 = r0[r12]     // Catch: android.os.RemoteException -> Lb7
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> Lb7
            r1 = 1
            r3 = r0[r1]     // Catch: android.os.RemoteException -> Lb7
            java.nio.ByteBuffer r3 = r3.getBuffer()     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> Lb7
            r4 = 2
            r5 = r0[r4]     // Catch: android.os.RemoteException -> Lb7
            java.nio.ByteBuffer r5 = r5.getBuffer()     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> Lb7
            r6 = r0[r12]     // Catch: android.os.RemoteException -> Lb7
            int r6 = r6.getPixelStride()     // Catch: android.os.RemoteException -> Lb7
            r7 = r0[r1]     // Catch: android.os.RemoteException -> Lb7
            int r7 = r7.getPixelStride()     // Catch: android.os.RemoteException -> Lb7
            r8 = r0[r4]     // Catch: android.os.RemoteException -> Lb7
            int r8 = r8.getPixelStride()     // Catch: android.os.RemoteException -> Lb7
            r9 = r0[r12]     // Catch: android.os.RemoteException -> Lb7
            int r9 = r9.getRowStride()     // Catch: android.os.RemoteException -> Lb7
            r1 = r0[r1]     // Catch: android.os.RemoteException -> Lb7
            int r10 = r1.getRowStride()     // Catch: android.os.RemoteException -> Lb7
            r0 = r0[r4]     // Catch: android.os.RemoteException -> Lb7
            int r0 = r0.getRowStride()     // Catch: android.os.RemoteException -> Lb7
            r1 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            com.google.android.gms.internal.mlkit_vision_face.zzf[] r0 = r1.zzf(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> Lb7
            r1 = r16
            goto L9d
        L89:
            r13 = r14
        L8a:
            lo.c r0 = lo.c.f()     // Catch: android.os.RemoteException -> Lb7
            r1 = r16
            java.nio.ByteBuffer r0 = r0.d(r1, r12)     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> Lb7
            r2 = r15
            com.google.android.gms.internal.mlkit_vision_face.zzf[] r0 = r15.zze(r0, r11)     // Catch: android.os.RemoteException -> Lb7
        L9d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
        La3:
            if (r12 >= r3) goto Lb6
            r4 = r0[r12]
            mo.a r5 = new mo.a
            android.graphics.Matrix r6 = r16.e()
            r5.<init>(r4, r6)
            r2.add(r5)
            int r12 = r12 + 1
            goto La3
        Lb6:
            return r2
        Lb7:
            r0 = move-exception
            goto Lbb
        Lb9:
            r0 = move-exception
            r13 = r14
        Lbb:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            r2 = 13
            java.lang.String r3 = "Failed to detect with legacy face detector"
            r1.<init>(r3, r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.j.e(com.google.android.gms.internal.mlkit_vision_face.zzj, ko.a):java.util.List");
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final Pair a(ko.a aVar) {
        List list;
        if (this.f17375f == null && this.f17376g == null) {
            zzd();
        }
        zzj zzjVar = this.f17375f;
        if (zzjVar == null && this.f17376g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List list2 = null;
        if (zzjVar != null) {
            list = e(zzjVar, aVar);
            if (!this.f17372c.g()) {
                g.m(list);
            }
        } else {
            list = null;
        }
        zzj zzjVar2 = this.f17376g;
        if (zzjVar2 != null) {
            list2 = e(zzjVar2, aVar);
            g.m(list2);
        }
        return new Pair(list, list2);
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final void zzb() {
        zzj zzjVar = this.f17375f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e11);
            }
            this.f17375f = null;
        }
        zzj zzjVar2 = this.f17376g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException e12) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e12);
            }
            this.f17376g = null;
        }
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final boolean zzd() {
        if (this.f17375f == null && this.f17376g == null) {
            try {
                zzm zza = zzl.zza(DynamiteModule.load(this.f17371b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
                IObjectWrapper wrap = ObjectWrapper.wrap(this.f17371b);
                if (this.f17372c.c() == 2) {
                    if (this.f17376g == null) {
                        this.f17376g = zza.zzd(wrap, new zzh(2, 2, 0, true, false, this.f17372c.a()));
                    }
                    if ((this.f17372c.d() == 2 || this.f17372c.b() == 2 || this.f17372c.e() == 2) && this.f17375f == null) {
                        this.f17375f = zza.zzd(wrap, new zzh(d(this.f17372c.e()), c(this.f17372c.d()), b(this.f17372c.b()), false, this.f17372c.g(), this.f17372c.a()));
                    }
                } else if (this.f17375f == null) {
                    this.f17375f = zza.zzd(wrap, new zzh(d(this.f17372c.e()), c(this.f17372c.d()), b(this.f17372c.b()), false, this.f17372c.g(), this.f17372c.a()));
                }
                if (this.f17375f == null && this.f17376g == null && !this.f17370a) {
                    Log.d("LegacyFaceDelegate", "Request face optional module download.");
                    m.c(this.f17371b, "barcode");
                    this.f17370a = true;
                }
                h.c(this.f17374e, false, zzks.NO_ERROR);
                return false;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create legacy face detector.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
            }
        }
        return false;
    }
}