package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.d0;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class v extends ThreadPoolExecutor {

    /* loaded from: classes2.dex */
    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        private final c f20774a;

        a(c cVar) {
            super(cVar, null);
            this.f20774a = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            t.f r11 = this.f20774a.r();
            t.f r12 = aVar.f20774a.r();
            return r11 == r12 ? this.f20774a.f20666a - aVar.f20774a.f20666a : r12.ordinal() - r11.ordinal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.c());
    }

    private void b(int i11) {
        setCorePoolSize(i11);
        setMaximumPoolSize(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    b(3);
                    return;
                } else {
                    b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            b(3);
                            return;
                        default:
                            b(3);
                            return;
                    }
            }
            b(2);
            return;
        }
        b(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}