package coil.memory;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class RequestDelegate implements DefaultLifecycleObserver {
    private RequestDelegate() {
    }

    public void a() {
    }

    public void b() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onDestroy(v owner) {
        s.g(owner, "owner");
        b();
    }

    public /* synthetic */ RequestDelegate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}