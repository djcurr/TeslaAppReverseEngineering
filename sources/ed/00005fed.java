package com.tesla.data.oapi;

import androidx.annotation.Keep;
import com.tesla.data.HttpMethodType;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\n\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tesla/data/oapi/OwnerApiEndpoint;", "", "Lcom/tesla/data/HttpMethodType;", "component1", "", "component2", "", "component3", "method", "uri", "isAuthenticated", "copy", "toString", "", "hashCode", "other", "equals", "Lcom/tesla/data/HttpMethodType;", "getMethod", "()Lcom/tesla/data/HttpMethodType;", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "Z", "()Z", "<init>", "(Lcom/tesla/data/HttpMethodType;Ljava/lang/String;Z)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OwnerApiEndpoint {
    private final boolean isAuthenticated;
    private final HttpMethodType method;
    private final String uri;

    public OwnerApiEndpoint(@ir.b(name = "TYPE") HttpMethodType method, @ir.b(name = "URI") String uri, @ir.b(name = "AUTH") boolean z11) {
        s.g(method, "method");
        s.g(uri, "uri");
        this.method = method;
        this.uri = uri;
        this.isAuthenticated = z11;
    }

    public static /* synthetic */ OwnerApiEndpoint copy$default(OwnerApiEndpoint ownerApiEndpoint, HttpMethodType httpMethodType, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            httpMethodType = ownerApiEndpoint.method;
        }
        if ((i11 & 2) != 0) {
            str = ownerApiEndpoint.uri;
        }
        if ((i11 & 4) != 0) {
            z11 = ownerApiEndpoint.isAuthenticated;
        }
        return ownerApiEndpoint.copy(httpMethodType, str, z11);
    }

    public final HttpMethodType component1() {
        return this.method;
    }

    public final String component2() {
        return this.uri;
    }

    public final boolean component3() {
        return this.isAuthenticated;
    }

    public final OwnerApiEndpoint copy(@ir.b(name = "TYPE") HttpMethodType method, @ir.b(name = "URI") String uri, @ir.b(name = "AUTH") boolean z11) {
        s.g(method, "method");
        s.g(uri, "uri");
        return new OwnerApiEndpoint(method, uri, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OwnerApiEndpoint) {
            OwnerApiEndpoint ownerApiEndpoint = (OwnerApiEndpoint) obj;
            return this.method == ownerApiEndpoint.method && s.c(this.uri, ownerApiEndpoint.uri) && this.isAuthenticated == ownerApiEndpoint.isAuthenticated;
        }
        return false;
    }

    public final HttpMethodType getMethod() {
        return this.method;
    }

    public final String getUri() {
        return this.uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.method.hashCode() * 31) + this.uri.hashCode()) * 31;
        boolean z11 = this.isAuthenticated;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isAuthenticated() {
        return this.isAuthenticated;
    }

    public String toString() {
        HttpMethodType httpMethodType = this.method;
        String str = this.uri;
        boolean z11 = this.isAuthenticated;
        return "OwnerApiEndpoint(method=" + httpMethodType + ", uri=" + str + ", isAuthenticated=" + z11 + ")";
    }
}