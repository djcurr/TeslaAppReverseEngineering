package jv;

import android.content.Context;
import jv.c;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b {

    /* loaded from: classes6.dex */
    public static final class a implements jv.a {
        a() {
        }

        @Override // jv.a
        public c b(Context context) {
            s.g(context, "context");
            return c.a.f33996a;
        }

        @Override // jv.a
        public c c(String macAddress, String vin, Context context) {
            s.g(macAddress, "macAddress");
            s.g(vin, "vin");
            s.g(context, "context");
            return c.a.f33996a;
        }

        @Override // jv.a
        /* renamed from: e */
        public c.a d(String macAddress, String vin, Context context) {
            s.g(macAddress, "macAddress");
            s.g(vin, "vin");
            s.g(context, "context");
            return c.a.f33996a;
        }

        @Override // jv.a
        public boolean isSupported(Context context) {
            s.g(context, "context");
            return false;
        }
    }

    public static final jv.a a() {
        return new a();
    }
}