package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import com.plaid.internal.link.LinkActivity;
import com.plaid.internal.link.TransparentLinkActivity;
import com.plaid.internal.wa;
import com.plaid.link.Plaid;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public final class f6 implements h2 {

    /* renamed from: a  reason: collision with root package name */
    public final w2 f18582a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f18583b;

    public f6(Application application) {
        List<String> l11;
        kotlin.jvm.internal.s.g(application, "application");
        w2 w2Var = new w2();
        this.f18582a = w2Var;
        l11 = wz.w.l(LinkActivity.class.getName(), TransparentLinkActivity.class.getName());
        this.f18583b = l11;
        application.registerActivityLifecycleCallbacks(w2Var);
    }

    @Override // com.plaid.internal.h2
    public boolean a(Throwable throwable) {
        LinkError fromException$link_sdk_release;
        kotlin.jvm.internal.s.g(throwable, "throwable");
        Activity activity = this.f18582a.f19657a.get();
        if (activity != null && this.f18583b.contains(activity.getClass().getName())) {
            Plaid plaid = Plaid.INSTANCE;
            if (throwable instanceof r5) {
                wa.a aVar = wa.f19678a;
                wa.f19679b.a(throwable, true);
                fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(new LinkException("Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists"));
            } else {
                fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(throwable);
            }
            plaid.setLinkResultAndFinish$link_sdk_release(activity, 6148, new LinkExit(fromException$link_sdk_release, null, 2, null));
            w2 w2Var = this.f18582a;
            WeakReference<Activity> weakReference = new WeakReference<>(null);
            w2Var.getClass();
            kotlin.jvm.internal.s.g(weakReference, "<set-?>");
            w2Var.f19657a = weakReference;
            return true;
        }
        return false;
    }
}