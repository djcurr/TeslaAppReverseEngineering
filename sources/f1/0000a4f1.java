package org.spongycastle.x509;

import java.security.cert.CertPath;
import org.spongycastle.i18n.ErrorBundle;
import org.spongycastle.i18n.LocalizedException;

/* loaded from: classes4.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2, CertPath certPath, int i11) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i11 != -1) {
            if (i11 >= -1 && i11 < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i11;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i11) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i11 != -1) {
            if (i11 >= -1 && i11 < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i11;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }
}