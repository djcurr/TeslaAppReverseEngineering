package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class m extends FutureTask<u> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f10100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f10101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f10101b = lVar;
        this.f10100a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o a11 = this.f10100a.a();
        if (a11.f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || a11.h()) {
                a11.g();
                if (isCancelled() && isDone()) {
                    return;
                }
                cancel(false);
            }
        } catch (InterruptedException e11) {
            e11.toString();
        } catch (CancellationException unused) {
            a11.g();
        } catch (ExecutionException e12) {
            if (e12.getCause() == null || !(e12.getCause() instanceof HttpException)) {
                e12.toString();
                return;
            }
            HttpException httpException = (HttpException) e12.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th2) {
            throw new RuntimeException("An error occured while executing http request", th2);
        }
    }
}