package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.internal.vision.zzp;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzc extends com.google.android.gms.internal.vision.zzm<zzg> {
    private final zze zzda;

    public zzc(Context context, zze zzeVar) {
        super(context, "FaceNativeHandle", "face");
        this.zzda = zzeVar;
        zzq();
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final /* synthetic */ zzg zza(DynamiteModule dynamiteModule, Context context) {
        zzj asInterface;
        if (zzp.zza(context, "com.google.android.gms.vision.dynamite.face")) {
            asInterface = zzk.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"));
        } else {
            asInterface = zzk.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        }
        if (asInterface == null) {
            return null;
        }
        return asInterface.newFaceDetector(ObjectWrapper.wrap(context), this.zzda);
    }

    public final Face[] zzb(ByteBuffer byteBuffer, zzn zznVar) {
        Landmark[] landmarkArr;
        FaceParcel[] faceParcelArr;
        Face[] faceArr;
        Contour[] contourArr;
        int i11 = 0;
        if (isOperational()) {
            try {
                FaceParcel[] zzc = zzq().zzc(ObjectWrapper.wrap(byteBuffer), zznVar);
                Face[] faceArr2 = new Face[zzc.length];
                int i12 = 0;
                while (i12 < zzc.length) {
                    FaceParcel faceParcel = zzc[i12];
                    int i13 = faceParcel.f14809id;
                    PointF pointF = new PointF(faceParcel.centerX, faceParcel.centerY);
                    float f11 = faceParcel.width;
                    float f12 = faceParcel.height;
                    float f13 = faceParcel.zzdb;
                    float f14 = faceParcel.zzdc;
                    float f15 = faceParcel.zzdd;
                    LandmarkParcel[] landmarkParcelArr = faceParcel.zzde;
                    if (landmarkParcelArr == null) {
                        faceParcelArr = zzc;
                        faceArr = faceArr2;
                        landmarkArr = new Landmark[i11];
                    } else {
                        landmarkArr = new Landmark[landmarkParcelArr.length];
                        int i14 = i11;
                        while (i14 < landmarkParcelArr.length) {
                            LandmarkParcel landmarkParcel = landmarkParcelArr[i14];
                            landmarkArr[i14] = new Landmark(new PointF(landmarkParcel.f14810x, landmarkParcel.f14811y), landmarkParcel.type);
                            i14++;
                            zzc = zzc;
                            faceArr2 = faceArr2;
                            landmarkParcelArr = landmarkParcelArr;
                        }
                        faceParcelArr = zzc;
                        faceArr = faceArr2;
                    }
                    zza[] zzaVarArr = faceParcel.zzdf;
                    if (zzaVarArr == null) {
                        contourArr = new Contour[0];
                    } else {
                        Contour[] contourArr2 = new Contour[zzaVarArr.length];
                        for (int i15 = 0; i15 < zzaVarArr.length; i15++) {
                            zza zzaVar = zzaVarArr[i15];
                            contourArr2[i15] = new Contour(zzaVar.zzcz, zzaVar.type);
                        }
                        contourArr = contourArr2;
                    }
                    faceArr[i12] = new Face(i13, pointF, f11, f12, f13, f14, f15, landmarkArr, contourArr, faceParcel.zzcg, faceParcel.zzch, faceParcel.zzci);
                    i12++;
                    zzc = faceParcelArr;
                    faceArr2 = faceArr;
                    i11 = 0;
                }
                return faceArr2;
            } catch (RemoteException e11) {
                Log.e("FaceNativeHandle", "Could not call native face detector", e11);
                return new Face[0];
            }
        }
        return new Face[0];
    }

    public final boolean zzd(int i11) {
        if (isOperational()) {
            try {
                return zzq().zzd(i11);
            } catch (RemoteException e11) {
                Log.e("FaceNativeHandle", "Could not call native face detector", e11);
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final void zzm() {
        zzq().zzn();
    }
}