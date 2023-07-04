package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f31470a = Logger.getLogger(z0.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31471a;

        static {
            int[] iArr = new int[com.google.gson.stream.a.values().length];
            f31471a = iArr;
            try {
                iArr[com.google.gson.stream.a.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31471a[com.google.gson.stream.a.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31471a[com.google.gson.stream.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31471a[com.google.gson.stream.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31471a[com.google.gson.stream.a.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31471a[com.google.gson.stream.a.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private z0() {
    }

    public static Object a(String str) {
        tn.a aVar = new tn.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e11) {
                f31470a.log(Level.WARNING, "Failed to close", (Throwable) e11);
            }
        }
    }

    private static List<?> b(tn.a aVar) {
        aVar.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.R()) {
            arrayList.add(e(aVar));
        }
        boolean z11 = aVar.Q0() == com.google.gson.stream.a.END_ARRAY;
        com.google.common.base.u.v(z11, "Bad token: " + aVar.getPath());
        aVar.p();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(tn.a aVar) {
        aVar.G0();
        return null;
    }

    private static Map<String, ?> d(tn.a aVar) {
        aVar.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.R()) {
            linkedHashMap.put(aVar.D0(), e(aVar));
        }
        boolean z11 = aVar.Q0() == com.google.gson.stream.a.END_OBJECT;
        com.google.common.base.u.v(z11, "Bad token: " + aVar.getPath());
        aVar.C();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(tn.a aVar) {
        com.google.common.base.u.v(aVar.R(), "unexpected end of JSON");
        switch (a.f31471a[aVar.Q0().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.J0();
            case 4:
                return Double.valueOf(aVar.t0());
            case 5:
                return Boolean.valueOf(aVar.p0());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.getPath());
        }
    }
}