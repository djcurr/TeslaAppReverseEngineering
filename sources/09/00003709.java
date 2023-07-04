package com.google.common.base;

import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f15918a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f15919b = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f15920c = Charset.forName("UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f15921d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f15922e;

    static {
        Charset.forName("UTF-16BE");
        f15921d = Charset.forName("UTF-16LE");
        f15922e = Charset.forName("UTF-16");
    }
}