package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17342a;

    /* renamed from: b  reason: collision with root package name */
    private final mo.e f17343b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17344c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17345d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17346e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoc f17347f;

    /* renamed from: g  reason: collision with root package name */
    private zzoy f17348g;

    /* renamed from: h  reason: collision with root package name */
    private zzoy f17349h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, mo.e eVar, zzoc zzocVar) {
        this.f17342a = context;
        this.f17343b = eVar;
        this.f17347f = zzocVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face") > 0;
    }

    private final void d() {
        if (this.f17343b.c() != 2) {
            if (this.f17349h == null) {
                this.f17349h = e(new zzou(this.f17343b.e(), this.f17343b.d(), this.f17343b.b(), 1, this.f17343b.g(), this.f17343b.a()));
                return;
            }
            return;
        }
        if (this.f17348g == null) {
            this.f17348g = e(new zzou(this.f17343b.e(), 1, 1, 2, false, this.f17343b.a()));
        }
        if ((this.f17343b.d() == 2 || this.f17343b.b() == 2 || this.f17343b.e() == 2) && this.f17349h == null) {
            this.f17349h = e(new zzou(this.f17343b.e(), this.f17343b.d(), this.f17343b.b(), 1, this.f17343b.g(), this.f17343b.a()));
        }
    }

    private final zzoy e(zzou zzouVar) {
        return this.f17345d ? c(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar) : c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
    }

    private static List f(zzoy zzoyVar, ko.a aVar) {
        if (aVar.f() == -1) {
            aVar = ko.a.a(lo.c.f().d(aVar, false), aVar.k(), aVar.g(), aVar.j(), 17);
        }
        try {
            List<zzow> zzd = zzoyVar.zzd(lo.d.b().a(aVar), new zzoq(aVar.f(), aVar.k(), aVar.g(), lo.b.a(aVar.j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzow zzowVar : zzd) {
                arrayList.add(new mo.a(zzowVar, aVar.e()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run face detector.", 13, e11);
        }
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final Pair a(ko.a aVar) {
        List list;
        if (this.f17349h == null && this.f17348g == null) {
            zzd();
        }
        if (!this.f17344c) {
            try {
                zzoy zzoyVar = this.f17349h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f17348g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f17344c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init face detector.", 13, e11);
            }
        }
        zzoy zzoyVar3 = this.f17349h;
        List list2 = null;
        if (zzoyVar3 != null) {
            list = f(zzoyVar3, aVar);
            if (!this.f17343b.g()) {
                g.m(list);
            }
        } else {
            list = null;
        }
        zzoy zzoyVar4 = this.f17348g;
        if (zzoyVar4 != null) {
            list2 = f(zzoyVar4, aVar);
            g.m(list2);
        }
        return new Pair(list, list2);
    }

    final zzoy c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2, zzou zzouVar) {
        return zzpa.zza(DynamiteModule.load(this.f17342a, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f17342a), zzouVar);
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f17349h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f17349h = null;
            }
            zzoy zzoyVar2 = this.f17348g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f17348g = null;
            }
        } catch (RemoteException e11) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e11);
        }
        this.f17344c = false;
    }

    @Override // com.google.mlkit.vision.face.internal.b
    public final boolean zzd() {
        if (this.f17349h == null && this.f17348g == null) {
            if (DynamiteModule.getLocalVersion(this.f17342a, "com.google.mlkit.dynamite.face") > 0) {
                this.f17345d = true;
                try {
                    d();
                } catch (RemoteException e11) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e11);
                } catch (DynamiteModule.LoadingException e12) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e12);
                }
            } else {
                this.f17345d = false;
                try {
                    d();
                } catch (RemoteException e13) {
                    h.c(this.f17347f, this.f17345d, zzks.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to create thin face detector.", 13, e13);
                } catch (DynamiteModule.LoadingException e14) {
                    if (!this.f17346e) {
                        m.c(this.f17342a, "face");
                        this.f17346e = true;
                    }
                    h.c(this.f17347f, this.f17345d, zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e14);
                }
            }
            h.c(this.f17347f, this.f17345d, zzks.NO_ERROR);
            return this.f17345d;
        }
        return this.f17345d;
    }
}