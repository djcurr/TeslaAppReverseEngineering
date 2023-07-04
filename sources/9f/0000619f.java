package com.tesla.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.q;
import com.tesla.data.oapi.f;
import com.tesla.data.oapi.g;
import com.tesla.share.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import org.json.JSONObject;
import vz.k;
import vz.m;
import yu.z;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tesla/share/ShareActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "a", "b", "share_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ShareActivity extends androidx.appcompat.app.d {

    /* renamed from: a  reason: collision with root package name */
    private final k f21968a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum b {
        SUCCESS,
        ERROR,
        TIMEOUT
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21969a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.TIMEOUT.ordinal()] = 1;
            iArr[b.SUCCESS.ordinal()] = 2;
            iArr[b.ERROR.ordinal()] = 3;
            f21969a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements g {
        d() {
        }

        @Override // com.tesla.data.oapi.g
        public void a(f fVar) {
            wu.g gVar = wu.g.f56207a;
            gVar.a("onFailure " + fVar);
            int i11 = wu.d.f56196l;
            if (fVar == f.OWNERAPI_ERROR_VEHICLE_IN_SERVICE) {
                i11 = wu.d.f56190f;
                ShareActivity.this.n().q(true);
                ShareActivity.this.n().m();
            } else if (fVar == f.OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED) {
                i11 = wu.d.f56187c;
                ShareActivity.this.n().m();
            }
            ShareActivity.this.r(i11);
        }

        @Override // com.tesla.data.oapi.g
        public void b(JSONObject jSONObject) {
            String D;
            wu.g.f56207a.a("Successful share");
            ShareActivity shareActivity = ShareActivity.this;
            b bVar = b.SUCCESS;
            String string = shareActivity.getString(wu.d.f56197m);
            s.f(string, "getString(R.string.share_to_vehicle_success)");
            String f11 = ShareActivity.this.n().f();
            if (f11 == null) {
                f11 = "";
            }
            D = v.D(string, "%vehicleName%", f11, false, 4, null);
            shareActivity.s(bVar, D);
        }

        @Override // com.tesla.data.oapi.g
        public void c() {
            wu.g.f56207a.a("Timeout reached");
            ShareActivity shareActivity = ShareActivity.this;
            b bVar = b.TIMEOUT;
            String string = shareActivity.getString(wu.d.f56198n);
            s.f(string, "getString(R.string.share_to_vehicle_timeout)");
            shareActivity.s(bVar, string);
        }
    }

    /* loaded from: classes6.dex */
    static final class e extends u implements h00.a<wu.k> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final wu.k invoke() {
            Context applicationContext = ShareActivity.this.getApplicationContext();
            s.f(applicationContext, "applicationContext");
            return new wu.k(applicationContext);
        }
    }

    static {
        new a(null);
    }

    public ShareActivity() {
        k a11;
        a11 = m.a(new e());
        this.f21968a = a11;
    }

    private final wu.e m() {
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        String s11 = z.p(getApplicationContext()).s();
        s.f(s11, "getInstance(applicationContext).locale");
        wu.e eVar = new wu.e("share_ext_content_raw", s11);
        s.f(intent, "intent");
        eVar.b(intent);
        if (s.c("android.intent.action.SEND", action) && type != null) {
            eVar.e(intent);
            if (s.c(type, "text/x-vcard")) {
                eVar.a(getApplicationContext(), intent);
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wu.k n() {
        return (wu.k) this.f21968a.getValue();
    }

    private final boolean o() {
        if (n().i()) {
            r(wu.d.f56186b);
            return false;
        } else if (!n().j()) {
            r(wu.d.f56189e);
            return false;
        } else if (!n().l()) {
            r(wu.d.f56188d);
            return false;
        } else if (n().k()) {
            r(wu.d.f56190f);
            return false;
        } else if (n().d()) {
            return true;
        } else {
            r(wu.d.f56191g);
            return false;
        }
    }

    private final void p(wu.e eVar) {
        d dVar = new d();
        JSONObject g11 = eVar.g();
        if (g11 != null) {
            if (n().n(g11, dVar, 10L)) {
                return;
            }
            r(wu.d.f56185a);
            return;
        }
        throw new IllegalStateException("Invalid share content JSON!");
    }

    private final void q(a.C0399a.EnumC0400a enumC0400a, String str, int i11) {
        if (isFinishing()) {
            return;
        }
        a.C0399a c0399a = com.tesla.share.a.f21972g;
        q supportFragmentManager = getSupportFragmentManager();
        s.f(supportFragmentManager, "supportFragmentManager");
        c0399a.a(supportFragmentManager, enumC0400a, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i11) {
        b bVar = b.ERROR;
        String string = getString(i11);
        s.f(string, "getString(messageResId)");
        s(bVar, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(b bVar, String str) {
        int i11 = c.f21969a[bVar.ordinal()];
        if (i11 == 1) {
            q(a.C0399a.EnumC0400a.TIMEOUT, str, 3);
        } else if (i11 == 2) {
            q(a.C0399a.EnumC0400a.SUCCESS, str, 3);
        } else if (i11 != 3) {
        } else {
            q(a.C0399a.EnumC0400a.ERROR, str, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q(a.C0399a.EnumC0400a.PROCESSING, "", 10);
        wu.e m11 = m();
        if (o()) {
            if (m11.f()) {
                p(m11);
            } else {
                r(wu.d.f56185a);
            }
        }
    }
}