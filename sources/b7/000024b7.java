package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i11 = Build.VERSION.SDK_INT;
        strArr2[0] = i11 <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "";
        strArr2[1] = i11 <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "";
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (zzi(context, zzc2, 1, zzhVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
                zzd(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if (Action.FILE_ATTRIBUTE.equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor2);
            try {
                zzh(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzhVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e11) {
                zzf(openAssetFileDescriptor2, e11);
                throw e11;
            } catch (IOException e12) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e12);
                zzf(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    public static InputStream zzb(Context context, Uri uri) {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (zzi(context, zzc2, 1, zzhVar)) {
                InputStream openInputStream = contentResolver.openInputStream(zzc2);
                zzd(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if (Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
                try {
                    zzh(context, openFileDescriptor, zzc2, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e11) {
                    zzg(openFileDescriptor, e11);
                    throw e11;
                } catch (IOException e12) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e12);
                    zzg(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e13) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e13);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzf(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e11) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e11);
        }
    }

    private static void zzg(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e11) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(final android.content.Context r7, android.os.ParcelFileDescriptor r8, android.net.Uri r9, com.google.android.gms.internal.mlkit_common.zzh r10) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r9 = r9.getPath()
            r0.<init>(r9)
            java.lang.String r9 = r0.getCanonicalPath()
            java.io.FileDescriptor r8 = r8.getFileDescriptor()
            com.google.android.gms.internal.mlkit_common.zzp r8 = com.google.android.gms.internal.mlkit_common.zzp.zza(r8)
            com.google.android.gms.internal.mlkit_common.zzp r0 = com.google.android.gms.internal.mlkit_common.zzp.zzb(r9)
            boolean r1 = r0.zzc
            java.lang.String r2 = "Can't open file: "
            if (r1 != 0) goto Lda
            long r3 = r8.zza
            long r5 = r0.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lcc
            long r3 = r8.zzb
            long r0 = r0.zzb
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 != 0) goto Lcc
            java.lang.String r8 = "/proc/"
            boolean r8 = r9.startsWith(r8)
            if (r8 != 0) goto Lc2
            java.lang.String r8 = "/data/misc/"
            boolean r8 = r9.startsWith(r8)
            if (r8 != 0) goto Lc2
            com.google.android.gms.internal.mlkit_common.zzh.zza(r10)
            java.io.File r8 = androidx.core.content.b.getDataDir(r7)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L57
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L66
        L54:
            r0 = r1
            goto Lbb
        L57:
            java.io.File r8 = android.os.Environment.getDataDirectory()
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L66
            goto L54
        L66:
            android.content.Context r8 = androidx.core.content.b.createDeviceProtectedStorageContext(r7)
            if (r8 == 0) goto L7d
            java.io.File r8 = androidx.core.content.b.getDataDir(r8)
            if (r8 == 0) goto L7d
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L7d
            goto L54
        L7d:
            com.google.android.gms.internal.mlkit_common.zzc r8 = new com.google.android.gms.internal.mlkit_common.zzc
            r8.<init>()
            java.io.File[] r8 = zzj(r8)
            int r3 = r8.length
            r4 = r0
        L88:
            if (r4 >= r3) goto L9c
            r5 = r8[r4]
            if (r5 == 0) goto L99
            java.lang.String r5 = zze(r5)
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L99
            goto L54
        L99:
            int r4 = r4 + 1
            goto L88
        L9c:
            com.google.android.gms.internal.mlkit_common.zzd r8 = new com.google.android.gms.internal.mlkit_common.zzd
            r8.<init>()
            java.io.File[] r7 = zzj(r8)
            int r8 = r7.length
            r3 = r0
        La7:
            if (r3 >= r8) goto Lbb
            r4 = r7[r3]
            if (r4 == 0) goto Lb8
            java.lang.String r4 = zze(r4)
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto Lb8
            goto L54
        Lb8:
            int r3 = r3 + 1
            goto La7
        Lbb:
            boolean r7 = com.google.android.gms.internal.mlkit_common.zzh.zzb(r10)
            if (r0 != r7) goto Lc2
            return
        Lc2:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = r2.concat(r9)
            r7.<init>(r8)
            throw r7
        Lcc:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r2.concat(r8)
            r7.<init>(r8)
            throw r7
        Lda:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r2.concat(r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzi.zzh(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, com.google.android.gms.internal.mlkit_common.zzh):void");
    }

    private static boolean zzi(Context context, Uri uri, int i11, zzh zzhVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z13 = zzhVar.zzc;
                return !z13;
            }
        }
        int zzc2 = zzh.zzc(zzhVar, context, new zzq(uri, resolveContentProvider, authority)) - 1;
        if (zzc2 != 0) {
            if (zzc2 != 1) {
                if (context.getPackageName().equals(resolveContentProvider.packageName)) {
                    z12 = zzhVar.zzc;
                    return z12;
                }
                z11 = zzhVar.zzc;
                if (z11) {
                    return false;
                }
                if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
                    String[] strArr = zzc;
                    int length = strArr.length;
                    for (int i12 = 0; i12 < 2; i12++) {
                        if (strArr[i12].equals(authority)) {
                            return true;
                        }
                    }
                    String[] strArr2 = zzd;
                    int length2 = strArr2.length;
                    for (int i13 = 0; i13 < 3; i13++) {
                        if (strArr2[i13].equals(authority)) {
                            return true;
                        }
                    }
                    String[] strArr3 = zzb;
                    for (int i14 = 0; i14 < 6; i14++) {
                        String str = strArr3[i14];
                        if (str.charAt(str.length() - 1) == '.') {
                            if (resolveContentProvider.packageName.startsWith(str)) {
                                return false;
                            }
                        } else if (resolveContentProvider.packageName.equals(str)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    private static File[] zzj(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e11) {
            if (Build.VERSION.SDK_INT < 22) {
                return new File[0];
            }
            throw e11;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }
}