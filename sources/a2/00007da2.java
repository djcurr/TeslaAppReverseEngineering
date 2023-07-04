package k8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k8.a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public k8.a f34484a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f34485b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f34486c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Object f34487d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public ServiceConnection f34488e = new a();

    /* loaded from: classes.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.this.f34484a = a.AbstractBinderC0640a.J(iBinder);
            synchronized (c.this.f34487d) {
                c.this.f34487d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.f34484a = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34490a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
    }

    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f34484a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f34488e, 1)) {
                    synchronized (this.f34487d) {
                        try {
                            this.f34487d.wait(3000L);
                        } catch (InterruptedException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                if (this.f34484a == null) {
                    return "";
                }
                try {
                    return c(context, str);
                } catch (RemoteException e12) {
                    e12.printStackTrace();
                    return "";
                }
            }
            try {
                return c(context, str);
            } catch (RemoteException e13) {
                e13.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }

    public boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f34485b)) {
            this.f34485b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f34486c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f34485b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : digest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb2.toString();
                    }
                } catch (NoSuchAlgorithmException e12) {
                    e12.printStackTrace();
                }
            }
            this.f34486c = str2;
        }
        String J = ((a.AbstractBinderC0640a.C0641a) this.f34484a).J(this.f34485b, this.f34486c, str);
        return TextUtils.isEmpty(J) ? "" : J;
    }
}