package com.squareup.workflow1.ui.backstack;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.t;

/* loaded from: classes2.dex */
public enum a {
    None,
    First,
    Other;
    
    public static final C0369a Companion = new C0369a(null);

    /* renamed from: default  reason: not valid java name */
    private static final a f0default;

    /* renamed from: com.squareup.workflow1.ui.backstack.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0369a extends t<a> {
        private C0369a() {
            super(m0.b(a.class));
        }

        public /* synthetic */ C0369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.t
        /* renamed from: b */
        public a a() {
            return a.f0default;
        }
    }

    static {
        a aVar;
        f0default = aVar;
    }
}