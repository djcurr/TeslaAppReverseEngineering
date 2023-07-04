package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzgf extends IOException {
    private zzhf zzxq;

    public zzgf(String str) {
        super(str);
        this.zzxq = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfh() {
        return new zzgf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfi() {
        return new zzgf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfj() {
        return new zzgf("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfk() {
        return new zzgf("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfl() {
        return new zzgf("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgg zzfm() {
        return new zzgg("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfn() {
        return new zzgf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfo() {
        return new zzgf("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgf zzfp() {
        return new zzgf("Protocol message had invalid UTF-8.");
    }

    public final zzgf zzg(zzhf zzhfVar) {
        this.zzxq = zzhfVar;
        return this;
    }
}