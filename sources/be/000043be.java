package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class f4 extends androidx.appcompat.app.d {

    /* renamed from: a  reason: collision with root package name */
    public a f18575a = a.C0339a.f18576a;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: com.plaid.internal.f4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0339a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0339a f18576a = new C0339a();

            public C0339a() {
                super(null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Intent f18577a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Intent intent) {
                super(null);
                kotlin.jvm.internal.s.g(intent, "intent");
                this.f18577a = intent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f18577a, ((b) obj).f18577a);
            }

            public int hashCode() {
                return this.f18577a.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("OnCreate(intent=");
                a11.append(this.f18577a);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Intent f18578a;

            public c(Intent intent) {
                super(null);
                this.f18578a = intent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f18578a, ((c) obj).f18578a);
            }

            public int hashCode() {
                Intent intent = this.f18578a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("OnNewIntent(intent=");
                a11.append(this.f18578a);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract void a(Intent intent);

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        this.f18575a = new a.b(intent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f18575a = new a.c(intent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        a aVar = this.f18575a;
        this.f18575a = a.C0339a.f18576a;
        if (aVar instanceof a.C0339a) {
            return;
        }
        if (aVar instanceof a.b) {
            a(((a.b) aVar).f18577a);
        } else if (aVar instanceof a.c) {
            a(((a.c) aVar).f18578a);
        }
    }
}