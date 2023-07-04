package com.henninghall.date_picker;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final j f17476a;

    public e(j jVar) {
        this.f17476a = jVar;
    }

    private String a(String str) {
        return " " + str + " ";
    }

    private boolean c(String str) {
        return this.f17476a.E() == qp.c.nativeAndroid && str.length() == 1;
    }

    public String b(String str) {
        return !c(str) ? str : a(str);
    }
}