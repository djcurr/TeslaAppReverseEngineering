package com.airbnb.android.react.maps;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class w {

    /* renamed from: f  reason: collision with root package name */
    private static w f9952f;

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<g> f9954b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f9955c = false;

    /* renamed from: e  reason: collision with root package name */
    private LinkedList<g> f9957e = new LinkedList<>();

    /* renamed from: a  reason: collision with root package name */
    private Handler f9953a = new Handler(Looper.myLooper());

    /* renamed from: d  reason: collision with root package name */
    private Runnable f9956d = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.f9955c = false;
            w.this.h();
            if (w.this.f9954b.size() > 0) {
                w.this.f9953a.postDelayed(w.this.f9956d, 40L);
            }
        }
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w f() {
        if (f9952f == null) {
            synchronized (w.class) {
                f9952f = new w();
            }
        }
        return f9952f;
    }

    public void e(g gVar) {
        this.f9954b.add(gVar);
        if (this.f9955c) {
            return;
        }
        this.f9955c = true;
        this.f9953a.postDelayed(this.f9956d, 40L);
    }

    public void g(g gVar) {
        this.f9954b.remove(gVar);
    }

    public void h() {
        Iterator<g> it2 = this.f9954b.iterator();
        while (it2.hasNext()) {
            g next = it2.next();
            if (!next.z()) {
                this.f9957e.add(next);
            }
        }
        if (this.f9957e.size() > 0) {
            this.f9954b.removeAll(this.f9957e);
            this.f9957e.clear();
        }
    }
}