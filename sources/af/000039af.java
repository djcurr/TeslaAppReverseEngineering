package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final URL f17038a;

    public j(URL url) {
        this.f17038a = url;
    }

    public URLConnection a() {
        return this.f17038a.openConnection();
    }

    public String toString() {
        return this.f17038a.toString();
    }
}