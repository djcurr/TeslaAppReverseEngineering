package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okio.i;
import ot.a;
import vu.c;
import zu.j;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u000f\u0010\b¨\u0006&"}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "component1", "", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "sessionInfo", "publicKey", "generateCommand", "isBackupKey", "isFleetKey", "copy", "(Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "toString", "", "hashCode", "other", "equals", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "getSessionInfo", "()Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "Ljava/lang/String;", "getPublicKey", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getGenerateCommand", "<init>", "(Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lot/a;", "addKeyPayload", "Lvu/c;", "vehicleSessionInfo", "(Lot/a;Lvu/c;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteBuildingRequestBody {
    private final Boolean generateCommand;
    private final Boolean isBackupKey;
    private final Boolean isFleetKey;
    private final String publicKey;
    private final VehicleSessionInfoDataBody sessionInfo;

    public RemoteBuildingRequestBody(@b(name = "session_info") VehicleSessionInfoDataBody vehicleSessionInfoDataBody, @b(name = "public_key") String str, @b(name = "generate_command") Boolean bool, @b(name = "backup") Boolean bool2, @b(name = "fleet") Boolean bool3) {
        this.sessionInfo = vehicleSessionInfoDataBody;
        this.publicKey = str;
        this.generateCommand = bool;
        this.isBackupKey = bool2;
        this.isFleetKey = bool3;
    }

    public static /* synthetic */ RemoteBuildingRequestBody copy$default(RemoteBuildingRequestBody remoteBuildingRequestBody, VehicleSessionInfoDataBody vehicleSessionInfoDataBody, String str, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vehicleSessionInfoDataBody = remoteBuildingRequestBody.sessionInfo;
        }
        if ((i11 & 2) != 0) {
            str = remoteBuildingRequestBody.publicKey;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            bool = remoteBuildingRequestBody.generateCommand;
        }
        Boolean bool4 = bool;
        if ((i11 & 8) != 0) {
            bool2 = remoteBuildingRequestBody.isBackupKey;
        }
        Boolean bool5 = bool2;
        if ((i11 & 16) != 0) {
            bool3 = remoteBuildingRequestBody.isFleetKey;
        }
        return remoteBuildingRequestBody.copy(vehicleSessionInfoDataBody, str2, bool4, bool5, bool3);
    }

    public final VehicleSessionInfoDataBody component1() {
        return this.sessionInfo;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final Boolean component3() {
        return this.generateCommand;
    }

    public final Boolean component4() {
        return this.isBackupKey;
    }

    public final Boolean component5() {
        return this.isFleetKey;
    }

    public final RemoteBuildingRequestBody copy(@b(name = "session_info") VehicleSessionInfoDataBody vehicleSessionInfoDataBody, @b(name = "public_key") String str, @b(name = "generate_command") Boolean bool, @b(name = "backup") Boolean bool2, @b(name = "fleet") Boolean bool3) {
        return new RemoteBuildingRequestBody(vehicleSessionInfoDataBody, str, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteBuildingRequestBody) {
            RemoteBuildingRequestBody remoteBuildingRequestBody = (RemoteBuildingRequestBody) obj;
            return s.c(this.sessionInfo, remoteBuildingRequestBody.sessionInfo) && s.c(this.publicKey, remoteBuildingRequestBody.publicKey) && s.c(this.generateCommand, remoteBuildingRequestBody.generateCommand) && s.c(this.isBackupKey, remoteBuildingRequestBody.isBackupKey) && s.c(this.isFleetKey, remoteBuildingRequestBody.isFleetKey);
        }
        return false;
    }

    public final Boolean getGenerateCommand() {
        return this.generateCommand;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final VehicleSessionInfoDataBody getSessionInfo() {
        return this.sessionInfo;
    }

    public int hashCode() {
        VehicleSessionInfoDataBody vehicleSessionInfoDataBody = this.sessionInfo;
        int hashCode = (vehicleSessionInfoDataBody == null ? 0 : vehicleSessionInfoDataBody.hashCode()) * 31;
        String str = this.publicKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.generateCommand;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBackupKey;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFleetKey;
        return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isBackupKey() {
        return this.isBackupKey;
    }

    public final Boolean isFleetKey() {
        return this.isFleetKey;
    }

    public String toString() {
        VehicleSessionInfoDataBody vehicleSessionInfoDataBody = this.sessionInfo;
        String str = this.publicKey;
        Boolean bool = this.generateCommand;
        Boolean bool2 = this.isBackupKey;
        Boolean bool3 = this.isFleetKey;
        return "RemoteBuildingRequestBody(sessionInfo=" + vehicleSessionInfoDataBody + ", publicKey=" + str + ", generateCommand=" + bool + ", isBackupKey=" + bool2 + ", isFleetKey=" + bool3 + ")";
    }

    public RemoteBuildingRequestBody(a aVar, c cVar) {
        this(new VehicleSessionInfoDataBody(cVar), (aVar == null || (r0 = aVar.c()) == null || (r0 = r0.E()) == null) ? null : j.c(r0, 0, 1, null), aVar != null ? Boolean.TRUE : null, aVar == null ? null : Boolean.valueOf(aVar.d()), aVar == null ? null : Boolean.valueOf(aVar.e()));
        i c11;
        byte[] E;
    }
}