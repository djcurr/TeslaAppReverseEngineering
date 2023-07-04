package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzao;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@KeepForSdk
/* loaded from: classes2.dex */
public class m {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final Feature[] f17254a = new Feature[0];
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    public static final Feature f17255b;
    @KeepForSdk

    /* renamed from: c  reason: collision with root package name */
    public static final Feature f17256c;
    @KeepForSdk

    /* renamed from: d  reason: collision with root package name */
    public static final Feature f17257d;
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final Feature f17258e;
    @KeepForSdk

    /* renamed from: f  reason: collision with root package name */
    public static final Feature f17259f;
    @KeepForSdk

    /* renamed from: g  reason: collision with root package name */
    public static final Feature f17260g;
    @KeepForSdk

    /* renamed from: h  reason: collision with root package name */
    public static final Feature f17261h;
    @KeepForSdk

    /* renamed from: i  reason: collision with root package name */
    public static final Feature f17262i;
    @KeepForSdk

    /* renamed from: j  reason: collision with root package name */
    public static final Feature f17263j;
    @KeepForSdk

    /* renamed from: k  reason: collision with root package name */
    public static final Feature f17264k;

    /* renamed from: l  reason: collision with root package name */
    private static final zzar f17265l;

    /* renamed from: m  reason: collision with root package name */
    private static final zzar f17266m;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f17255b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f17256c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f17257d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f17258e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f17259f = feature5;
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f17260g = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f17261h = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f17262i = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f17263j = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f17264k = feature10;
        zzaq zzaqVar = new zzaq();
        zzaqVar.zza("barcode", feature);
        zzaqVar.zza("custom_ica", feature2);
        zzaqVar.zza("face", feature3);
        zzaqVar.zza("ica", feature4);
        zzaqVar.zza("ocr", feature5);
        zzaqVar.zza("langid", feature6);
        zzaqVar.zza("nlclassifier", feature7);
        zzaqVar.zza("tflite_dynamite", feature8);
        zzaqVar.zza("barcode_ui", feature9);
        zzaqVar.zza("smart_reply", feature10);
        f17265l = zzaqVar.zzb();
        zzaq zzaqVar2 = new zzaq();
        zzaqVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzaqVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzaqVar2.zza("com.google.android.gms.vision.face", feature3);
        zzaqVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzaqVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzaqVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzaqVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzaqVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzaqVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f17266m = zzaqVar2.zzb();
    }

    @KeepForSdk
    public static boolean a(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return b(context, e(f17266m, list));
        }
        try {
            for (String str : list) {
                DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str);
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @KeepForSdk
    private static boolean b(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.b0
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = featureArr;
                    Feature[] featureArr3 = m.f17254a;
                    return featureArr2;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.c0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e11) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e11);
            return false;
        }
    }

    @KeepForSdk
    public static void c(Context context, String str) {
        d(context, zzao.zzj(str));
    }

    @KeepForSdk
    public static void d(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            final Feature[] e11 = e(f17265l, list);
            ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.d0
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr = e11;
                    Feature[] featureArr2 = m.f17254a;
                    return featureArr;
                }
            }).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.e0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
                }
            });
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    private static Feature[] e(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            featureArr[i11] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i11)));
        }
        return featureArr;
    }
}