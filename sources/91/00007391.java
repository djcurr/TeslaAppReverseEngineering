package hn;

import com.google.firebase.perf.v1.ApplicationInfo;

/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final fn.a f29343b = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationInfo f29344a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ApplicationInfo applicationInfo) {
        this.f29344a = applicationInfo;
    }

    private boolean g() {
        ApplicationInfo applicationInfo = this.f29344a;
        if (applicationInfo == null) {
            f29343b.j("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo.hasGoogleAppId()) {
            f29343b.j("GoogleAppId is null");
            return false;
        } else if (!this.f29344a.hasAppInstanceId()) {
            f29343b.j("AppInstanceId is null");
            return false;
        } else if (!this.f29344a.hasApplicationProcessState()) {
            f29343b.j("ApplicationProcessState is null");
            return false;
        } else if (this.f29344a.hasAndroidAppInfo()) {
            if (!this.f29344a.getAndroidAppInfo().hasPackageName()) {
                f29343b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f29344a.getAndroidAppInfo().hasSdkVersion()) {
                return true;
            } else {
                f29343b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        } else {
            return true;
        }
    }

    @Override // hn.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f29343b.j("ApplicationInfo is invalid");
        return false;
    }
}