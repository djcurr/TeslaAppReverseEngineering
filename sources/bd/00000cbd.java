package bl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.android.vending.licensing.ILicensingService;
import com.android.vending.licensing.a;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes3.dex */
public class d implements ServiceConnection {

    /* renamed from: j  reason: collision with root package name */
    private static final SecureRandom f7848j = new SecureRandom();

    /* renamed from: a  reason: collision with root package name */
    private ILicensingService f7849a;

    /* renamed from: b  reason: collision with root package name */
    private PublicKey f7850b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7851c;

    /* renamed from: d  reason: collision with root package name */
    private final i f7852d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f7853e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7854f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7855g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<f> f7856h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    private final Queue<f> f7857i = new LinkedList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends a.AbstractBinderC0195a {

        /* renamed from: a  reason: collision with root package name */
        private final f f7858a;

        /* renamed from: b  reason: collision with root package name */
        private Runnable f7859b;

        /* renamed from: bl.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0152a implements Runnable {
            RunnableC0152a(d dVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Check timed out.");
                a aVar = a.this;
                d.this.l(aVar.f7858a);
                a aVar2 = a.this;
                d.this.h(aVar2.f7858a);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f7862a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f7863b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f7864c;

            b(int i11, String str, String str2) {
                this.f7862a = i11;
                this.f7863b = str;
                this.f7864c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Received response.");
                if (d.this.f7856h.contains(a.this.f7858a)) {
                    a.this.L();
                    a.this.f7858a.g(d.this.f7850b, this.f7862a, this.f7863b, this.f7864c);
                    a aVar = a.this;
                    d.this.h(aVar.f7858a);
                }
            }
        }

        public a(f fVar) {
            this.f7858a = fVar;
            this.f7859b = new RunnableC0152a(d.this);
            M();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L() {
            Log.i("LicenseChecker", "Clearing timeout.");
            d.this.f7853e.removeCallbacks(this.f7859b);
        }

        private void M() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            d.this.f7853e.postDelayed(this.f7859b, AbstractComponentTracker.LINGERING_TIMEOUT);
        }

        @Override // com.android.vending.licensing.a
        public void o(int i11, String str, String str2) {
            d.this.f7853e.post(new b(i11, str, str2));
        }
    }

    public d(Context context, i iVar, String str) {
        this.f7851c = context;
        this.f7852d = iVar;
        this.f7850b = j(str);
        String packageName = context.getPackageName();
        this.f7854f = packageName;
        this.f7855g = k(context, packageName);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f7853e = new Handler(handlerThread.getLooper());
    }

    private void g() {
        if (this.f7849a != null) {
            try {
                this.f7851c.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f7849a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h(f fVar) {
        this.f7856h.remove(fVar);
        if (this.f7856h.isEmpty()) {
            g();
        }
    }

    private int i() {
        return f7848j.nextInt();
    }

    private static PublicKey j(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(cl.a.a(str)));
        } catch (Base64DecoderException e11) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new RuntimeException(e12);
        } catch (InvalidKeySpecException e13) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e13);
        }
    }

    private static String k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(f fVar) {
        this.f7852d.b(291, null);
        if (this.f7852d.a()) {
            fVar.a().a(291);
        } else {
            fVar.a().c(291);
        }
    }

    private void m() {
        while (true) {
            f poll = this.f7857i.poll();
            if (poll == null) {
                return;
            }
            try {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + poll.c());
                this.f7849a.m((long) poll.b(), poll.c(), new a(poll));
                this.f7856h.add(poll);
            } catch (RemoteException e11) {
                Log.w("LicenseChecker", "RemoteException in checkLicense call.", e11);
                l(poll);
            }
        }
    }

    public synchronized void f(e eVar) {
        if (this.f7852d.a()) {
            Log.i("LicenseChecker", "Using cached license response");
            eVar.a(256);
        } else {
            f fVar = new f(this.f7852d, new g(), eVar, i(), this.f7854f, this.f7855g);
            if (this.f7849a == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    if (this.f7851c.bindService(new Intent(new String(cl.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage(new String(cl.a.a("Y29tLmFuZHJvaWQudmVuZGluZw=="))), this, 1)) {
                        this.f7857i.offer(fVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        l(fVar);
                    }
                } catch (Base64DecoderException e11) {
                    e11.printStackTrace();
                } catch (SecurityException unused) {
                    eVar.b(6);
                }
            } else {
                this.f7857i.offer(fVar);
                m();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7849a = ILicensingService.a.J(iBinder);
        m();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f7849a = null;
    }
}