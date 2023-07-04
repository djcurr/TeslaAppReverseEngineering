package com.plaid.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class zc {
    public static final LayoutInflater a(ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(viewGroup, "<this>");
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.f(context, "context");
        Object systemService = androidx.core.content.b.getSystemService(context, LayoutInflater.class);
        kotlin.jvm.internal.s.e(systemService);
        return (LayoutInflater) systemService;
    }
}