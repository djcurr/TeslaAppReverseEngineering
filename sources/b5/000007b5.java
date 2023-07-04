package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.d;
import com.google.firebase.messaging.h;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static final c f5279a = new a();

    /* renamed from: b */
    static final c f5280b = new b();

    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.d.c
        public void a(int i11, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.d.c
        public void a(int i11, Object obj) {
            String str;
            switch (i11) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i11 != 6 && i11 != 7 && i11 != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i11, Object obj);
    }

    public static /* synthetic */ void a(c cVar, int i11, Object obj) {
        cVar.a(i11, obj);
    }

    static boolean b(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z11 = readLong == packageInfo.lastUpdateTime;
                if (z11) {
                    cVar.a(2, null);
                }
                return z11;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    static void d(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    static void e(Executor executor, final c cVar, final int i11, final Object obj) {
        executor.execute(new Runnable() { // from class: r4.b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.d.a(d.c.this, i11, obj);
            }
        });
    }

    private static void f(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        if (Build.VERSION.SDK_INT < 19) {
            e(executor, cVar, 3, null);
            return;
        }
        androidx.profileinstaller.a aVar = new androidx.profileinstaller.a(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (aVar.d() && aVar.f().i().j()) {
            d(packageInfo, file);
        }
    }

    public static void g(Context context) {
        h(context, h.f16804a, f5279a);
    }

    public static void h(Context context, Executor executor, c cVar) {
        i(context, executor, cVar, false);
    }

    public static void i(Context context, Executor executor, c cVar, boolean z11) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z11 || !b(packageInfo, filesDir, cVar)) {
                f(assets, packageName, packageInfo, filesDir, name, executor, cVar);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            cVar.a(7, e11);
        }
    }
}