package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: com.facebook.react.views.scroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0237a<T> {
        void flashScrollIndicators(T t11);

        void scrollTo(T t11, b bVar);

        void scrollToEnd(T t11, c cVar);
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12579a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12580b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12581c;

        b(int i11, int i12, boolean z11) {
            this.f12579a = i11;
            this.f12580b = i12;
            this.f12581c = z11;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12582a;

        c(boolean z11) {
            this.f12582a = z11;
        }
    }

    public static Map<String, Integer> a() {
        return yf.c.f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void b(InterfaceC0237a<T> interfaceC0237a, T t11, int i11, ReadableArray readableArray) {
        wf.a.c(interfaceC0237a);
        wf.a.c(t11);
        wf.a.c(readableArray);
        if (i11 == 1) {
            d(interfaceC0237a, t11, readableArray);
        } else if (i11 == 2) {
            e(interfaceC0237a, t11, readableArray);
        } else if (i11 == 3) {
            interfaceC0237a.flashScrollIndicators(t11);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i11), interfaceC0237a.getClass().getSimpleName()));
        }
    }

    public static <T> void c(InterfaceC0237a<T> interfaceC0237a, T t11, String str, ReadableArray readableArray) {
        wf.a.c(interfaceC0237a);
        wf.a.c(t11);
        wf.a.c(readableArray);
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    c11 = 0;
                    break;
                }
                break;
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    c11 = 1;
                    break;
                }
                break;
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                d(interfaceC0237a, t11, readableArray);
                return;
            case 1:
                interfaceC0237a.flashScrollIndicators(t11);
                return;
            case 2:
                e(interfaceC0237a, t11, readableArray);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, interfaceC0237a.getClass().getSimpleName()));
        }
    }

    private static <T> void d(InterfaceC0237a<T> interfaceC0237a, T t11, ReadableArray readableArray) {
        interfaceC0237a.scrollTo(t11, new b(Math.round(p.b(readableArray.getDouble(0))), Math.round(p.b(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void e(InterfaceC0237a<T> interfaceC0237a, T t11, ReadableArray readableArray) {
        interfaceC0237a.scrollToEnd(t11, new c(readableArray.getBoolean(0)));
    }
}