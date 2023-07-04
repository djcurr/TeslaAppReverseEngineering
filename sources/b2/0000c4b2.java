package z9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import dk.a;
import java.util.List;

/* loaded from: classes.dex */
public class b extends z9.a {

    /* renamed from: a */
    private int f60392a = 0;

    /* renamed from: b */
    private final Context f60393b;

    /* renamed from: c */
    private dk.a f60394c;

    /* renamed from: d */
    private ServiceConnection f60395d;

    /* renamed from: z9.b$b */
    /* loaded from: classes.dex */
    private final class ServiceConnectionC1378b implements ServiceConnection {

        /* renamed from: a */
        private final c f60396a;

        private ServiceConnectionC1378b(c cVar) {
            b.this = r1;
            if (cVar != null) {
                this.f60396a = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            aa.a.a("InstallReferrerClient", "Install Referrer service connected.");
            b.this.f60394c = a.AbstractBinderC0459a.J(iBinder);
            b.this.f60392a = 2;
            this.f60396a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            aa.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            b.this.f60394c = null;
            b.this.f60392a = 0;
            this.f60396a.onInstallReferrerServiceDisconnected();
        }
    }

    public b(Context context) {
        this.f60393b = context.getApplicationContext();
    }

    private boolean g() {
        return this.f60393b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    @Override // z9.a
    public void a() {
        this.f60392a = 3;
        if (this.f60395d != null) {
            aa.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f60393b.unbindService(this.f60395d);
            this.f60395d = null;
        }
        this.f60394c = null;
    }

    @Override // z9.a
    public d b() {
        if (h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f60393b.getPackageName());
            try {
                return new d(this.f60394c.a(bundle));
            } catch (RemoteException e11) {
                aa.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f60392a = 0;
                throw e11;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // z9.a
    public void d(c cVar) {
        ServiceInfo serviceInfo;
        if (h()) {
            aa.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.onInstallReferrerSetupFinished(0);
            return;
        }
        int i11 = this.f60392a;
        if (i11 == 1) {
            aa.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.onInstallReferrerSetupFinished(3);
        } else if (i11 != 3) {
            aa.a.a("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f60393b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && g()) {
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC1378b serviceConnectionC1378b = new ServiceConnectionC1378b(cVar);
                    this.f60395d = serviceConnectionC1378b;
                    if (this.f60393b.bindService(intent2, serviceConnectionC1378b, 1)) {
                        aa.a.a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    aa.a.b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f60392a = 0;
                    cVar.onInstallReferrerSetupFinished(1);
                    return;
                }
                aa.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f60392a = 0;
                cVar.onInstallReferrerSetupFinished(2);
                return;
            }
            this.f60392a = 0;
            aa.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            cVar.onInstallReferrerSetupFinished(2);
        } else {
            aa.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.onInstallReferrerSetupFinished(3);
        }
    }

    public boolean h() {
        return (this.f60392a != 2 || this.f60394c == null || this.f60395d == null) ? false : true;
    }
}