package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f10174a = new b();

    /* renamed from: b  reason: collision with root package name */
    public Thread f10175b = null;

    /* renamed from: c  reason: collision with root package name */
    public LinkedList<Runnable> f10176c = new LinkedList<>();

    public static b a() {
        return f10174a;
    }

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f10175b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f10176c.add(runnable);
        if (this.f10175b == null) {
            Thread thread = new Thread(new c(this));
            this.f10175b = thread;
            thread.start();
        }
    }
}