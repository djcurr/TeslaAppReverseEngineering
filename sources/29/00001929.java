package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.Map;

@fg.a(name = ToastModule.NAME)
/* loaded from: classes3.dex */
public class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12111b;

        a(String str, int i11) {
            this.f12110a = str;
            this.f12111b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f12110a, this.f12111b).show();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12114b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12115c;

        b(String str, int i11, int i12) {
            this.f12113a = str;
            this.f12114b = i11;
            this.f12115c = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f12113a, this.f12114b);
            makeText.setGravity(this.f12115c, 0, 0);
            makeText.show();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12119c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12120d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12121e;

        c(String str, int i11, int i12, int i13, int i14) {
            this.f12117a = str;
            this.f12118b = i11;
            this.f12119c = i12;
            this.f12120d = i13;
            this.f12121e = i14;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f12117a, this.f12118b);
            makeText.setGravity(this.f12119c, this.f12120d, this.f12121e);
            makeText.show();
        }
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap b11 = yf.c.b();
        b11.put(DURATION_SHORT_KEY, 0);
        b11.put(DURATION_LONG_KEY, 1);
        b11.put(GRAVITY_TOP_KEY, 49);
        b11.put(GRAVITY_BOTTOM_KEY, 81);
        b11.put(GRAVITY_CENTER, 17);
        return b11;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String str, double d11) {
        UiThreadUtil.runOnUiThread(new a(str, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String str, double d11, double d12) {
        UiThreadUtil.runOnUiThread(new b(str, (int) d11, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(String str, double d11, double d12, double d13, double d14) {
        UiThreadUtil.runOnUiThread(new c(str, (int) d11, (int) d12, (int) d13, (int) d14));
    }
}