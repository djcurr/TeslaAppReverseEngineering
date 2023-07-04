package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f12514a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12515b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12516c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12517d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12518e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12519f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12520g;

    private b(int i11, int i12, int i13) {
        this(i11, i12, i13, null, null, 0, 0, 0, 0);
    }

    public static final b a(int i11, int i12, Throwable th2) {
        return new b(i11, i12, 1, th2.getMessage(), null, 0, 0, 0, 0);
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.f12516c);
        createMap.putDouble(Snapshot.WIDTH, this.f12517d);
        createMap.putDouble(Snapshot.HEIGHT, this.f12518e);
        return createMap;
    }

    public static final b c(int i11, int i12) {
        return new b(i11, i12, 3);
    }

    public static final b d(int i11, int i12, String str, int i13, int i14) {
        return new b(i11, i12, 2, null, str, i13, i14, 0, 0);
    }

    public static final b e(int i11, int i12) {
        return new b(i11, i12, 4);
    }

    public static final b f(int i11, int i12, String str, int i13, int i14) {
        return new b(i11, i12, 5, null, str, 0, 0, i13, i14);
    }

    public static String g(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "topProgress";
                        }
                        throw new IllegalStateException("Invalid image event: " + Integer.toString(i11));
                    }
                    return "topLoadStart";
                }
                return "topLoadEnd";
            }
            return "topLoad";
        }
        return "topError";
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) this.f12514a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        int i11 = this.f12514a;
        if (i11 == 1) {
            createMap.putString("error", this.f12515b);
        } else if (i11 == 2) {
            createMap.putMap(Stripe3ds2AuthParams.FIELD_SOURCE, b());
        } else if (i11 == 5) {
            createMap.putInt("loaded", this.f12519f);
            createMap.putInt("total", this.f12520g);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return g(this.f12514a);
    }

    private b(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17) {
        super(i11, i12);
        this.f12514a = i13;
        this.f12515b = str;
        this.f12516c = str2;
        this.f12517d = i14;
        this.f12518e = i15;
        this.f12519f = i16;
        this.f12520g = i17;
    }
}