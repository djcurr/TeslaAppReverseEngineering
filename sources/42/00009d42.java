package org.spongycastle.crypto.tls;

import okhttp3.internal.http2.Settings;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public final class ProtocolVersion {
    private String name;
    private int version;
    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");
    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");
    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");
    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");
    public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");
    public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");

    private ProtocolVersion(int i11, String str) {
        this.version = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.name = str;
    }

    public static ProtocolVersion get(int i11, int i12) {
        if (i11 != 3) {
            if (i11 == 254) {
                switch (i12) {
                    case 253:
                        return DTLSv12;
                    case 254:
                        throw new TlsFatalAlert((short) 47);
                    case 255:
                        return DTLSv10;
                    default:
                        return getUnknownVersion(i11, i12, "DTLS");
                }
            }
            throw new TlsFatalAlert((short) 47);
        } else if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return getUnknownVersion(i11, i12, "TLS");
                    }
                    return TLSv12;
                }
                return TLSv11;
            }
            return TLSv10;
        } else {
            return SSLv3;
        }
    }

    private static ProtocolVersion getUnknownVersion(int i11, int i12, String str) {
        TlsUtils.checkUint8(i11);
        TlsUtils.checkUint8(i12);
        int i13 = (i11 << 8) | i12;
        String upperCase = Strings.toUpperCase(Integer.toHexString(65536 | i13).substring(1));
        return new ProtocolVersion(i13, str + " 0x" + upperCase);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProtocolVersion) && equals((ProtocolVersion) obj));
    }

    public ProtocolVersion getEquivalentTLSVersion() {
        if (isDTLS()) {
            if (this == DTLSv10) {
                return TLSv11;
            }
            return TLSv12;
        }
        return this;
    }

    public int getFullVersion() {
        return this.version;
    }

    public int getMajorVersion() {
        return this.version >> 8;
    }

    public int getMinorVersion() {
        return this.version & 255;
    }

    public int hashCode() {
        return this.version;
    }

    public boolean isDTLS() {
        return getMajorVersion() == 254;
    }

    public boolean isEqualOrEarlierVersionOf(ProtocolVersion protocolVersion) {
        if (getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = protocolVersion.getMinorVersion() - getMinorVersion();
        if (isDTLS()) {
            if (minorVersion > 0) {
                return false;
            }
        } else if (minorVersion < 0) {
            return false;
        }
        return true;
    }

    public boolean isLaterVersionOf(ProtocolVersion protocolVersion) {
        if (getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = protocolVersion.getMinorVersion() - getMinorVersion();
        if (isDTLS()) {
            if (minorVersion <= 0) {
                return false;
            }
        } else if (minorVersion >= 0) {
            return false;
        }
        return true;
    }

    public boolean isSSL() {
        return this == SSLv3;
    }

    public boolean isTLS() {
        return getMajorVersion() == 3;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.version == protocolVersion.version;
    }
}