package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: e */
    static final Pattern f17141e;

    /* renamed from: f */
    static final Pattern f17142f;

    /* renamed from: a */
    private final Set<BiConsumer<String, e>> f17143a = new HashSet();

    /* renamed from: b */
    private final Executor f17144b;

    /* renamed from: c */
    private final d f17145c;

    /* renamed from: d */
    private final d f17146d;

    static {
        Charset.forName("UTF-8");
        f17141e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f17142f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public l(Executor executor, d dVar, d dVar2) {
        this.f17144b = executor;
        this.f17145c = dVar;
        this.f17146d = dVar2;
    }

    public static /* synthetic */ void a(BiConsumer biConsumer, String str, e eVar) {
        biConsumer.accept(str, eVar);
    }

    private void c(final String str, final e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f17143a) {
            for (final BiConsumer<String, e> biConsumer : this.f17143a) {
                this.f17144b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a(BiConsumer.this, str, eVar);
                    }
                });
            }
        }
    }

    private static e e(d dVar) {
        return dVar.f();
    }

    private static Set<String> f(d dVar) {
        HashSet hashSet = new HashSet();
        e e11 = e(dVar);
        if (e11 == null) {
            return hashSet;
        }
        Iterator<String> keys = e11.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String g(d dVar, String str) {
        e e11 = e(dVar);
        if (e11 == null) {
            return null;
        }
        try {
            return e11.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer<String, e> biConsumer) {
        synchronized (this.f17143a) {
            this.f17143a.add(biConsumer);
        }
    }

    public Map<String, mn.g> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f17145c));
        hashSet.addAll(f(this.f17146d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public mn.g h(String str) {
        String g11 = g(this.f17145c, str);
        if (g11 != null) {
            c(str, e(this.f17145c));
            return new p(g11, 2);
        }
        String g12 = g(this.f17146d, str);
        if (g12 != null) {
            return new p(g12, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new p("", 0);
    }
}