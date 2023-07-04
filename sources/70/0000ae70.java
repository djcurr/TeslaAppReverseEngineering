package qs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class b implements Promise {

    /* renamed from: a  reason: collision with root package name */
    private final l<Object, b0> f48439a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<b0> f48440b;

    public b(l<Object, b0> onResolve, h00.a<b0> onReject) {
        s.g(onResolve, "onResolve");
        s.g(onReject, "onReject");
        this.f48439a = onResolve;
        this.f48440b = onReject;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        this.f48439a.invoke(obj);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th2) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th2) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th2) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th2, WritableMap writableMap) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, WritableMap userInfo) {
        s.g(userInfo, "userInfo");
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th2, WritableMap writableMap) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, WritableMap userInfo) {
        s.g(userInfo, "userInfo");
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th2, WritableMap writableMap) {
        this.f48440b.invoke();
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str) {
        this.f48440b.invoke();
    }
}