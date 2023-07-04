package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a */
    private final SharedPreferences f16861a;

    /* renamed from: b */
    private final String f16862b;

    /* renamed from: c */
    private final String f16863c;

    /* renamed from: e */
    private final Executor f16865e;

    /* renamed from: d */
    final ArrayDeque<String> f16864d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f16866f = false;

    private u0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f16861a = sharedPreferences;
        this.f16862b = str;
        this.f16863c = str2;
        this.f16865e = executor;
    }

    public static /* synthetic */ void a(u0 u0Var) {
        u0Var.h();
    }

    private boolean b(boolean z11) {
        if (z11 && !this.f16866f) {
            i();
        }
        return z11;
    }

    public static u0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        u0 u0Var = new u0(sharedPreferences, str, str2, executor);
        u0Var.d();
        return u0Var;
    }

    private void d() {
        synchronized (this.f16864d) {
            this.f16864d.clear();
            String string = this.f16861a.getString(this.f16862b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f16863c)) {
                String[] split = string.split(this.f16863c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f16864d.add(str);
                    }
                }
            }
        }
    }

    public void h() {
        synchronized (this.f16864d) {
            this.f16861a.edit().putString(this.f16862b, g()).commit();
        }
    }

    private void i() {
        this.f16865e.execute(new Runnable() { // from class: com.google.firebase.messaging.t0
            @Override // java.lang.Runnable
            public final void run() {
                u0.a(u0.this);
            }
        });
    }

    public String e() {
        String peek;
        synchronized (this.f16864d) {
            peek = this.f16864d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b11;
        synchronized (this.f16864d) {
            b11 = b(this.f16864d.remove(obj));
        }
        return b11;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it2 = this.f16864d.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(this.f16863c);
        }
        return sb2.toString();
    }
}