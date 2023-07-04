package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingResponse;", "", "", "component1", "component2", "Lcom/tesla/messagebuilder/util/Response;", "component3", "error", "errorDescription", "response", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "getErrorDescription", "Lcom/tesla/messagebuilder/util/Response;", "getResponse", "()Lcom/tesla/messagebuilder/util/Response;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/tesla/messagebuilder/util/Response;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteBuildingResponse {
    private final String error;
    private final String errorDescription;
    private final Response response;

    public RemoteBuildingResponse(@b(name = "error") String str, @b(name = "error_description") String str2, @b(name = "response") Response response) {
        this.error = str;
        this.errorDescription = str2;
        this.response = response;
    }

    public static /* synthetic */ RemoteBuildingResponse copy$default(RemoteBuildingResponse remoteBuildingResponse, String str, String str2, Response response, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = remoteBuildingResponse.error;
        }
        if ((i11 & 2) != 0) {
            str2 = remoteBuildingResponse.errorDescription;
        }
        if ((i11 & 4) != 0) {
            response = remoteBuildingResponse.response;
        }
        return remoteBuildingResponse.copy(str, str2, response);
    }

    public final String component1() {
        return this.error;
    }

    public final String component2() {
        return this.errorDescription;
    }

    public final Response component3() {
        return this.response;
    }

    public final RemoteBuildingResponse copy(@b(name = "error") String str, @b(name = "error_description") String str2, @b(name = "response") Response response) {
        return new RemoteBuildingResponse(str, str2, response);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteBuildingResponse) {
            RemoteBuildingResponse remoteBuildingResponse = (RemoteBuildingResponse) obj;
            return s.c(this.error, remoteBuildingResponse.error) && s.c(this.errorDescription, remoteBuildingResponse.errorDescription) && s.c(this.response, remoteBuildingResponse.response);
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Response getResponse() {
        return this.response;
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Response response = this.response;
        return hashCode2 + (response != null ? response.hashCode() : 0);
    }

    public String toString() {
        String str = this.error;
        String str2 = this.errorDescription;
        Response response = this.response;
        return "RemoteBuildingResponse(error=" + str + ", errorDescription=" + str2 + ", response=" + response + ")";
    }
}