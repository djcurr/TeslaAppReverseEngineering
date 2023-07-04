package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.canhub.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f10979a;

        /* renamed from: b  reason: collision with root package name */
        private final e f10980b;

        public Intent a(Context context) {
            return b(context, CropImageActivity.class);
        }

        public Intent b(Context context, Class<?> cls) {
            this.f10980b.a();
            Intent intent = new Intent();
            intent.setClass(context, cls);
            Bundle bundle = new Bundle();
            bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", this.f10979a);
            bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", this.f10980b);
            intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
            return intent;
        }

        public b c(int i11, int i12) {
            e eVar = this.f10980b;
            eVar.f10997m = i11;
            eVar.f10998n = i12;
            eVar.f10996l = true;
            return this;
        }

        public b d(boolean z11) {
            this.f10980b.f10996l = z11;
            return this;
        }

        public b e(float f11) {
            this.f10980b.f10995k = f11;
            return this;
        }

        public b f(Bitmap.CompressFormat compressFormat) {
            this.f10980b.P = compressFormat;
            return this;
        }

        public b g(int i11) {
            this.f10980b.Q = i11;
            return this;
        }

        public b h(Uri uri) {
            this.f10980b.O = uri;
            return this;
        }

        private b(Uri uri) {
            this.f10979a = uri;
            this.f10980b = new e();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CropImageView.b implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i11, Rect rect2, int i12) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i11, i12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeParcelable(d(), i11);
            parcel.writeParcelable(g(), i11);
            parcel.writeSerializable(c());
            parcel.writeFloatArray(a());
            parcel.writeParcelable(b(), i11);
            parcel.writeParcelable(h(), i11);
            parcel.writeInt(e());
            parcel.writeInt(f());
        }

        protected c(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    public static b a(Uri uri) {
        return new b(uri);
    }

    public static c b(Intent intent) {
        if (intent != null) {
            return (c) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
        }
        return null;
    }

    public static List<Intent> c(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri d11 = d(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (d11 != null) {
                intent2.putExtra("output", d11);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    public static Uri d(Context context) {
        if (new eb.a().b()) {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            try {
                return FileProvider.getUriForFile(context, context.getPackageName() + ".cropper.fileprovider", File.createTempFile("pickImageResult", ".jpeg", externalFilesDir));
            } catch (Exception unused) {
                return Uri.fromFile(new File(externalFilesDir.getPath(), "pickImageResult.jpeg"));
            }
        }
        return Uri.fromFile(new File(context.getExternalCacheDir().getPath(), "pickImageResult.jpeg"));
    }

    public static Intent e(String str, boolean z11) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setType(z11 ? "*/*" : "image/*");
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }

    public static Intent f(Context context) {
        return g(context, context.getString(db.f.f23886c), false, true);
    }

    public static Intent g(Context context, CharSequence charSequence, boolean z11, boolean z12) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!j(context) && z12) {
            arrayList.addAll(c(context, packageManager));
        }
        arrayList.add(e("android.intent.action.GET_CONTENT", z11));
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    public static Uri h(Context context, Intent intent) {
        String action;
        boolean z11 = true;
        if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
            z11 = false;
        }
        return (z11 || intent.getData() == null) ? d(context) : intent.getData();
    }

    public static boolean i(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean j(Context context) {
        return Build.VERSION.SDK_INT >= 23 && i(context, "android.permission.CAMERA") && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public static boolean k(Context context, Uri uri) {
        return Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && l(context, uri);
    }

    public static boolean l(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void m(Activity activity) {
        activity.startActivityForResult(f(activity), 200);
    }
}