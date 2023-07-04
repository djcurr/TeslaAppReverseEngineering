package com.withpersona.sdk.inquiry.network;

import com.squareup.moshi.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk/inquiry/network/JsonAdapterBinding;", "T", "", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "Lcom/squareup/moshi/f;", "jsonAdapter", "Lcom/squareup/moshi/f;", "getJsonAdapter", "()Lcom/squareup/moshi/f;", "<init>", "(Ljava/lang/Class;Lcom/squareup/moshi/f;)V", "network_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class JsonAdapterBinding<T> {
    private final Class<T> clazz;
    private final f<T> jsonAdapter;

    public JsonAdapterBinding(Class<T> clazz, f<T> jsonAdapter) {
        s.g(clazz, "clazz");
        s.g(jsonAdapter, "jsonAdapter");
        this.clazz = clazz;
        this.jsonAdapter = jsonAdapter;
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    public final f<T> getJsonAdapter() {
        return this.jsonAdapter;
    }
}