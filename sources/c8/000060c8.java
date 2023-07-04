package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tesla/messagebuilder/util/Response;", "", "", "component1", "encodedRoutableMessage", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEncodedRoutableMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Response {
    private final String encodedRoutableMessage;

    public Response(@b(name = "routable_message") String str) {
        this.encodedRoutableMessage = str;
    }

    public static /* synthetic */ Response copy$default(Response response, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = response.encodedRoutableMessage;
        }
        return response.copy(str);
    }

    public final String component1() {
        return this.encodedRoutableMessage;
    }

    public final Response copy(@b(name = "routable_message") String str) {
        return new Response(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Response) && s.c(this.encodedRoutableMessage, ((Response) obj).encodedRoutableMessage);
    }

    public final String getEncodedRoutableMessage() {
        return this.encodedRoutableMessage;
    }

    public int hashCode() {
        String str = this.encodedRoutableMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.encodedRoutableMessage;
        return "Response(encodedRoutableMessage=" + str + ")";
    }
}