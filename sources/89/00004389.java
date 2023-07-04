package com.plaid.internal;

import com.plaid.internal.c2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class d2<T extends c2> {

    /* renamed from: a  reason: collision with root package name */
    public final String f18483a;

    /* loaded from: classes2.dex */
    public static final class a extends d2<wb> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18484b = new a();

        public a() {
            super(kotlin.jvm.internal.m0.b(wb.class), null);
        }
    }

    public d2(n00.d<T> dVar) {
        String simpleName = g00.a.b(dVar).getSimpleName();
        kotlin.jvm.internal.s.f(simpleName, "crashApiClass.java.simpleName");
        this.f18483a = simpleName;
    }

    public /* synthetic */ d2(n00.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }
}