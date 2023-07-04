package org.spongycastle.crypto.tls;

import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public abstract class AbstractTlsServer extends AbstractTlsPeer implements TlsServer {
    protected TlsCipherFactory cipherFactory;
    protected short[] clientECPointFormats;
    protected Hashtable clientExtensions;
    protected ProtocolVersion clientVersion;
    protected TlsServerContext context;
    protected boolean eccCipherSuitesOffered;
    protected boolean encryptThenMACOffered;
    protected short maxFragmentLengthOffered;
    protected int[] namedCurves;
    protected int[] offeredCipherSuites;
    protected short[] offeredCompressionMethods;
    protected int selectedCipherSuite;
    protected short selectedCompressionMethod;
    protected short[] serverECPointFormats;
    protected Hashtable serverExtensions;
    protected ProtocolVersion serverVersion;
    protected Vector supportedSignatureAlgorithms;
    protected boolean truncatedHMacOffered;

    public AbstractTlsServer() {
        this(new DefaultTlsCipherFactory());
    }

    protected boolean allowEncryptThenMAC() {
        return true;
    }

    protected boolean allowTruncatedHMac() {
        return false;
    }

    protected Hashtable checkServerExtensions() {
        Hashtable ensureExtensionsInitialised = TlsExtensionsUtils.ensureExtensionsInitialised(this.serverExtensions);
        this.serverExtensions = ensureExtensionsInitialised;
        return ensureExtensionsInitialised;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public CertificateRequest getCertificateRequest() {
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public CertificateStatus getCertificateStatus() {
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public TlsCipher getCipher() {
        return this.cipherFactory.createCipher(this.context, TlsUtils.getEncryptionAlgorithm(this.selectedCipherSuite), TlsUtils.getMACAlgorithm(this.selectedCipherSuite));
    }

    protected abstract int[] getCipherSuites();

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public TlsCompression getCompression() {
        if (this.selectedCompressionMethod == 0) {
            return new TlsNullCompression();
        }
        throw new TlsFatalAlert((short) 80);
    }

    protected short[] getCompressionMethods() {
        return new short[]{0};
    }

    protected ProtocolVersion getMaximumVersion() {
        return ProtocolVersion.TLSv11;
    }

    protected ProtocolVersion getMinimumVersion() {
        return ProtocolVersion.TLSv10;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public NewSessionTicket getNewSessionTicket() {
        return new NewSessionTicket(0L, TlsUtils.EMPTY_BYTES);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public int getSelectedCipherSuite() {
        int[] cipherSuites;
        boolean supportsClientECCCapabilities = supportsClientECCCapabilities(this.namedCurves, this.clientECPointFormats);
        for (int i11 : getCipherSuites()) {
            if (Arrays.contains(this.offeredCipherSuites, i11) && ((supportsClientECCCapabilities || !TlsECCUtils.isECCCipherSuite(i11)) && TlsUtils.isValidCipherSuiteForVersion(i11, this.serverVersion))) {
                this.selectedCipherSuite = i11;
                return i11;
            }
        }
        throw new TlsFatalAlert((short) 40);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public short getSelectedCompressionMethod() {
        short[] compressionMethods = getCompressionMethods();
        for (int i11 = 0; i11 < compressionMethods.length; i11++) {
            if (Arrays.contains(this.offeredCompressionMethods, compressionMethods[i11])) {
                short s11 = compressionMethods[i11];
                this.selectedCompressionMethod = s11;
                return s11;
            }
        }
        throw new TlsFatalAlert((short) 40);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public Hashtable getServerExtensions() {
        if (this.encryptThenMACOffered && allowEncryptThenMAC() && TlsUtils.isBlockCipherSuite(this.selectedCipherSuite)) {
            TlsExtensionsUtils.addEncryptThenMACExtension(checkServerExtensions());
        }
        short s11 = this.maxFragmentLengthOffered;
        if (s11 >= 0 && MaxFragmentLength.isValid(s11)) {
            TlsExtensionsUtils.addMaxFragmentLengthExtension(checkServerExtensions(), this.maxFragmentLengthOffered);
        }
        if (this.truncatedHMacOffered && allowTruncatedHMac()) {
            TlsExtensionsUtils.addTruncatedHMacExtension(checkServerExtensions());
        }
        if (this.clientECPointFormats != null && TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite)) {
            this.serverECPointFormats = new short[]{0, 1, 2};
            TlsECCUtils.addSupportedPointFormatsExtension(checkServerExtensions(), this.serverECPointFormats);
        }
        return this.serverExtensions;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public Vector getServerSupplementalData() {
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public ProtocolVersion getServerVersion() {
        if (getMinimumVersion().isEqualOrEarlierVersionOf(this.clientVersion)) {
            ProtocolVersion maximumVersion = getMaximumVersion();
            if (this.clientVersion.isEqualOrEarlierVersionOf(maximumVersion)) {
                ProtocolVersion protocolVersion = this.clientVersion;
                this.serverVersion = protocolVersion;
                return protocolVersion;
            } else if (this.clientVersion.isLaterVersionOf(maximumVersion)) {
                this.serverVersion = maximumVersion;
                return maximumVersion;
            }
        }
        throw new TlsFatalAlert((short) 70);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void init(TlsServerContext tlsServerContext) {
        this.context = tlsServerContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void notifyClientCertificate(Certificate certificate) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void notifyClientVersion(ProtocolVersion protocolVersion) {
        this.clientVersion = protocolVersion;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void notifyFallback(boolean z11) {
        if (z11 && getMaximumVersion().isLaterVersionOf(this.clientVersion)) {
            throw new TlsFatalAlert((short) 86);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void notifyOfferedCipherSuites(int[] iArr) {
        this.offeredCipherSuites = iArr;
        this.eccCipherSuitesOffered = TlsECCUtils.containsECCCipherSuites(iArr);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void notifyOfferedCompressionMethods(short[] sArr) {
        this.offeredCompressionMethods = sArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void processClientExtensions(Hashtable hashtable) {
        this.clientExtensions = hashtable;
        if (hashtable != null) {
            this.encryptThenMACOffered = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable);
            short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable);
            this.maxFragmentLengthOffered = maxFragmentLengthExtension;
            if (maxFragmentLengthExtension >= 0 && !MaxFragmentLength.isValid(maxFragmentLengthExtension)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.truncatedHMacOffered = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable);
            Vector signatureAlgorithmsExtension = TlsUtils.getSignatureAlgorithmsExtension(hashtable);
            this.supportedSignatureAlgorithms = signatureAlgorithmsExtension;
            if (signatureAlgorithmsExtension != null && !TlsUtils.isSignatureAlgorithmsExtensionAllowed(this.clientVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.namedCurves = TlsECCUtils.getSupportedEllipticCurvesExtension(hashtable);
            this.clientECPointFormats = TlsECCUtils.getSupportedPointFormatsExtension(hashtable);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public void processClientSupplementalData(Vector vector) {
        if (vector != null) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    protected boolean supportsClientECCCapabilities(int[] iArr, short[] sArr) {
        if (iArr == null) {
            return TlsECCUtils.hasAnySupportedNamedCurves();
        }
        for (int i11 : iArr) {
            if (NamedCurve.isValid(i11) && (!NamedCurve.refersToASpecificNamedCurve(i11) || TlsECCUtils.isSupportedNamedCurve(i11))) {
                return true;
            }
        }
        return false;
    }

    public AbstractTlsServer(TlsCipherFactory tlsCipherFactory) {
        this.cipherFactory = tlsCipherFactory;
    }
}