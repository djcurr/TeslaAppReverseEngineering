package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class f implements xr.d {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<int[]> f21185a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<int[]> f21186b = new SparseArray<>();

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        s.e(array);
        s.f(array, "config.getArray(key)!!");
        int size = array.size();
        int[] iArr = new int[size];
        int i11 = size - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                iArr[i12] = array.getInt(i12);
                if (i13 > i11) {
                    break;
                }
                i12 = i13;
            }
        }
        return iArr;
    }

    @Override // xr.d
    public boolean a(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        s.g(handler, "handler");
        s.g(otherHandler, "otherHandler");
        return false;
    }

    @Override // xr.d
    public boolean b(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        s.g(handler, "handler");
        s.g(otherHandler, "otherHandler");
        int[] iArr = this.f21186b.get(handler.N());
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == otherHandler.N()) {
                return true;
            }
        }
        return false;
    }

    @Override // xr.d
    public boolean c(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        s.g(handler, "handler");
        s.g(otherHandler, "otherHandler");
        return false;
    }

    @Override // xr.d
    public boolean d(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        s.g(handler, "handler");
        s.g(otherHandler, "otherHandler");
        int[] iArr = this.f21185a.get(handler.N());
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == otherHandler.N()) {
                return true;
            }
        }
        return false;
    }

    public final void e(GestureHandler<?> handler, ReadableMap config) {
        s.g(handler, "handler");
        s.g(config, "config");
        handler.r0(this);
        if (config.hasKey("waitFor")) {
            this.f21185a.put(handler.N(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f21186b.put(handler.N(), f(config, "simultaneousHandlers"));
        }
    }

    public final void g(int i11) {
        this.f21185a.remove(i11);
        this.f21186b.remove(i11);
    }

    public final void h() {
        this.f21185a.clear();
        this.f21186b.clear();
    }
}