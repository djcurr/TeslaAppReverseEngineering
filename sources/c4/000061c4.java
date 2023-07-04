package com.tesla.widget.data;

import com.tesla.data.oapi.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/widget/data/OwnerApiErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/tesla/data/oapi/f;", "error", "<init>", "(Lcom/tesla/data/oapi/f;)V", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OwnerApiErrorException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final f f22021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerApiErrorException(f error) {
        super(error.getErrorString());
        s.g(error, "error");
        this.f22021a = error;
    }

    public final f a() {
        return this.f22021a;
    }
}