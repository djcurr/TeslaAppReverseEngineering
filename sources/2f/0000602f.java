package com.tesla.data.oapi;

import android.content.Context;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21733b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static h f21734c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, OwnerApiEndpoint> f21735a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Context context) {
            s.g(context, "context");
            if (h.f21734c == null) {
                Context applicationContext = context.getApplicationContext();
                s.f(applicationContext, "context.applicationContext");
                h.f21734c = new h(applicationContext, null);
            }
            h hVar = h.f21734c;
            s.e(hVar);
            return hVar;
        }
    }

    private h(Context context) {
        InputStream open = context.getAssets().open("shared/ownerapi_endpoints.json");
        s.f(open, "context.assets.open(\"sha…ownerapi_endpoints.json\")");
        Map<String, OwnerApiEndpoint> map = (Map) new p.b().a(new lr.b()).d().d(r.k(Map.class, String.class, OwnerApiEndpoint.class)).d(okio.r.d(okio.r.k(open)));
        this.f21735a = map == null ? new LinkedHashMap<>() : map;
    }

    public /* synthetic */ h(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final OwnerApiEndpoint c(String name) {
        s.g(name, "name");
        return this.f21735a.get(name);
    }
}