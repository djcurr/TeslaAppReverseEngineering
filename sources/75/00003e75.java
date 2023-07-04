package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
class SvgViewModule extends ReactContextBaseJavaModule {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f17530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f17531b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f17532c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f17533d;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0317a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class RunnableC0318a implements Runnable {
                RunnableC0318a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f17530a, aVar.f17531b, aVar.f17532c, aVar.f17533d + 1);
                }
            }

            RunnableC0317a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f17530a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0318a());
            }
        }

        /* loaded from: classes2.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f17530a, aVar.f17531b, aVar.f17532c, aVar.f17533d + 1);
            }
        }

        a(int i11, ReadableMap readableMap, Callback callback, int i12) {
            this.f17530a = i11;
            this.f17531b = readableMap;
            this.f17532c = callback;
            this.f17533d = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f17530a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f17530a, new RunnableC0317a());
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
            } else {
                ReadableMap readableMap = this.f17531b;
                if (readableMap != null) {
                    this.f17532c.invoke(svgViewByTag.toDataURL(readableMap.getInt(Snapshot.WIDTH), this.f17531b.getInt(Snapshot.HEIGHT)));
                } else {
                    this.f17532c.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i11, ReadableMap readableMap, Callback callback, int i12) {
        UiThreadUtil.runOnUiThread(new a(i11, readableMap, callback, i12));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewManager";
    }

    @ReactMethod
    public void toDataURL(int i11, ReadableMap readableMap, Callback callback) {
        toDataURL(i11, readableMap, callback, 0);
    }
}