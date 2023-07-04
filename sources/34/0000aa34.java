package p5;

import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class l extends n {

    /* renamed from: f  reason: collision with root package name */
    private ReactApplicationContext f46199f;

    public l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f46199f = null;
        this.f46199f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String i() {
        return Build.VERSION.SDK_INT >= 19 ? Telephony.Sms.getDefaultSmsPackage(this.f46199f) : "com.android.mms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String j() {
        return "market://details?id=com.android.mms";
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        n();
    }
}